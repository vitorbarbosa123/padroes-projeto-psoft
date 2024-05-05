

import java.util.HashSet;
import java.util.Set;

public class Corrida implements Area {

    private Set<Veiculo> veiculos;
    private Passageiro passageiro;
    private double valor = Math.random() * 10;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.veiculos = new HashSet<Veiculo>();
    }

    public void iniciarCorrida(Set<Veiculo> veiculosDisponiveis) {
        setVeiculosDaArea(veiculosDisponiveis);
        notificaMotoristasDaArea();
    }

    @Override
    public Set<Veiculo> getVeiculosDaArea() {
        return veiculos;
    }

    public void setVeiculosDaArea(Set<Veiculo> veiculosDisponiveis) {
        for(Veiculo veiculo: veiculosDisponiveis) {
            if(veiculo.getPosicao().equals(passageiro.getLocalizacao())) {
                veiculos.add(veiculo);
            }
        }
    }

    @Override
    public void notificaMotoristasDaArea() {
        for(Veiculo veiculo: veiculos) {
           System.out.println( veiculo.corridaDisponivel(passageiro.getName(), passageiro.getLocalizacao(), valor));
           
        }
    }
    
}
