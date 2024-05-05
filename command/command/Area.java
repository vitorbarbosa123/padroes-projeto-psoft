package command.command;

import java.util.HashSet;
import java.util.Set;

// Receiver
public class Area {
    
    private Set<Veiculo> veiculosArea;
    private String area;

    public Area(String area) {
        this.veiculosArea = new HashSet<>();
        this.area = area;
    }

    public void addVeiculosArea(Veiculo veiculo) {
        if(veiculo.getAreaVeiculo().equals(area)) {
            veiculosArea.add(veiculo);
        }
    }

    public void chamaCorrida() {
        for(Veiculo veiculo: veiculosArea) {
            veiculo.chamaVeiculo();
        }
    }
}
