package com.semana.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semana.devsuperior.dsvendas.dto.SellerDTO;
import com.semana.devsuperior.dsvendas.entities.Seller;
import com.semana.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository rp;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = rp.findAll();
		return result.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
	}
}
