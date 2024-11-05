package Q24;

import java.io.IOException;

class ThrowsCheckedException {

        public static void method1() throws IOException{
            throw new IOException("Call from method2");
        }

        public static void main(String[] args) {
           try {
               method1();
           }catch (IOException e){
               System.out.println("Exception Handled !!");
        }
    }

}
