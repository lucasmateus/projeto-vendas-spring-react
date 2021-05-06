package com.projetospringreact.vendasspring.service;

import com.projetospringreact.vendasspring.dto.SaleDTO;
import com.projetospringreact.vendasspring.entities.Sale;
import com.projetospringreact.vendasspring.repositories.SaleRepository;
import com.projetospringreact.vendasspring.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SaleService {

    @Autowired //Injeta a dependencia sem precisar de declarar
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
