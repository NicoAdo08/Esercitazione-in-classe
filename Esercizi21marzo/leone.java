package Esercizi21marzo;
public class Leone extends Animale {
    public Leone(String nome, int eta) {
        super(nome, eta);
    }
    @Override
    public void verso(){
        System.out.println(nome+" (Leone) ruggisce: ROAARR!");
    }
    @Override
    public void muovi() {
        System.out.println(nome+" corre velocemente nella savana.");
    }
}