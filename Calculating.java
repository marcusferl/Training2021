
/**
 * Calculating
 */


public class Calculating {

    public static void main(String[] args) {
;
System.out.println(calculator(10, '/', 0));
    }

    public static int calculator(int num1, char operator, int num2) {

        int sum = 0;

        switch (operator) {
        case '+':
            sum = num1 + num2;
            break;
        case '*':
            sum =  num1 * num2;
            break;
        case '/':
        if(num1 == 0 || num2 == 0){
            sum = 0;
            break;
        }
        else{
            sum = num1 / num2;
            break;
        }
        }
        return sum;
    }
}