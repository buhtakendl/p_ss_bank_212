package com.bank.transfer.controller;

import com.bank.transfer.dto.AccountTransferDTO;
import com.bank.transfer.service.AccountTransferServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account_transfer")
public class AccountTransferController {

    private final AccountTransferServiceImpl accountTransferService;

    public AccountTransferController(AccountTransferServiceImpl accountTransferService) {
        this.accountTransferService = accountTransferService;
    }

    @GetMapping
    public ResponseEntity<List<AccountTransferDTO>> getAll() {
        return ResponseEntity.ok(accountTransferService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountTransferDTO> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountTransferService.getById(id));
    }

    @PostMapping
    public ResponseEntity<AccountTransferDTO> save(@RequestBody AccountTransferDTO accountTransferDTO) {
        return ResponseEntity.ok(accountTransferService.save(accountTransferDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountTransferDTO> update(@PathVariable("id") Long id, @RequestBody AccountTransferDTO accountTransferDTO) {
        accountTransferDTO.setId(id);
        return ResponseEntity.ok(accountTransferService.update(accountTransferDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        accountTransferService.delete(id);
        return ResponseEntity.ok().build();
    }


}
