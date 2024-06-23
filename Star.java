
import java.util.Scanner;


//비기너 별짓기
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=100&&(b>0&&4>b)) {
            switch (b) {
                case 1:
                    for (int i = 0; i <= a; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = a; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 1; i < a*2; i+=2) {
                        for(int j = a*2; j-1 > i; j-=2) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z < i; z++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        } else {
            System.out.println("INPUT ERROR!");
        }
    }
}

