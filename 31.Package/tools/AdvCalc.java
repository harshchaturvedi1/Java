package tools;
// concept of "is-a" relationships 

// here AdvCalc is a Calc

public class AdvCalc extends Calc {

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
