public class SupermarketQueue {
    public static void main(String[] args) {
        
    }
    public static int solveSuperMarketQueue(int [] customers, int n){

        int time = 0;

        if(customers.length != 0){
        for (int i = 0; i < customers.length; i++) {
            time = time + customers[i];
        }
    }
        return time / n;
    }
}
