package main;

import cui.BeheersKostenApplicatie;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomeinController dc = new DomeinController();
		new BeheersKostenApplicatie(dc);

	}

}
