package com.snakeandladder;

public class Players implements Comparable<Players>{
 
	private int rank=0;
	private int pos=0;
	private String name;
	private boolean isWin;
	
	public Players( String name, boolean isWin) {
		this.name = name;
		this.isWin = isWin;
	}
	

	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isWin() {
		return isWin;
	}


	public void setWin(boolean isWin) {
		this.isWin = isWin;
	}


	@Override
	public String toString() {
		return "Players [rank=" + rank + ", pos=" + pos + ", name=" + name + ", isWin=" + isWin + "]";
	}


	@Override
	public int compareTo(Players o) {
		
		return this.rank -o.getRank();
	}
	
	
	
	
}
