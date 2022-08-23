package forLoop;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int a=1;
		for(i=1;i<=4;i++) {//outer loop
		for(j=1;j<=i;j++) { //inner loop
			System.out.print(a);
			a++;
			if(a>9) {
				break;
			}
		}
		System.out.println(); //new line
		}
	}

}
