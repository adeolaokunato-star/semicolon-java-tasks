public class SmallMathApp {
    int numberOne = 10;
    int numberTwo = 2;
    public double operators(String symbol) {
        double answer = 0;
        switch (symbol) {
            case "*":
                answer = multiplyNumbers();
                break;
            case "/":
                answer = divideNumbers();
                break;
            case "+":
                answer = addNumbers();
                break;
            case "-":
                answer = subtractNumbers();
                break;
            default:
                System.out.println("Olodo no spoil app for me!!!!");
        }
        return answer;
    }
    public double multiplyNumbers() {
        return numberOne * numberTwo;
    }
    public double addNumbers() {
        return numberOne + numberTwo;
    }
    public double subtractNumbers() {
        return numberOne - numberTwo;
    }
    public double divideNumbers() {
        return (double) numberOne / numberTwo;
    }
}
