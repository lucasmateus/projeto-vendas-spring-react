package com.projetospringreact.vendasspring.controllers;

import com.projetospringreact.vendasspring.dto.SaleDTO;
import com.projetospringreact.vendasspring.dto.SaleSuccessDTO;
import com.projetospringreact.vendasspring.dto.SaleSumDTO;
import com.projetospringreact.vendasspring.dto.SellerDTO;
import com.projetospringreact.vendasspring.service.SaleService;
import com.projetospringreact.vendasspring.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        List<SaleSuccessDTO> list = service.successGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
