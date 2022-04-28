/*1번.조깅
 * 
 * 
 */

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input value");
		
		Scanner scn = new Scanner(System.in);
		String inputValue = scn.nextLine();
		
		String [] values = inputValue.split(" ");
		
		int takaSPS = Integer.parseInt(values[0]);
		int takaS = Integer.parseInt(values[1]);
		int takaTR = Integer.parseInt(values[2]);
		int aokiSPS = Integer.parseInt(values[3]);
		int aokiS = Integer.parseInt(values[4]);
		int aokiTR = Integer.parseInt(values[5]);
		
		int x = Integer.parseInt(values[3]);
		
		
		
		System.out.println("taka");
		//로직 파트
		
		
		//System.out.println(values[0]);
		//System.out.println(values[6]);
	}

}
