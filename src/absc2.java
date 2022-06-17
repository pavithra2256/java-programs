public class absc2 {
    abstract class lang{
        abstract void nation();
        public void Telugu(){
            System.out.println("Telugu is my native language");
        }
    }
    class Hindi extends lang{
        void nation(){
            System.out.println("Hindi is our national language");
        }
    }
    class English extends lang{
        void nation(){
            System.out.println("English is mainly used for communication purpose");
        }
    }
    public class abst2 {
        public static void main(String[] args) {
            English lang1=new English();
            lang1.Telugu();
            lang1.nation();
            Hindi lang2=new Hindi();
            lang2.Telugu();
            lang2.nation();
        }
    }
}
