programa
{
	
	funcao inicio()
	{
		// Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.

		real salarioAtual, reajuste, novoSalario

		escreva("Informe seu salário: ")
		leia(salarioAtual)
		
		escreva("Informe o percentual de reajuste: ")
		leia(reajuste)

		novoSalario = salarioAtual + (reajuste * salarioAtual) / 100
	 	
		escreva(novoSalario)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */