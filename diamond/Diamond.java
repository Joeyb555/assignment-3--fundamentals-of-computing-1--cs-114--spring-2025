import java.util.Scanner;

public class Diamond {
  private static Scanner scanner = new Scanner(System.in);
  private static int n, mid;

  public static void main(String[] args) {
    System.out.print("Enter an integer for the diamond size:");
    n = scanner.nextInt();

    if (n % 2 == 0)
      System.out.println();

    mid = n / 2;

  for (int i = 0; i <= mid; i++) {
    for (int j = 0; j < mid - i; j++) {
      System.out.print(" ");
    }

    for (int j = 0; j < 2 * i + 1; j++) {
      System.out.print("*");
    }

    System.out.println();
  }

  for (int i = mid - 1; i >= 0; i--) {
    for (int j = 0; j < mid - i; j++) {
      System.out.print(" ");
    }

    for (int j = 0; j < 2 * i + 1; j++) {
      System.out.print("*");
    }

    System.out.println();
  }
}

public static Scanner getScanner() {
  return scanner;
}

public static void setScanner(Scanner scanner) {
  Diamond.scanner = scanner;
}

public static int getN() {
  return n;
}

public static void setN(int n) {
  Diamond.n = n;
}

public static int getMid() {
  return mid;
}

public static void setMid(int mid) {
  Diamond.mid = mid;
  }
}
