package br.com.jandira.senai.funcionarios.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import br.com.jandira.senai.funcionarios.dao.CargoDao;
import br.com.jandira.senai.funcionarios.dao.FuncionarioDao;
import br.com.jandira.senai.funcionarios.model.Cargo;
import br.com.jandira.senai.funcionarios.model.Funcionario;


@Database(entities = {Funcionario.class, Cargo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract FuncionarioDao daoFuncionario();
    public abstract CargoDao daoCargo();

}
