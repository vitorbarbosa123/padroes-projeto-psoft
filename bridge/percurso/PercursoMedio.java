package percurso;

public class PercursoMedio implements Percurso {
    private static final double fatorDistancia = 0.4;
    private String MODO = "Medio";


    @Override
    public double calculaValorPercurso(double ponto_partida, double ponto_chegada) {
        return (ponto_chegada - ponto_partida) * fatorDistancia;
    }

    @Override
    public String getPercurso() {
        return this.MODO;
    }

}
