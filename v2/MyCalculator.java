public class MyCalculator {
    
    public static void main(String[] args) {
        aMessage();
        // String shouting = caps("addition");
        // System.out.println(shouting);
        
        double sum = add(5,4);
        System.out.println(sum);
        double sum2 = sub(5,4);
        System.out.println(sum2);
        double sum3 = mul(5,4);
        System.out.println(sum3);
        double sum4 = div(5,4);
        System.out.println(sum4);
        double sum5 = sqrt(5,4);
        System.out.println(Math.sqrt(sum5));




    }
    public static void aMessage(){
        System.out.println("My Calculator");
    } 
    
    public static double add(int a, int b){ // by changing void=> int, type
        return a + b;// returns a variable to be stored in method call
    }
    public static double sub(int a, int b){
        return a - b;
    }
    public static double mul(int a, int b){
        return a * b;
    }
    public static double div(int a, int b){
        return a / b;
    }
    public static double sqrt(int a, int b){
        return a / b;
    }
    public void fizunctions(){
        System.out.println(Math.sqrt());
        System.out.println("Math.sin(" + a + ")=" + Math.sin(a));
        System.out.println("Math.sin(" + b + ")=" + Math.sin(b));
    }

    
}