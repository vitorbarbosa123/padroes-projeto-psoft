package template_method;

/*
 * Template method: ter uma classe de template (abstract) que vai armazenar métodos que podem ser sobrescritos ou não.
 * Os métodos que podem ser sobrescritos são aqueles que apresentam comportamentos diferentes dado a entrada. Já os 
 * métodos que não necessitam ser sobrescritos são aqueles que armazenam comportamentos universais e independentes do tipo
 * de dado.
 * @autor Vitor Barbosa
 */
public abstract class Uber {
    
    // método universal
    public double calculaDistancia(double ponto_partida, double ponto_destino) {
        return ponto_destino - ponto_partida;
    }

    // método que pode ser sobrescrito declarado como asbtract;
    public abstract double calculaValorDistanciaPorPrecoBaseVeiculo(double distancia);

    // método que pode ser sobrescrito declarado como asbtract;
    public abstract double calculaPrecoFinalComDinamica(double valorDistancia);

    /*
    * Esse padrão também aplica uma ideia de "método de etapas". Onde, é descrito um método que vai servir como um
    * passo a passo que apresenta chama os métodos universais e os sobrescritos.
    */ 
    public final double valorCorrida(double ponto_partida, double ponto_destino) {
        double result;
        double distanciaTotal = calculaDistancia(ponto_partida, ponto_destino);
        double precoDistancia = calculaValorDistanciaPorPrecoBaseVeiculo(distanciaTotal);
        result = calculaPrecoFinalComDinamica(precoDistancia);

        return result;
    }

    public static void main(String args[]) {
        Uber uber = new CarroTemplate();
        double ponto_partida = 1.2;
        double ponto_destino = 2.4;
        System.out.println(uber.valorCorrida(ponto_partida, ponto_destino));
    }

}


