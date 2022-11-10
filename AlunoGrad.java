package trabalhofinalengsoft;

/**
 *
 * @author Hugo_Chaves
 */
public class AlunoGrad extends Usuario{
    
    //Atributos
    int codigo;
    String nome;

    //construtor
    public AlunoGrad (String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
        regraEmprestimo = new EmprestimoAlunoGrad();
        regraReserva = new ReservaAlunoGrad();
    }
    
    @Override
    public void display() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Eu sou um aluno de graduação.");
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }    
}
