package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
public static void main(String[] args) {
		
		int[] x = {1,3,4,5,6,7,8};
		Arrays.sort(x);
		for(int i=0;i<x.length;i++) {
			if(x[i]==(i+1)) {
				continue;
			}else {
				System.out.println("Missing Element in an array is : " +(i+1));
				break;
			}
			
		}
		
	}

	}


