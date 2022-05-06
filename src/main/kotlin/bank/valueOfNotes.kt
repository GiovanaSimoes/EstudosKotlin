package bank

fun cashMachine(amount: Int) {
    val remainingOneHundred = getRemainingAmount(amount, Notes.ONEHUNDRED.weight)
    val remainingFifty = getRemainingAmount(remainingOneHundred.getValue("value"), Notes.FIFTY.weight)
    val remainingTen = getRemainingAmount(remainingFifty.getValue("value"), Notes.TEN.weight)
    val remainingFive = getRemainingAmount(remainingTen.getValue("value"), Notes.FIVE.weight)
    val remainingOne = getRemainingAmount(remainingFive.getValue("value"), Notes.ONE.weight)

    println(
        "Você irá receber: \n" +
                "${remainingOneHundred.getValue("notes")} notas de R$100\n" +
                "${remainingFifty.getValue("notes")} notas de R$50\n" +
                "${remainingTen.getValue("notes")} notas de R$10\n" +
                "${remainingFive.getValue("notes")} notas de R$5\n" +
                "${remainingOne.getValue("notes")} notas de R$1\n"
    )
}

private fun getRemainingAmount(amount: Int, noteValue: Int): Map<String, Int> {
    val qtdNotes = (amount / noteValue)
    val quantity = amount - (qtdNotes * noteValue)
    return mapOf("notes" to qtdNotes, "value" to quantity)
}

enum class Notes(var weight: Int) {
    ONE(1),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    ONEHUNDRED(100)
}
