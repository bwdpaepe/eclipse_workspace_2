package domein;

import java.util.Comparator;
 
public class Vergelijknaam implements Comparator<Student>
{
    //sorteren per naam en bij gelijke naam op stamboeknummer
    @Override    
    public int compare(Student o1, Student o2)
    {
       int res = o1.getNaam().compareTo( o2.getNaam() );
       if(res==0)
           res = o1.compareTo(o2);
       return res;
    }

}
