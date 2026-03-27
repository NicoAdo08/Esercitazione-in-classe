package ZooUtils;
import Esercizi21marzo.Animale;

public class ZooUtils{
    public static void stampaInfo(Animale a) {
        System.out.println("---------------------------");
        System.out.println("NOME: "+a.getNome());
        System.out.println("ETA': "+a.getEta());
        System.out.println("SPECIE: "+ a.getClass().getSimpleName());
    }
}