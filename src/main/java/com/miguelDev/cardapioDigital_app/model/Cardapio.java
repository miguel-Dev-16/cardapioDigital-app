package com.miguelDev.cardapioDigital_app.model;

import com.miguelDev.cardapioDigital_app.enums.Menu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cardapio {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(nullable = false, unique = true, length = 70)
	private String nome;
	
	@Column(nullable = false)
	private String menu;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String imagem;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String descricao;
	
	public void setMenu(Menu menu) {
		this.menu = menu.getMenuCardapio();
	}
	
}
