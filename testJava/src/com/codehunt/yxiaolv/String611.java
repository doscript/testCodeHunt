package com.codehunt.yxiaolv;

public class String611 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program.Puzzle(0, 2, null);

	}
	

	public static class Program {
	    public static String Puzzle(int i, int j, String s) {
//	        StringBuffer sbTmp = new StringBuffer();
	        char [] charArr = {(char) (i+97),(char) (j+97)};
//			sbTmp.append((i+97));
//			sbTmp.append((j+97));
	        System.out.println("strout="+new String(charArr));
			return new String(charArr); //这种codehunt会报错；
			
	    }
	}  

}
