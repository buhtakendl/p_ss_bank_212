package com.bank.transfer.controller;


import com.bank.transfer.dto.PhoneTransferDTO;
import com.bank.transfer.service.PhoneTransferServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phone_transfer")
public class PhoneTransferController {

    private final PhoneTransferServiceImpl phoneTransferService;

    public PhoneTransferController(PhoneTransferServiceImpl phoneTransferService) {
        this.phoneTransferService = phoneTransferService;
    }


    @GetMapping
    public ResponseEntity<List<PhoneTransferDTO>> getAll() {
        return ResponseEntity.ok(phoneTransferService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PhoneTransferDTO>> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(phoneTransferService.getById(id));
    }

    @PostMapping
    public ResponseEntity<PhoneTransferDTO> save(@RequestBody PhoneTransferDTO phoneTransferDTO) {
        return ResponseEntity.ok(phoneTransferService.save(phoneTransferDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhoneTransferDTO> update(@PathVariable("id") Long id, @RequestBody PhoneTransferDTO phoneTransferDTO) {
        phoneTransferDTO.setId(id);
        return ResponseEntity.ok(phoneTransferService.update(phoneTransferDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        phoneTransferService.delete(id);
        return ResponseEntity.ok().build();
    }
}
