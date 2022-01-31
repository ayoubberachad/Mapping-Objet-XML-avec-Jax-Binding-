package com.mapingobjet.xml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Releve {
	private String nomReleve ;

	private long Id_Releve;
	private double solde;
	private Date dateReleve;
	private List<Operation> operations;

	public Releve() {
		// TODO Auto-generated constructor stub
	}
 

	public Releve(String nomReleve, long id_Releve, double solde, Date dateReleve, List<Operation> operations) {
		super();
		this.nomReleve = nomReleve;
		Id_Releve = id_Releve;
		this.solde = solde;
		this.dateReleve = dateReleve;
		this.operations = operations;
	}

	public String getNomReleve() {
		return nomReleve;
	}
	
	public void setNomReleve(String nomReleve) {
		this.nomReleve = nomReleve;
	}
	
	public long getId_Releve() {
		return Id_Releve;
	}
	
	public void setId_Releve(long id_Releve) {
		Id_Releve = id_Releve;
	}
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(Date dateReleve) {
		this.dateReleve = dateReleve;
	}

	public List<Operation> getOperations() {
		return operations;
	}
	
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

}
