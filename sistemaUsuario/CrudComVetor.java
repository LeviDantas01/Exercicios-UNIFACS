package sistemaUsuario;
import javax.swing.JOptionPane;

public class CrudComVetor {

	public static void main(String[] args) {

		String nomes[] = new String[50];
		int tempoDeServico[] = new int[50];
		double salarios[] = new double[50];
		int menu;
		double max = salarios[0];
		double salarioMinimo = 1320;
		String listaFuncionarios = "";

		String nome = null;
		int tempoServico = 0, quantidade = 0;
		double salario;

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escolha uma opção:\n 1- Cadastrar\n 2- Listar maior salario\n 3- Listar salario menor qeu o minimo\n 4- Verificar aumento\n 5- Listar todos os funcionarios\n 6- Sair"));
			switch (menu) {
			case 1:
				quantidade = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Quantos funcionaros deseja cadastrar ?"));
				if (quantidade <= 50) {
					for (int i = 0; i < quantidade; i++) {

						nome = JOptionPane.showInputDialog("Informe o nome do funcionario: ");
						nomes[i] = nome;

						tempoServico = Integer.parseInt(
								JOptionPane.showInputDialog("Informe o tempo de servico do funcinario(em anos) "));
						tempoDeServico[i] = tempoServico;

						salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcinario: "));
						salarios[i] = salario;
					}

				} else {
					JOptionPane.showMessageDialog(null, "O tamanha maximo permitido é 50");
				}
				break;
			case 2:
				if (nomes[0] != null) {
					for (int i = 0; i < salarios.length; i++) {
						if (salarios[i] != 0 && salarios[i] > max) {
							max = salarios[i];
							nome = nomes[i];
							tempoServico = tempoDeServico[i];
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não existe funcionario cadastrado");
				}
				if (nomes[0] != null) {
					JOptionPane.showMessageDialog(null, "Funcionario com maior salario:\n Nome: " + nome
							+ " \nTempo de Serviço " + tempoServico + " anos\n " + "salario: R$" + max + "\n");
				}
				break;
			case 3:
				listaFuncionarios = "Funcionarios com Salario abaixo do Minimo:\n ";
				if (nomes[0] != null) {
					for (int i = 0; i < salarios.length; i++) {
						if (salarios[i] != 0 && salarios[i] < salarioMinimo) {
							listaFuncionarios += "\nNome: " + nomes[i] + "\nTempo de serviço: " + tempoDeServico[i]
									+ " anos\nSalário: R$" + salarios[i] + "\n";
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não existe funcionario cadastrado");
				}
				if (nomes[0] != null) {
					JOptionPane.showMessageDialog(null, listaFuncionarios);
				}
				break;

			case 4:
				listaFuncionarios = "Novos salarios:\n ";
				if (nomes[0] != null) {
					for (int i = 0; i < tempoDeServico.length; i++) {
						if (tempoDeServico[i] > 3) {
							salarios[i] *= 1.03;
						}

					}
					for (int o = 0; o < tempoDeServico.length; o++) {
						if (tempoDeServico[o] != 0) {
							listaFuncionarios += "\nNome: " + nomes[o];
							listaFuncionarios += "\nTempo de serviço: " + tempoDeServico[o];
							listaFuncionarios += " anos\nSalário: R$" + salarios[o] + "\n";
						}

					}
				} else {
					JOptionPane.showMessageDialog(null, "Não existe funcionario cadastrado");
				}
				if (nomes[0] != null) {
					JOptionPane.showMessageDialog(null, listaFuncionarios);
				}
				break;

			case 5:
				listaFuncionarios = "Funcionarios:\n ";
				if (nomes[0] != null) {
					for (int i = 0; i < quantidade; i++) {
						if (nomes[i] != null) {
							listaFuncionarios += "\nNome: " + nomes[i];
							listaFuncionarios += "\nTempo de serviço: " + tempoDeServico[i];
							listaFuncionarios += " anos\nSalário: R$" + salarios[i] + "\n";
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não existe funcionario cadastrado");
				}
				if (nomes[0] != null) {
					JOptionPane.showMessageDialog(null, listaFuncionarios);
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida! ");
			}
		} while (menu != 6);
	}
}