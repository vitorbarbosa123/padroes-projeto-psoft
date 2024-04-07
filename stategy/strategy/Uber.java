package strategy;

/*
 * Strategy: ter uma classe pai que será responsável por instânciar a estratégia utilizada. Além disso, ter uma classe Strategy 
 * que vai armazenar o comportamento que vai ser sobrescrito pelas classes de estrategias propriamente ditas.
 */
public class Uber {
    
    private Strategy MotoStrategy;
    private Strategy BicicletaStrategy;
    private Strategy CarroStrategy;
    private Strategy strategy;

    // Alterar entre: MotoStrategy, BicicletaStrategy ou CarroStrategy. Depende da escolha do cliente
    public Uber() {
        this.strategy = new CarroStrategy();
    }

    public String calculaPreco(double ponto_partida, double ponto_destino) {
        return this.strategy.calculaPrecoCorrida(ponto_partida, ponto_destino);
    }

    public static void main(String args[]) {
        Uber contexto = new Uber();
        double ponto_partida = 1.2;
        double ponto_destino = 2.4;

        System.out.println(contexto.calculaPreco(ponto_partida, ponto_destino));
    }

}


