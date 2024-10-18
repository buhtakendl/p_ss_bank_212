package com.bank.transfer.service.interfaces;

import com.bank.transfer.dto.AccountTransferDTO;

import java.util.List;
import java.util.Optional;

public interface AccountTransferService {

    List<AccountTransferDTO> getAll();

    AccountTransferDTO getById(Long id);

    AccountTransferDTO save(AccountTransferDTO accountTransferDTO);

    void delete(Long id);

    AccountTransferDTO update(AccountTransferDTO accountTransferDTO);

    Optional<AccountTransferDTO> findByAccountNumber(Long accountNumber);
}
