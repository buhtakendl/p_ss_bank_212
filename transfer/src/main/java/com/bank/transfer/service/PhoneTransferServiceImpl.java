package com.bank.transfer.service;

import com.bank.transfer.dto.PhoneTransferDTO;
import com.bank.transfer.entity.PhoneTransfer;
import com.bank.transfer.exception.EntityNotFoundException;
import com.bank.transfer.mapper.PhoneTransferMapper;
import com.bank.transfer.repository.PhoneTransferRepository;
import com.bank.transfer.service.interfaces.PhoneTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhoneTransferServiceImpl implements PhoneTransferService {

    private final PhoneTransferRepository phoneTransferRepository;
    private final PhoneTransferMapper phoneTransferMapper; // add this line

    @Autowired
    public PhoneTransferServiceImpl(PhoneTransferRepository phoneTransferRepository, PhoneTransferMapper phoneTransferMapper) {
        this.phoneTransferRepository = phoneTransferRepository;
        this.phoneTransferMapper = phoneTransferMapper;
    }


    @Override
    public List<PhoneTransferDTO> getAll() {
        return phoneTransferRepository.findAll().stream()
                .map(phoneTransferMapper::toDtoPhoneTransfer).toList();
    }

    @Override
    public PhoneTransferDTO getById(Long id) {
        PhoneTransfer phoneTransfer = phoneTransferRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Phone transfer with id " + id + " not found"));
        return phoneTransferMapper.toDtoPhoneTransfer(phoneTransfer);
    }

    @Override
    @Transactional
    public PhoneTransferDTO save(PhoneTransferDTO phoneTransferDTO) {
        PhoneTransfer phoneTransfer = phoneTransferMapper.toPhoneTransfer(phoneTransferDTO);
        return phoneTransferMapper.toDtoPhoneTransfer(phoneTransferRepository.save(phoneTransfer));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        phoneTransferRepository.deleteById(id);
    }

    @Override
    @Transactional
    public PhoneTransferDTO update(PhoneTransferDTO phoneTransferDTO) {
        return phoneTransferMapper.toDtoPhoneTransfer(phoneTransferRepository.save(phoneTransferMapper.toPhoneTransfer(phoneTransferDTO)));
    }

    @Override
    public PhoneTransferDTO findByPhoneNumber(Long phoneNumber) {
        PhoneTransfer phoneTransfer = phoneTransferRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new EntityNotFoundException("Phone transfer with phone number " + phoneNumber + " not found"));
        return phoneTransferMapper.toDtoPhoneTransfer(phoneTransfer);
    }
}
