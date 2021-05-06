package com.projetospringreact.vendasspring.service;

import java.util.stream.Collectors;
import java.util.List;

import com.projetospringreact.vendasspring.dto.SellerDTO;
import com.projetospringreact.vendasspring.entities.Seller;
import com.projetospringreact.vendasspring.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SellerService {

    @Autowired //Injeta a dependencia sem precisar de declarar
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
