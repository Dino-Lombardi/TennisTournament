package be.Lombardi.Tournament;

public class Person {
	private int idPerson;
	private String firstname;
	private String lastname;
	private String nationality;

	public Person(int id, String firstname, String lastname, String nationality) {
		this.idPerson = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationality = nationality;
	}
	
	public int getIdPerson() {
		return idPerson;
	}
	
	public String getFirstname() {
		return firstname;
	}

	
	public String getLastname() {
		return lastname;
	}

	public String getNationality() {
		return nationality;
	}

	@Override
	public String toString() {
		return	"Firstname: " + firstname + "\n"
				+ "Lastname:  " + lastname + "\n"
				+ "Nationality: " + nationality;
	}
	
	@Override
	public int hashCode() {
		
		return 	idPerson + 
				this.getFirstname().hashCode() +
				this.getLastname().hashCode() +
				this.getNationality().hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
		if (obj ==null || obj.getClass()!=this.getClass())
		{
			return false;
		}
		else
		{
			Person p=(Person)obj;
			if (p.getFirstname().equals(getFirstname()) & p.getLastname().equals(getLastname()) & p.getNationality().equals(getNationality()))
			{	
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
