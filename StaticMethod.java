package Constructor;

    class StaticMethod1 {
	int roll;
	String name;
	float fee;
	static String college="ABC";
	static void change() {
		college="CAB";
	}
	StaticMethod1(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee+ " "+college);
	}
  class StaticMethod{
	public static void main(String[] args) {
		StaticMethod1.change();
		StaticMethod1 s1=new StaticMethod1(100,"deep",4000);
		StaticMethod1 s2=new StaticMethod1(200,"raj",5000);
		//s1.change();
		s1.show();
		s2.show();
	}
}

}
