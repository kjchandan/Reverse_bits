package Reverse_bits;

import java.util.*;
public class reverse_bits {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int n= scan.nextInt();  //1
		int f=31,l=0; //first = 31bits, last =0 bit. 
		int rev = 0;
		
		while(f>l){
			if((n & (1<<f)) != 0){
				rev = rev|(1<<l);
			}
			
			if((n & (1<<l))!= 0) {
				rev = rev | (1<<f);	
			}
			f--;
			l++;
		}
		System.out.println(rev); //output=-2147483648 (minimum nmber the the intgeer can store).
		
		
	}

}
