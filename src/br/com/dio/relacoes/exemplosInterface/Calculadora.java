package br.com.dio.relacoes.exemplosInterface;

class Calculadora implements  OperacaoMatematica{

    //Classe que implementa ainterface OperacaoMatematica
    //Precisa implementar todos os métodos
    //Se não implenetar todos os métodos dará um erro
    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }
    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 - operando2));
    }
    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 * operando2));
    }
    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 / operando2));
    }

}
