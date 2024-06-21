package Armazenamento;

import Modelo.Universidade;

/**
 *
 * @author Abigail && Miguel
 *
 */

public class DataBase {
    private Universidade universidade;
    
    public DataBase() {
        universidade = new Universidade();
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
