/**
 * This program calculates PI 
 * @author (Fikri San Koktas)
 * @version (18 February 2021)
 */
public class KFS_MonteCarloSimulation_Main
{
    public static void main(String[] args)
      {
   	 int i;                                                               
   	 int nThrows = 0;                                             
   	 int nSuccess = 0;                                            
   									
   	 double x, y;                                                 						
   	 for (i = 0; i < 1000000 ; i++)                         
   	 {                                                            
   	    x = Math.random(); // Throw a dart                   
   	    y = Math.random();  
   	    
   	    nThrows++;                                                        							
   	    if ( x*x + y*y <= 1 )             
   	       nSuccess++;                                               
   	 }                                                            							
   	 System.out.println("Pi = " + 4*(double)nSuccess/(double)nThrows );
      }
}
