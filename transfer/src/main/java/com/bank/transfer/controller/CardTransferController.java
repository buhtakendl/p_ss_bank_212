package com.bank.transfer.controller;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.service.CardTransferServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card_transfer")
public class CardTransferController {

    private final CardTransferServiceImpl cardTransferService;

    public CardTransferController(CardTransferServiceImpl cardTransferService) {
        this.cardTransferService = cardTransferService;
    }


    @GetMapping
    public ResponseEntity<List<CardTransferDTO>> getAll() {
        return ResponseEntity.ok(cardTransferService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CardTransferDTO>> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(cardTransferService.getById(id));
    }

    @PostMapping
    public ResponseEntity<CardTransferDTO> save(@RequestBody CardTransferDTO cardTransferDTO) {
        return ResponseEntity.ok(cardTransferService.save(cardTransferDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CardTransferDTO> update(@PathVariable("id") Long id, @RequestBody CardTransferDTO cardTransferDTO) {
        cardTransferDTO.setId(id);
        return ResponseEntity.ok(cardTransferService.update(cardTransferDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        cardTransferService.delete(id);
        return ResponseEntity.ok().build();
    }
}
