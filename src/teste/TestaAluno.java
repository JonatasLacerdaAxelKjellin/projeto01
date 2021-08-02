package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        
        
        System.out.printIn("Nome: " + aluno.getNome());
        
//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno: ");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
//        aluno.telefone = JOptionPane.showInputDialog("Digite o telefone do aluno ou do responsavel: ");
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: "));
//        aluno.logradouro = JOptionPane.showInputDialog("Digite o logradouro: ");
//        aluno.numero = JOptionPane.showInputDialog("Digite o numero do aluno: ");
//        aluno.bairro = JOptionPane.showInputDialog("Digite o bairro do aluno: ");
//
//        aluno.cpf = Long.parseLong( JOptionPane.showInputDialog("Digite o cpf do aluno: "));
//
////        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome + " " + aluno.sobrenome
//                + "\nIdade: " + aluno.idade
//                + "\ntelefone: " + aluno.telefone
//                + "\nsalario: " + aluno.salario
//                + "\nlogradouro: " + aluno.logradouro
//                + "\nnumero: " + aluno.numero
//                + "\nbairro: " + aluno.bairro);

    }
}
