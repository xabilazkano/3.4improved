package com.zubiri.agenda;

public class Note {
	
	private String note;
	
	/**
	 * Gets the note
	 * @return
	 */
	public String getNote() {
		return note;
	}
	
	/**
	 * Sets a new note
	 * @param note1
	 */
	public void setNote(String note1) {
		this.note=note1;
		System.out.println("Succesfully added");
	}
	
	/**
	 * Returns the note as a string
	 * @return
	 */
	public String notetotext() {
		return this.note;
	}

}
