public class Animale {
    
    String razza;
    String verso;

    Animale(String razza, String verso){
        this.razza = razza;
        this.verso = verso;

    }

    void faiIlVerso(String razza,String verso) {

        System.out.println("il " + razza + " fa " + verso);
    }

}
