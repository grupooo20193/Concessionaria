
package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Vendedor extends Funcionario {
    
    private ArrayList<Venda> vendas;
    private ArrayList<Cliente>clientes;

    public Vendedor(String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
    }

    public Vendedor(ArrayList<Venda> vendas, ArrayList<Cliente> clientes, String id, String nome, String usuario, String senha) {
        super(id, nome, usuario, senha);
        this.vendas = vendas;
        this.clientes = clientes;
    }

   

    public void criaVenda(Venda venda){
        vendas.add(venda);
        
    }

    public int quantidadeVendas(){
        return vendas.size();
    }


    public void deletaVenda(Venda venda){
        vendas.remove(venda);
    }

    public Venda getVenda(int posicao){
        return vendas.get(posicao);
    }
    
    public void criaCliente(Cliente cliente){
        clientes.add(cliente);
        
    }
    
    public int quantidadeClientes(){
        return clientes.size();
    }
    public void deletarCliente(Cliente cliente){
        clientes.remove(cliente);
   }
   
   public Cliente getCliente(int posicao){
        return clientes.get(posicao);
    }
   

     /* public void retornaFuncionarios(){
        for(int i=0; i < bancoDeDadosFuncionario.quantidadeVendedores(); i++){
            System.out.println(bancoDeDadosFuncionario.getVendedores(i).getNomeFuncionario());
            System.out.println("");
        }
    }*/  
}
