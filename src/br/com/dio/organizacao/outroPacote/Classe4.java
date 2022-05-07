package br.com.dio.organizacao.outroPacote;
//classe não está no mesmo pacote, só tem acesso as publicas
//então tem que importar e fazer uma atribuição para poder usar alguns coisas da classe1
import br.com.dio.organizacao.visibilidade.Classe1;

public class Classe4 {
    Classe1 classe1;

    void  metodo() {
        // atributo 3
        //metodo 3
    }
}
