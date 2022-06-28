import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);// Високосный если возвращает true
        } else {
            System.out.println("13.09." + year); // Не високосный если возвращает false
        }

    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {  //кратен 400 - високосный
            return (true);
        } else if (year % 100 == 0) { //кратен 100 - не високосный
                return(false);
        }
         else if (year % 4 == 0) { //кратен 4 - високосный
            return (true);
        }
        return false;
    }
}