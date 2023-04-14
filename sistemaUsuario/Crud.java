package sistemaUsuario;

import javax.swing.JOptionPane;

public class Crud {

	public static void main(String[] args) {

		String nome = null;
		int idade = 0, menu;

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escolha a opção dejesada:\n 1- Cadastrar\n 2- Perfil\n 3- Editar perfil\n 4- Deletar perfil\n 5- Sair"));
			switch (menu) {
			case 1:
				
				if(nome == null && idade == 0) {
					nome = JOptionPane.showInputDialog("Insira seu nome completo: ");
					idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a sua idade: "));
					JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Já foram cadastrado dados!");
				}
				
				break;
				
			case 2:
				if (nome == null && idade == 0) {
					JOptionPane.showMessageDialog(null, "Sem dados cadastrados !");
				} else {
					JOptionPane.showMessageDialog(null, "Perfil do Estudante: \n\nNome: " + nome + "\nIdade: " + idade);
				}
				break;

			case 3:
				
				if (nome == null && idade == 0) {
					JOptionPane.showInternalMessageDialog(null, "Sem dados para editar.");
				} else if (nome != null) {
					JOptionPane.showMessageDialog(null, "Perfil do Estudante: \n\nNome: " + nome + "\nIdade: " + idade);
					nome = JOptionPane.showInputDialog("Insira o novo nome: ");
					idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a nova idade: "));
				} else {
					nome = JOptionPane.showInputDialog("Insira o novo nome: ");
					idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a nova idade: "));
				}
				break;

			case 4:
				if (nome == null && idade == 0) {
					JOptionPane.showInternalMessageDialog(null, "Sem dados para excluir.");
				} else {
					nome = null;
					idade = 0;
					JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso !");

				}
				break;

			case 5:
				JOptionPane.showMessageDialog(null, "Até logo!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida.");
			}

		} while (menu != 5);

	}

}
