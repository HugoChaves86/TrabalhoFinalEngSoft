package engsoftware;

/**
 *
 * @author Hugo_Chaves
 */
public class AlunoPosGrad extends Usuario{

    //construtor
    public AlunoPosGrad (String nome, int codigo){
        super(nome, codigo);
        regraEmprestimo = new EmprestimoAlunoPos();
        regraReserva = new ReservaAlunoPos();
    }

    @Override
    public void display() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Aluno de pós-graduação.");
    }
}