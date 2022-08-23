package forLoop;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=9;i++) {//outer loop
		for(j=1;j<=i;j++) { //inner loop
			System.out.print(j);
		}
		System.out.println(); //new line
		}
	}

}
