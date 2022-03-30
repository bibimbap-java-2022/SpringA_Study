package bibimbap_study;

import java.util.Scanner;

public class Main_v2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("김도형");
		System.out.println("202211264");
		
		int A,B,C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		program1(A,B);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		program2(A,B,C);
	}
	
	
	
	
	public static void program1(int A, int B) {
		System.out.printf("A@B = %d\n", calculation1(A,B));
	}
	
	public static void program2(int A,int B, int C) {
		System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
		calculation2(A,B,C);
		
		System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");
		calculation3(A,B,C);
	}
	
	
	
	
	public static int calculation1 (int A, int B) {
		return (A+B)*(A-B);
	}
	
	public static void calculation2(int A, int B, int C) {
		int x = (A+B)%C;
		int y = ((A%C) + (B%C))%C;
		
		if(x==y) System.out.printf("%d == %d 로 같다.\n",x,y);
		else if(x!=y) System.out.printf("%d != %d 로 다르다.\n",x,y);
	}
	
	public static void calculation3(int A, int B, int C) {
		int x = (A*B)%C;
		int y = ((A%C) * (B%C))%C;
		
		if(x==y) System.out.printf("%d == %d 로 같다.",x,y);
		else if(x!=y) System.out.printf("%d != %d 로 다르다.",x,y);
	}

}
