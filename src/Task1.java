import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int place = 1;
    System.out.println("          =  =  =  =  =  МЕСТО ИВАНА В СТРОЮ  =  =  =  =  =");
    System.out.println("Введите рост учеников (натуральное число, не более 200) по убыванию:");
    System.out.println("(в конце укажите любой символ, отличный от числа, для завершения ввода)");
    List<Integer> height = new ArrayList<>();
    while (scanner.hasNextInt()) {
      int x = scanner.nextInt();
      height.add(x);
    }
    scanner.next();
    System.out.println("Введите рост Ивана (натуральное число, не более 200):");
    int heightIvan = scanner.nextInt();
    for (Integer integer : height) {
      if (heightIvan <= integer) {
        ++place;
      } else {
        break;
      }
    }
    System.out.println("Рост Ивана, соответствует " + place + "-му месту в строю.");
  }
}
