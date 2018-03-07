package space.quest;

import java.util.*;
import java.util.concurrent.*;

public class Game {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

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
		if (name.isEmpty()) {
			
			name = "NULL";
			
		}
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
	
	
	Boolean shipNameBool = false;
	do {
		System.out.print("Now its time to pick a name for your ship, Captain: ");
		String shipName = in.nextLine();
		
		if(!shipName.isEmpty()) {
			shipNameBool = true;
			System.out.println("\"" + shipName + ".\" That’s not a bad name.");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Now, your ship doesn’t exactly exist at this moment because it doen’t have a class.");
		}else if (shipName.isEmpty()){
			
			System.out.println("Unfortunately, your ship name cannot be empty.");
			
		}
	}while (shipNameBool == false);
	
	System.out.println("Don’t worry, I will walk you through the classes and stats.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("The first stat is health.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Each class has a different amount of health, heavy has more, light has less.");
	TimeUnit.SECONDS.sleep(3);
	System.out.println("The next stat is shield.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("The anmount of shield is the same on every ship,\nhowever the shield only prevents energy weapons from penetrating it, normal weapons will pass right through it.");
	TimeUnit.SECONDS.sleep(3);
	System.out.println("Now lets move on to speed.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Light ships have more speed than heavy ships.\nSpeed determines how long it takes to travel to destinations.\nIt also determines the chance that your ship will dodge an attack.");
	TimeUnit.SECONDS.sleep(4);
	System.out.println("Next we have damage.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Each ship has a base damage value, with heavy ships having slightly more than light.\nThis base damage is added to the damage of an attack, and the total damage is done to the enemy.");
	TimeUnit.SECONDS.sleep(4);
	System.out.println("Lastly, we have dodge chance.");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Dodge chance is higher in light ships, and heavy ships are incapable of dodging.");
	TimeUnit.SECONDS.sleep(2);
	
	in.close();
		
	}
	
}
