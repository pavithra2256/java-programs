package programs;
abstract class Animal{
     abstract void makesound();
     public void eat(){
         System.out.println("i can eat");

     }


}
class Goat extends Animal{
    public void makesound(){
        System.out.println("im a goat");
    }


}

public class prac2 {
    public static void main(String[] args){
        Goat d1=new Goat();
        d1.makesound();
        d1.eat();

    }
}
