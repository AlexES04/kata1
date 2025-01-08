package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("Alejandro", LocalDate.of(2004, 6, 11)));
        System.out.println(new Person("Lucas", LocalDate.of(1901, 1, 8)));
    }
}
