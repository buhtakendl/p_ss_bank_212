package com.bank.transfer.service.interfaces;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.entity.CardTransfer;

import java.util.List;
import java.util.Optional;

public interface CardTransferService {

    List<CardTransferDTO> getAll();

    Optional<CardTransferDTO> getById(Long id);

    CardTransferDTO save(CardTransferDTO cardTransferDTO);

    void delete(Long id);

    CardTransferDTO update(CardTransferDTO cardTransferDTO);

    Optional<CardTransferDTO> findByCardNumber(Long cardNumber);
}
