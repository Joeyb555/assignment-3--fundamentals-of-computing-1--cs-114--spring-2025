import java.util.Scanner;

public class Diamond {
  private static Scanner scanner = new Scanner(System.in);
  private static int input, middle;

  public static void main(String[] args) {
    System.out.print("Enter a number:");
    input = scanner.nextInt();

    if (input % 2 == 0) {
      // handle the even case here
      System.out.println();
    } else {
      ; // handle the odd case here
    }

    middle = input / 2;

    for (int i = 0; i <= middle; i++) {
      for (int j = 0; j < middle - i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = middle - 1; i >= 0; i--) {
      for (int j = 0; j < middle - i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
