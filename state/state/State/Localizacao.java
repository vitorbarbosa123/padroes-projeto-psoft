package state.state.State;

import state.state.Corrida;

public class Localizacao extends State {

    public Localizacao(Corrida corrida) {
        super(corrida);
    }

    @Override
    public String statusCorrida() {
        corrida.changeState(new Pagamento(corrida));
        return "Validando sua localização";
    }

    
    
}
