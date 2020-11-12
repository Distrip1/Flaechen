public class MainGeo{
    public static void main(String[] argv){
        GeoRechteck gr1 = new GeoRechteck();
        GeoKreis gk1 = new GeoKreis();
        GeoDreieck gd1 = new GeoDreieck();

        gr1.setFlaeche();
        gk1.setFlaeche();
        gd1.setFlaeche();

        System.out.println("Die Flaeche des Rechtecks betraegt " + gr1.getFlaeche() + " Meter!");
        System.out.println("Die Flaeche des Kreises betraegt " + gk1.getFlaeche() + " Meter!");
        System.out.println("Die Flaeche des Dreiecks betraegt " + gd1.getFlaeche() + " Meter!");
    }

}

