//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c;

        if (a < b){
            c = subtructTwoNumbers(a, b);
        } else {
            c = sumTwoNumbers(a, b);
        }

        System.out.println(c);
    }

    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtructTwoNumbers(int a, int b) {
        return b - a;
    }
}
