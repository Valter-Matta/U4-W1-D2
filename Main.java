import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // es#1 printati
      // System.out.println(stringaPariDispari("Valter"));
      // System.out.println(annoBisestile(2016));

      // es#2

      Scanner scanner = new Scanner(System.in);
      System.out.println("inserisci un numero compreso tra 0 e 3: ");
      int numero = scanner.nextInt();

      System.out.println(costruttoSwitch(numero));

      // es#3

      // System.out.println("Stampo sempre finchè non premi :q ");
      // String letter = scanner.nextLine();
      // spelling(letter, scanner);
      scanner.close();

   }

   // es#1
   // public static boolean stringaPariDispari(String str) {
   // return (str.length() % 2 == 0) ? true : false;
   // }

   // public static boolean annoBisestile(int year) {
   // return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) ? true :
   // false;
   // }

   // es#2
   public static String costruttoSwitch(int number) {
      switch (number) {
         case 0:
            return "Zero";

         case 1:
            return "Uno";

         case 2:
            return "Due";

         case 3:
            return "Tre";

         default:
            return "Il numero inserito è maggiore di 3";

      }
   }

   // // es#4
   // public static void spelling(String str, Scanner scanner) {

   // while (!str.equals("q")) {
   // System.out.println(str);
   // str = scanner.nextLine();
   // }
   // System.out.println("Hai digitato :q , bravo");

   // }
}