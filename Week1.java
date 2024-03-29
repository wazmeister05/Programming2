public class Week1 {

    private static void isMultiple(long n, long m){

        boolean divisible = false;
        if(n%m == 0){
            divisible = true;
        }
        System.out.println(divisible);
    }

    private static void isOdd(int n){
        boolean oddOrEven = false; //initial value 0 = false, so 1 = true
        for (int i = 1; i <= n; i++){
            oddOrEven = !oddOrEven; //!false = true
        }
        System.out.println(oddOrEven);
    }

    public static void main(String[] args){
        Week1.isOdd(222);               //false
        Week1.isOdd(45);                //true
        Week1.isMultiple(33, 3);    //true
        Week1.isMultiple(247, 2);   //false
    }

}
