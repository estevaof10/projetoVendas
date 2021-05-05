package com.semana.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.semana.devsuperior.dsvendas.dto.SaleDTO;
import com.semana.devsuperior.dsvendas.entities.Sale;
import com.semana.devsuperior.dsvendas.repositories.SaleRepository;
import com.semana.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository rp;
	
	@Autowired
	private SellerRepository sR;
	
	public Page<SaleDTO> findAll(Pageable pageabel) {
		sR.findAll();
		Page<Sale> result = rp.findAll(pageabel);
		return result.map(x-> new SaleDTO(x));
	}
}
