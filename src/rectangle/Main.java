package rectangle;
// имаме точка и проверяваме дали е в обхвата на кординатите X i Y
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] coordinates = new int[4];
        for (int i = 0; i < 4; i++) {
            coordinates[i] = Integer.parseInt(input[i]);
        }

        Rectangle rectangle = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
        int numberOfPoints = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPoints; i++) {
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();

            Point check = new Point(pointX, pointY);
            System.out.println(rectangle.contains(check));
        }

        scanner.close();
    }
}