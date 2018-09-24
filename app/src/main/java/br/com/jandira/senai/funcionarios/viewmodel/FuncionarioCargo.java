package br.com.jandira.senai.funcionarios.viewmodel;

import br.com.jandira.senai.funcionarios.model.Funcionario;

/**
 * Created by 17259208 on 24/09/2018.
 */

public class FuncionarioCargo {

    private Funcionario funcionario;

    private String cargo;


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

