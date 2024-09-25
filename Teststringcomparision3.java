public class Teststringcomparision3 {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s4 = new String("Sachin");
        String s3 = new String("Sachin");
        System.out.println(s1==s2);//true(because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        System.out.println(s3==s4);//false(Memory allocation is differnt)
    }
}
