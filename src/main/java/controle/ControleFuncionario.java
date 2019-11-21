/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import concerssionariacarroos.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author walki
 */
public class ControleFuncionario {
    
    String nome;
    String cargo;
    String cpf;
    String senha;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    Funcionario funcionario;
    
    public ControleFuncionario(){
        //temporario
        criaFuncionario();
    }
    
    public ControleFuncionario(String nome, String cargo, String cpf, String senha){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.senha = senha;       
        
    }
    
    //temporario
    public void criaFuncionario(){
        Funcionario nfu1 = new Funcionario("01546897847", "Nome do 1", cargo, senha);
        funcionarios.add(nfu1);
        Funcionario nfu2 = new Funcionario("25646897847", "Nome do 2", cargo, senha);
        funcionarios.add(nfu2);
        Funcionario nfu3 = new Funcionario("21346897847", "Nome do 3", cargo, senha);
        funcionarios.add(nfu3);
        
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }
    
    public void setFuncinarios(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    
   /* public void criaFuncionario(){
        if(verificaInfo()==true){
        funcionario = new Funcionario(cpf, nome, cargo, senha);
        }
        else
            JOptionPane.showMessageDialog(null, "Erro");
    }
    */
    public boolean verificaInfo(){
        if (nome.isEmpty()){
            return false;
        }
        if (cpf.isEmpty()){
            return false;
        }
        if (senha.isEmpty()){
            return false;
        }
        return true;
    }
    
}
