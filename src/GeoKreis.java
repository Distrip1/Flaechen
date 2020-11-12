public class GeoKreis extends GeoForm{
    private double r = 6;
    private double f = Math.PI * r * r;
    public void setFlaeche(){
        setFlaeche(f);
    }
}

