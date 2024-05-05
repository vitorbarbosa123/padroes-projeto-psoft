import java.util.HashSet;
import java.util.Set;

/*
 * O padrão observer tem o objetivo de encapsular classes que apresentam a mesma modificação mediante a atualização de
 * algum de seus atributos. A ideia é que exista uma classe (geralmente uma interface) que encapsule os métodos responsáveis
 * por atualizar algum dado. A classe possuidora dos dados atualizados precisa armazenar quais "distribuidores de informações"
 * deverão ter seus dados atualizados (geralmente uma lista armazena). A partir disso, aquelas entidades são atualizadas/notificadas
 * todas de uma única vez.
 * @author Vitor Barbosa
 */
public class Uber {

    private Corrida corrida;
    private Set<Veiculo> veiculosDisponiveis;
    private Passageiro passageiro;

    public Uber(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.veiculosDisponiveis = new HashSet<Veiculo>();
    }

    public void buscaCorrida() {
        corrida = new Corrida(this.passageiro);
        corrida.iniciarCorrida(veiculosDisponiveis);
    }

    public void adicionaMotoristas(Veiculo veiculo) {
       this.veiculosDisponiveis.add(veiculo);
    }

    public static void main(String args[]) {
        Passageiro passageiro = new Passageiro("vitor", "B2");
        Uber contexto = new Uber(passageiro);
        contexto.adicionaMotoristas(new Veiculo("Carro", 20000.0, "João", "A1"));
        contexto.adicionaMotoristas(new Veiculo("Moto", 10000.0, "Maria", "B2"));
        contexto.adicionaMotoristas(new Veiculo("Caminhão", 50000.0, "Pedro", "C3"));
        contexto.adicionaMotoristas(new Veiculo("Ônibus", 80000.0, "Ana", "D4"));
        contexto.adicionaMotoristas(new Veiculo("Van", 30000.0, "Carlos", "E5"));
        contexto.buscaCorrida();
    }
    
}
