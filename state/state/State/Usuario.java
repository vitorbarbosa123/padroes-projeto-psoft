package state.state.State;

import state.state.Corrida;

public class Usuario extends State {

    public Usuario(Corrida corrida) {
        super(corrida);
    }

    @Override
    public String statusCorrida() {
        corrida.changeState(new Localizacao(corrida));
        return "Validando informações do usuário";
    }
    
    
}
