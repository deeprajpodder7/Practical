class Student {
private String name;//private data member
public String getName() {//getter method
	return name;
}
public void setName(String name) {//setter method
	this.name=name;
	System.out.println("name updated successfully");
}
}
class Encap1{
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("debkanta");//setting the value
		System.out.println(s.getName());//getting the value
	}
}
