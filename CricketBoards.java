import java.util.Scanner;

class Bowlers {
    void print() {
        System.out.println("-----Bowling Strategy-----");
    }
}

class Fast extends Bowlers {
    void fast() {
        System.out.println("He/She is a fast bowler");
    }
}

class Medium extends Bowlers {
    void medium() {
        System.out.println("He/She is a medium pace bowler");
    }
}

class Spinner extends Bowlers {
    void spin() {
        System.out.println("He/She is a spin bowler");
    }
}

public class CricketBoards{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bowling speed of the bowler : ");
        int speed = sc.nextInt();

        Bowlers obj = new Bowlers();
        obj.print();

        if (speed >= 140 && speed < 151) {
            new Fast().fast(); 
        } else if (speed >= 110 && speed <= 139) {
            new Medium().medium(); 
        } else if (speed >= 90 && speed <= 109) {
            new Spinner().spin(); 
        } else {
            System.out.println("He/She is not a bowler");
        }
    }
}
