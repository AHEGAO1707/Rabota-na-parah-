public class focus {
    public static void main(String[] args){
        int[] a = {-1, -1, -1, -1, -1};
        for (int i = 1; i<a.length-1;) {
            //a[i] = i++; //постфиксный инкремент
            a[i] = ++i +10; //префиксный инкремент
            //a[i--] = i; //постфиксный декремент
            //a[--i] = i; //префиксный декремент
        }
        for (int i = 0; i<a.length; i = i+1) {
            System.out.println(a[i]);
        }
        System.out.println("\n");
    }
}
