public class Test {
         int a =50;
        public static void main(String[] args) {
            int a =10;
            a=Test.a=90;
            System.out.println(a);
            System.out.println(Test.a);
        }
}
