package streamTest;

import java.util.HashMap;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class CountVar {

	public static void main(String[] args) {
		int temp=0;
		int arr[] = new int[]{1,10,2,11,2,3};

		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]>arr[j]) //arr[0]>arr[1] 10>2
		{

		temp = arr[i];         
		arr[i] = arr[j];
		arr[j] = temp;
		
		 }
		}
		
		System.out.println(arr[i]);    
	   }
		
		
	}
}
	