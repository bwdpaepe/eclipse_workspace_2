package ui;

import java.util.stream.IntStream;

public class IntStreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

	    // display original values
	    System.out.print("Original values: ");
	    IntStream.of(values)
	             .forEach(value->System.out.printf("%d ", value));
	    System.out.println();
	    
	    // count, min, max, sum and average of the values
	    System.out.printf("%ncount: %d%n", IntStream.of(values)
	    		                                    .count());
	    
	    System.out.printf("%nmin: %d%n", IntStream.of(values)
	    		                                  .min()
	    		                                  .getAsInt());
	    
	    System.out.printf("%nmax: %d%n", IntStream.of(values)
                								  .max()
                								  .getAsInt());
	    
	    System.out.printf("%nsum: %d%n", IntStream.of(values)
                								  .sum());
	    
	    System.out.printf("%naverage: %.2f%n", IntStream.of(values)
                									  .average()
                									  .getAsDouble());
	    
	    // sum of values with reduce
	    System.out.printf("%nsum via reduce: %d%n", IntStream.of(values)
				  											 .reduce(0,(x,y)->x+y));
	    
	    System.out.printf("%nsum of squares via reduce: %d%n", IntStream.of(values)
					 													.reduce(0,(x,y)->x*x+y*y));
	    
	    System.out.printf("%nproduct via reduce: %d%n", IntStream.of(values)
					 											 .reduce(0,(x,y)->x*y));
	      
	    // displaying the elements in sorted order
	    System.out.printf("Values displayed in sorted order: ");
	    IntStream.of(values)
	             .sorted()
	             .forEach(value->System.out.printf("%d ",  value));
	    
	    //odd values multiplied by 10 displayed in sorted order
	    System.out.printf("odd values multiplied by 10 displayed in sorted order: ");
	    IntStream.of(values)
	             .filter(value->value%2!=0)
	             .map(value->value*10)
	             .sorted()
	             .forEach(value->System.out.printf("%d ", value));
	    
	    System.out.printf("%n sum 1-9: %d%n", IntStream.range(1, 10).sum());
	}

}
