/**
 * 
 */
package com.codehunt.yxiaolv;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Administrator
 *
 */
public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int a[] = Puzzle(n); 
		for(int i=0; i<n; i++)
			System.out.println("["+i+"]="+a[i]);

	}

	
    public static int[] Puzzle(int n) {
        List<Integer> listA = new ArrayList<Integer>();
		for(int i=0;i<n;)
		{
			listA.add(i);
			i++;
		}
		
		int[] aRet = new int[listA.size()];
		for(int i=0;i<n;)
		{
			aRet[i] = listA.get(i);
			i++;
		}		
				
		return aRet;
    }
}
