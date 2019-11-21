
package concerssionariacarroos;

import java.util.ArrayList;

public class BancoDeDadosFuncionario {
    private Gerente gerente;
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    
    public void adicionaFuncionario(Vendedor e){
        vendedores.add(e);
    }
    
    public int quantidadeVendedores(){
        return vendedores.size();
    }

    public void deletaVendedor(Vendedor vendedor){
        vendedores.remove(vendedor);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public Vendedor getVendedores(int posicao) {
        return vendedores.get(posicao);
    }
    
    
}
