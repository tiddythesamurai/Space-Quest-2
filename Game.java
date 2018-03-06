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
		TimeUnit.SECONDS.sleep(1);
		System.out.println("I am Personal Assistant #" + rand(0, 99999));
		TimeUnit.SECONDS.sleep(1);
		Boolean genderBool = false;
		System.out.print("Now I need your gender for identification purposes: ");
		
	do {
		
		String gender = in.nextLine();
		gender.toLowerCase();
		
	
		switch (gender) {
		
			case "m":
				
				TimeUnit.SECONDS.sleep(1);
				System.out.println("So, " + name + ", you are a guy.");
				genderBool = true;
				break;
				
			case "f":
				
				TimeUnit.SECONDS.sleep(1);;
				System.out.println("So, " + name + ", you are a girl.");
				genderBool = true;
				break;
				
			default:
				
				System.out.print("Please input a valid gender: ");
				gender = "";
				
		}
		
	}while (genderBool == false);
	
	System.out.print("Now its time to pick a name for your ship, Captain: ");
	String shipName = in.nextLine();
	Boolean shipNameBool = false;
	do {	
		if(shipName != "") {
			shipNameBool = true;
			System.out.println("\"" + shipName + ".\" That’s not a bad name.");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Now, your ship doesn’t exactly exist at this moment because it doen’t have a class.");
		}else{
			
			System.out.println("Unfortunately, your ship name cannot be empty.");
			
		}
	}while (shipNameBool == false);
	
	System.out.println("Don’t worry, I will walk you through the classes and stats.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("The first stat is health.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Each class has a different amount of health, heavy has more, light has less.");
	TimeUnit.SECONDS.sleep(2);
	System.out.println("The next stat is shield");
	in.close();
		
	}
	
}
