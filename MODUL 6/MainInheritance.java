package Inheritance;

import java.time.LocalDate;

public class MainInheritance {
    public static void main(String[] args) {

        // Manusia
        System.out.println(new Manusia("A", true, "111", true));
        System.out.println(new Manusia("B", false, "222", true));
        System.out.println(new Manusia("C", true, "333", false));

        // Mahasiswa
        System.out.println(new MahasiswaFILKOM("D", true, "444", false, "255150701111026", 2.9));
        System.out.println(new MahasiswaFILKOM("E", true, "555", false, "235150201111044", 3.3));
        System.out.println(new MahasiswaFILKOM("F", true, "666", false, "245150501111033", 3.8));

        // Pekerja
        System.out.println(new Pekerja("G", true, "777", true, 3000, LocalDate.now().minusYears(2), 2));
        System.out.println(new Pekerja("H", true, "888", true, 3000, LocalDate.now().minusYears(9), 0));
        System.out.println(new Pekerja("I", true, "999", true, 3000, LocalDate.now().minusYears(20), 10));

        // Manager
        System.out.println(new Manager("J", true, "000", true, 7500, LocalDate.now().minusYears(15), 0, "IT"));
    }
}