
package concerssionariacarroos;


public class APrazo extends Pagamento {

    private int parcelas;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public float CalcularValor() {
        
        if(parcelas <= 12)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.1*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 12 && parcelas <= 24)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.15*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 24  && parcelas <= 36)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.2*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 36  && parcelas <= 48)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.25*this.getVenda().getCarro().getValorCarro())));
        
        else if(parcelas > 48  && parcelas <= 60)
            this.getVenda().getCarro().setValorCarro((float) (this.getVenda().getCarro().getValorCarro() + (0.3*this.getVenda().getCarro().getValorCarro())));
        
        else 
            System.out.println("Parcela indisponível!!");
        
        return this.getVenda().getCarro().getValorCarro();
    }

  
   
    
}
