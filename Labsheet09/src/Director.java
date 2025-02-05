
public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Director(String name,String email){
		this(name,email,' ');
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public char getGendername() {
		return this.gender;
	}

}
