package com.bank.transfer.service;

import com.bank.transfer.dto.AccountTransferDTO;
import com.bank.transfer.entity.AccountTransfer;
import com.bank.transfer.exception.EntityNotFoundException;
import com.bank.transfer.mapper.AccountTransferMapper;
import com.bank.transfer.repository.AccountTransferRepository;
import com.bank.transfer.service.interfaces.AccountTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountTransferServiceImpl implements AccountTransferService {

    private final AccountTransferRepository accountTransferRepository;

    private final AccountTransferMapper accountTransferMapper;

    @Autowired
    public AccountTransferServiceImpl(AccountTransferRepository accountTransferRepository, AccountTransferMapper accountTransferMapper) {
        this.accountTransferRepository = accountTransferRepository;
        this.accountTransferMapper = accountTransferMapper;
    }

    @Override
    public List<AccountTransferDTO> getAll() {
        return accountTransferRepository.findAll().stream()
                .map(accountTransferMapper::toDtoAccountTransfer)
                .toList();
    }

    @Override
    public AccountTransferDTO getById(Long id) {
        AccountTransfer accountTransfer = accountTransferRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account transfer with id " + id + " not found"));
        return accountTransferMapper.toDtoAccountTransfer(accountTransfer);
    }

    @Override
    public AccountTransferDTO save(AccountTransferDTO accountTransferDTO) {
        AccountTransfer accountTransfer = accountTransferMapper.toAccountTransfer(accountTransferDTO);
        return accountTransferMapper.toDtoAccountTransfer(accountTransferRepository.save(accountTransfer));
    }

    @Override
    public void delete(Long id) {
        AccountTransfer accountTransfer = accountTransferRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account transfer with id " + id + " not found"));
        accountTransferRepository.delete(accountTransfer);
    }

    @Override
    public AccountTransferDTO update(AccountTransferDTO accountTransferDTO) {
        return accountTransferMapper.toDtoAccountTransfer(accountTransferRepository.save(accountTransferMapper.toAccountTransfer(accountTransferDTO)));
    }

    @Override
    public Optional<AccountTransferDTO> findByAccountNumber(Long accountNumber) {
        return accountTransferRepository.findByAccountNumber(accountNumber).map(accountTransferMapper::toDtoAccountTransfer);
    }
}
