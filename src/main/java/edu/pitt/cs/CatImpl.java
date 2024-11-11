package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id;
	private String name;
	private Boolean rented = false;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		if (!rented) {
			rented =  true;
		}  
	}

	public void returnCat() {
		if (rented) {
			rented = false;
		}
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() 
	{
		return this.rented;
	}

	public String toString() {
		return "ID " + this.id + ". " + this.name;
	}

}