public class Gatto extends Animale {

    Gatto(String razza, String verso) {
        super(razza, verso);
        
    }

    @Override
    void faiIlVerso(String razza,String verso) {

        System.out.println("il " + razza + " fa " + verso +" frfrf");
    }
    
}
