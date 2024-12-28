package com.miguelDev.cardapioDigital_app.dto;

import com.miguelDev.cardapioDigital_app.model.Cardapio;

import lombok.Data;

@Data
public class CardapioDto {
   
	private Long   codigo;
	private String nome;
	private String menu;
	private String imagem;
	private Double preco;
	private String descricao;
	
	public CardapioDto(Cardapio model) {
		codigo = model.getCodigo();
		nome   = model.getNome();
		menu   = model.getMenu();
		imagem = model.getImagem();
		preco  = model.getPreco();
		descricao = model.getDescricao();
	}
	
	
}
