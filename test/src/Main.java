import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> Material = new ArrayList<Double>();

        Material.add(90.000);
        Material.add(80.000);
        Material.add(100.000);


        double tongTien = 0;
        for(Double gia : Material) {
            tongTien += gia;
        }
        System.out.println("Tong tien cua Material: " + tongTien);
    }
}


