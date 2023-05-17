public class Filme {

    String titulo;
    String genero;
    int anoLancamento;
    float nota;

    void mostrar_nota(){
        System.out.println("Avaliação do filme "+titulo+": "+nota);
    }
    void nome_filme(){
        System.out.println("Nome do filme: "+titulo);
    }
    void mostrar_genero(){
        System.out.println("Gênero do filme: "+genero);
    }
}
