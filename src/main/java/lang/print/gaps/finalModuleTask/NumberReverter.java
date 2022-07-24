package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstNumber = number / 100;
        int medianNumber = (number / 10) % 10;
        int endNumber = number % 10;

        System.out.println(endNumber + "" + medianNumber + "" + firstNumber);
    }
}
