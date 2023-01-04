package chainofresponsibility;

public class ATM {
    public static void main(String[] args){
        Handler50 handler50 = new Handler50();
        Handler20 handler20 = new Handler20();
        Handler10 handler10 = new Handler10();
        Handler5 handler5 = new Handler5();
        handler50.setNext(handler20);
        handler20.setNext(handler10);
        handler10.setNext(handler5);
        handler50.process(23145);
    }
}
