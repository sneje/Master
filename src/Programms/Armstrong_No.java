package Programms;

public class Armstrong_No {
public static void main(String arg[]) {
	int no=153;
	int temp=no;
	int reminder;
	 int result=0;
	while(temp!=0) {
		reminder=temp/10;
		result=result+reminder*reminder*reminder;
		temp=temp/10;
	}
	if(result==no) {
		System.out.println("no is armstrong");
	}
}
}
