public class encapulation1 {
    package encapsulation;
    class employee {
        private String empname;
        private int empid;
        private String empdepartment;

        public String getEmpname() {
            return empname;
        }

        public void setEmpname(String name) {
            this.empname = name;
        }

        public int getEmpid() {
            return empid;
        }

        public void setEmpid(int id) {
            this.empid = id;
        }

        public String getEmpdepartment() {
            return empdepartment;
        }

        public void setEmpdepartment(String deprt) {
            this.empdepartment = deprt;
        }

    }
    class encap1 {
        public static void main(String[] args) {
            employee obj1 = new employee();
            obj1.setEmpname("Jaswanthi");
            obj1.setEmpid(71);
            obj1.setEmpdepartment("jr.Executive");
            System.out.println(obj1.getEmpname());
            System.out.println(obj1.getEmpid());
            System.out.println(obj1.getEmpdepartment());
        }
    }

}
