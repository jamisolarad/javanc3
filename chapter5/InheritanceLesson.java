package chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
    }
}
    
final class FinalParent{
    int number;
    void getParent(){

    }
}

// class ChildClass extends FinalParent{
//     void getChildParent();
//     getParent();
//     System.out.print(number);
// }
// }

class Animal2 extends java.lang.Object{
    String name;
    int age;
    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Lion extends Animal2{
    int LionId;
    public Lion(String name, int age, int LionId){
        super(name, age);
        this.LionId = LionId;
    }
}

class MountainLion extends Lion {
    String locationString;
    public MountainLion(String name, int age, int LionId, String locationString){
        super(name, age, LionId);
        this.locationString = locationString;

    }

}

class Canine{
    public double getAveWeight(){
    return 50;
    }
}
class Wolf extends Canine{
    public double getAveWeight(){
        return
        super.getAveWeight()+20;
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAveWeight());
        System.out.println(new Wolf().getAveWeight());
    }
}
