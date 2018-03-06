package space.quest;

import java.util.*;
import java.util.concurrent.*;

public class Game {

	public static int rand (int min, int max) {
		
		int output;
		
		output = (int) (Math.ceil(Math.random() * max) + 1 + min);
		
		return output;
		
	}
	
	public static void main (String[] args) throws InterruptedException {
	
		System.out.println("Welcome to Space Quest 2!\nThe sequel to the first Space Quest\nNow in Java!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Loading...");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("[       ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[*      ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[**     ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[***    ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[****   ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[*****  ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[****** ]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("[*******]");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Please input your username: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Nice to meet you " + name);
		System.out.println("I am Personal Assistant #" + rand(0, 99999));
		
		Boolean genderBool = false;
		System.out.print("Now I need your gender for identification purposes: ");
		
	do {
		
		String gender = in.nextLine();
		gender.toLowerCase();
		
	
		switch (gender) {
		
			case "m":
				
				System.out.println("So, " + name + ", you are a guy.");
				genderBool = true;
				break;
				
			case "f":
				
				System.out.println("So, " + name + ", you are a girl.");
				genderBool = true;
				break;
				
			default:
				
				System.out.print("Please input a valid gender: ");
				gender = "";
				
		}
		
	}while (genderBool == false);
	
	in.close();
		
	}
	
}
