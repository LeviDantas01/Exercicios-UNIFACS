programa
{
	
	funcao inicio()
	{
		// Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa
		// apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

		inteiro anos, meses, dias, totalIdade, totalDiaAno = 365, totalDiaMes = 30

		escreva("Informe sua idade em anos, messas e dia: ")
		leia(anos, meses, dias)
		

		totalIdade = anos * totalDiaAno + meses + dias

		escreva(totalIdade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */