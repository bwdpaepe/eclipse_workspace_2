package cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domein.Student;
import domein.Vergelijk_naam;
import domein.Vergelijk_naam_voornaam;

public class StudentApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arrayStudenten = new Student[5];

        List<Student> lijstStudenten = new ArrayList<>();
        lijstStudenten.add(new Student(20132566, "Janssens", "Wendy", "Eke"));
        lijstStudenten.add(new Student(20132567, "Janssens", "Hans", "Oudenaarde"));
        lijstStudenten.add(new Student(20132563, "Janssens", "Jan", "Gent"));
        lijstStudenten.add(new Student(20132564, "Karels", "Matt", "Gent"));
        lijstStudenten.add(new Student(20132565, "Fransen", "Luc", "Gent"));

        System.out.println("Lijst: ");
        System.out.println(lijstStudenten);
        System.out.println();
        
        arrayStudenten = lijstStudenten.toArray(arrayStudenten);
        
        System.out.println("Array gesorteerd volgens stamboeknr: ");
        Arrays.sort(arrayStudenten);
        System.out.println(Arrays.toString(arrayStudenten));
        
        System.out.println("Array gesorteerd volgens naam en bij gelijke naam op voornaam: ");
        Arrays.sort(arrayStudenten, new Vergelijk_naam_voornaam());
        System.out.println(Arrays.toString(arrayStudenten));
        
        System.out.println("Array gesorteerd volgens naam en bij gelijke naam op stamboeknummer: ");
        Arrays.sort(arrayStudenten, new Vergelijk_naam());
        System.out.println(Arrays.toString(arrayStudenten));
        
        Student s1 = new Student(102, "Jan", "Jan", "Jabbeke");
        Student s2 = new Student(102, "Jan", "Jan", "Jabbeke");

        if (s1.equals(s2))
        {
            System.out.print("dezelfde");
        } else
        {
            System.out.print("verschillend");
        }

	}

}
