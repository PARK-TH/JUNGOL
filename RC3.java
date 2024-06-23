package JUNGOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//반복제어문3 자가진단, 형성평가
public class RC3 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    q17();
  }

  public static void q1() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    int sum = 0;
    int odd = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 1) {
        sum += i;
        odd++;
        if (sum >= num) {
          break;
        }
      }
    }
    System.out.printf("%d %d", odd, sum);
  }

  public static void q2() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void q3() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = num; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q4() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = 1; i <= num; i++) {
      for (int j = num; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
    }
  }

  public static void q5() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = num * 2 - 2; i >= 0; i -= 2) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
      for (int j = i; j <= num * 2 - 2; j += 2) {
        System.out.print(" ");
      }

    }
  }

  public static void q6() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    char ch = 'A';
    for (int i = 1; i <= num; i++) {
      for (int j = num; j >= i; j--) {
        System.out.printf("%s", ch);
        ch++;
      }
      System.out.println();
    }
  }

  public static void q7() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    char ch = 'A';
    for (int i = num; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      for (int j = num; j >= i; j--) {
        System.out.printf("%s ", ch);
        ch++;
      }
      System.out.println();
    }
  }
  //반복제어문3 형성평가
  public static void q8() throws IOException {
    String str;
    int cnt = 0;
    int num;
    int sum = 0;
    int avg = 0;
    boolean loop = true;
    while (loop) {
      str = br.readLine();
      num = Integer.parseInt(str);
      if (num==0||cnt>=19) {
        sum += num;
        loop = false;
        break;
      } else if (num!=0&&cnt<20){
        sum += num;
        cnt++;
      }
    }
    System.out.printf("%d %d",sum, sum/cnt);
  }

  public static void q9() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    if(num<=100){
      for(int i = num; i <= 100; i+=num){
        if(i%10!=0){
          System.out.printf("%d ", i);
        } else if(i%10==0){
          System.out.printf("%d ", i);
          break;
        }
      }
    }
  }

  public static void q10() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);

    for (int i = 1; i <= num; i++){
      for (int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = num; i >= 2; i--){
      for (int j = i; j >= 2; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q11() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);

    for (int i = num*2; i > 1; i-=2) {
      for(int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
      for (int j = num*2; j >= i; j-=2) {
        System.out.print(" ");
      }
    }
    System.out.print("\r");
      for (int i = 3; i < num*2; i+=2) {
        for(int j = num*2; j-1 > i; j-=2) {
          System.out.print(" ");
        }
        for (int z = 0; z < i; z++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public static void q12() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
      for (int i = num*2; i >= 1; i-=2) {
        for (int j = 3; j <= i; j++) {
          System.out.print(" ");
        }
        for (int j = num*2; j >= i; j--) {
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public static void q13() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num-i; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print(j);
        }
        System.out.println();
      }
    }

  public static void q14() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    char ch = 'A';
    for (int i = 1; i <= num; i++) {
      for (int j = num; j > i-1; j--) {
        System.out.printf("%s ", ch);
        ch++;
      }
      for (int j = 0; j <= i-2; j++) {
        System.out.printf("%d ", i+j-2);
      }
      System.out.println();
    }
  }

  public static void q15() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    int a = 1;
    for (int i = 1; i <= num; i++) {
      for (int j = i; j <= num ; j++) {
        System.out.print(a++ + " ");
      }

      System.out.println();
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
    }
  }

  public static void q16() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);

    for (int i = 1; i < num; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("# ");
      }
      System.out.println();
    }

    for (int i = 1; i <= num; i++) {
      for (int j = i; j <= num ; j++) {
        System.out.print("# ");
      }

      System.out.println();
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
    }
  }

  public static void q17() throws IOException {
    String str = br.readLine();
    int n = Integer.parseInt(str);
int ten = 1;
    for (int i=1; i<=n; i++){
      for (int j=1; j<=n; j++){
        System.out.print(ten+ " ");
        if(ten<9){
          ten+=2;
        } else if (ten>=9){
          ten = 1;
        }
      }
      System.out.println();
    }

  }

  }
