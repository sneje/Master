package Programms;

import java.util.Arrays;

public class ArrayEqual {
public static void main(String arg[]) {
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,3,4,5};
	int c[]= {1,2,3};
	
	System.out.println(Arrays.equals(a, b));
	System.out.println(Arrays.equals(b, c));
}
}
