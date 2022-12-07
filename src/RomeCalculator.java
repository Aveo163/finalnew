public class RomeCalculator {

    final static String[] rome = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XVII", "XVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    private static int getInt(String rom) {
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(rom)) {
                Main.checkTen(i + 1);
                return i + 1;
            }
        }
        throw new RuntimeException();
    }


    public static String sum(String num1, String num2) {
        int result = getInt(num1) + getInt(num2);
        return rome[result - 1];
    }


    public static String min(String num1, String num2) {
        int result = getInt(num1) - getInt(num2);
        return rome[result - 1];
    }


    public static String div(String num1, String num2) {
        int result = getInt(num1) / getInt(num2);
        return rome[result - 1];
    }


    public static String mul(String num1, String num2) {
        int result = getInt(num1) * getInt(num2);
        return rome[result - 1];
    }
}
