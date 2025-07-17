package com.snakeandladder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		Scanner sc =new Scanner(System.in);
		
		int position=0;
		
		Map<Integer,Integer> ladder = new HashMap();
		ladder.put(8, 34);
		ladder.put(17, 43);
		ladder.put(22, 99);
		ladder.put(56, 97);
		
		Map<Integer,Integer> snakes = new HashMap();
		snakes.put(99, 1);
		snakes.put(91, 78);
		snakes.put(69, 49);
		snakes.put(37, 11);
		
		while(position< 100) {
			System.out.println("Roll The Dice ");
			sc.nextLine();
			int rdvalue = rn.nextInt(6)+1;
			System.out.println("Your Dice Number  is: "+rdvalue);
			position+=rdvalue;
			
			System.out.println("Your Position is :"+position);
			
			if(position > 100) {
				position-=rdvalue;
			}
			
			
			for(int n :ladder.keySet()) {
				if(n==position) {
					Integer value = ladder.get(n);
					System.out.println("Congrats You Move from "+position+" to "+value);
					position=value;
				}
			}
			
			for(int n :snakes.keySet()) {
				if(n==position) {
					Integer value = snakes.get(n);
					System.out.println("Oops You Move from "+position+" to "+value);
					position=value;
				}
			}
			if(position==100) {
				System.out.println("You Won the game !");
			}
		}
		
		
	}

}
