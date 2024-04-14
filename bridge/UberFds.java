import percurso.Percurso;
import veiculo.Veiculo;

public class UberFds extends Uber {
    private static final double DINAMICA = 1.2;

    public UberFds(Veiculo veiculo, Percurso percurso) {
        super(veiculo, percurso);
    }


    @Override
    public double determinaValorFinal(double valorVeiculo, double valorPercurso) {
        return (valorVeiculo / valorPercurso) * DINAMICA;   
    }

    
}
