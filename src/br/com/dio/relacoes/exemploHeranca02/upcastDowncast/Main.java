package br.com.dio.relacoes.exemploHeranca02.upcastDowncast;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcast - Subindo na Hierarquia (IMPLICITO - não preciso de forma explicita disser pra quem eu estou querendo fazer esse upcast)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - Descendo na Hierarquia (EXPLICITO - tenho que especificar )
        //Gerente gerenteFuncionario = new Funcionario(); // erro por falta de especificação
        Vendedor vendedorFuncionario = (Vendedor)  new Funcionario(); // Valido porém deve ser evitado, perda de informação

    }
}
