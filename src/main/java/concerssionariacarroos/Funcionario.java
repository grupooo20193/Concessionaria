
package concerssionariacarroos;



public class Funcionario {
     
    private int idFuncionario;
    private String nomeFuncionario;
    private String usuarioFuncionario;
    private String senhaFuncionario;
   // BancoDeDadosFuncionario bancoDeDadosFuncionario = new BancoDeDadosFuncionario();
    
    public Funcionario(String id, String nome, String usuario, String senha){
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nome;
        this.usuarioFuncionario = usuario;
        this.senhaFuncionario = senha;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getUsuarioFuncionario() {
        return usuarioFuncionario;
    }

    public void setUsuarioFuncionario(String usuarioFuncionario) {
        this.usuarioFuncionario = usuarioFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    
    
   /* public void retornaFuncionarios(){
        for(int i=0; i < bancoDeDadosFuncionario.quantidadeVendedores(); i++){
            System.out.println(bancoDeDadosFuncionario.getVendedores(i).getNomeFuncionario());
            System.out.println("");
        }
        System.out.println(bancoDeDadosFuncionario.getGerente());
    }  */
     
}
