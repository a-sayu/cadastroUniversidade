package semcamadas;

/**
 *
 * @author Abigail
 * 
 */

public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private final int MAX = 100;
    private int cont;
    
    public Universidade () {
        nome = "Undefined";
    }
    
    public Universidade (String nome) {
        this.nome = nome;
        inicializar();
    }
    
    private void inicializar(){
        departamentos = new Departamento[MAX];
        cont = 0;
    }
    
    public void addDepartamento(Departamento departamento) {
        if (cont < MAX) {
            departamentos[cont] = departamento;
            cont++;
        } else System.out.println("error: not enough space");
    }
    
    // SET && GET
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMAX() {
        return MAX;
    }
        
}
