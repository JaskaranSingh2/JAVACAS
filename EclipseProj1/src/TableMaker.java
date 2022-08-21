import java.util.Scanner;

public class TableMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* MATH TABLEMAKER */
		  int numberinput, placeholder = 1;
		  
		  Scanner tablescanner = new Scanner(System.in);
		  
		  System.out.println("What number for your table?");
		  
		  numberinput = tablescanner.nextInt();
		  
		  while(placeholder <= 20) {
		  
		  System.out.println(numberinput+" * "+placeholder+" = "+numberinput*placeholder);
		  
		  placeholder++; 
		  
		  }
		  
		  tablescanner.close();
	}

}
