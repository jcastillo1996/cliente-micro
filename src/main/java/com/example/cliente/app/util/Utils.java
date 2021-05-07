package com.example.cliente.app.util;

import java.time.LocalDate;
import java.util.Random;

public class Utils {

    public static LocalDate fechaRandom() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1980, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(1999, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
