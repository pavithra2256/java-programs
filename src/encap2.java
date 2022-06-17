public class encap2 {
    package encapsulation;
    class car{
        private String carname;
        private double carrate;

        public String getCarname() {
            return carname;
        }
        public void setCarname(String name){
            this.carname=name;
        }

        public double getCarrate() {
            return carrate;
        }

        public void setCarrate(double rate) {
            this.carrate = rate;
        }
    }
    public class encap2 {
        public static void main(String[] args) {
            car car1=new car();
            car1.setCarname("BMW");
            System.out.println(car1.getCarname());
            car1.setCarrate(7000000);
            System.out.println(car1.getCarrate());
        }
    }
}
