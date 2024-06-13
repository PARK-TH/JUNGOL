# JUNGOL

//연산자 자가진단1
import java.io.*; //다른 폴더에 있는 클래스 불러오기

public class Main{
    public static void main(String[] args) throws IOException{ //예외처리
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine(); // 입력된  
        String[] strChange = str.split(" "); //공백 기준으로 나누기
        int x = Integer.parseInt(strChange[0]);
        int y = Integer.parseInt(strChange[1]);
        int z = Integer.parseInt(strChange[2]);
        int sum = x+y+z; // 합
        int avg = (x+y+z)/3; // 평균
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %d", avg);
    }
}

