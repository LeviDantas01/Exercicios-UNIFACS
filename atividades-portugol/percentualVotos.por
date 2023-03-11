programa
{
	
	funcao inicio()
	{
		//8)Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
		//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

		inteiro totalEleitores, votosBrancos, votosNulos, votosValidos
		real percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos
		
		escreva("Informe o total de votos brancos: ")
		leia(votosBrancos)

		escreva("Informe o total de votos nulos: ")
		leia(votosNulos)

		escreva("Informe o total de votos válidos: ")
		leia(votosValidos)

		totalEleitores = votosBrancos + votosNulos + votosValidos

		percentualVotosBrancos = 100 * votosBrancos / totalEleitores
		percentualVotosNulos = 100 * votosNulos / totalEleitores
		percentualVotosValidos = 100 * votosValidos / totalEleitores

		escreva(percentualVotosBrancos,"\n", percentualVotosNulos, "\n", percentualVotosValidos)
		

		

		

		
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 918; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */