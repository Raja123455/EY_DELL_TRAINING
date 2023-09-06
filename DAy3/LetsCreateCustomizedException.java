package DAy3;

class invalidageexception extends Exception{

    invalidageexception(String message){

        super(message);

    }

}

public class LetsCreateCustomizedException {



   

   public static void main(String[] args) {

       // TODO Auto-generated method stub

       

       try {

           validvoterstatus(17);

       }catch(invalidageexception e) {

           System.out.println("exception message is "+ e.getMessage());



       }

       System.out.println("code will run smoothly afterwards");





   }

   static void validvoterstatus(int age) throws invalidageexception{

       if (age<18) {

           throw new invalidageexception("user can not vote!");

       }

   }



}