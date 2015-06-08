package cs;
import java.util.ArrayList;
import java.util.List;

import bron.*;
/**
 * @author Maciej Kulikiewicz
 */
public class Gracz extends Postac{
	
	/**
	 * @param kewlar
	 * @param Ranga ranga gracza
	 */
	private List<Bron> bronie = new ArrayList <Bron> () ;
	protected int kewlar;
	protected String Ranga;
	/**
	 * konstruktor 4 parametrowy przkazujacy
	 * @param nazwe
	 * @param Randa
	 * @param zycie
	 * @param kewlar
	 */
	protected Gracz(String nazwa_postaci, String Ranga, int zycie , int kewlar )
	{
		super.zycie=zycie;
		this.kewlar=kewlar;
		super.nazwa_postaci=nazwa_postaci;
		this.Ranga=Ranga;
	}
	/**
	 * Kosntruktor domyslny
	 */
	public Gracz()
	{
		this("Nieznana" , "Silver 1 " , 100 , 100);
	}
	public void dodaj_do_gracza_Bron(Bron b)
	{
		try
		{
			if((bronie.size()<2 ))
				bronie.add(b);
			else
				throw new ExceptionMy();
		}
		catch (Exception ExceptionMy)
		{
			System.out.println("Postaæ nie mo¿e mieæ wiêcej broni ni¿ :"+ bronie.size()+" ");
		}
		
	}
	
}

