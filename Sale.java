public class Sale {
    public static void main(String[] args) {
        discount(89, 20);
    }

    public static double discount(int price, int percentage) {

        double a = price / 100.00 * percentage;
        System.out.println(a);
        double sale = price - a;

        System.out.println(sale);
        return sale;
    }

}
