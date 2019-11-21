
package concerssionariacarroos;

import java.util.Date;

public abstract class Pagamento {
    private int idPagamento;
    private Date dataPagamento;
    private Venda venda;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Pagamento() {
    }

    public Pagamento(int idPagamento, Date dataPagamento, Venda venda) {
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.venda = venda;
    }
    
    public abstract float CalcularValor();
    
}
    

   

