package yava.euler.utils;

public class Utils {

    public static boolean isPrime(int number) {
        if (number <= 3) {
            return number > 1;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getNumberInWords(long num) {
        if (num < 10)
            return belowTen(num);
        else if (num < 20)
            return belowTwenty(num);
        else if (num < 100)
            return belowHundred(num);
        else if (num < 1000)
            return belowThousand(num);
        else if (num < 100000)
            return belowLakh(num);
        else if (num < 10000000)
            return belowCrore(num);
        else if (num < 1000000000)
            return belowBilion(num);
        return "";
    }

    public static String leftChars(String str, int n) {
        if (str.length() <= n)
            return str;
        else
            return str.substring(0, n);
    }

    public static String rightChars(String str, int n) {
        if (str.length() <= n)
            return str;
        else
            return str.substring(str.length() - n, str.length());
    }

    public static long leftChars(long num, int n) {
        return new Long(leftChars(Long.toString(num), n));
    }

    public static long rightChars(long num, int n) {
        return new Long(rightChars(Long.toString(num), n));
    }

    public static int length(long num) {
        return Long.toString(num).length();
    }

    private static String belowTen(long x) {
        switch ((int) x) {
            case 1:
                return "one ";
            case 2:
                return "two ";
            case 3:
                return "three ";
            case 4:
                return "four ";
            case 5:
                return "five ";
            case 6:
                return "six ";
            case 7:
                return "seven ";
            case 8:
                return "eight ";
            case 9:
                return "nine ";
        }
        return "";
    }

    private static String belowTwenty(long x) {
        if (x < 10)
            return belowTen(x);
        switch ((int) x) {
            case 10:
                return "ten ";
            case 11:
                return "eleven ";
            case 12:
                return "twelve ";
            case 13:
                return "thirteen ";
            case 14:
                return "fourteen ";
            case 15:
                return "fifteen ";
            case 16:
                return "sixteen ";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen ";
            case 19:
                return "nineteen ";
        }
        return "";
    }

    private static String belowHundred(long x) {
        if (x < 10)
            return belowTen(x);
        else if (x < 20)
            return belowTwenty(x);
        switch ((int) leftChars(x, 1)) {
            case 2:
                return "twenty " + belowTen(rightChars(x, 1));
            case 3:
                return "thirty " + belowTen(rightChars(x, 1));
            case 4:
                return "forty " + belowTen(rightChars(x, 1));
            case 5:
                return "fifty " + belowTen(rightChars(x, 1));
            case 6:
                return "sixty " + belowTen(rightChars(x, 1));
            case 7:
                return "seventy " + belowTen(rightChars(x, 1));
            case 8:
                return "eighty " + belowTen(rightChars(x, 1));
            case 9:
                return "ninety " + belowTen(rightChars(x, 1));
        }
        return "";
    }

    private static String belowThousand(long x) {

        if (x < 10) {
            return belowTen(x);
        } else if (x < 20) {
            return belowTwenty(x);
        } else if (x < 100) {
            return belowHundred(x);
        } else if (x % 100 == 0) {
            return belowTen(leftChars(x, 1)) + "hundred ";
        }
        return belowTen(leftChars(x, 1)) + "hundred and " + belowHundred(rightChars(x, 2));
    }

    private static String belowLakh(long x) {
        if (x < 10)
            return belowTen(x);
        else if (x < 20)
            return belowTwenty(x);
        else if (x < 100)
            return belowHundred(x);
        else if (x < 1000)
            return belowThousand(x);
        if (length(x) == 4)
            return belowTen(leftChars(x, 1)) + "thousand " + belowThousand(rightChars(x, 3));
        else
            return belowHundred(leftChars(x, 2)) + "thousand " + belowThousand(rightChars(x, 3));
    }

    private static String belowCrore(long x) {
        if (x < 10)
            return belowTen(x);
        else if (x < 20)
            return belowTwenty(x);
        else if (x < 100)
            return belowHundred(x);
        else if (x < 1000)
            return belowThousand(x);
        else if (x < 100000)
            return belowLakh(x);
        if (length(x) == 6)
            return belowTen(leftChars(x, 1)) + "hundered " + belowLakh(rightChars(x, 5));
        else
            return belowHundred(leftChars(x, 2)) + "hundered " + belowLakh(rightChars(x, 5));
    }

    private static String belowBilion(long x) {
        if (x < 10)
            return belowTen(x);
        else if (x < 20)
            return belowTwenty(x);
        else if (x < 100)
            return belowHundred(x);
        else if (x < 1000)
            return belowThousand(x);
        else if (x < 100000)
            return belowLakh(x);
        else if (x < 100000000)
            return belowCrore(x);

        if (length(x) == 8)
            return belowTen(leftChars(x, 1)) + "bilion " + belowCrore(rightChars(x, 7));
        else
            return belowHundred(leftChars(x, 2)) + "bilion " + belowCrore(rightChars(x, 7));
    }

}
