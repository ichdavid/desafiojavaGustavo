package Desafio03;

public class Veiculo {

    private String marca;
    private String modelo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void verificarVelocidade(String marcaVeiculo, int velocidadeAtual){
        int velocidadeMaxima = 60;

        if(velocidadeMaxima > velocidadeAtual){
            System.out.printf("\nEste %s, esta fora da velocidade permitida!\n", marcaVeiculo);
        }else{
            System.out.printf("\nEste %s, esta dentro da velocidade permitida!\n", marcaVeiculo);
        }
    }

}
