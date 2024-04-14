import percurso.Percurso;
import veiculo.Veiculo;

public class UberSemana extends Uber {

    private static final double DINAMICA = 0.9;


    public UberSemana(Veiculo veiculo, Percurso percurso) {
        super(veiculo, percurso);
    }

    @Override
    public double determinaValorFinal(double valorVeiculo, double valorPercurso) {
        return (valorVeiculo / valorPercurso) * DINAMICA;   
    }
    
}
