package Exceptions.Unchecked;

public class NoLocationException extends RuntimeException{
    public NoLocationException(NoLocationException e) {}
    public NoLocationException(String message) {
        super(message);
    }
}
