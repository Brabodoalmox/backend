package com.belval.maniadepets.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Info_Pet")
public class InfoPet {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Pet_Id") 
	private Integer PetId;
	
	@Column(name = "Inf_Especie")
	private String infespecie;
	
	@Column(name = "Inf_Raca")
	private String infraca;
	
	@Column(name = "Inf_Cor")
	private String infcor;
	
	@Column(name = "Inf_DataNasc")
	private String infdatanasc;
	
	@Column(name = "Inf_peso")
	private String infpeso;
	
	@OneToOne
	private Agenvis agenvis;
	
	//Método construtor padrão, isto é, sem parâmetros
		public InfoPet() {
		
		
			
		}

	public InfoPet(Integer petId, String infespecie, String infaca, String infcor, String infdatanasc, String infpeso,
			Agenvis agenvis) {
		super();
		PetId = petId;
		this.infespecie = infespecie;
		this.infraca = infraca;
		this.infcor = infcor;
		this.infdatanasc = infdatanasc;
		this.infpeso = infpeso;
		
	}

	public Integer getPetId() {
		return PetId;
	}

	public void setPetId(Integer petId) {
		PetId = petId;
	}

	public String getInfespecie() {
		return infespecie;
	}

	public void setInfespecie(String infespecie) {
		this.infespecie = infespecie;
	}

	public String getInfaca() {
		return infraca;
	}

	public void setInfaca(String infaca) {
		this.infraca = infraca;
	}

	public String getInfcor() {
		return infcor;
	}

	public void setInfcor(String infcor) {
		this.infcor = infcor;
	}

	public String getInfdatanasc() {
		return infdatanasc;
	}

	public void setInfdatanasc(String infdatanasc) {
		this.infdatanasc = infdatanasc;
	}

	public String getInfpeso() {
		return infpeso;
	}

	public void setInfpeso(String infpeso) {
		this.infpeso = infpeso;
	}

	public Agenvis getAgenvis() {
		return agenvis;
	}

	public void setAgenvis(Agenvis agenvis) {
		this.agenvis = agenvis;
	}

	
	
	
	@Override
	public String toString() {
		return "InfoPet [PetId=" + PetId + ", infespecie=" + infespecie + ", infaca=" + infraca + ", infcor=" + infcor
				+ ", infdatanasc=" + infdatanasc + ", infpeso=" + infpeso + ", agenvis=" + agenvis + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(PetId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoPet other = (InfoPet) obj;
		return Objects.equals(PetId, other.PetId);
	}
	
	

		
		}


			
		

		