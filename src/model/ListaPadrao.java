package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.ILista;

public class ListaPadrao implements ILista{

	
	
	
	@Override
	public List<String> getNomes() {
		List<String> listanomes = new ArrayList<>();
		listanomes.add("Master Sucos");
		listanomes.add("Mercadão de Taquaritinga-SP");
		listanomes.add("Mercadão de maragoji-SP");
		
		return listanomes;
	}

}
