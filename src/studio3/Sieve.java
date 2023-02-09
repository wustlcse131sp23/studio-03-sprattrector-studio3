package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your n value?");
		int nValue= in.nextInt();
		int [] nArray = new int [nValue];
		int i= 0;
	while (i * 2 < nValue){
		int evenNum = i * 2;
		i++;
		System.out.println(evenNum);
		nArray [evenNum] = 4;
	}
	int i1 = 0;
	while (i1 * 3< nValue) {
		int threeNum = i1 * 3;
		i1++;
		System.out.println(threeNum);
		nArray [threeNum] = 4; 
		
	}
		for(int index =0; i1 < nArray.length; i1++) {
		 index = 4;
			System.out.println(nArray[index]);
		}
	}
}

// 4 is false number


