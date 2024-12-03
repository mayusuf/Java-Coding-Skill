package Q36;

class MarkerClass implements MyMarkerInterface{

    private String data;

    public MarkerClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class MarkerInterfaceTest {

    public static void main(String[] args) {
        MarkerClass markerClass = new MarkerClass("Marker Class");

        if(markerClass instanceof MyMarkerInterface){

            System.out.println("Object is marked with MyMarkerInterface!");

        }else{
            System.out.println("Object is not marked with MyMarkerInterface!");

        }
    }
}
