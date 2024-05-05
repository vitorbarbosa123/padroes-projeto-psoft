package command.command;

// Concrete command
public class Moto implements Veiculo {
    private String motorista_name;
    private double valor_base;
    private String type;
    private String area;

    public Moto(String name, double valor, String type, String area) {
        this.motorista_name = name;
        this.valor_base = valor;
        this.type = type;
        this.area = area;
    }

    @Override
    public void chamaVeiculo() {
       System.out.println(
        "Motorista selecionado: " + this.motorista_name + "\n" +
        "Tipo de veiculo: " + this.type + "\n" +
        "Valor: " + this.valor_base
       );
    }

    @Override
    public String getAreaVeiculo() {
      return this.area;
    }
}
