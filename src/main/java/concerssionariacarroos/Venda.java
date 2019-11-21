package concerssionariacarroos;


import concerssionariacarroos.Cliente;
import java.util.ArrayList;

public class Venda {
    private int idVendas;
    private Cliente cliente;
    private Vendedor vendedor;
    private Carro carro;
    private Pagamento pagamento;

    public Venda(int idVendas, Cliente cliente, Vendedor vendedor, Carro carro, Pagamento pagamento) {
        this.idVendas = idVendas;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.pagamento = pagamento;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
   
}
