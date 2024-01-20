package generic;

import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    String modelo;
    int ano;
    double preco;

    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public abstract String obterInformacoes();
}

class CarroEsportivo extends Carro {
    public CarroEsportivo(String modelo, int ano, double preco) {
        super(modelo, ano, preco);
    }

    @Override
    public String obterInformacoes() {
        return String.format("Carro Esportivo - Modelo: %s, Ano: %d, Preço: R$%.2f", modelo, ano, preco);
    }
}

class CarroLuxo extends Carro {
    public CarroLuxo(String modelo, int ano, double preco) {
        super(modelo, ano, preco);
    }

    @Override
    public String obterInformacoes() {
        return String.format("Carro de Luxo - Modelo: %s, Ano: %d, Preço: R$%.2f", modelo, ano, preco);
    }
}

public class ListaDeCarrosAbstrata {
    public static void main(String[] args) {
        // Criando instâncias de carros
        Carro carroEsportivo = new CarroEsportivo("Ferrari", 2022, 500000.0);
        Carro carroLuxo = new CarroLuxo("Mercedes S-Class", 2023, 150000.0);

        // Criando a lista de carros
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(carroEsportivo);
        listaCarros.add(carroLuxo);

        // Exibindo a lista de carros
        for (Carro carro : listaCarros) {
            System.out.println(carro.obterInformacoes());
        }
    }
}

