package JUNGOL;

import java.io.*;
import java.util.StringTokenizer;

//반복제어문2 자가진단, 형성평가
public class RC2 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    q18();
  }

  public static void q1() throws IOException {
    String str = br.readLine();
    char ch = str.charAt(0);
    for (int i = 0; i < 20; i++) {
      System.out.printf("%s", ch);
    }
  }

  public static void q2() {
    for (int i = 10; i <= 20; i++) {
      System.out.printf("%d ", i);
    }
  }

  public static void q3() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    if (num > 0 && 50 >= num) {
      for (int i = 2; i <= num; i += 2) {
        System.out.printf("%d ", i);
      }
    } else {
      System.out.println("1부터 50사이의 숫자를 입력해주세요");
    }
  }


  public static void q4() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    int sum = 0;
    if (num > 0 && 100 >= num) {
      for (int i = num; i <= 100; i++) {
        sum += i; //가독성 X 하지만 한줄로 축약가능
      }
    } else {
      System.out.println("1부터 100사이의 숫자를 입력해주세요");
    }

    System.out.println(sum);
  }

  public static void q5() throws IOException {
    String str = br.readLine();
    String[] strChange = str.split(" ");
    int Mul3 = 0;
    int Mul5 = 0;
    for (int i = 0; i < strChange.length; i++) {
      int num = Integer.parseInt(strChange[i]);
      if (num % 3 == 0 && num % 5 == 0) { // 입력 받은 수가 3배수와 5배수면 mul3과 mul5 둘다 증가
        Mul5 += 1;
        if (num % 3 == 0) {
          Mul3 += 1;
        }
      } else if (num % 3 == 0) { //3배수면 mul3 증가
        Mul3 += 1;
      } else if (num % 5 == 0) { //5배수면 mul5 증가
        Mul5 += 1;
      }
    }
    System.out.println("Multiples of 3 : " + Mul3);
    System.out.println("Multiples of 5 : " + Mul5);
  }

  public static void q6() throws IOException {
    String str1 = br.readLine();
    int num = Integer.parseInt(str1);
    int sum = 0;
    String str2 = br.readLine();
    String[] str2Change = str2.split(" ");
    for (int i = 0; i <= num - 1; i++) {
      sum += Integer.parseInt(str2Change[i]);
    }
    if (sum / num >= 80) {
      System.out.println("avg : " + (double) sum / num);
      System.out.println("pass");
    } else {
      System.out.println("avg : " + (double) sum / num);
      System.out.println("fail");

    }

  }

  public static void q7() {
    for (int i = 2; i <= 6; i++) {
      System.out.print(i + " ");
      for (int j = i + 1; j < i + 5; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }

  public static void q8() throws IOException {
    for (int i = 2; i <= 4; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("%d * %d =%3d   ", i, j, i * j);
      }
      System.out.println();
    }
  }

  //형성평가
  public static void q9() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = 1; i <= num; i++) {
      System.out.println("JUNGOL");
    }
  }

  public static void q10() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max = Integer.parseInt(st.nextToken());
    int min = Integer.parseInt(st.nextToken());
    for (int i = min; i <= max; i++) {
      System.out.print(i + " ");
    }
  }

  public static void q11() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }

  public static void q12() throws IOException {
    System.out.println("100 이하의 자연수를 입력해주세요");
    String str1 = br.readLine();

    int num = Integer.parseInt(str1);
    int sum = 0;

    System.out.printf("%d개의 정수를 입력하시면 됩니다.\n", num);
    String str2 = br.readLine();
    String[] str2Change = str2.split(" ");

    if (num <= 100) {
      for (int i = 0; i <= num - 1; i++) {
        if (i < num) {
          sum += Integer.parseInt(str2Change[i]);
        }
      }
      System.out.printf("avg : %.2f", (double) sum / num);
    }
  }

  public static void q13() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num;
    int odd = 0;
    int even = 0;
    while (st.hasMoreTokens()) { //토큰이 있으면 true 없으면 false
      num = Integer.parseInt(st.nextToken()); //토큰을 정수로 변환
      if (num % 2 == 0) { //짝수
        even += 1;
      } else if (num % 2 == 1) { //홀수
        odd += 1;
      }
    }
    System.out.printf("even : %d\nodd : %d", even, odd);
  }

  public static void q14() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int min = Integer.parseInt(st.nextToken());
    int max = Integer.parseInt(st.nextToken());
    int sum = 0;
    int div = 0;
    for (int i = min; i <= max; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
        div++;
      }
    }
    System.out.printf("sum : %d\navg : %.1f", sum, (double) sum / div);
  }

  public static void q15() throws IOException {
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d ", num * i);
    }
  }

  public static void q16() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= b; j++) {
        System.out.printf("%d ", i * j);
      }
      System.out.println(" ");
    }
  }

  public static void q17() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= a; j++) {
        System.out.printf("(%d, %d) ", i, j);
      }
      System.out.println();
    }
  }

  public static void q18() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= 9; i++) {
      for (int j = a; j >= b; j--) {
        System.out.printf("%d * %d = %2d   ", j, i, i * j);
      }
      System.out.println();
    }
  }


}

