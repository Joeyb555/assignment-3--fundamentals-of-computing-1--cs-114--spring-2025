import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int size = sc.nextInt();

    Matrix matrix = new Matrix(size);

    matrix.populateMatrix();
    System.out.println("Original Matrix:");
    matrix.printMatrix();

    matrix.flipMatrix();
    System.out.println("\nFlipped Matrix:");
    matrix.printMatrix();

    sc.close();
  }
}
