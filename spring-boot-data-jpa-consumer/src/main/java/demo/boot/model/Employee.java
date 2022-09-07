package demo.boot.model;





public class Employee {
	
	
	private long id;
	private String name;
	private String city;

	public Employee() {
		super();
	}
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
