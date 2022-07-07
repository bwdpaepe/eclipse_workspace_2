package main;

import cui.RekeningApplicatie;
import cui.RekeningApplicatie2;
import cui.RekeningApplicatie3;
import domein.DomeinController;

public class StartUp
{

    public static void main(String[] args)
    {
        DomeinController dc = new DomeinController();
    	RekeningApplicatie ra = new RekeningApplicatie(dc);
    	ra.werkMetRekeningen();
        //new RekeningApplicatie2();
        //new RekeningApplicatie3();
    }
}
