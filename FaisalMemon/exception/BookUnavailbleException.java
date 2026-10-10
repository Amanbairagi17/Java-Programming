package FaisalMemon.exception;

class BookUnavailbleException extends Exception {
    public  BookUnavailbleException(String msg){
        super(msg);
    }
}
class InValidBookAccess extends Exception{
    public InValidBookAccess(String msg){
        super(msg);
    }
}
