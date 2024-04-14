import percurso.*;
import veiculo.*;

/*
 * O padrão bridge permite que duas entidades diferentes se desenvolvam e se relacionem sem que uma impacte na outra.
 * No exemplo abaixo, a entidade veiculo pode crescer para outros tipos de veiculos, o mesmo acontecendo para o percurso. 
 * No fim, ambas as classes ainda podem ser combinadas para diferentes situações.
 * @author Vitor Barbosa
 * 
 */
public abstract class Uber {

    Veiculo veiculo;
    Percurso percurso;

    public Uber(Veiculo veiculo, Percurso percurso) {
        this.veiculo = veiculo;
        this.percurso = percurso;
    }

    public abstract double determinaValorFinal(double valorVeiculo, double valorPercurso);

    public String chamaCorrida(double ponto_partida, double ponto_chegada) {
        double valorPercurso = this.percurso.calculaValorPercurso(ponto_partida, ponto_chegada);
        double valorVeiculo = this.veiculo.calculaPrecoCorrida(valorPercurso);
        return "O veiculo selecionado foi: " + this.veiculo.getVeiculo() + "\n" +
               "O percurso selecionado foi: " + this.percurso.getPercurso() + "\n" + 
               "O valor final foi: " + determinaValorFinal(valorVeiculo, valorPercurso);

    }

    public static void main(String args[]) {
        Veiculo bicicleta = new Bicicleta();
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();
    
        Percurso curto = new PercursoCurto();
        Percurso medio = new PercursoMedio();
        Percurso longo = new PercursoLongo();

        double ponto_partida_longo = 2;
        double ponto_chegada_longo = 5;
        double ponto_partida_medio = 2;
        double ponto_chegada_medio = 4;
        double ponto_partida_curto = 2;
        double ponto_chegada_curto = 3;
        
        Uber chamaCorridaSemanaCarro = new UberSemana(carro, longo);
        Uber chamaCorridaSemanaMoto = new UberSemana(moto, medio);
        Uber chamaCorridaSemanaBicicleta = new UberSemana(bicicleta, curto);

        Uber chamaCorridaFdsCarro = new UberFds(carro, longo);
        Uber chamaCorridaFdsMoto = new UberFds(moto, medio);
        Uber chamaCorridaFdsBicicleta = new UberFds(bicicleta, curto);


        System.out.println(chamaCorridaSemanaMoto.chamaCorrida(ponto_partida_medio, ponto_chegada_medio));

    }
}
