
package program;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    TowersOfHanoi obj = new TowersOfHanoi();
		
		System.out.println("Enter number of disks :- ");
	    
		Scanner scanner = new Scanner(System.in);
		int disks = scanner.nextInt();
		scanner.close();
		
		System.out.println("Move disks as below illustration.");
		obj.solveTowersOfHanoi(disks, "A", "B", "C");
                double totalMoves=Math.pow(2, disks)-1;
                System.out.println("TOTAL NUMBER OF MOVES: " + totalMoves) ;  
                
    }
   
}