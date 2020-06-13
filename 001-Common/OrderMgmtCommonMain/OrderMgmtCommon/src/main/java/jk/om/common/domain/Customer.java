package jk.om.common.domain;

public class Customer {

	private Long id;

	private String name;
	private String firstName;
	private String lastName;

	private String customerType;
	private Address address;

	public Customer() {
	}

	public Customer(Long id, String name, String firstName, String lastName, String customerType, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerType = customerType;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", customerType=" + customerType + ", address=" + address + "]";
	}

}
