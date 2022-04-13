package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotApp {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Mascota m1 = new Mascota("fernando chiquito",leer.next(), "perro");
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.color);
    }

}
