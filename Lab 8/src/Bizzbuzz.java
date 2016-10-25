public class Bizzbuzz {

  static boolean print_number = true;

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      if ((i % 3) == 0) {
        System.out.println("Bizz");
        print_number = false;
      } else if ((i % 5) == 0) {
        System.out.println("Buzz");
        print_number = false;
      } else {
        System.out.println(i);
      }
      System.out.println();
    }
  }
}
