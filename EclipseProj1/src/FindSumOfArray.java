
public class FindSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {10,20,30,40,50};
		int i = 0;
		int sum = 0;
		
		while(i<5) {
		int num = sumArray[i];
		sum = sum + num;
		i++;
		System.out.println(sum);
		}
	}

}