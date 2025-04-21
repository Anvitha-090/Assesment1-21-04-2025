package assesment_1;

import java.security.DomainCombiner;
import java.util.Scanner;

public class GameStore {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean isexecute=true;
		int totalCost=0;
		while(isexecute) {
		System.out.println("1500- Call of Warfare ");
		System.out.println("1200-  Speed Racers   ");
		System.out.println("1000-  Mystery Mansion   ");
		System.out.println("800-  Pixel Adventure    ");
		System.out.println("500-   Puzzle Mania    ");
		System.out.println("0-Checkout  ");
		System.out.println("enter a option");
		int num=scanner.nextInt();
		switch(num) {
		case 1500:{
			System.out.println("Call of Warfare is added");
			break;
		}
		case 1200:{
			System.out.println("Speed Racers is added");
			break;
		}
		case 1000:{
			System.out.println("Mystery Mansion is added");
			break;
		}
		case 800:{
			System.out.println("Pixel Adventure is added");
			break;
		}
		case 500:{
			System.out.println("Puzzle Mania is added");
			break;
		}
		
		case 0:{
			
			
			System.out.println("exiting..");
			isexecute=false;
		}
		}
		totalCost=num+totalCost;
		System.out.println("total cost of games is :"+totalCost);
		}
		
		
	}

}
