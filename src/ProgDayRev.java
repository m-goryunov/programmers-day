import java.util.Scanner;
 class ProgDayRew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year); //високосный
        } else {
            System.out.println("13.09." + year); // не високосный
        }
        // здесь нужно вывести результат
    }
    public static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            if ((year % 100) == 0) {
                return false;
            } else if ((year % 4) == 0) {
                return true;
            }
        }
        return true;
    }
}