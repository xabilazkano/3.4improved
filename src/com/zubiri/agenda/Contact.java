package com.zubiri.agenda;

import java.util.ArrayList;

public class Contact {

	private Person pertsona;
	private int number;
	private String address;
	private ArrayList<Note> notes = new ArrayList<Note>();

	/**
	 * Default constructor
	 */
	public Contact() {

	}

	/**
	 * Second constructor
	 * @param person Object of type person
	 * @param number
	 * @param address
	 */
	public Contact(Person person, int number, String address) {
		this.pertsona = person;
		this.number = number;
		this.address = address;
	}

	/**Set a new person
	 * 
	 * @param person
	 */
	public void setPerson(Person person) {
		this.pertsona = person;
	}

	/**Gets the person
	 * 
	 * @return
	 */
	public Person getPerson() {
		return this.pertsona;
	}

	/**Sets a new telephone number
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**Gets the telephone number
	 * 
	 * @return
	 */
	public int getNumber() {
		return this.number;
	}

	/**Sets a new address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**Gets the address
	 * 
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}
	
	public ArrayList<Note> getNotes(){
		return this.notes;
	}
	
	public void setNotes(ArrayList<Note> notes2) {
		this.notes=notes2;
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}
	
	public void readNotes() {
		for (int i=0;i<notes.size();i++) {
			System.out.println(notes.get(i).notetotext());
		}
	}
	/**Gets the contact
	 * 
	 * @return Returns all the information of the contact
	 */
	public String getContact() {
		return pertsona.tostring() + " " + number + " " + address;

	}
}
