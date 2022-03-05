package com;
public class LongestIncreasingSubsequence {
	
	public static int lis(int arr[], int arrLen){
	      int seqArr[] = new int[arrLen];
	      int a, b, max = 0;
	      for (a = 0; a < arrLen; a++)
	         seqArr[a] = 1;
	      for (a = 1; a < arrLen; a++)
	      for (b = 0; b < a; b++)
	      if (arr[a] > arr[b] && seqArr[a] < seqArr[b] + 1)
	      seqArr[a] = seqArr[b] + 1;
	      for (a = 0; a < arrLen; a++)
	      if (max < seqArr[a])
	      max = seqArr[a];
	      return max;
	   }

	public static void main(String[] args) {
		
		 int my_arr[] = { 32, 64, 615, 43, 25, 58, 49, 24 };
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +lis(my_arr, arr_len));
		

	}

}


