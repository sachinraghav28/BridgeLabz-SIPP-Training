public class Seven {
    public static void main(String[] args) {
        int radius= 6378;
        double pi = 3.14159265358979323846;
        Double volumeofearth=(4/3)*pi*radius*radius*radius;
        Double cubicmiles =volumeofearth*0.621371;
        System.out.println("The volume of earth in cubic km is  "+volumeofearth+" and in cubic miles is "+cubicmiles);
    }
}
