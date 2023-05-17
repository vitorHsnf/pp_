public class Main {
    public static void main(String[] args) {
        /*
        * Carro
        * */
        Carro volkswagenFusca = new Carro();
        Carro toyotaCorolla = new Carro();
        Carro hondaCivic = new Carro();
        Carro fiatIdea = new Carro();
        Carro fordMondeo = new Carro();

        volkswagenFusca.modelo = "volkswagen";
        volkswagenFusca.velocidade = 50;
        volkswagenFusca.ligar();
        volkswagenFusca.acelerar();

        /*
        * Relogio
        * */
        Relogio casio = new Relogio();
        Relogio citizen = new Relogio();
        casio.horas = 10;
        casio.marca = "casio";
        casio.obter_hora();
        casio.obter_marca();

        /*
        Filme
         */
        Filme starWars= new Filme();
        Filme titanic = new Filme();
        starWars.titulo = "Star Wars III";
        starWars.genero = "ficção científica";
        starWars.nota = 4.5F;

        starWars.mostrar_nota();
        starWars.mostrar_genero();

    }
}
