package Constructor;

public class StaticVariable {
	int roll;
	String name;
	float fee;
	static String college="RERF";
	StaticVariable(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee+ " "+college);
	}
public class StaticVariable1{
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable(100,"deep",4000);
		StaticVariable s2=new StaticVariable(200,"raj",5000);
		s1.show();
		s2.show();
	}
}
}
