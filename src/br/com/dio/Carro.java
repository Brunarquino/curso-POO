package br.com.dio;
 //Objeto/Classe/Substantivo
 //Carro
public class Carro {

     //Atributos/Caracteristicas/Adjetivos
     //Atributos do Carro
     String cor;
     String modelo;
     int capacidadeTanque;

     //Contrutores
     //Contrutor vazio
     Carro(){}

     //sobregarga do construtor
     Carro(String cor, String modelo, int capacidadeTanque) {
         this.cor = cor;
         this.modelo = modelo;
         this.capacidadeTanque = capacidadeTanque;
     }

     //Metodos métodos getters e setters
     //GET ->  Pegue, Me rotarna, me devolva
     String getCor() {
      return cor;
     }
     //SET -> colocar o valor em um atributo
     void setCor(String cor) {
      this.cor = cor;
     }

     String getModelo() {
      return modelo;
     }
     void setModelo(String modelo) {
      this.modelo = modelo;
     }

     int getCapacidadeTanque() {
      return capacidadeTanque;
     }
     void setCapacidadeTanque(int capacidadeTanque) {
      this.capacidadeTanque = capacidadeTanque;
     }

     //Metodos/Comportamentos/verbos/ações do objeto
     //método do total para encher o tanque
     double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
     }

 }




