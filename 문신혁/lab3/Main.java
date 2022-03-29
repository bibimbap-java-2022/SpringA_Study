package lab3;
import java.util.Scanner;


public class Main {

    // Scanner 선언 및 생성
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 자신의 이름 출력
        System.out.println("문신혁");
        // 자신의 학번 출력
        System.out.println("202211295");

        // A와 B를 받아 A@B 연산 결과를 출력하는 프로그램 작성
        System.out.print("A를 입력하세요 : ");
        int A = sc.nextInt();
        System.out.print("B를 입력하세요 : ");
        int B = sc.nextInt();

        // A@B = (A+B)*(A-B)
        int K = (A+B)*(A-B);
        System.out.printf("%d\n", K);

	    
        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        System.out.print("C를 입력하세요 : ");
        int C = sc.nextInt();
        System.out.println("(A+B)%C = " + (A+B)%C);
        System.out.println("((A%C) + (B%C))%C = " + ((A%C) + (B%C))%C);
        System.out.println("(A+B)%C = ((A%C) + (B%C))%C");
	
	
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        System.out.println("(A*B)%C = " + (A*B)%C);
	System.out.println("((A%C) * (B%C))%C = " + ((A%C) * (B%C))%C);
        System.out.println("(A+B)%C = ((A%C) * (B%C))%C");        
    }
}
