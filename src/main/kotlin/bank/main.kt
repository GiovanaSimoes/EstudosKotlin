package bank

fun main() {
    val bank = BankFactory().build()
    val menu = Menu(bank)

    menu.selectionConditionsInit()

}
