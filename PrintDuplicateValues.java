package week1.day2;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
//		int [] arr = {14,12,13,11,15,14,18,16,17,19,18,20};
//		Arrays.sort(arr);
//		int count;
//		for (int i =0; i < arr.length; i++) 
//		{
//		count = 1;
//		for (int j = i+1; j < arr.length; j++ ) {
//		
//			if (arr[i] == arr[j]) {
//				count++; 
//			}
//		}
//			
//		if (count > 1)
//		{
//			System.out.println(arr[i]);
//			
//		}}}}
//			
// another method of less codes		
int [] arr = {14,12,13,11,15,14,18,16,18,20};

Arrays.sort(arr);

for (int i = 0; i < arr.length-1; i++) 
{ if (arr[i] == arr[i+1]);{
System.out.println(arr[i]);
}
	}}}