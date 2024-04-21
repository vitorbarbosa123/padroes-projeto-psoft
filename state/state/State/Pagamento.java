package state.state.State;

import state.state.Corrida;

public class Pagamento extends State {

    public Pagamento(Corrida corrida) {
        super(corrida);
    }

    @Override
    public String statusCorrida() {
        corrida.changeState(new Motorista(corrida));
        return "Validando opções de pagamento";
    }
    
}
