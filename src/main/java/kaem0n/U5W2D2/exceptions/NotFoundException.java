package kaem0n.U5W2D2.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id){
        super("Element with id " + id + " not found.");
    }
}