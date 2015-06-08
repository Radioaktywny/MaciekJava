package cs;

import java.util.ArrayList;
import java.util.List;


import bron.Bron;
import bron.Pistolety;
import bron.Snajperska;

public class CS {
	private List<Gracz> CTlist = new ArrayList <Gracz> () ;
	private List<Gracz> TTlist = new ArrayList <Gracz> () ;

	public void dodajCT(Gracz g)
	{
		try
		{
			if((TTlist.size()+2)>(CTlist.size()) && CTlist.size()<5 )
		CTlist.add(g);
			else
				throw new ExceptionMy();
		}
		catch (Exception ExceptionMy)
		{
			System.out.println("NIE MOZNA DODAC SORY :D bo : "+CTlist.size()+" i "+ TTlist.size());
		}
	}
	public void dodajTT(Gracz g)throws ExceptionMy
	{
		try
		{
			if((CTlist.size()+2)>(TTlist.size()) && TTlist.size()<5 )
		TTlist.add(g);
			else
				throw new ExceptionMy();
		}
		catch (Exception ExceptionMy)
		{
			System.out.println("NIE MOZNA DODAC SORY :D bo :"+CTlist.size()+" i "+ TTlist.size());
		}
	}
	public Gracz getGracz(int i,Boolean tt)
	{
		if(tt)
		return CTlist.get(i);
		else
		return TTlist.get(i);
	}
	public static void main(String[] args) throws ExceptionMy {
		
		
			CS cs = new CS();
		cs.dodajCT(new Gracz("Stefan","silver 2",100,100));
		cs.dodajCT( new Gracz("Andrzej","silver 4",100,100));
		cs.dodajCT (new Gracz("Zbyszek","zoloto 3",100,100));
		cs.dodajCT (new Gracz("Stefanek","szeryf",100,100));
		cs.dodajTT( new Gracz("Michal","zloto 1",100,100));
		cs.dodajCT(new Gracz("Marian","silver 2",100,100));
		cs.dodajCT( new Gracz("Marian","silver 2",100,100));
		cs.dodajTT (new Gracz("Stefanek","szeryf",100,100));
		cs.dodajTT( new Gracz("Michal","zloto 1",100,100));
		cs.dodajCT(new Gracz("Marian","silver 2",100,100));
		cs.dodajCT( new Gracz("Marian","silver 2",100,100));
		cs.dodajCT (new Gracz("Stefanek","szeryf",100,100));
		cs.dodajTT( new Gracz("Michal","zloto 1",100,100));
		cs.dodajTT(new Gracz("Marian","silver 2",100,100));
		cs.dodajTT( new Gracz("Marian","silver 2",100,100));
		Bron bron= new Pistolety("beretta",20,10,30,30,30,10, false, "zielony");
		
		cs.getGracz(0, true).dodajBron(bron);
		bron= new Pistolety("Glock", 13, 5,10, 33,30, 15, false, "brazowy");	
		cs.getGracz(0, true).dodajBron(bron);
		bron = new Snajperska("AWP",10,50,10,100,30,40,100);
		cs.getGracz(0, true).dodajBron(bron);
	}

}
