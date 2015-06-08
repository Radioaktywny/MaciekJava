package cs;

import java.util.*;

import bron.Bron;
public class Bronie {
	private HashMap<Integer, Bron> Bronie;
	private Integer id_broni;
	
	public Bronie()
	{
		id_broni=0;
	}
	
	public void dodajBron(Bron bron)
	{	
		Bronie.put(id_broni,bron);
		id_broni++;
	}
			
			
	}
