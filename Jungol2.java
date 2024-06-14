
//연산자 형성평가1-1
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strChange = str.split(" ");
        int a = Integer.parseInt(strChange[0]);
        int b = Integer.parseInt(strChange[1]);
        int c = Integer.parseInt(strChange[2]);
        int d = Integer.parseInt(strChange[3]);
        int sum = a+b+c+d;
        int avg = (a+b+c+d)/4;

        System.out.printf("sum %d\navg %d",sum, avg);

    }
}

//연산자 형성평가1-2 두번째 방법입니다.
/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int i = 0;
        int sum = 0;
        int avg = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) { //토큰이 있으면 참
                sum += Integer.parseInt(st.nextToken());
                i++; //hasMoreTokens이 참을 반환할 때마다 1씩 증가시킴
        }

        avg = sum/i; // 반복문에서 증가시킨 i를 입력한 값의 총합에 나눠줌
        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d", avg);
    }
}
 */

//연산자 형성평가2
/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int a = 0; // 다른 메소드에서도 변수를 사용할 수 있게 선언
    static int b = 0;
    static int quo = 0;
    static int rmd = 0;

    public static void main(String[] args) throws IOException {
        q1();
        cal();
        System.out.printf("%d / %d = %d...%d", a, b, quo, rmd);
    }

    static void q1() throws IOException { //외부입출력장치에서 받아서 읽어들인 문자열을 정수로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    static void cal() throws IOException{ //계산하는 부분
        quo = a/b; //몫을 나타냄
        rmd = a%b; //나머지를 나타냄
    }
}
 */


//연산자 형성평가3
/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int a = 0;
    static int b = 0;
    static int quo = 0;
    static int rmd = 0;

    public static void main(String[] args) throws IOException {
        q1();
        cal();
        System.out.printf("width = %d\nlength = %d\narea = %d", a, b, a*b);
    }

    static void q1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    static void cal() throws IOException{
        a = a+5; //가로
        b = b*2; //세로
    }
}
 */

//연산자 형성평가4
/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) throws IOException {
        q1();
        cal();

    }

    static void q1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

    }

    static void cal() throws IOException{
        ++a; //
        System.out.printf("%d %d\n", a , b);
        b--;
        System.out.printf("%d %d", a , b);
    }
}
 */

//연산자 형성평가5
/*
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        q1();
    }

    static void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        String[] str1Change = str1.split(" ");
        String[] str2Change = str2.split(" ");

        int a1 = Integer.parseInt(str1Change[0]);
        int a2 = Integer.parseInt(str1Change[1]);

        int b1 = Integer.parseInt(str2Change[0]);
        int b2 = Integer.parseInt(str2Change[1]);

        boolean big = (a1>b1)&&(a2>b2);

        if(big == true) System.out.println(1);
        else System.out.println(0);

    }
}

 */
