programa
{
	
	funcao inicio()
	{
		/*
		 * 	Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
			mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
			efetuadas. Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o
			valor que ele recebe por carro vendido. Calcular e exibir o salário final do vendedor.

		 */


		 real numCarroVendido, totalVendas, salarioFianl, comissaoCarroVendido, comissaoValorVendas
		 real comissao = 2, salarioFixo = 2000, bonusPorTotalVendas = 5

		 escreva("Quantos carros você vendeu: ")
		 leia(numCarroVendido)

		 escreva("Valor total de suas vendas: ")
		 leia(totalVendas)

		 comissaoCarroVendido = comissao * numCarroVendido / 100
		 comissaoValorVendas = bonusPorTotalVendas * totalVendas / 100

		 salarioFianl = salarioFixo + comissaoCarroVendido + comissaoValorVendas

		 escreva(salarioFianl)
		 

		 

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */