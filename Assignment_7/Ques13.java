class CustomException extends Exception{
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}


public class Ques13 {
    public static void main(String[] args) {
        try{
            throw new CustomException();
        }catch (CustomException e){
            e.printStackTrace();
        }
    }
    
    
}
