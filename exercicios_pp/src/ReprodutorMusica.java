public class ReprodutorMusica {

    private Musica music;
    private int volume = 0;

    public void reproduzir(){
        System.out.println("Tocando: " + music.getTitulo() + " - " + music.getArtista());

    }
    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void retomar(){
        System.out.println("Retomando música...");
    }

    public void verificarMusica(){
        System.out.println("Dados da Música Atual...");
        System.out.println("-> Título: " + music.getTitulo());
        System.out.println("-> Artista: " + music.getArtista());
        System.out.println("-> Álbum: " + music.getAlbum());
        System.out.println("-> Duração: " + music.getDuracao() + " minutos");
    }

    public void setMusica(Musica new_music){
        music = new_music;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando Volume... ");
        volume++;
        System.out.println("Volume Atual: "+volume);
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo Volume... ");
        volume--;
        System.out.println("Volume Atual: "+volume);
    }
}
