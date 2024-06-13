
//연산자 자가진단1
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine(); //입력된 문자열
        String[] str1Change = str1.split(" "); //공백으로 나누기
        int x = Integer.parseInt(str1Change[0]);
        int y = Integer.parseInt(str1Change[1]);
        int z = Integer.parseInt(str1Change[2]);
        int sum = x+y+z;
        int avg = (x+y+z)/3;
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %d", avg);
    }
}


/* 연산자 자가진단2

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strChange = str.split(" ");
        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);
        int p = x+100;
        int d = y%10;
        System.out.printf("%d %d",p,d);
    }
}

 */


/* 연산자 자가진단3

import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int x = Integer.parseInt(str);
        System.out.printf("%d\n",x++);
        System.out.printf("%d",++x);
    }
}

 */


/* 연산자 자가진단4

import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strChange = str.split(" ");
        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);
        --y;
        int z = x*y;
        x++;
        System.out.printf("%d %d %d",x , y, z);
    }
}

 */


/* 연산자 자가진단5

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strChange = str.split(" ");
        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);

        if (x == y){
            System.out.println(1);
            System.out.println(0);
        }
        if (x != y){
            System.out.println(0);
            System.out.println(1);
        }

    }
}

 */


/* 연산자 자가진단6

import java.io.*;
//두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
//이때 입력받은 두 정수를 이용하여 출력하시오

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 버퍼에서 입력하여 저장된 값을 읽어 문자열 str에 저장
        String[] strChange = str.split(" "); //공백을 기준으로 나눔

        int x = Integer.parseInt(strChange[0]); //나눠진 문자열들을 정수형으로 변환
        int y = Integer.parseInt(strChange[1]);


        boolean a = x > y; //불린형 변수 지정과 조건
        boolean b = x < y;
        boolean c = x >= y;
        boolean d = x <= y;



        if(a == true) { //a 가 참이면 밑의 문자열 출력
            System.out.println(x + " > " + y + " --- " + a);
        } else { //참이 아니면 밑의 문자열 출력
            System.out.println(x + " > " + y + " --- " + a);
        }

        if(b == true) {
            System.out.println(x + " < " + y + " --- " + b);
        } else {
            System.out.println(x + " < " + y + " --- " + b);
        }

        if(c == true) {
            System.out.println(x + " >= " + y + " --- " + c);
        } else {
            System.out.println(x + " >= " + y + " --- " + c);
        }

        if(d == true) {
            System.out.println(x + " <= " + y + " --- " + d);
        } else {
            System.out.println(x + " <= " + y + " --- " + d);
        }
    }
}
*/


/* 연산자 자가진단7

import java.io.*;
//두 개의 정수를 입력받아서 0이 아니면 참, 0이면 거짓으로 처리하고
//두 값의 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strChange = str.split(" ");

        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);


        boolean c = (x != 0) && (y != 0); //둘 다 True여야지 True
        boolean d = (x != 0) || (y != 0); //둘 중 하나만 True여도 Ture

        System.out.println(c + " " + d);

    }
}
*/



/* 연산자 자가진단8

import java.io.*;
//3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고
//세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strChange = str.split(" ");

        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);
        int z = Integer.parseInt(strChange[2]);

        boolean b = (x > y) && (x > z);
        boolean c = (x == y) && (y == z); //셋 다 True여야지 True

        if(b == true) System.out.println(b + " " + c); //b가 참일 때
        else System.out.println(b + " " + c); //b가 거짓일 때

    }
}
*/