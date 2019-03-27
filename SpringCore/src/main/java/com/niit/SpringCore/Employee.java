package com.niit.SpringCore;

// Model Bean POJO Class
public class Employee {

	private int eid;
	private String ename;
	//private String eaddress;
	
	Address address;
	

	public Employee() {
		System.out.println("Object Created");
	}

	/*tightly coupled (has-a relationship) 
	 * public Employee(int eid, String ename, Address address) { 
	 * super();
	 * this.eid = eid;
	 * this.ename = ename;
	 * address = new Address(); }
	 */
	
	//loosely coupled (is a relationship)
	public Employee(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	/*
	 * public String getEaddress() { return eaddress; }
	 * 
	 * public void setEaddress(String eaddress) { this.eaddress = eaddress; }
	 */

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	

}
