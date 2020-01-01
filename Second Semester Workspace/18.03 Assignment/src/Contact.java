
public class Contact
{
	private String name;
	private String relation;
	private String bday;
	private String phone;
	private String email;
	
	public Contact(String name, String relation, String bday, String phone, String email)
	{
		this.name = name;
		this.relation = relation;
		this.bday = bday;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getRelation()
	{
		return this.relation;
	}
	
	public String getBDay()
	{
		return this.bday;
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	@Override
	public String toString()
	{
		return String.format("%-15s %-15s %-15s %-15s %-15s", this.name, this.relation, this.bday, this.phone, this.email);
	}
}
