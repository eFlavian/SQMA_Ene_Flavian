import ase.hw.sqma.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(10,20);
        System.out.println("Sum is: " + sum);
    }
}