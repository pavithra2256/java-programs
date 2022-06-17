public class prac3 {
    public class practice7 {
        //declaring variables
        int emp_id;
        String emp_name;
        double emp_salary;
        static String company="ITC";
        //constructor accepting single value
        practice7(int emp_id,String emp_name,double emp_salary) {
            this.emp_id=emp_id;
            this.emp_name=emp_name;
            this.emp_salary=emp_salary;
        }
        void display() {
            System.out.println(emp_id + emp_name + emp_salary+company);
        }
        static void abc(){
            company="TCS";
        }
        public static void main(String[] args) {
            //call constructor by passing a single value
            practice7 emp1=new practice7(234,"Siva",40000);
            practice7 emp2=new practice7(241,"Mrunal",78405);
            practice7 emp3=new practice7(287,"Mukthesh",58504);
            practice7.abc();
            /*practice7.company="HCL";*/
            emp1.display();

        }
    }

}
