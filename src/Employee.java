public class Employee {
    public class Employee {
        String empname="Mukthesh";
        int empid= 231;
        int empsalary=48903;

        public void displayEmployeebonus() {
            System.out.println("Employee" + empname + "gets the bonus of" + empsalary * 0.20);
        }
        public static void main(String[] args){
            Employee emp1=new Employee();
            Employee emp2=new Employee();

            emp1.empname="Rob";
            emp2.empid=10;
            emp1.empsalary=28684;

            emp1.displayEmployeebonus();

            emp2.empname="Siva";
            emp2.empid=21;
            emp2.empsalary=98675;

            emp2.displayEmployeebonus();
        }
    }
}
