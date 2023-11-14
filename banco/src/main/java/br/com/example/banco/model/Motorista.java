package br.com.example.banco.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Motorista implements Serializable {
private static final long serialversionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_motorista")
	private Integer id;
	@Column(name ="nome")
	private String nome;
	@Column(name ="tipo_habilitacao")
	private String tipo_habilitacao;
	@Temporal(TemporalType.DATE)
	@Column(name ="data_habilitacao")
	private Date data_habilitacao;
	
	public Motorista() {
	}

	public Motorista(Integer id, String nome, String tipo_habilitacao, Date data_habilitacao) {
		this.id = id;
		this.nome = nome;
		this.tipo_habilitacao = tipo_habilitacao;
		this.data_habilitacao = data_habilitacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data_habilitacao, nome, tipo_habilitacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		return Objects.equals(data_habilitacao, other.data_habilitacao) && Objects.equals(nome, other.nome)
				&& Objects.equals(tipo_habilitacao, other.tipo_habilitacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_habilitacao() {
		return tipo_habilitacao;
	}

	public void setTipo_habilitacao(String tipo_habilitacao) {
		this.tipo_habilitacao = tipo_habilitacao;
	}

	public Date getData_habilitacao() {
		return data_habilitacao;
	}

	public void setData_habilitacao(Date data_habilitacao) {
		this.data_habilitacao = data_habilitacao;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", tipo_habilitacao=" + tipo_habilitacao
				+ ", data_habilitacao=" + data_habilitacao + "]";
	}
	
	
}
