package cui;

import java.util.Arrays;

import domein.Container;
import domein.Vergelijk_massa;

public class ContainerApplicatie {

    public static void main(String[] args) {
        Container[] containers = new Container[4];
        
        containers[0] = new Container("Antwerpen", 60, 150, 1234);
        containers[1] = new Container("Rotterdam", 70, 110, 2568);
        containers[2] = new Container("Calais", 80, 90, 8569);
        containers[3] = new Container("Brugge", 70, 100, 8564);
         
        // Stap 1
        Arrays.sort(containers);
        System.out.println(Arrays.toString(containers));
        // Stap 2
        Arrays.sort(containers,new Vergelijk_massa());
        System.out.println(Arrays.toString(containers));
        // Stap 3
        Arrays.sort(containers, new Vergelijk_eigenaar());
        System.out.println(Arrays.toString(containers));
        // Stap 4
        Container nieuweContainer = new Container("Antwerpen", 70, 75, 8564);
        for(Container cc: containers) {
        	if(nieuweContainer.equals(cc)) {
        		
        	}
        }
    }
}