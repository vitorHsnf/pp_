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

        /*
        Reprodutor de Musica
         */
        ReprodutorMusica mp3player = new ReprodutorMusica();
        Musica song1 = new Musica("I Can't Stop Me", "Twice", "Eyes Wide Open", 3.25);
        Musica song2 = new Musica("Eleanor Rigby", "The Beatles", "Revolver", "2.11");
        Musica song3 = new Musica("Anklebiters", "Paramore", "Paramore", "2.18");
        mp3player.setMusica(song1);
        mp3player.reproduzir();
        mp3player.pausar();
        mp3player.setMusica(song2);
        mp3player.reproduzir();
        mp3player.verificarMusica();

    }
}
