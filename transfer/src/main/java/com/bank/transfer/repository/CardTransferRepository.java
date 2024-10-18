package com.bank.transfer.repository;

import com.bank.transfer.entity.CardTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardTransferRepository extends JpaRepository<CardTransfer, Long> {

    Optional<CardTransfer> findByCardNumber(Long cardNumber);
}
