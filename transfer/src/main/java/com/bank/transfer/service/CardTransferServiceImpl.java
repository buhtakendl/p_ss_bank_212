package com.bank.transfer.service;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.entity.CardTransfer;
import com.bank.transfer.exception.EntityNotFoundException;
import com.bank.transfer.mapper.CardTransferMapper;
import com.bank.transfer.repository.CardTransferRepository;
import com.bank.transfer.service.interfaces.CardTransferService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardTransferServiceImpl implements CardTransferService {

    private final CardTransferRepository cardTransferRepository;
    private final CardTransferMapper cardTransferMapper;

    public CardTransferServiceImpl(CardTransferRepository cardTransferRepository, CardTransferMapper cardTransferMapper) {
        this.cardTransferRepository = cardTransferRepository;
        this.cardTransferMapper = cardTransferMapper;
    }

    @Override
    public List<CardTransferDTO> getAll() {
        return cardTransferRepository.findAll().stream().map(
                cardTransferMapper::toDtoCardTransfer).toList();
    }

    @Override
    public CardTransferDTO getById(Long id) {
        CardTransfer cardTransfer = cardTransferRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Card transfer with id " + id + " not found"));
        return cardTransferMapper.toDtoCardTransfer(cardTransfer);
    }

    @Override
    @Transactional
    public CardTransferDTO save(CardTransferDTO cardTransferDTO) {
        CardTransfer cardTransfer = cardTransferMapper.toCardTransfer(cardTransferDTO);
        return cardTransferMapper.toDtoCardTransfer(cardTransferRepository.save(cardTransfer));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cardTransferRepository.deleteById(id);
    }

    @Override
    @Transactional
    public CardTransferDTO update(CardTransferDTO cardTransferDTO) {
        return cardTransferMapper.toDtoCardTransfer(cardTransferRepository.save(cardTransferMapper.toCardTransfer(cardTransferDTO)));
    }

    @Override
    public CardTransferDTO findByCardNumber(Long cardNumber) {
        CardTransfer cardTransfer = cardTransferRepository.findByCardNumber(cardNumber)
                .orElseThrow(() -> new EntityNotFoundException("Card transfer with card number " + cardNumber + " not found"));
        return cardTransferMapper.toDtoCardTransfer(cardTransfer);
    }
}
