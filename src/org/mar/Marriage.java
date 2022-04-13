package org.mar;

import java.util.Scanner;

public class Marriage {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
		if (age>21) {
			System.out.println("Girls Eligble for marriage");
		}
		else if(age>=18) {
			System.out.println("Boys eligble for marriage");
		}
	    else if(age<18) {
				System.out.println("not eligible for marriage");
			}
		
		else {
			System.out.println("None");
		}
	}
	}


