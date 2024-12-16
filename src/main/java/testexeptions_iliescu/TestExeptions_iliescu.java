package testexeptions_iliescu;

/**
 *
 * @author B045_15
 */
public class TestExeptions_iliescu {

    public static void main(String[] args) {
        try{
            validate(16);
        }
        catch(ArithmeticException e){
            System.out.println("età non valida");
        }
        System.out.println("Hello World!");
    }

    static void validate(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("not valid");
        }
        else{
            System.out.println("welcome to vote");  
        }
    }
}
