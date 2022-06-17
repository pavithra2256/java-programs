package programs;
interface polygon{
    void getArea(int length,int breath);
}
class rectangle implements polygon{
    @Override
    public void getArea(int length, int breath) {
        System.out.println("th area of rectangle is: "+(length*breath));
    }
}

public class prac3 {
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.getArea(7,5);

    }
}
