package Desafio03;

public class Moto extends Veiculo {

    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void empinar(){
        System.out.println("\nCilindradas ativadas!\n");
    }
}
