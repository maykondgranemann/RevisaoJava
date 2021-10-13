package R07;

public class Main {
    public static void main(String[] args) {
        Localizacao loc1 = new Localizacao(1115151, -1161656);
        
        long lat = loc1.getLatitude();
        long log = loc1.getLongitude();
        System.out.printf("\nLat inicial %d Log inicial %d\n", lat, log);

        loc1.setLatitude(1516515);
        loc1.setLongitude(-1516515);

        System.out.println(loc1);
    }
}
