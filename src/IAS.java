class animal{
    public void animalsound(){
        System.out.println("The animals make different sounds");
    }
}
class dog extends animal{
    public void animalsound(){
        System.out.println("the dog says:wow wow...");


    }
}
class cat extends animal{
    public void animalsound(){
        System.out.println("the cat sounds:meow meow...");
    }
}

public class IAS
{
    public static void main(String[] args)
    {
        animal obj1 =new animal();
        animal dog1=new dog();
        animal cat1=new cat();
        obj1.animalsound();
        dog1.animalsound();
        cat1.animalsound();
    }
}
