package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.ILista;

public class ListaPadrao implements ILista{

	
	
	
	@Override
	public List<String> getNomes() {
		List<String> listanomes = new ArrayList<>();
		listanomes.add("Master Sucos");
		listanomes.add("Mercad�o de Taquaritinga-SP");
		listanomes.add("Mercad�o de maragoji-SP");
		
		return listanomes;
	}

}
