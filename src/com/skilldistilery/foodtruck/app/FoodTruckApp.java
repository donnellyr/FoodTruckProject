package com.skilldistilery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

import com.skilldistilery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	Foodtruck output = new Foodtruck();

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.userInput();

	}

	private void userInput() {
		Scanner sc = new Scanner(System.in);
		int truckID = 0, truckRating = 0, average = 0;
		String truckName = "", foodType = "";
		String truckList[] = new String[5];
		int winner[] = new int[5];
		for (int i = 0; i < truckList.length; i++) {
			System.out.println("Please enter a food truck name or Quit to continue");
			truckName = sc.nextLine();
			if (truckName.equals("Quit") || truckName.equals("quit")) {
				break;
			}

			else if (truckName != null)
				System.out.println("What type of food does this truck serve?");
			foodType = sc.nextLine();

			System.out.println("On a scale of 1-5 what would you rate this truck?");
			truckRating = sc.nextInt();
			++truckID;
			truckList[i] = "Truck ID: " + truckID + " Truck Name: " + truckName + " Food Type: " + foodType
					+ " Rating: " + truckRating;
			average += truckRating;
			winner[i] = truckRating;
			truckName = sc.nextLine();

		}

		int choice = 0;
		boolean repeat = true;
		while (repeat) {
			System.out.println("1. List all trucks");
			System.out.println("2. See truck raiting average");
			System.out.println("3. Display the highest rated truck");
			System.out.println("4. quit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				output.getfoodTruck(truckList);
				// appMenue();
				break;
			case 2:
				System.out.println("Average truck Rating: " + output.truckAverage(average, truckID));
				// appMenue();
				break;
			case 3:
				output.bestTruck(truckList, winner);
				// appMenue();
				break;
			case 4:
				System.out.println("Have a good day!");
				repeat = false;
				break;

			}
		}
	}
}
