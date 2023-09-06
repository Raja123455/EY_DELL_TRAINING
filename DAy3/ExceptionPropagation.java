package DAy3;

public class ExceptionPropagation {

	 

    public static void main(String[] args) {

        System.out.println("main method");

        try {

            ExceptionPropagation obj = new ExceptionPropagation();

            obj.a();

        }catch(InterruptedException e) {

            System.out.println("main method"+ e.getMessage());

 

        }

        // TODO Auto-generated method stub

 

    }

    void a()throws InterruptedException{

        System.out.println("method  a");

     b();

    }

    void b()throws InterruptedException{

        System.out.println("method  b");

     c();

    }

    void c()throws InterruptedException{

        System.out.println("method  c");

    }

 

 

}

 