package g5;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Contenedor c = new Contenedor(5);
        System.out.println(c.getPrioridad());
        c.setPrioridad(2);
        Contenedor c1 = new Contenedor(1, 500, "España", false, 2,"patatas" , "MA", "MO");
        System.out.println(c1.toString());

        System.out.println("------------------------------------------------------------------------------------");
        int num;
        Contenedor [][] aux = new Contenedor[10][12];
        Contenedor aux1 = new Contenedor(0);
        Random rand = new Random();
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                num = rand.nextInt(100-0+1) + 1;
                aux1 = new Contenedor(num);
                aux[i][j] = aux1;
            }
        }
        Hub h = new Hub();
        aux [3][1] = null;
        c.setPais("España");
        h.setArrayCont(aux);
        System.out.println(h.toString());
        h.apilar(c);
        System.out.println("Apilado: ");
        System.out.println(h.toString());


    }
}
