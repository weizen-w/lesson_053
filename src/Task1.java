import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] numbersString = scanner.nextLine().split(" ");
    int place = 1;
    int heightIvan = scanner.nextInt();
    for (String str : numbersString) {
      if (heightIvan <= Integer.parseInt(str)) {
        ++place;
      } else {
        break;
      }
    }
    System.out.println(place);
  }
}
