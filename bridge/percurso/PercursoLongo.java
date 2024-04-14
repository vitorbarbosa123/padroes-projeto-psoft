package percurso;

public class PercursoLongo implements Percurso {
    private static final double fatorDistancia = 0.3;
    private String MODO = "Longo";


    @Override
    public double calculaValorPercurso(double ponto_partida, double ponto_chegada) {
        return (ponto_chegada - ponto_partida) * fatorDistancia;
    }

    @Override
    public String getPercurso() {
        return this.MODO;
    }

}
