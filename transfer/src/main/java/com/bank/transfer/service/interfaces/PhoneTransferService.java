package com.bank.transfer.service.interfaces;

import com.bank.transfer.dto.PhoneTransferDTO;
import com.bank.transfer.entity.PhoneTransfer;

import java.util.List;
import java.util.Optional;

public interface PhoneTransferService {

    List<PhoneTransferDTO> getAll();

    PhoneTransferDTO getById(Long id);

    PhoneTransferDTO save(PhoneTransferDTO phoneTransferDTO);

    void delete(Long id);

    PhoneTransferDTO update(PhoneTransferDTO phoneTransfer);

    PhoneTransferDTO findByPhoneNumber(Long phoneNumber);

}
