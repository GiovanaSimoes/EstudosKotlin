/*Exercício 6:
-Faça um programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor
serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
-O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
-Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
-Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

Passos:
-Perguntar ao usuário o valor
-Se o valor de saque for <10, aparecer mensagem, o mínimo do saque é 10 reais
-Se o valor de saque for >600, aparecer mensagem o máximo do saque é 600 reais
-Caso o input seja inválido 'ABC'devolver a mensagem: "Valor inválido, por favor utilize apenas números".
-Separar valor digitado em 100,50,5,10,1
-Informar quantidade de notas
 */
import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)

    println("Qual valor você gostaria de sacar?")
    var value = reader.nextInt()
    withdrawalConditions(value)


}
//Caixa Eletrônico
fun cashMachine(value : Int){
    var value1 = value
    var oneHundred = (value1/100)
    value1 = value1-(oneHundred*100)

    var fifty = (value1/50)
    value1 = value1-(fifty*50)

    var ten = (value1/10)
    value1 = value1-(ten*10)

    var five = (value1/5)
    value1 = value1-(five*5)

    var one = value1

    println("Você irá precisar de: \n" +
            "$oneHundred notas de R$100\n" +
            "$fifty notas de R$50\n" +
            "$ten notas de R$10\n" +
            "$five notas de R$5\n" +
            "$one notas de R$1\n")
}
//Condições de saque
fun withdrawalConditions(value:Int){
    val reader = Scanner(System.`in`)

    if(value<10){
        println("O valor mínimo para saque é 10 reais, digite outro valor:")
        var value = reader.nextInt()
        if(value>600){
            println("O valor máximo para saque é 600 reais, digite outro valor:")
            var value = reader.nextInt()
    }
    }else if(value.equals(String)){
        println("Valor inválido, por favor utilize apenas números")
        var value = reader.nextInt()
    }else{
        cashMachine(value)
    }
}
