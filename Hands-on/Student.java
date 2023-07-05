package oops;
//Example of Encapsulation

class Student {
 private int rollNo;
 private String name;
 private int age;
 private String address;

 public int getRollNo() {
     return rollNo;
 }

 public void setRollNo(int rollNo) {
     this.rollNo = rollNo;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }
}

class Main {
	    public static void main(String[] args) {
	        Student student = new Student();

	        student.setRollNo(12345);
	        student.setName("John Doe");
	        student.setAge(20);
	        student.setAddress("123 Main St");

	        System.out.println("Roll No: " + student.getRollNo());
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	        System.out.println("Address: " + student.getAddress());
	    }
	}
