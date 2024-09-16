import java.util.ArrayList;
import java.util.List;

// Interface Venda
interface Venda {
    void Venda();
    void returnVenda();
}

// Classe Veiculo implementando Venda
class Veiculo implements Venda {
    private String marca;
    private String preco;
    private String nome;

    public Veiculo(String marca, String preco, String nome) {
        this.marca = marca;
        this.preco = preco;
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getPreco() {
        return preco;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public void Venda() {
        
    }

    @Override
    public void returnVenda() {
        
    }
}

// Classe User
class User {
    private String name_user;
    private List<Veiculo> Venda;

    public User(String name_user) {
        this.name_user = name_user;
        this.Venda = new ArrayList<>();
    }

    public void Venda(Veiculo veiculo) {
        Venda.add(veiculo);
        veiculo.venda();
    }

    public void returnVenda(Veiculo veiculo) {
        Veiculo_vendido.remove(veiculo);
        veiculo.returnVenda();
    }
}

// Classe Store
class Store {
    private String nome_store;
    private List<Veiculo> veiculos;
    private List<User> users;

    public Store(String name) {
        this.nome_store = nome_store;
        this.veiculos = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculo.add(veiculo);
    }

    public void registerUser(User User) {
        User.add(users);
    }
}
