package com.bank.transfer.repository;

import com.bank.transfer.entity.AccountTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountTransferRepository extends JpaRepository<AccountTransfer, Long> {

    Optional<AccountTransfer> findByAccountNumber(Long accountNumber);
}
