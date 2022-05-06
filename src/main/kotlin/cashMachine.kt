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
fun main() {
    val value = withdrawalConditions()
    cashMachine(value)
}

fun cashMachine(amount: Int) {
    val remainingOneHundred = getRemainingAmount(amount, Notes.ONEHUNDRED.weight)
    val remainingFifty = getRemainingAmount(remainingOneHundred.getValue("value"), Notes.FIFTY.weight)
    val remainingTen = getRemainingAmount(remainingFifty.getValue("value"), Notes.TEN.weight)
    val remainingFive = getRemainingAmount(remainingTen.getValue("value"), Notes.FIVE.weight)
    val remainingOne = getRemainingAmount(remainingFive.getValue("value"), Notes.ONE.weight)

    println(
        "Você irá precisar de: \n" +
                "${remainingOneHundred.getValue("notes")} notas de R$100\n" +
                "${remainingFifty.getValue("notes")} notas de R$50\n" +
                "${remainingTen.getValue("notes")} notas de R$10\n" +
                "${remainingFive.getValue("notes")} notas de R$5\n" +
                "${remainingOne.getValue("notes")} notas de R$1\n"
    )
}

fun withdrawalConditions(): Int {
    var canWithdraw: Boolean
    var value = 0

    do {
        println("Qual valor você gostaria de sacar?")

        try {
            value = getUseInput()
        } catch (e: NumberFormatException) {
            println("Valor inválido, por favor utilize apenas números")
            canWithdraw = false
            continue
        }
        canWithdraw = checkTheValues(value)

    } while (!canWithdraw)
    return value
}

fun checkTheValues(value: Int): Boolean {
    when (value) {
        in 0..10 -> {
            println("O valor mínimo para saque é 10 reais, digite outro valor:")
            return false
        }

        in 600..Int.MAX_VALUE -> {
            println("O valor máximo para saque é 600 reais, digite outro valor:")
            return false
        }
    }
    return true
}

fun getRemainingAmount(amount: Int, noteValue: Int): Map<String, Int> {
    val qtdNotes = (amount / noteValue)
    val quantity = amount - (qtdNotes * noteValue)
    return mapOf("notes" to qtdNotes, "value" to quantity)
}

fun getUseInput(): Int {
    val input = readLine() ?: ""
    return input.toInt()
}

enum class Notes(var weight: Int) {
    ONE(1),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    ONEHUNDRED(100)
}
