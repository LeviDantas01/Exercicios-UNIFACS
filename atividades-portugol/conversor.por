programa {
  funcao inicio() {
    //1) Ler a cota��o do d�lar e a quantidade de d�lares. Converter para real e mostrar o resultado.
    
    real vlReal, vlCotacao, vlDolar

    escreva("Inoforme a cota��o do dolar: ")
    leia(vlCotacao)
    
    escreva("Informe o valor em dolar: ")
    leia(vlDolar)

    vlReal = vlCotacao * vlDolar

    escreva("Voce tem ", vlReal)

  }
}
