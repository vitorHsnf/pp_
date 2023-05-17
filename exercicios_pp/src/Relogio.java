public class Relogio {
    String marca;
    int horas;
    boolean alarme;

    void obter_hora(){
        System.out.println("Horário: "+horas+" horas");
    }
    void definir_alarme(){
        System.out.println("O alarme foi definido");
    }
    void obter_marca(){
        System.out.println("Marca do relógio: "+ marca);
    }
}
