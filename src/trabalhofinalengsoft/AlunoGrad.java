package trabalhofinalengsoft;

import java.util.ArrayList;

/**
 *
 * @author Hugo_Chaves
 */
public class AlunoGrad extends Usuario{    
    
    //construtor
    public AlunoGrad (String nome, int codigo){
        super(nome, codigo);
        regraEmprestimo = new EmprestimoAluno();
        regraReserva = new ReservaGeral();
        emprestimos = new ArrayList<>();
        reservas = new ArrayList<>();
        
    }
    
    @Override
    public void display() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Está devendo? " + VerificacoesEAcoes.estaDevendo(this));
        System.out.println("Aluno de graduação.");
    }   
    
    @Override
    public void listarEmprestimos(){
        
        if(this.emprestimos.isEmpty()){
            System.out.println("\n" + this.getNome() + " não possui empréstimos em aberto.");
        }
        
        int cont = 1;
        for (Emprestimo emprestimo: emprestimos){
            System.out.println("\nEmpréstimo 0" + cont + ": ====\n");
            System.out.println("Titulo: " + emprestimo.getTitulo());
            System.out.println("Código do exemplar: " + emprestimo.getCodigoExemplar());
            System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Empréstimo em curso? " + emprestimo.emprestimoEmCurso());
            if (emprestimo.emprestimoEmCurso().equalsIgnoreCase("Sim")){
                System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucao());
            }else{
                System.out.println("Devolvido em: " + emprestimo.getDataDevolvido());                
            }
            cont++;
        }
    }

    @Override
    public void listarReservas() {
        
        if(this.reservas.isEmpty()){
            System.out.println("\n" + this.getNome() + " não possui reservas.");
        }
        
        int cont = 1;
        for (Reserva reserva: reservas){
            System.out.println("\nReserva 0" + cont + ": " + reserva.getTitulo());
            System.out.println("Código do exemplar: " + reserva.getCodigoExemplar());
            System.out.println("Data da solicitação: " + reserva.getDataEmprestimo());
            cont++;
        }
    }

    @Override
    public void atualiza() {} // Foi obrigatório utilizar esse método vazio
}
