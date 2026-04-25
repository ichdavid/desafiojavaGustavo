package Desafio03;

public class Main {

    static void main() {

        Carro carro1 = new Carro();
        carro1.setMarca("Honda");
        carro1.setModelo("civic");
        carro1.setPortas(4);

        carro1.abrirPorta();

        Moto moto1 = new Moto();
        moto1.setMarca("Suzuki");
        moto1.setModelo("GSX 150");
        moto1.setCilindradas(300);

        moto1.empinar();

        Bike bike1 = new Bike();
        bike1.setMarca("Caloi");
        bike1.setModelo("Vulcan");
        bike1.setPedal("Trilha - Plataforma");

        bike1.pedalar();

        carro1.verificarVelocidade(carro1.getMarca(), 60);

        moto1.verificarVelocidade(moto1.getMarca(), 85);

        bike1.verificarVelocidade(bike1.getMarca(), 10);

    }
}
