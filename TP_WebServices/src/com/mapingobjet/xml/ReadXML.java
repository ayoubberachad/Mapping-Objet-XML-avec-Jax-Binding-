package com.mapingobjet.xml;

import java.io.File;
import java.util.List;

import javax.xml.bind.*;

public class ReadXML {
	public static void main(String[] args) throws Exception {

		JAXBContext JC = JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller = JC.createUnmarshaller();
		Releve releve = (Releve) unmarshaller.unmarshal(new File("Releve.xml"));

		System.out.println("------------- Le Releve  : -------------");
		System.out.println("Solde : " + releve.getSolde() + "\nDate : " + releve.getDateReleve() + "");
		System.out.println("  ");
		System.out.println("------------- Les Operations  : -------------");

		for (Operation rv : releve.getOperations()) {

			System.out.println("Type d'operation : " + rv.getTypeOperation());
			System.out.println("Description : " + rv.getDescription());
			System.out.println("Date d'operation : " + rv.getDate());
			System.out.println("Montant d'operation : " + rv.getMontant());
			System.out.println("  ");

		}
	}

}
