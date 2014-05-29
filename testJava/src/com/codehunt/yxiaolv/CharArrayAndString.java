package com.codehunt.yxiaolv;

import java.lang.Integer;

public class CharArrayAndString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strTemp = Program.Puzzle("Test");
		System.out.println("cString=" + strTemp);
		
		StringBuffer strBuf = new StringBuffer();
		strBuf.append('b');
		
		String strFromAscII = Program2.asciiToString("97,98,99,100,101,103");
		System.out.println("strFromAscII="+strFromAscII);

		String strToAscII = Program2.stringToAscii("abcdeg");
		System.out.println("strToAscII="+strToAscII);
		
		String strPuzzle = Program2.Puzzle("aabb");
		System.out.println("strPuzzle=" + strPuzzle);


	}
	
	Integer a = new Integer(0);
	
	
	private static class Program {
	    public static String Puzzle(String s) {
	        int m = 0;
	        char[] c = new char[s.length()];
			
			for(int i=0;i<s.length();i++)
			{
				c[i]='f';
				System.out.println("c["+i+"]=" + c[i]);
			}
			
			System.out.println("cString=" + new String(c));
	        return new String(c); //assign OK; c.toString will get pointer address
	    }
	}
	
	public static class Program2 {
	    public static String Puzzle(String s) {
	        StringBuffer strBuf = new StringBuffer();
	        char[] c = s.toCharArray();


	        for(int i=0;i<s.length();i++)
			{
				if(c[i]<='e')
				strBuf.append((char)((int)(c[i])+5));
			}		        
	        return strBuf.toString();
	    }
	    
		public static String asciiToString(String value)
		{
			StringBuffer sbu = new StringBuffer();
			String[] chars = value.split(",");
			for (int i = 0; i < chars.length; i++) {
				sbu.append((char) Integer.parseInt(chars[i]));
			}
			return sbu.toString();
		}
		
		public static String stringToAscii(String value)
		{
			StringBuffer sbu = new StringBuffer();
			char[] chars = value.toCharArray(); 
			for (int i = 0; i < chars.length; i++) {
				if(i != chars.length - 1)
				{
					sbu.append((int)chars[i]).append(",");
				}
				else {
					sbu.append((int)chars[i]);
				}
			}
			return sbu.toString();
		}
	}
	


}
