package class40_roman_to_integer_integer_to_roman;

public class IntegerToRoman {

    public static void main(String[] args) {

        String romanNum = convert(1248);
        System.out.println("ROMAN NUMBER IS : " + romanNum);
    }

    private static String convert(int num) {
        int values[] = {1000, 900, 500, 400, 100, 50, 40, 10, 9, 5, 4, 1};
        String symbols[] = {"M", "CM", "D", "CD", "C", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    private static String convert1(int num) {
        final String[] thousands = {"", "M", "MM", "MMM"};
        final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        final String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }
}
