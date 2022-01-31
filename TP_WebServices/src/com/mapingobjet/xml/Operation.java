package com.mapingobjet.xml;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
 
public class Operation {
private String typeOperation;
private Date date;
private Double montant;
private String description;
public Operation() {
	// TODO Auto-generated constructor stub
}

public Operation(String typeOperation, Date date, Double montant, String description) {
	super();
	this.typeOperation = typeOperation;
	this.date = date;
	this.montant = montant;
	this.description = description;
}
public String getTypeOperation() {
	return typeOperation;
}
public void setTypeOperation(String typeOperation) {
	this.typeOperation = typeOperation;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Double getMontant() {
	return montant;
}
public void setMontant(Double montant) {
	this.montant = montant;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}
