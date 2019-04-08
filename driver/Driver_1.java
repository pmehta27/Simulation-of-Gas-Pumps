package org.com.driver;

import java.util.Scanner;

import org.com.inputprocessor.GasPump_1;
import org.com.inputprocessor.GasPump_2;

public class Driver_1 {

	
	static void Show_GasPump_1_Menu()
	{
		GasPump_1 gp1 = new GasPump_1();
		float a, b;
		char ch;
		String p;
		//Displaying Menu  GasPump-1
		System.out.println("========== GasPump-1 ==========");
		System.out.println("========== MENU of Operations ==========");
		System.out.println("0. Activate(float, float)");
		System.out.println("1. Start()");		
		System.out.println("2. PayCredit()");
		System.out.println("3. PayDebit(String)");
		System.out.println("4. Pin(String)");
		System.out.println("5. Reject()");
		System.out.println("6. Approved()");
		System.out.println("7. Cancel()");
		System.out.println("8. Diesel()");
		System.out.println("9. Regular()");		
		System.out.println("a. StartPump()");
		System.out.println("b. PumpGallon()");
		System.out.println("c. StopPump()");
		System.out.println("d. FullTank()");
		System.out.println("q. Quit the program");
		System.out.println("Please make a note of these operations");
		System.out.println("GasPump-1 Execution");
		
		Scanner reader=new Scanner(System.in);
		ch = '1';
		while (ch !='q') {
		System.out.println("\n");
		System.out.println(" Select Operation: ");
		System.out.println("0-Activate \n 1-Start \n 2-PayCredit \n 3-PayDebit \n 4-Pin \n 5-Reject \n 6-Approved");
		System.out.println(" 7-Cancel \n 8-Diesel \n 9-Regular \n a-StartPump \n b-PumpGallon \n c-StopPump \n d-FullTank \n q-Quit");
		System.out.println("enter your choice1");
		ch =(char) reader.next().charAt(0);
		switch (ch) {
		case '0': { //Activate()
				System.out.println(" Operation:Activate()");
				System.out.println(" Enter value:");
				a = reader.nextFloat();
				System.out.println(" Enter value");
				b = reader.nextFloat();		
				gp1.Activate(a,b);
				break;
		}

		case '1': { //Start
				System.out.println(" Operation: Start()");				
				gp1.Start();
				break;
		}
		case '2': { //PayCredit
				System.out.println(" Operation: PayCredit()");								
				gp1.PayCredit();
				break;
		}
		case '3': { //PayDebit
				System.out.println(" Operation: PayDebit()");			
				System.out.println("Enter Pin to Store");
				p = reader.next();		
				System.out.println(p);
				gp1.PayDebit(p);
				break;
		}
		case '4': { //Pin
				System.out.println(" Operation: Pin()");
				System.out.println(" Enter Pin to Validate:");
				p = reader.next();		
				gp1.Pin(p);
				break;
		}

		case '5': {//Reject
		System.out.println(" Operation: Reject()");
		gp1.Reject();
		break;
		}
		
		case '6': { //Approved
		System.out.println(" Operation: Approved()");
		gp1.Approved();
		break;
		}
		
		case '7': {//Cancel
		System.out.println("Operation: Cancel()");
		gp1.Cancel();
		break;
		}
		
		case '8': {//Diesel
		System.out.println(" Operation: Diesel()");
		gp1.Diesel();
		break;
		}
		
		case '9': { //Regular
		System.out.println(" Operation: Regular()");
		gp1.Regular();
		break;
		}
		
		case 'a': {//StartPump
		System.out.println(" Operation: StartPump()");
		gp1.StartPump();
		break;
		}
		
		case 'b': {//PumpGallon
		System.out.println(" Operation: PumpGallon()");
		gp1.PumpGallon();
		break;
		}
		
		case 'c': { //StopPump
		System.out.println(" Operation: StopPump()");
		gp1.StopPump();
		break;
		}
		
		case 'd': { //FullTank
		System.out.println(" Operation: FullTank()");
		gp1.FullTank();
		break;
		}
		
		case 'q': {
			System.exit(0);			
		}
		
		}// endswitch
		} //endwhile
		reader.close();
	}
	
	
	static void Show_GasPump_2_Menu()
	{
		GasPump_2 gp2 = new GasPump_2();
		float a, b, c;
		int c1;
		char ch;
		//Displaying Menu  GasPump-2
		System.out.println("========== GasPump-2 ==========");
		System.out.println("========== MENU of Operations =======");
		System.out.println("0. Activate(float, float, float)");
		System.out.println("1. PayCash(int)");
		System.out.println("2. PayCredit()");
		System.out.println("3. Approved()");
		System.out.println("4. Reject()");
		System.out.println("5. Cancel()");
		System.out.println("6. Premium()");
		System.out.println("7. Regular()");
		System.out.println("8. Super()");
		System.out.println("9. StartPump()");
		System.out.println("a. PumpLiter()");
		System.out.println("b. Stop()");
		System.out.println("c. Receipt()");
		System.out.println("d. NoReceipt()");
		System.out.println("q. Quit the program");
		System.out.println("\tPlease make a note of these operations");
		System.out.println("===========GasPump-2 Execution=======");
		
		Scanner reader=new Scanner(System.in);
		ch = '1';
		while (ch !='q') {
		System.out.println("\n");
		System.out.println(" Select Operation: ");
		System.out.println("0-Activate \n 1-PayCash \n 2-PayCredit \n 3-Approved \n 4-Reject \n 5-Cancel \n 6-Premium");
		System.out.println("7-Regular \n 8-Super \n 9-StartPump \n a-PumpLiter \n b-Stop \n c-Receipt \n d-NoReceipt \n q-quit");
		System.out.println("enter your choice1");
		ch =(char) reader.next().charAt(0);
		switch (ch) {
		case '0': { //Activate()
		System.out.println(" Operation:");
		System.out.println(" Enter value:");
		a = reader.nextFloat();
		System.out.println(" Enter value");
		b = reader.nextFloat();
		System.out.println(" Enter value");
		c = reader.nextFloat();
		gp2.Activate(a,b,c);
		break;
		}
		case '1': { //PayCash
		System.out.println(" Operation: PayCash(int c)");
		System.out.println(" Enter value of the parameter c:");
		c1 = reader.nextInt();
		gp2.PayCash(c1);
		break;
		}
		case '2': { //PayCredit
		System.out.println(" Operation: PayCredit()");
		gp2.PayCredit();
		break;
		}
		case '3': { //Approved
		System.out.println(" Operation: Approved()");
		gp2.Approved();
		break;
		}
		case '4': {//Reject
		System.out.println(" Operation: Reject()");
		gp2.Reject();
		break;
		}
		case '5': {//Cancel
		System.out.println("Operation: Cancel()");
		gp2.Cancel();
		break;
		}
		case '6': {//Premium
		System.out.println(" Operation: Premium()");
		gp2.Premium();
		break;
		}
		case '7': { //Regular
		System.out.println(" Operation: Regular()");
		gp2.Regular();
		break;
		}
		case '8': { //Super
		System.out.println("Operation: Super()");
		gp2.Super();
		break;
		}
		case '9': {//StartPump
		System.out.println(" Operation: StartPump()");
		gp2.StartPump();
		break;
		}
		case 'a': {
		//PumpLiter
		System.out.println(" Operation: PumpLiter()");
		gp2.PumpLiter();
		break;
		}
		case 'b': { //Stop
		System.out.println(" Operation: Stop()");
		gp2.Stop();
		break;
		}
		case 'c': { //Receipt
		System.out.println(" Operation: Receipt()");
		gp2.Receipt();
		break;
		}
		case 'd': { //NoReceipt
		System.out.println(" Operation: NoReceipt()");
		gp2.NoReceipt();
		break;
		}
		case 'q': break;
		}// endswitch
		} //endwhile
		reader.close();
	}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println( "\nSelect Gas Pump Station:\n");
			System.out.println( "1. Gas Pump 1\n2. Gas Pump 2\n");
			System.out.println( "Your Selection: ");
			int select;
			 select=sc.nextInt();
			switch(select)
			{
				case 1: 
					Show_GasPump_1_Menu();
					break;
				case 2:
					Show_GasPump_2_Menu();
				default: break;
			}
			sc.close();
			
		}//main
}
