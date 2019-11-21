

package concerssionariacarroos;

import java.io.File;

public class Carro {
    private int idCarro;
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
    private float valorCarro;
    
    public Carro(){
        
    }
    public Carro(String marcaCarro, String modeloCarro, String anoCarro, float valorCarro){
        this.anoCarro = anoCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.valorCarro = valorCarro;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }
    
    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    public float getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(float valorCarro) {
        this.valorCarro = valorCarro;
    }

}