package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;
        if (input == null || input.isEmpty()) {
            sum = -1;
            return sum;
        }
        sum = isNumber(input, sum);
        return sum;
    }

    private int isNumber(String input, int sum) {
        for (int i = 0; i < input.length(); i++) {
            try {
                sum += Integer.parseInt(input.substring(i, i+1));
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return sum;
    }
}
