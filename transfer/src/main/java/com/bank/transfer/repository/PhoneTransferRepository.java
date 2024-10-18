package com.bank.transfer.repository;

import com.bank.transfer.entity.PhoneTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneTransferRepository extends JpaRepository<PhoneTransfer, Long> {

    Optional<PhoneTransfer> findByPhoneNumber(Long phoneNumber);
}
