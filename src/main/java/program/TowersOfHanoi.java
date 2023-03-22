/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author CLICK ONCE
 */
public class TowersOfHanoi {
     
    
 
	public void solveTowersOfHanoi(int n, String sourcePeg, String auxPeg, String destPeg)
	{
               
		// If only 1 disk, make the move and return.
		if(n==1)
		{
			System.out.println(sourcePeg+" --> "+destPeg);
			return;
		}
		
		/** Move top n-1 disks from A to B using C as auxiliary.
                 * 
                 * 
                */
		solveTowersOfHanoi(n-1, sourcePeg, destPeg, auxPeg);
		
		//Move remaining disks from A to C
		System.out.println(sourcePeg+" --> "+destPeg);
		
		// Move n-1 disks from B to C using A as auxiliary
		solveTowersOfHanoi(n-1, auxPeg, sourcePeg, destPeg);
               
                   
		
	}
    }

