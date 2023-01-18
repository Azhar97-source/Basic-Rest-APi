package com.zensar.careersolutionswebservice.beans;


public class Qualification {

	private int marks10;
	private int marks12;
	private int marksG;
	private int marksPg;
	
	public Qualification() {
		super();
	}

	public Qualification(int marks10, int marks12, int marksG, int marksPg) {
		super();
		this.marks10 = marks10;
		this.marks12 = marks12;
		this.marksG = marksG;
		this.marksPg = marksPg;
	}

	public int getMarks10() {
		return marks10;
	}

	public void setMarks10(int marks10) {
		this.marks10 = marks10;
	}

	public int getMarks12() {
		return marks12;
	}

	public void setMarks12(int marks12) {
		this.marks12 = marks12;
	}

	public int getMarksG() {
		return marksG;
	}

	public void setMarksG(int marksG) {
		this.marksG = marksG;
	}

	public int getMarksPg() {
		return marksPg;
	}

	public void setMarksPg(int marksPg) {
		this.marksPg = marksPg;
	}

	@Override
	public String toString() {
		return "Qualification [marks10=" + marks10 + ", marks12=" + marks12 + ", marksG=" + marksG + ", marksPg="
				+ marksPg + "]";
	}
	
	
}
