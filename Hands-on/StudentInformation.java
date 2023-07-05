package oops;
//Example of Encapsulation

class StudentInformation
{
	private int rollNo;
	private String name;
	private int age;
	private String address;
	
	
	//getRollno method
	public int getRollno() {
		return rollNo;
	}
	
	//setRollno method
	public void setRollno(int rollno) {
		this.rollNo = rollno;
	}
	
	//getName method
	public String getName() {
		return name;
	}
	
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge method
	public int getAge() {
		return age;
	}
	
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}
	
	//getAddress method
	public String getAddress() {
		return address;
	}
	
	//setAddress method
	public void setAddress(String address) {
		this.address = address;
	}
}
class College
{
	public static void main(String[] args)
	{
		//Creating instance of StudentInformation
		StudentInformation student=new StudentInformation();
		
		//Setting Values
		student.setRollno(21);
		student.setName("Aishwarya");
		student.setAge(22);
		student.setAddress("Pune");
		
		//Print values
		System.out.println("Rollno is:" + student.getRollno());
		System.out.println("Name is:" + student.getName());
		System.out.println("Age is:" + student.getAge());
		System.out.println("Address is:" + student.getAddress());
		
	}
	}
