package com.miguelDev.cardapioDigital_app.contrato;

import java.util.List;

import com.miguelDev.cardapioDigital_app.dto.CardapioDto;
import com.miguelDev.cardapioDigital_app.model.Cardapio;

public interface ICardapio {
    
	CardapioDto cadastrarCardapio(Cardapio cardapio);
	List<CardapioDto> filtrarCardapioPorMenu(String menu, int pagina, int registros);
	CardapioDto consultarCardapioPorCodigo(Long codigo);
	CardapioDto consultarCardapioPorNome(String nome);
	List<CardapioDto> listarCardapios(int pagina, int registros);
	CardapioDto atualizarCardapio(Cardapio cardapio);
	void excluirCardapio(Long codigo);
}
