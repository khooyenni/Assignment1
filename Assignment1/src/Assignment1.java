import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter you name: ");
		String name = in.next();
		System.out.println("Name : " + name);
		System.out.println();
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age : " + age);
		System.out.println();
		
		System.out.print("Enter your citizenship:");
		String citizenship = in.next();
		System.out.println("Citizenship : " + citizenship);
		System.out.println();
		
		System.out.print("Enter your Home Address:");
		String home = in.next();
		System.out.println("Home Address : " + home);
		System.out.println();
		
		System.out.println("Type of loan: Bussiness loan");
		System.out.println("The interest for bussiness loan more or equal to RM10000 is 6%.");
		System.out.println("The interest for bussiness loan less than RM10000 is 7%.");
		System.out.println();
		
		System.out.println("Enter the amount borrowed: ");
		int amount = in.nextInt();
		System.out.println("Amount borrowed : " + "RM" + amount);
		System.out.println();
		
		System.out.println("The number of months to pay the loan back: ");
		int months = in.nextInt();
		System.out.println("The number of months to pay the loan back : " + months);
		System.out.println();
		
		int interest1 = 6;
		int interest2 = 7;
		double rate1 = amount * 0.06;
		double rate2 = amount * 0.07;
		double tinterestloan1 = months * rate1;
		double tinterestloan2 = months * rate2;
		double tpayback1 = tinterestloan1+ amount;
		double tpayback2 = tinterestloan1+ amount;
		
		if(amount>=10000) {
			System.out.println("Interest is : " + interest1 + "%");
			System.out.println("Total interest per month : " + "RM" + rate1);
			System.out.println("Total interest per loan : " + "RM" + tinterestloan1);
			System.out.println("Total payback : " + "RM" + tpayback1);
		}else if(amount<10000){
			System.out.println("Interest is : " + interest2 + "%");
			System.out.println("Total interest per month : " + "RM" + rate2);
			System.out.println("Total interest per loan : " + "RM" + tinterestloan2);
			System.out.println("Total payback : " + "RM" + tpayback2);
		}
		

	}

}
