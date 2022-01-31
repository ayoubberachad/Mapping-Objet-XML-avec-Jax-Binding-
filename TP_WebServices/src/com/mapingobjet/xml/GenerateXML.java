package com.mapingobjet.xml;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class GenerateXML {


	public static void main(String[] args) throws Exception {
		
	
		Operation oper1 = new Operation("CREDIT", new Date(), 133.0, "operation 1 (Releve 1)");
		Operation oper2 = new Operation("VIREMENT", new Date(), 139.0, "operation 2 (Releve 1)");
		Operation oper3 = new Operation("CREDIT", new Date(), 133.0, "operation 3 (Releve 2)");
		Operation oper4 = new Operation("VIRSEMENT", new Date(), 133.0, "operation 4 (Releve 2)");
		List<Operation> operations = new ArrayList<Operation>();
		operations.add(oper1);
		operations.add(oper2);
		operations.add(oper3);
		operations.add(oper4);
		List<Operation> operations1 = new ArrayList<Operation>();
		operations1.add(oper3);
		operations1.add(oper4);

		
		Releve releve1 = new Releve("Releve Nm 01 : ", 1,10000,new Date(),  operations);
		Releve releve2 = new Releve("Releve Nm 02 : ", 2,20000,new Date(),  operations1);

	 	System.out.println("Releve 1 : ");
		System.out.println("-----------------------------------------");
		System.out.println(releve1.getDateReleve());
		System.out.println(releve1.getSolde());
		for (Operation operation : releve1.getOperations()) {
			System.out.println(operation.getDescription());
			System.out.println(operation.getMontant());
			System.out.println(operation.getTypeOperation());
			System.out.println(operation.getDate());
		}
		System.out.println("Releve 2 : ");
		System.out.println("-----------------------------------------");
		System.out.println(releve2.getDateReleve());
		System.out.println(releve2.getSolde());
		for (Operation operation : releve2.getOperations()) {
			System.out.println(operation.getDescription());
			System.out.println(operation.getMontant());
			System.out.println(operation.getTypeOperation());
			System.out.println(operation.getDate());
		}
	  
		JAXBContext context=JAXBContext.newInstance(Releve.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		marshaller.marshal(releve1,new File("Releve.xml"));

		
	}
}