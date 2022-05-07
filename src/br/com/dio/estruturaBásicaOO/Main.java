package br.com.dio.estruturaBásicaOO;

public class Main {
    public static void main(String[] args) {

        //Contrutor Vazio
        //Instanciando o objeto de uma classe
        Carro carro1 = new Carro();

        //Colocando valor nos atributos pelo set
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //Pegando o retorno desses atributos
        System.out.println("Caracteristicas do 1ºCarro");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do Tanque: " + carro1.getCapacidadeTanque());
        //Mensagem/Chamando o método
        System.out.println("Total do valor do Tanque: " + carro1.totalValorTanque(6.39));

        //Passou seus valores pelo construtor
        //Instanciando o objeto de uma classe e passando os valores atraves de parâmetros
        //Sobrecarga
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C",66);

        System.out.println("\nCaracteristicas do 2ºCarro");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque());

        //Mensagem/Chamando o método
        System.out.println("Total do valor do Tanque: " + carro2.totalValorTanque(6.46));


    }
}
