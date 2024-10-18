package com.bank.transfer.service;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.entity.CardTransfer;
import com.bank.transfer.mapper.CardTransferMapper;
import com.bank.transfer.repository.CardTransferRepository;
import com.bank.transfer.service.interfaces.CardTransferService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
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
    public Optional<CardTransferDTO> getById(Long id) {
        return cardTransferRepository.findById(id).map(cardTransferMapper::toDtoCardTransfer);
    }

    @Override
    public CardTransferDTO save(CardTransferDTO cardTransferDTO) {
        CardTransfer cardTransfer = cardTransferMapper.toCardTransfer(cardTransferDTO);
        return cardTransferMapper.toDtoCardTransfer(cardTransferRepository.save(cardTransfer));
    }

    @Override
    public void delete(Long id) {
        cardTransferRepository.deleteById(id);
    }

    @Override
    public CardTransferDTO update(CardTransferDTO cardTransferDTO) {
        return cardTransferMapper.toDtoCardTransfer(cardTransferRepository.save(cardTransferMapper.toCardTransfer(cardTransferDTO)));
    }

    @Override
    public Optional<CardTransferDTO> findByCardNumber(Long cardNumber) {
        return cardTransferRepository.findByCardNumber(cardNumber).map(cardTransferMapper::toDtoCardTransfer);
    }
}
