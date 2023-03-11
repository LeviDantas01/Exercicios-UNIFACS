programa {
  funcao inicio() {
    
    //)Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua
    //comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e
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
