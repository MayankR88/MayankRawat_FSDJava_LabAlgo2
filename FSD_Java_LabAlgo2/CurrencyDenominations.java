package com.FSD_Java_LabAlgo2;

import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the currency denominations value: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		while (true) {
			int flag = 0;
			long amountpay;
			System.out.println("Enter the amount you want to pay: ");
			amountpay = sc.nextInt();
			long sum = 0;

			if (amountpay > 0) {
				System.out.println("Your payment approach in order to give minimum no of notes will be: ");
				for (int i = 0; i < size; i++) {
					sum += arr[i];
					if (sum <= amountpay) {
						for(int j =0; j < size; j++) {
							System.out.println((arr[i]) + ":" + (amountpay / arr[j]));
							flag = 1;
							break;
						}
					}
				}
			}

			if (amountpay == 0) {
				System.out.println("*****Invalid amount .,i., 0*****");
				break;
			}
		}
	}
}
