package com.codehunt.yxiaolv;

public class RecursePower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=2, power=9;
		
		Puzzle(number, power);
		
		String str;
		

	}

    static int nRet = 1;
    
    public static int Puzzle(int number, int power) {
    	

		 System.out.println("power="+power + " nRet="+nRet); //here print nRet=1 ???
		 
		 
		 if(1== power)
		 {
			 nRet = nRet*number;
		 }
		
         if((power--)>1)
		 {
        	 System.out.println("_power="+power + " nRet="+nRet); //here print nRet=1 ???
        	 nRet = nRet*number * Puzzle(number,power);
		 }

		 System.out.println("__power="+power + " nRet="+nRet); //here the value is right; 
		 return nRet;	
    }

}
