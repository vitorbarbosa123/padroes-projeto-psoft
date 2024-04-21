package state.state.State;

import state.state.Corrida;

public class Motorista extends State {

    public Motorista(Corrida corrida) {
        super(corrida);
    }

    @Override
    public String statusCorrida() {
        return "Procurando motoristas por perto da sua região";
    }
    
}
