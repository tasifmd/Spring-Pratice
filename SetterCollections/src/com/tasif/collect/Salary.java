package com.tasif.collect;

public class Salary {
	private String month;
	private int amount;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Salary [month=" + month + ", amount=" + amount + "]";
	}	
}
