package Q28;

import java.io.BufferedInputStream;
import java.io.FileReader;

public class Demo {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("/Users/yusuf/Documents/file.txt")){

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
