public class TestThrow1 {
    //function toc heck if person is elegible to vote or not
    public static void validate(int age){
        if(age<18){
            //throws Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }

    //main method
    public static void main(String[] args) {
        //calling the function
        validate(20);
        validate(21);
        System.out.println("rest of the code...");
    }
    
}