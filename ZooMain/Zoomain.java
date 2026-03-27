import Esercizi21marzo.*;
import ZooUtils.ZooUtils;
import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {
        List<Animale> listaAnimali=new ArrayList<>();

        listaAnimali.add(new Leone("Simba", 5));
        listaAnimali.add(new Scimmia("George", 3));
        listaAnimali.add(new Leone("Mufasa", 10));

        System.out.println("GESTIONE ZOO VIRTUALE\n");

        for (Animale anim : listaAnimali) {
            ZooUtils.stampaInfo(anim);
            anim.verso();
            anim.muovi();
        }
        System.out.println("\n---------------------------");
        System.out.println("Fine programma.");
    }
}