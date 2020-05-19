public class MyCalculator {
    
    public static void main(String[] args) {
        aMessage();
        // String shouting = caps("addition");
        // System.out.println(shouting);

        int sum = add(5,4);
        System.out.println(sum);
        int sum2 = sub(5,4);
        System.out.println(sum2);
        int sum3 = mul(5,4);
        System.out.println(sum3);

        // int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
        // System.out.println(awesomeArray[0]);
        // System.out.println(awesomeArray[1]);
        // System.out.println(awesomeArray[2]);
    }
    public static void aMessage(){
        System.out.println("My Calculator");
    } 
    
    public static int add(int a, int b){ // by changing void=> int, type
        return a + b;// returns a variable to be stored in method call
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static String caps(String s){
        return s.toUpperCase();
    }

    // public static int[] gimmeArrayFromInts(int a, int b, int c){
    //     int[] array = new int[3];
    //     array[0] = a;
    //     array[1] = b;
    //     array[2] = c;
    //     return array;
    // }
}