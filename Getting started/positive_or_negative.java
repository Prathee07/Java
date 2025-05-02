import java.util.Scanner;
public class NUMBERS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if its positive or negative");
		int num1=sc.nextInt();
//		if(num1>0) {
//			System.out.println(num1+ " is positive number");
//		}
//		else {
//			System.out.println(num1 + " is negative number");
//		}
		boolean result=num1>=0?true:false;
		if(result==true) {
			System.out.println(num1+ " is positive number");
		}
		else {
			System.out.println(num1 + " is negative number");
		}
		sc.close();
		}
	}


