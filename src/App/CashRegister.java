package App;

import java.util.Scanner;

public class CashRegister {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amountOfTwenties, amountOfTens, amountOfFives, amountOfOnes, amountOfQuarters,  amountOfDimes, amountOfNickles, amountOfPennies;
		double amountTendered, purchasePrice, change;
		double twentyDollarBill = 20.00;
		double tenDollarBill = 10.00;
		double fiveDollarBill = 5.00;
		double oneDollarBill = 1.00;
		double quarter = .25;
		double dime = .10;
		double nickle = .05;
		double penny = .01;
		
		System.out.print("What is the price of the item? \n$");
		purchasePrice = sc.nextDouble();
		System.out.print("Please enter how much you would like to pay? \n$");
		amountTendered = sc.nextDouble();
		change = amountTendered - purchasePrice;
		change = Math.round(change * 100)/100.0;
		
		if (amountTendered < purchasePrice) {
			System.out.println("Not enough money. Get out!");
		}
		else if (amountTendered > purchasePrice) {
			System.out.println("Your change is: " + change);
			while (change > 0) {
				if (change >= 20) {           
					amountOfTwenties = (int) (change / twentyDollarBill); 
					change = Math.round((change - (amountOfTwenties * twentyDollarBill))*100)/100.0;
					System.out.println("The amount of twenties is: " + amountOfTwenties);
				}
			
				else if(change >= 10) {
					amountOfTens = (int) (change / tenDollarBill);
					change = Math.round((change - (amountOfTens * tenDollarBill))*100)/100.0;
					System.out.println("The amount of tens is: " + amountOfTens);
				}
					
				else if (change >= 5) { 
					amountOfFives = (int) (change / fiveDollarBill);
					change = Math.round((change - (amountOfFives * fiveDollarBill))*100)/100.0;
					System.out.println("The amount of fives is: " + amountOfFives);
				}
				else if (change >= 1) {
					amountOfOnes = (int) (change / oneDollarBill);
					change = Math.round((change - (amountOfOnes * oneDollarBill))*100)/100.0;				
					System.out.println("The amount of ones is: " + amountOfOnes);
				}
				else if (change >= .25) {
					amountOfQuarters = (int) (change / quarter);
					change = Math.round((change - (amountOfQuarters * quarter))*100)/100.0;					
					System.out.println("The amount of quarters is: " + amountOfQuarters);
				}
				else if (change >= .10) { 
					amountOfDimes = (int) (change / dime);
					change = Math.round((change - (amountOfDimes * dime))*100)/100.0;				
					System.out.println("The amount of dimes is: " + amountOfDimes);
				}
				else if (change >= .05) {
					amountOfNickles = (int) (change / nickle);
					change = Math.round((change - (amountOfNickles * nickle))*100)/100.0;					
					System.out.println("The amount of nickles is: " + amountOfNickles);
				}
				else if (change >= .01) {
					amountOfPennies = (int) (change / penny);
					change = Math.round((change - (amountOfPennies * penny))*100)/100.0;					
					System.out.println("The amount of pennies is: " + amountOfPennies);
				}
			  }
			}
		else {
		System.out.printf("$%.2f is exact amount needed for purchase.", amountTendered);
			}
		System.out.println("\nThanks for shopping with us today!");
		sc.close();
		}
	  }
