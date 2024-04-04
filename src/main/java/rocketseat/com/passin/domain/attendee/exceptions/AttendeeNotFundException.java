package rocketseat.com.passin.domain.attendee.exceptions;

public class AttendeeNotFundException extends RuntimeException{
    public AttendeeNotFundException(String message){
        super(message);
    }
}
