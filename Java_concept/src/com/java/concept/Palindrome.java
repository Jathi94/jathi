package com.java.concept;

public class Palindrome {
	
	public static void main(String[] args) throws InterruptedException {
		
//		int aa[]=new int[5];
//		int a[] = {1,2,3,4};
//		int b[][]= {{1,2,3},{4,5,6}};
		String str = "lollol";
		Thread.sleep(1000);
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println(str + " is not palindrome");
				System.exit(0);

			}

			i++;
			j--;

		}
		System.out.println(str + " is palindrom. ");
	}
}


