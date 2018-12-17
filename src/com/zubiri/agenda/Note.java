package com.zubiri.agenda;

public class Note {
	
	private String note;
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note1) {
		this.note=note1;
		System.out.println("Succesfully added");
	}
	
	public String notetotext() {
		return this.note;
	}

}
