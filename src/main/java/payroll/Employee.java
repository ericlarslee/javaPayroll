package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {
	private @Id @GeneratedValue Long id;
	private String name;
	private String role;
	
	Employee() {}
	Employee(String name, String role) {
		
		this.name = name;
		this.role = role;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public boolean equals(Object object) {
		
		if (this == object)
			return true;
		if (!(object instanceof Employee))
			return false;
		Employee employee = (Employee) object;
		return Objects.equals(this.id,  employee.id) && Objects.equals(this.name,  employee.name) && Objects.equals(this.role,  employee.role); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.role);	
	}
	
	@Override
	public String toString() {
		return "Employee{" + this.id + ",name=' " + this.name + '\'' + ", role=' " + this.role + '\'' + '}';
	}
}
