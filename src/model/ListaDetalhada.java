package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import interfaces.ILista;

@Component
public class ListaDetalhada implements ILista{

	@Override
	public List<String> getNomes() {
		List<String> listanomes = new ArrayList<>();
		listanomes.add("Informática TQ");
		listanomes.add("Pizzaria SP");
		listanomes.add("Pastelaria PR");
		listanomes.add("Lanchonete RS");
		listanomes.add("Padaria RN");
		return listanomes;
	}
	
	

}
