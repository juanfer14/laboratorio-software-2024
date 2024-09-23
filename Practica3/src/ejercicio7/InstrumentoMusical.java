package ejercicio7;

public interface InstrumentoMusical {
    void hacerSonar();
    void hacerSonar(Notas n, int duracion);
    String queEs();
    default void afinar() {};
    void afinar(FrecuenciaDeLA f);
}
