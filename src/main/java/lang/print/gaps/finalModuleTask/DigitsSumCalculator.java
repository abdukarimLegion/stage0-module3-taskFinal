package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int n1 = number / 1000, n2 = (number / 100) % 10,
                n3 = (number / 10) % 10, n4 = (number % 10);
        System.out.println(n1+n2+n3+n4);
    }
}
