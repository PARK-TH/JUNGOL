### JUNGOL

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strChange = str.split(" ");
        int x = Integer.parseInt(strChange[0]); //문자형을 정수로 바꾸기
        int y = Integer.parseInt(strChange[1]);
        int p = x+100; // 정수형 변수 x에 100 더하기
        int d = y%10;  // 정수형 변수 y를 10으로 나눈 나머지
        System.out.printf("%d %d",p,d);
    }
}
