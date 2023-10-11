public class Swap {
    public static void main(String[] args) {
        int x=2;
        int y=3;
        System.out.println("before swap first number is "+x);
        System.out.println("before swap second number is "+y);
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap first number is "+x);
        System.out.println("after swap second number is "+y);
    }
}
