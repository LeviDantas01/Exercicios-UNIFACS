programa {
  funcao inicio() {
    //1) Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.
    
    real vlReal, vlCotacao, vlDolar

    escreva("Inoforme a cotação do dolar: ")
    leia(vlCotacao)
    
    escreva("Informe o valor em dolar: ")
    leia(vlDolar)

    vlReal = vlCotacao * vlDolar

    escreva("Voce tem ", vlReal)

  }
}
