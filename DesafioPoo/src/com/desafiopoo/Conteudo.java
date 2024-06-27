package com.desafiopoo;

public abstract class Conteudo {
	//ATRIBUTO 
	protected static final double XP_PADRAO = 10d;
	private String titulo;
	private String descricao;
	private double notaFeedBack;
	
	public abstract double calcularXP();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static double getXpPadrao() {
		return XP_PADRAO;
	}

	public double getNotaFeedBack() {
		return notaFeedBack;
	}

	public void setNotaFeedBack(double notaFeedBack) {
		this.notaFeedBack = notaFeedBack;
	}
	
	

}
