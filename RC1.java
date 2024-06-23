package JUNGOL;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

//반복제어문1 자가진단, 형성평가

public class RC1 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    q11();
  }

  public static void q1() {
    int i = 1;
    while (i < 16) {
      System.out.printf(i + " ");
      i = i + 1;
    }
  }

  public static void q2() throws IOException {
    String str = br.readLine();
    int a = Integer.parseInt(str);
    int b = 0;
    int sum = 0;
    while (b < a) {
      b++;
      sum = sum + b;
    }
    System.out.printf("%d", sum);
  }

  public static void q3() throws IOException {
    while (true) {
      System.out.print("number? ");

      String str = br.readLine();
      if (str == null) {
        return;
      }
      int a = Integer.parseInt(str);
      if (a > 0) {
        System.out.println("positive integer");
      } else if (a < 0) {
        System.out.println("negative number");
      } else {
        break;
      }
    }
  }

  public static void q4() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0;
    int i = 0;
    while (st.hasMoreTokens()) {
      int a = Integer.parseInt(st.nextToken());
      if (a < 100) {
        sum += a;
        i++;
      } else if (a >= 100) {
        sum += a;
        i++;
        break;
      }
    }
    System.out.printf("%d\n%.1f", sum, (double) sum / (double) i);
  }

  public static void q5() throws IOException {
    while (true) {
      String str = br.readLine();
      int a = Integer.parseInt(str);
      System.out.println("(입력) " + a);
      if (a % 3 != 0) {
      } else if (a % 3 == 0) {
        System.out.println("(출력) " + a / 3);
      }
    }//while
  }//메소드

  public static void q6() throws IOException {

    boolean RR = true;
    while (RR) {
      System.out.println("1. Korea");
      System.out.println("2. USA");
      System.out.println("3. JAPAN");
      System.out.println("4. China");
      System.out.print("number? ");
      String str = br.readLine();
      int a = Integer.parseInt(str);

      switch (a) {
        case 1:
          System.out.println("\nSeoul\n");
          break;
        case 2:
          System.out.println("\nWashington\n");
          break;
        case 3:
          System.out.println("\nTokyo\n");
          break;
        case 4:
          System.out.println("\nbeijing\n");
          break;
        default:
          System.out.println("\nnone\n");
          RR = false;
          break;
      }
    }
  }
  //  반복제어문1 형성평가
  public static void q7() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
      System.out.printf("%d ", i);
    }
  }

  public static void q8() throws IOException {
    int even = 0;
    int odd = 0;

    while (true) {
      String str = br.readLine();
      int a = Integer.parseInt(str);
      if (a > 0 && a % 2 == 0) {
        even += 1;
      } else if (a > 0 && a%2 == 1) {
        odd += 1;
      } else if (a == 0) {
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
        break;
      } else {
        System.out.println("0 이상의 정수를 입력해주세요");
      }
    }
  }


  public static void q9() throws IOException {
    int sum = 0;
    int i = 0;
    while (true) {
      String str = br.readLine();
      int a = Integer.parseInt(str);
      double avg = (double) sum / (double) i;

      if (100 >= a && a >= 0) {
        i += 1;
        sum += a;
      } else if (0 > a || a > 100) {
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);
      }
    }
  }

  public static void q10() throws IOException {
    int num = 0;
    while (true) {
      String str = br.readLine();
      int a = Integer.parseInt(str);

      if (a % 3 != 0 && a % 5 != 0) {
        num += 1;
      } else if (a == 0) {
        System.out.println(num);
      }
    }
  }

  public static void q11() throws IOException {
    boolean loop = true;
    while (loop) {
      System.out.print("Base = ");
      String str1 = br.readLine();
      double Base = Double.parseDouble(str1);
      System.out.print("Height = ");
      String str2 = br.readLine();
      double Height = Double.parseDouble(str2);


      System.out.printf("Triangle width = %.1f\n", (Base*Height)/2);

      System.out.print("Continue? ");
      String str3 = br.readLine();
      char ch = str3.charAt(0);

      switch (ch){
        case 'y': break;
        case 'Y': break;
        default : loop = false;
          break;
      }
    }

  }


}//클래스




