package com.skilldistilery.foodtruck.entities;

public class Foodtruck {

	public void bestTruck(String[] truckList, int[] rating) {
		int currentBest = 0;
		String bestTruck = "";
		for (int i = 0; i < rating.length; i++) {
			if (rating[i] > currentBest) {
				currentBest = rating[i];
				bestTruck = truckList[i];
			}
		}
		System.out.println("The best rated truck is " + bestTruck);
	}

	public void displayTruck(String[] truckList) {

		for (int i = 0; i < truckList.length; i++) {
			if (truckList[i] != null) {
				System.out.println(truckList[i]);
			}

		}
	}

	public int truckAverage(int average, int truckID) {
		int output = average / truckID;
		return output;
	}
}
