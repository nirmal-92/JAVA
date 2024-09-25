class Sports {
    public void play() {
        System.out.println("Let's play a sport!");
    }
}
class Football extends Sports {
    public void play() {
        System.out.println("Let's play Football!");
    }
}
class Basketball extends Sports {
    public void play() {
        System.out.println("Let's play Basketball!");
    }
}
class Rugby extends Sports {
    public void play() {
        System.out.println("Let's play Volleyball!");
    }
}

public class Para8 {
    public static void main(String[] args) {
        Sports genericSport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();
        
        genericSport.play();
        football.play(); 
        basketball.play(); 
        rugby.play(); 
    }
}
