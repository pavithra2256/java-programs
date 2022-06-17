public class arg {
    public class arg {
        int i;
        //constructor with no parameter
        private arg(){
            i=5;
            System.out.println("Constructor is:");
        }
        public static void main(String[] args) {
            //calling the constructor without any parameter
            arg obj=new arg();
            System.out.println("Value of i:"+obj.i);
        }
    }
}
