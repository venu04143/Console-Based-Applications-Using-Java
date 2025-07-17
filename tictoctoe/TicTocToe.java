package com.tictoctoe;

import java.util.Scanner;

public class TicTocToe {

	static char[][] table = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	static char currentPlayer = 'X';
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			display();
			System.out.println("Enter row");
			int row=sc.nextInt();
			System.out.println("Enter col");
			int col=sc.nextInt();
			
			if(row < 0 || row > table.length || col <0 || col>table.length || table[row][col]!=' ') {
				System.out.println("Invalid Position");
				continue;
			}else {
				table[row][col]=currentPlayer;
			}
			if(isWin()) {
				display();
				System.out.println("Player "+currentPlayer+" is Win.");
				System.out.println("Do You Want Play Again ! Yes / No :");
				String ans = sc.next();
				sc.nextLine();
				
				if(ans.equalsIgnoreCase("yes")) {
					 char[][] table2 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
					 table = table2;
				}else {
					break;
				}
			}
			if(checkDraw()) {
				display();
				System.out.println("Match Draw");
				System.out.println("Do You Want Play Again ! Yes / No :");
				String ans = sc.next();
				sc.nextLine();
				if(ans.equalsIgnoreCase("yes")) {
					 char[][] table2 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
					 table = table2;
				}else {
					break;
				}
			}
			currentPlayer = currentPlayer=='X'? 'O':'X';
		}
		
		
	}
	
	public static void display() {
		for(char[] c : table) {
			System.out.print("| ");
			for(char c1 : c) {
				System.out.print(c1+" | ");
			}
			System.out.println();
		}
	}
	public static boolean isWin() {
		
		for(int i=0;i<table.length;i++) {
			if(table[i][0]==currentPlayer && table[i][1]==currentPlayer && table[i][2]==currentPlayer) {
				return true;
			}
		}
		for(int i=0;i<table.length;i++) {
			if(table[0][i]==currentPlayer && table[1][i]==currentPlayer && table[2][i]==currentPlayer) {
				return true;
			}
		}
		if(table[0][0]==currentPlayer && table[1][1]==currentPlayer && table[2][2]==currentPlayer) {
			return true;
		}
		if(table[0][1]==currentPlayer && table[1][1]==currentPlayer && table[2][0]==currentPlayer) {
			return true;
		}
		return false;
	}
	
	public static boolean checkDraw() {
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				if(table[i][j]==' ') {
					return false;
				}
			}
		}
		return true;
	}

}
