package com.lib.demo.bean;

//import java.util.List;
import java.util.Set;

public class Book {
	private String name;
	private int id;
	private int num;
	private Set<User> borrowedUsers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Set<User> getBorrowedUsers() {
		return borrowedUsers;
	}

	public void setBorrowedUsers(Set<User> borrowedUsers) {
		this.borrowedUsers = borrowedUsers;
	}
}
