package state.state;

import state.state.State.*;

public class Corrida {
    private State state;

    public Corrida() {
        this.state = new Usuario(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
