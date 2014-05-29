package com.codehunt.yxiaolv;

public class StringBufferCharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Test Test9998";
		StringBuffer strBuf = new StringBuffer(s);
		for(int i=0; i< strBuf.length();i++)
		{
			if(strBuf.charAt(i) != (char)0x20)
				strBuf.setCharAt(i, Character.toUpperCase(strBuf.charAt(i)));
				
		}
		System.out.println("str="+strBuf.toString());
		
		
		System.out.println("endthree="+ s.substring(s.length()-3));
		
		System.out.println("endthree2="+ Program.Puzzle(s));
		
		
	}
	
	
    public static class Program {
        public static String Puzzle(String s) {
             if(s.length()>=3)
                      return (String) s.subSequence(s.length()-3, s.length());
    	     else return s;
        }
    }


}
