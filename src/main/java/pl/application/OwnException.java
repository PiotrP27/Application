package pl.application;

public class OwnException extends Exception{

    public OwnException(){};

    public OwnException(String message){super(message);};

    public OwnException(String message,Throwable cause){super(message,cause);};

}
