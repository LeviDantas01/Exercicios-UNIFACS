programa {
  funcao inicio() {
    
    //)Calcular o pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua
    //comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados: pre�o unit�rio da pe�a e
    //quantidade vendida.

    real precoUnitario, quantidadeVendida, total, comissao

    leia(precoUnitario)
    leia(quantidadeVendida)

    total = quantidadeVendida * precoUnitario

    escreva(total, "\n")

    comissao = total * 0.05


    escreva(comissao)


  }
}
