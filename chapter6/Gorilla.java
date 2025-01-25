package chapter6;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {
    
    //put gorilla food into cage
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
        System.out.println("-The gorilla is full.\n");
        return true;
        }

        else {
        System.out.println("-The gorilla is not hungry.\n");
        return false;
        }
    }

    //lather, rinse, repeat
    public void groom() {
        System.out.println("-The gorilla looks clean now.\n");
    }

    //pet at your own risk
    public void pet() {
        System.out.println("-The gorilla felt happy.\n");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        System.out.println(">>Feeding the gorilla");
        gorilla.feed(true);

        System.out.println(">>Grooming the gorilla");
        gorilla.groom();

        System.out.println(">>Petting the gorilla");
        gorilla.pet();
    }
}
