package Q19;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleExceptionHandle {

    public static void main(String[] args){

        try{
            FileReader f = new FileReader("/Users/yusuf/Documents/file.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
