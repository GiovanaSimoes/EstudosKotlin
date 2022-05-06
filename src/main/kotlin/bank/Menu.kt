package bank

fun main() {

}

class Menu(private val bank: Bank) {

    private var curentAccount: BankAccount? = null

    fun selectionConditionsInit() {
        var inputResult: Int
        var goToOption: Boolean

        do {
            println(
                "Bem vindo ao GBank!!\n" +
                        "Selecione o serviço desejado: \n" +
                        "1-> Cadastrar\n" +
                        "2-> Acessar a conta\n" +
                        "3-> Sair\n"
            )
            try {
                inputResult = getUseInput()
            } catch (e: NumberFormatException) {
                println("Valor inválido, por favor utilize apenas números")
                goToOption = false
                continue
            }
            goToOption = optionsInit(inputResult)
        } while (!goToOption)
    }

    private fun optionsInit(inputResult: Int): Boolean {

        when (inputResult) {
            1 -> register()
            2 -> accessTheAccount()
            3 -> close()
        }
        return true
    }

    private fun selectionConditionsMenu() {
        var inputResult: Int
        var goToOption: Boolean

        do {
            println(
                "Selecione o serviço desejado: \n" +
                        "1-> Sacar\n" +
                        "2-> Depositar\n" +
                        "3-> Transferências\n" +
                        "9-> Sair"
            )
            try {
                inputResult = getUseInput()
            } catch (e: NumberFormatException) {
                println("Valor inválido, por favor utilize apenas números")
                goToOption = false
                continue
            }
            goToOption = optionsMenu(inputResult)
        } while (!goToOption)
    }

    private fun optionsMenu(inputResult: Int): Boolean {
        when (inputResult) {
            1 -> toWithdraw()
            2 -> cashDeposit()
            3 -> cashTransfer()
            9 -> close()
        }
        return true
    }

    private fun getUseInput(): Int {
        val input = readLine() ?: ""
        return input.toInt()
    }

    private fun close() {

    }

    private fun register() {
        bank.addAccount(
            bank.registerAccount(
                (bank.newCustomer(
                    newCustomerMessageName(), newCustomerMessageCpf(),
                    newCustomerMessageEmail(), newCustomerMessageCell()
                )), openingBalanceMessage()
            )
        )
        selectionConditionsInit()
    }

    private fun accessTheAccount() {
        curentAccount = bank.login()
        selectionConditionsMenu()
    }

    private fun toWithdraw() {
        curentAccount?.let { withdrawalRequestMessage(it, bank) }
        selectionConditionsMenu()
    }

    private fun cashDeposit() {
        depositRequestMessage(bank)
        selectionConditionsMenu()
    }

    private fun cashTransfer() {
        curentAccount?.let {transferRequestMessage(it,bank) }
        selectionConditionsMenu()
    }
}
