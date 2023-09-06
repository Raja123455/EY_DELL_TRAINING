package DAy3;
import java.io.IOException;

public class ThrowKeyword {

    

 

    public static void main(String[] args) {

        sampleMethod();

        System.out.println("rest of the code");

        

        // TODO Auto-generated method stub

 

    }

    static void sampleMethod() {

        try {

            throw new IOException("device error");

            

        }catch(IOException e) {

            System.out.println("exception handled");

 

        }

    }

 

}
