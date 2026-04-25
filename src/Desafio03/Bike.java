package Desafio03;

public class Bike extends Veiculo {

    private String pedal;

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public void pedalar(){
        System.out.println("\nPedalando...\n");
    }

}
