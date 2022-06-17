public class inherit2 {
    //Hierarchial inheritance
//parent class
    class Teacher {
        void specialization() {
            System.out.println("MATHS & Statistics");
        }
    }
    //child class1
    class student1 extends Teacher{
        void Maths(){
            System.out.println("To learn maths");
        }
    }
    //child class2
    class student2 extends Teacher{
        void Statistics(){
            System.out.println("To learn Statistics");
        }
    }

    public class inherit2 {
        public static void main(String[] args) {
            student2 s2=new student2();
            s2.Statistics();
            s2.specialization();
            student1 s1=new student1();
            s1.Maths();
            s1.specialization();

        }
    }
}
