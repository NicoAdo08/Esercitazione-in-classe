package Esercizi21marzo;
public class Scimmia extends Animale{
    public Scimmia(String nome, int eta) {
        super(nome, eta);
    }
    @Override
    public void verso(){
        System.out.println(nome+" (Scimmia) grida: UHUH AHAH!");
    }
    @Override
    public void muovi(){
        System.out.println(nome+" si arrampica agilmente sugli alberi.");
    }
}