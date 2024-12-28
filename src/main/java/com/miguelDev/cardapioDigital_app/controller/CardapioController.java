package com.miguelDev.cardapioDigital_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miguelDev.cardapioDigital_app.dto.CardapioDto;
import com.miguelDev.cardapioDigital_app.model.Cardapio;
import com.miguelDev.cardapioDigital_app.service.CardapioService;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {
    
	@Autowired
	private CardapioService service;
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<CardapioDto> cadastrarCardapio(@RequestBody Cardapio cardapio){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarCardapio(cardapio));
	}
	
	@DeleteMapping("/{codigo}")
	public ResponseEntity<Void> excluirCardapio(@PathVariable Long codigo) {
		service.excluirCardapio(codigo);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}
