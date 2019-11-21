package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario {

       private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
    private BancoDeDadosFuncionario funcionarios = new BancoDeDadosFuncionario();
    private  ModelosCarros carros = new ModelosCarros();

    public Gerente(String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
    }

    public void adicionaCarro(Carro carro) {
        
    }

    public int quantidadeCarros() {
        return carros.quantidadeCarros();
    }

    public void deletaCarro(Carro carro) {
        carros.deletaCarro(carro);
    }

    public void adicionaVendedor(Vendedor vendedor) {
        funcionarios.adicionaFuncionario(vendedor);
    }

    public int quantidadeVendedores() {
        return funcionarios.quantidadeVendedores();
    }

    public void deletaVendedor(Vendedor vendedor) {
        funcionarios.deletaVendedor(vendedor);
    }

    
    
    public void retornaFuncionarios(){
        
        System.out.println(funcionarios.getGerente());
    }
}
