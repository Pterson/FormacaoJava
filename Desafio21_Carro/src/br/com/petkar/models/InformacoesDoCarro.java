package br.com.petkar.models;

public class InformacoesDoCarro extends Carro {

    public InformacoesDoCarro(String nomeDoModelo, int anoDeFabricacao) {
        super(nomeDoModelo, anoDeFabricacao);
    }

    // Adiciona informações específicas do modelo ao exibir
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Exibe as informações da classe pai
        System.out.println("Este é um modelo específico do tipo ModeloCarro.");
    }
}
