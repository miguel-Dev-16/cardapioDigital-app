package com.miguelDev.cardapioDigital_app.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelDev.cardapioDigital_app.contrato.ICardapio;
import com.miguelDev.cardapioDigital_app.dto.CardapioDto;
import com.miguelDev.cardapioDigital_app.model.Cardapio;
import com.miguelDev.cardapioDigital_app.repository.CardapioRepository;

@Service
public class CardapioService implements ICardapio{
     
	 @Autowired
	 private CardapioRepository repository;
	
	@Override
	public CardapioDto cadastrarCardapio(Cardapio cardapio) {
		if(Objects.isNull(cardapio)) {
			throw new IllegalArgumentException("O objeto cardapio está nulo");
		}		
		return new CardapioDto(repository.save(cardapio));
	}

	@Override
	public List<CardapioDto> filtrarCardapioPorMenu(String menu, int pagina, int registros) {
		
		return null;
	}

	@Override
	public CardapioDto consultarCardapioPorCodigo(Long codigo) {
		
		return null;
	}

	@Override
	public CardapioDto consultarCardapioPorNome(String nome) {
		
		return null;
	}

	@Override
	public List<CardapioDto> listarCardapios(int pagina, int registros) {
		
		return null;
	}

	@Override
	public CardapioDto atualizarCardapio(Cardapio cardapio) {
		
		return null;
	}

	@Override
	public void excluirCardapio(Long codigo) {
		Cardapio obj = repository.findById(codigo).get();
		if(Objects.isNull(obj)) {
			throw new IllegalArgumentException("O objeto cardapio está nulo, não está cadastrado no banco!");
		}		
		
		repository.deleteById(codigo);
		
	}
  
}
