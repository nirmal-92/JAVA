public class ConcatExample {
    public static void main(String[] args) {
        String s1 = "java string";
        //The String s1 doesnot get changed, even though it is invoking the method concat(), as it is immutable. 
        //Therfore, the explicit assignment is required here
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
    }
}


