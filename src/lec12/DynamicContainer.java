package lec12;

import java.util.Arrays;

public class DynamicContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=3;
		int [] a=new int[n];
		int j=0;
		for(int i=0;i<100;i++){
			if(j>=n){				
				int[] a2=new int[n*2];
				for(int k=0;k<n;k++)
					a2[k]=a[k];
				a=a2;
				n=2*n;
			}
			a[j]=i;
			j++;
			System.out.println(Arrays.toString(a));
		}
		
	}

}
