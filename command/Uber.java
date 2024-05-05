package command;


/*
 * O padrão command é bastante similar ao padrão strategy. A ideia é que classes extremamente similares, mas que possuam
 * pelo menos um comportamento diferente, possam ser encapsuladas e utilizadas dependendo do contexto. A ideia é que 
 * todas essas classes implementem um método de ação oriunda de uma interface. Cada classe vai implementar a sua ação da sua
 * própria maneira, contanto que instancie o método da interface. O local que vai precisar da entidade precisa determinar
 * qual vai ser o comando executado (ou qual ação vai ser executada) e a partir disso, a entidade especifica vai ser chamada.
 * A ideia é boa quando se tem uma quantidade significativa de entidades que possuem apenas ações como diferença. Poucos casos
 * ainda faz sentido ter subclasses.
 * @author Vitor Barbosa
 */
// Invoker
public class Uber {
    private Area area;

    public void setArea(Area area) {
        this.area = area;
    }

    public void chamaCorrida() {
        this.area.chamaCorrida();
    }

    public void addVeiculosArea(Veiculo veiculo) {
        this.area.addVeiculosArea(veiculo);
    }

    // Client
    public static void main(String args[]) {
        String area_passageiro = "A1";
        Uber contexto = new Uber();
        contexto.setArea(new Area(area_passageiro));
        contexto.addVeiculosArea(new Carro("Carro", 20000.0, "João", "A1"));
        contexto.addVeiculosArea(new Moto("Moto", 10000.0, "Maria", "A1"));
        contexto.addVeiculosArea(new Carro("Carro", 50000.0, "Pedro", "C3"));
        contexto.addVeiculosArea(new Carro("Carro", 80000.0, "Ana", "D4"));
        contexto.addVeiculosArea(new Moto("Moto", 30000.0, "Carlos", "E5"));
        contexto.chamaCorrida();

    }
}
