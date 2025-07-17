package com.snakeandladder;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Players p1 = new Players("Dhoni",false);
		Players p2 = new Players("Raina",false);
		Players p3 = new Players("Jaddu",false);
		Players p4 = new Players("Venu",false);
		
		ArrayList<Players> arr = new ArrayList<>();
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);

		SnakeAndLadderForMulti.play(arr);
	
	}

}
