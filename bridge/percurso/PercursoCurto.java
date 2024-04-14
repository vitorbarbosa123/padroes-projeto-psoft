package percurso;

public class PercursoCurto implements Percurso {
    private static final double FATOR_DISTANCIA = 0.5;
    private String MODO = "Curto";

    @Override
    public double calculaValorPercurso(double ponto_partida, double ponto_chegada) {
        return (ponto_chegada - ponto_partida) * FATOR_DISTANCIA;
    }

    @Override
    public String getPercurso() {
        return this.MODO;
    }

}
