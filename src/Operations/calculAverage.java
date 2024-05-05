package Operations;

public class calculAverage {
    private double[] numbers;

    public calculAverage(double[] numbers) {
        this.numbers = numbers;
    }

    public void addNumber(double number) {
        double[] newNumbers = new double[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[numbers.length] = number;
        numbers = newNumbers;
    }

    public double calcul() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
