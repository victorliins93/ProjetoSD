package com.projetoSD.projetoSD.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MunicipioDTO {
	
	public MunicipioDTO(Long cod_municipio, String nome_municipio, String part_ocupados,
			String part_nao_ocupados_fechados, String part_nao_ocupados_ocasional, String part_nao_ocupados_vagos,
			String total_particulares, String total_coletivos, String coletivos_morador, String coletivos_sem_morador) {
		super();
		this.cod_municipio = cod_municipio;
		this.nome_municipio = nome_municipio;
		this.part_ocupados = part_ocupados;
		this.part_nao_ocupados_fechados = part_nao_ocupados_fechados;
		this.part_nao_ocupados_ocasional = part_nao_ocupados_ocasional;
		this.part_nao_ocupados_vagos = part_nao_ocupados_vagos;
		this.total_particulares = total_particulares;
		this.total_coletivos = total_coletivos;
		this.coletivos_morador = coletivos_morador;
		this.coletivos_sem_morador = coletivos_sem_morador;
	}

	public Long getCod_municipio() {
		return cod_municipio;
	}

	public void setCod_municipio(Long cod_municipio) {
		this.cod_municipio = cod_municipio;
	}

	public String getNome_municipio() {
		return nome_municipio;
	}

	public void setNome_municipio(String nome_municipio) {
		this.nome_municipio = nome_municipio;
	}

	public String getPart_ocupados() {
		return part_ocupados;
	}

	public void setPart_ocupados(String part_ocupados) {
		this.part_ocupados = part_ocupados;
	}

	public String getPart_nao_ocupados_fechados() {
		return part_nao_ocupados_fechados;
	}

	public void setPart_nao_ocupados_fechados(String part_nao_ocupados_fechados) {
		this.part_nao_ocupados_fechados = part_nao_ocupados_fechados;
	}

	public String getPart_nao_ocupados_ocasional() {
		return part_nao_ocupados_ocasional;
	}

	public void setPart_nao_ocupados_ocasional(String part_nao_ocupados_ocasional) {
		this.part_nao_ocupados_ocasional = part_nao_ocupados_ocasional;
	}

	public String getPart_nao_ocupados_vagos() {
		return part_nao_ocupados_vagos;
	}

	public void setPart_nao_ocupados_vagos(String part_nao_ocupados_vagos) {
		this.part_nao_ocupados_vagos = part_nao_ocupados_vagos;
	}

	public String getTotal_particulares() {
		return total_particulares;
	}

	public void setTotal_particulares(String total_particulares) {
		this.total_particulares = total_particulares;
	}

	public String getTotal_coletivos() {
		return total_coletivos;
	}

	public void setTotal_coletivos(String total_coletivos) {
		this.total_coletivos = total_coletivos;
	}

	public String getColetivos_morador() {
		return coletivos_morador;
	}

	public void setColetivos_morador(String coletivos_morador) {
		this.coletivos_morador = coletivos_morador;
	}

	public String getColetivos_sem_morador() {
		return coletivos_sem_morador;
	}

	public void setColetivos_sem_morador(String coletivos_sem_morador) {
		this.coletivos_sem_morador = coletivos_sem_morador;
	}

	private Long cod_municipio;
	
	private String nome_municipio;
	
	private String part_ocupados;
	
	private String part_nao_ocupados_fechados;
	
	private String part_nao_ocupados_ocasional;
	
	private String part_nao_ocupados_vagos;
	
	private String total_particulares;
	
	private String total_coletivos;
	
	private String coletivos_morador;
	
	private String coletivos_sem_morador;

}
