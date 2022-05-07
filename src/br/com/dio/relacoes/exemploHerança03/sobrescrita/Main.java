package br.com.dio.relacoes.exemploHerança03.sobrescrita;

public class Main {
    public static void main(String[] args) {

        //Criando um vetor do tipo clase mãe
        //com 3 objetos
        ClasseMae[] classes = new ClasseMae[]{
                new ClasseFilha1(), //chamando métodos desse objeto é considerado polimorfismo
                new ClasseFilha2(), //chamando métodos desse objeto é considerado polimorfismo
                new ClasseMae()
        };

        //chamando o método 1 de cada um deles
        for (ClasseMae classe: classes) {
            classe.metodo1(); //Vai acontecer dois polimorfismo e uma chamda de método normalmente
        }
        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2(); //Vai acontecer um polimorfismo, uma chamda de método herdado da ClasseMãe e um chamda de método normalmente
        }

        System.out.println("");

        //Sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //Trabalhando diretamente com o método filha2
        classeFilha2.metodo2(); //Sobrescrendo o método, sobrescrita pura

    }
}
