public class languages {
    public class languages {
        String proglanguages;

        //constructor accepting single value
        languages(String prog){
            proglanguages=prog;
            System.out.println("Programming Lanuage:" +proglanguages);
        }
        public static void main(String[] args) {
            //call constructer by passing a single value
            languages obj1=new languages("Java");
            languages obj2=new languages("C");
            languages obj3=new languages("Python");
        }
    }
}
