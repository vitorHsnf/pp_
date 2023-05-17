public class Carro {
    String modelo;
    String cor;
    float velocidade;

    void ligar(){
        System.out.println("O carro "+modelo+" foi ligado");
    }
    void desligar(){
        System.out.println("O carro "+modelo+" foi desligado");

    }
    void acelerar(){
        System.out.println("Acelerando...");
        velocidade++;
        System.out.println("Velocidade atual (km): "+velocidade);
    }
}
