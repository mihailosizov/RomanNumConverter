package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RomanNumeralsConverter {
    private final HashMap<Integer, String> romanNumbersTable = new HashMap<>();

    {
        romanNumbersTable.put(0, "");
        romanNumbersTable.put(1, "I");
        romanNumbersTable.put(2, "II");
        romanNumbersTable.put(3, "III");
        romanNumbersTable.put(4, "IV");
        romanNumbersTable.put(5, "V");
        romanNumbersTable.put(6, "VI");
        romanNumbersTable.put(7, "VII");
        romanNumbersTable.put(8, "VIII");
        romanNumbersTable.put(9, "IX");
        romanNumbersTable.put(10, "X");
        romanNumbersTable.put(20, "XX");
        romanNumbersTable.put(30, "XXX");
        romanNumbersTable.put(40, "XL");
        romanNumbersTable.put(50, "L");
        romanNumbersTable.put(60, "LX");
        romanNumbersTable.put(70, "LXX");
        romanNumbersTable.put(80, "LXXX");
        romanNumbersTable.put(90, "XC");
        romanNumbersTable.put(100, "C");
        romanNumbersTable.put(200, "CC");
        romanNumbersTable.put(300, "CCC");
        romanNumbersTable.put(400, "CD");
        romanNumbersTable.put(500, "D");
        romanNumbersTable.put(600, "DC");
        romanNumbersTable.put(700, "DCC");
        romanNumbersTable.put(800, "DCCC");
        romanNumbersTable.put(900, "CM");
        romanNumbersTable.put(1000, "M");
        romanNumbersTable.put(2000, "MM");
        romanNumbersTable.put(3000, "MMM");
    }

    public String convert(Integer number) {
        String romanNumber = "";
        ArrayList<Integer> summarizableArray = new ArrayList<>(Arrays.asList(convertIntToSummarizableArray(number)));
        for (Integer value : summarizableArray) {
            romanNumber += romanNumbersTable.get(value);
        }
        return romanNumber;
    }

    private Integer[] convertIntToSummarizableArray(Integer number) {
        String[] stringNumberArray = number.toString().split("");
        Integer[] intNumberArray = new Integer[stringNumberArray.length];
        for (int i = 0; i < intNumberArray.length; i++) {
            intNumberArray[i] = Integer.valueOf(stringNumberArray[i]);
        }

        for (int i = 0, j = intNumberArray.length - 1; i < intNumberArray.length; i++, j--) {
            Double multiplier = Math.pow(10, j);
            intNumberArray[i] *= multiplier.intValue();
        }
        return intNumberArray;
    }
}
