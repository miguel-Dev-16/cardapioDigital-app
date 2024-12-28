package com.miguelDev.cardapioDigital_app.enums;

public enum Menu {
    ALMOCO("Aolmoço"), JANTAR("Jantar"), LANCHE("Lanche");
	
	private String MenuCardapio;
	
	private Menu(String menu) {
		this.MenuCardapio = menu;
	}
	
	public String getMenuCardapio() {
		return this.MenuCardapio;
	}
	
	
}
