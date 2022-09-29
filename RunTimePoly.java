class RunTimePoly {
void show() {
	System.out.println("abcd");
}
}
class bcda extends RuntimePoly{
	void show() {
		System.out.println("abcdefg");
	}
	public static void main(String[] args) {
		RuntimePoly rp=new bcda();	
		rp.show();
	}
}
