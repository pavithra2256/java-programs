package Exception;

public class excep1 {
    public static void main(String[] args){
        try {
            int divided = 100 / 40;
            System.out.println("division");
        }
        catch (ArithmeticException e) {
            System.out.println("error is occurred");
        }
        finally {
            System.out.println("finally rectified");
        }
    }

}
