package JUNGOL;

import java.util.Scanner;

//선택제어문 자가진단 1~9,형성평가 1~5

public class CC {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    q14();
  }

  public static void q1() {
    int a = sc.nextInt();
    if (a > 0) {
      System.out.println(a);
    } else if (a < 0) {
      System.out.println(a);
      System.out.println("minus");
    }
  }

  public static void q2() {
    int height = sc.nextInt();
    int weight = sc.nextInt();

    int bm = weight + 100 - height;
    if (bm > 0) {
      System.out.println(bm + "\nObesity");
    } else {
      System.out.println(bm);
    }
  }

  public static void q3() {
    int old = sc.nextInt();
    if (old >= 20) {
      System.out.println("adult");
    } else if (old < 20) {
      System.out.printf("%d years later", 20 - old);
    }
  }

  public static void q4() {
    double weight = sc.nextDouble();

    if (weight > 88.45) {
      System.out.println("Heavyweight");
    } else if (88 >= weight && weight > 72.58) {
      System.out.println("Cruiserweight");
    } else if (75.57 >= weight && weight > 61.24) {
      System.out.println("Middleweight");
    } else if (61.23 >= weight && weight > 50.80) {
      System.out.println("Lightweight");
    } else if (50.80 >= weight) {
      System.out.println("Flyweight");
    }

  }

  public static void q5() {
    double A = sc.nextDouble();
    double B = sc.nextDouble();

    if (A >= 4.0 && B >= 4.0) {
      System.out.println("A");
    } else if (4.0 > A && A >= 3.0 || 4.0 > B && B >= 3.0) {
      System.out.println("B");
    } else {
      System.out.println("C");
    }
  }

  public static void q6() {
    String a = sc.next();
    int b = sc.nextInt();
    char ch = a.charAt(0);

    if (ch == 'M' && b >= 18) {
      System.out.println("MAN");
    } else if (ch == 'M' && (b < 17 && b > 0)) {
      System.out.println("BOY");
    } else if (ch == 'F' && b >= 18) {
      System.out.println("WOMAN");
    } else if (ch == 'F' && (b < 17 && b > 0)) {
      System.out.println("GIRL");
    }
  }


  public static void q7() {
    String a = sc.nextLine();
    char ch = a.charAt(0);

    switch (ch) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Usually");
        break;
      case 'D':
        System.out.println("Effort");
        break;
      case 'F':
        System.out.println("Failure");
        break;
      default:
        System.out.println("error");
        break;
    }
  }

  public static void q8() {
    double avg = sc.nextDouble();

    if (avg <= 4.5) {
      int a = (int) avg;

      switch (a) {
        case 4:
          System.out.println("Scholarship");
          break;
        case 3:
          System.out.println("next semester");
          break;
        case 2:
          System.out.println("seasonal semester");
          break;
        default:
          System.out.println("retake");
          break;
      }
    } else {
      System.out.println("4.5 이하의 수를 입력해주세요");
    }
  }

  public static void q9() {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    //첫번째 방법
    /*int min = (a<b)? a:b;
    min = (min<c)? min:c;

    System.out.println(min);*/

    //응용
    int min = Math.min(a, b);
    min = Math.min(min, c);
    System.out.println(min);

  }

  public static void q10() {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    System.out.println(max - min);
  }

  public static void q11() {
    int a = sc.nextInt();

    if (a == 0) {
      System.out.println("zero");
    } else if (a > 0) {
      System.out.println("plus");
    } else if (a < 0) {
      System.out.println("minus");
    } else {
      System.out.println("숫자를 입력해주세요");
    }
  }

  public static void q12() {
    int a = sc.nextInt();
    boolean ly = a % 400 == 0 || (a % 4 == 0 && a % 100 != 0);

    if (ly) {
      System.out.println("leap year");
    } else {
      System.out.println("common year");
    }
  }

  public static void q13() {
    System.out.print("number? ");
    int a = sc.nextInt();
    switch (a) {
      case 1:
        System.out.println("dog");
        break;
      case 2:
        System.out.println("cat");
        break;
      case 3:
        System.out.println("chick");
        break;
      default:
        System.out.println("I don't know");
        break;
    }
  }

  public static void q14() {
    int a = sc.nextInt();
    switch (a) {
      case 1:
        System.out.println("31");
        break;
      case 2:
        System.out.println("28");
        break;
      case 3:
        System.out.println("31");
        break;
      case 4:
        System.out.println("30");
        break;
      case 5:
        System.out.println("31");
        break;
      case 6:
        System.out.println("30");
        break;
      case 7:
        System.out.println("31");
        break;
      case 8:
        System.out.println("31");
        break;
      case 9:
        System.out.println("30");
        break;
      case 10:
        System.out.println("31");
        break;
      case 11:
        System.out.println("30");
        break;
      case 12:
        System.out.println("31");
        break;
      default:
        System.out.println("1월 부터 12월 까지 중에서 선택해주세요");
        break;
    }
  }

}


