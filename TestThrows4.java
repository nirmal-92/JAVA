public class TestThrows4 {
    //defining a method
    public static void checkNum(int num){
        if (num < 1){
            throw new ArithmeticException("\n number is negative cannot calculate square");
        }
        else{
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }

    //main method
    public static void main(String[] args) {
        TestThrows4 obj = new TestThrows4();
        obj.checkNum(3);
        System.out.println("Rest of the code");
    }
}
