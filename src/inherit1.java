public class inherit1 {
    //Multi-level inheritance
    class Twowheeler{
        void latest(){
            System.out.println("Latest models");
        }
    }

    //parent class
    class bike extends Twowheeler{
        void ride(){
            System.out.println("Exclusive bikes");
        }
    }
    //child class
    class honda extends bike {
        void milage() {
            System.out.println("Honda speed bike");
        }

    }

    public class inherit1 {
        public static void main(String[] args) {
            honda bike1=new honda();
            bike1.milage();
            bike1.ride();
            bike1.latest();
        }
    }
}
