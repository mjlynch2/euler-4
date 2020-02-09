
public class Euler4 {

    public static boolean isPal(int num) {
        String numToString = String.valueOf(num);
        String reverseNum = "";
        for (int i = numToString.length() - 1; i >= 0; i--) {
            reverseNum = reverseNum + numToString.charAt(i);
        }
        return numToString.equals(reverseNum);
    }

    public static boolean isDivis(int num) {
        return (num % 999 == 0);
    }

    public static void main(String[] args) {
        int currLargest = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int prod = i * j;
                if (prod > currLargest && isPal(prod)) {
                    currLargest = prod;
                }
            }
        }

        System.out.println(currLargest);
    }

}