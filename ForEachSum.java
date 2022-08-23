package forLoop;

public class ForEachSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int sum=0;
		for (int i: arr) {
			System.out.println(i);
			sum+=i;
			
		}System.out.println("Sum is :" +sum);
	}

}
