package main;

import domein.DomeinController;
import ui.WinkelApplicatie;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomeinController dc = new DomeinController();
		new WinkelApplicatie(dc).start();

	}

}
