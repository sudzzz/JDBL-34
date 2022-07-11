package Session2;

class UserNotFoundException extends Exception{
    public UserNotFoundException(String s){
        super(s);
    }
}

public class CustomException {
    public static void main(String args[]) throws UserNotFoundException{
        try {
            throw new UserNotFoundException("User doesn't exist in the system");
        }
        catch (UserNotFoundException e){
            System.out.println();
        }
        //Encountered a situation where user is not found
//        throw new userNotFoundException("User doesn't exist in the system");
    }
}
