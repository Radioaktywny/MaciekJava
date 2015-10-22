package engine;

public class User
{
	protected String nick;
	protected String imie;
	protected String wiek;
	protected String miasto;
	
	
	private String login;
	private String haslo;
	private String email;
	
	public User(String login,String haslo, String email)
	{
		this.login=login;
		this.haslo=haslo;
		this.email=email;		
	}
	
}
