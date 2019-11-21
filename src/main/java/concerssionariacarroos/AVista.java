
package concerssionariacarroos;


public class AVista extends Pagamento {

    public float CalcularValor() {
        
        this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() - (0.05*this.getVenda().getCarro().getValorCarro())));
        
        return this.getVenda().getCarro().getValorCarro();
    }
   
}
