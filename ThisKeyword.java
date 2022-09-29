public class ThisKeyword {
	int roll;
	String name;
	float fee;
	
	ThisKeyword(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee);
	}
  class Test{
	public static void main(String[] args) {
		
		ThisKeyword s1=new ThisKeyword(100,"dev",400);
		ThisKeyword s2=new ThisKeyword(200,"dev",500);
		//s1.change();
		s1.show();
		s2.show();
	}
}
}
