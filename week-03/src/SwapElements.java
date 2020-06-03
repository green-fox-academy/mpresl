public class SwapElements {
    public static void main(String[] args){
        String[] orders = new String[]{"first", "second", "third"};
        String x = orders[0];
        orders[0] = orders[2];
        orders[2]= x;

        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i]+" ");
        }
    }
}
