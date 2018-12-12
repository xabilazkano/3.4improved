package com.zubiri.agenda;

import java.util.ArrayList;

/**
 * 
 * @author xabilazkano
 *
 */

public class Agenda {

	private ArrayList<Contact> kontaktuak = new ArrayList<Contact>();
	private ArrayList<Contact> favourites = new ArrayList<Contact>();
	
	public ArrayList<Contact> getfavourites() {
		return this.favourites;
	}
	
	public void  setfavourites(ArrayList<Contact> _favourites){
		this.favourites=_favourites;
	}
	
	//public void addFavourite{
		
	//}
	/**
	 * Returns the contact arrayList
	 * 
	 * @return the whole arrayList
	 */

	public ArrayList<Contact> getKontaktuak() {
		return this.kontaktuak;
	}

	/**
	 * Sets a new arrayList
	 * 
	 * @param _kontaktuak the arrayList that we want to asign to the property
	 */
	public void setKontaktuak(ArrayList<Contact> _kontaktuak) {
		this.kontaktuak = _kontaktuak;
	}
	

	

	/**
	 * Adds a contact
	 * 
	 * @param contact
	 */

	public void addContact(Contact contact) {

		kontaktuak.add(contact);

	}

	/**
	 * Reads a contact
	 * 
	 * @param name The name of this contact
	 * @return returns all the data of an specific contat
	 */
	public String readContact(String name) {

		if (index(name) == 100) {
			return "Contact not found";
		} else {
			return kontaktuak.get(index(name)).getContact();
		}
	}

	public void readAll() {

		for (int i = 0; i < kontaktuak.size(); i++) {
			System.out.println(kontaktuak.get(i).getContact());
		}
	}

	/**
	 * Deletes a contact
	 * 
	 * @param name
	 */

	public void deleteContact(String name) {

		if (index(name) == 100) {
			System.out.println("Contact not found");
		} else {
			kontaktuak.remove(index(name));
			System.out.println("Succesfuly deleted");
		}
	}

	public void deleteAll() {
		for (int i = 0; i < kontaktuak.size(); i++) {

			kontaktuak.remove(i);
			
		}
		System.out.println("All the contacts were deleted");

	}

	/**
	 * Modifies a contact
	 * 
	 * @param name  Name of the contact
	 * @param what  What information to delete
	 * @param value New value
	 */
	public void modifyContact(String name, String what, String value) {
		if (index(name) == 100) {
			System.out.println("Contact not found");
		} else {

			switch (what) {

			default:
				System.out.println(what + " is not saved in this agenda");
				break;

			case "name":

				kontaktuak.get(index(name)).getPerson().setName(value);
				System.out.println("Succesfuly edited");
				break;

			case "age":
				int val = Integer.parseInt(value);
				kontaktuak.get(index(name)).getPerson().setAge(val);
				System.out.println("Succesfuly edited");

				break;

			case "weight":
				double val2 = Double.parseDouble(value);
				kontaktuak.get(index(name)).getPerson().setWeight(val2);
				System.out.println("Succesfuly edited");
				break;

			case "dni":

				kontaktuak.get(index(name)).getPerson().setDni(value);
				System.out.println("Succesfuly edited");
				break;

			case "number":

				val = Integer.parseInt(value);

				kontaktuak.get(index(name)).setNumber(val);
				System.out.println("Succesfuly edited");
				break;

			case "address":

				kontaktuak.get(index(name)).setAddress(value);
				System.out.println("Succesfuly edited");
				break;

			}

		}
	}
	
	public void order() {
		for (int i = 0;i<kontaktuak.size()-1;i++) {
			int num= kontaktuak.get(i).getPerson().getName().compareTo(kontaktuak.get(i+1).getPerson().getName());
			if (num>0) {
				Contact aux= kontaktuak.get(i);
				kontaktuak.set(i, kontaktuak.get(i+1));
				kontaktuak.set(i+1, aux);
			}
		}
		System.out.println("Contacts ordered");
	}
	

	/**
	 * Finds the index of a contact
	 * 
	 * @param name Name of the contact
	 * @return Index of the contact
	 */
	private int index(String name) {
		int index = 100;
		for (int i = 0; i < kontaktuak.size(); i++) {
			if (kontaktuak.get(i).getPerson().getName().matches(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

}