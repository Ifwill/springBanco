package br.com.example.banco.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro implements Serializable {
	private static final long serialversionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String nome;
	private int ano;
	private String cor;
	
	public Carro() {
	}
	public Carro(Integer id, String marca, String nome, int ano, String cor) {
		this.id = id;
		this.marca = marca;
		this.nome = nome;
		this.ano = ano;
		this.cor = cor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ano, marca, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome);
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", nome=" + nome + ", ano=" + ano + ", cor=" + cor + "]";
	}
	
}
