package bank

const val RED = "\u001b[31m"
const val GREEN = "\u001B[32m"
const val RESET = "\u001B[0m"

fun withdrawalMessage(status: Boolean, withdrawalValue: Double, balance: Double) {
    if (status) {
        println("${GREEN}Saque efetuado com sucesso!!$RESET\nSeu saldo atual é: R$$balance\n")
        cashMachine(withdrawalValue.toInt())
    } else {
        println("${RED}Saldo Insuficiente, operação não efetuada!$RESET")
    }
}

fun depositMessage(status: Boolean) {
    if (status) {
        println("${GREEN}Deposito concluído com sucesso!!$RESET")
    } else {
        println("${RED}Operação não efetuada!$RESET")
    }
}

fun transferMessage(status: Boolean, balance: Double) {
    if (status) {
        println("${GREEN}Tranferência concluída com sucesso!!$RESET\nSeu saldo atual é: R$$balance")
    } else {
        println("${RED}Saldo Insuficiente, operação não efetuada!$RESET")
    }
}

fun newCustomerMessageName(): String {
    println(
        "Para realizar o cadastro é necessário de algumas informações como:\n" +
                "Nome: "
    )
    return readLine().toString()
}

fun newCustomerMessageCpf(): Long {
    println("CPF: ")
    return readLine()!!.toLong()
}

fun newCustomerMessageEmail(): String {
    println("E-mail: ")
    return readLine().toString()
}

fun newCustomerMessageCell(): Int {
    println("Celular: ")
    return readLine()!!.toInt()
}

fun openingBalanceMessage(): Double {
    println("Qual o seu saldo inicial de conta? ")
    return readLine()!!.toDouble()
}

fun transferRequestMessage(accountOrigin: BankAccount, bank : Bank) {
    println("Qual valor da transferência?\nSaldo disponível em conta: R$${accountOrigin.balance}")
    val transferValue = readLine()!!.toDouble()
    println(
        "Para quem você quer transferir?\n" +
                "${bank.showSomeAccounts(accountOrigin)}" +
                "\nObs: Selecione pelo Id"
    )
    val destiny = readLine()!!.toInt()
    bank.transferRequest(accountOrigin,destiny,transferValue)
}

fun depositRequestMessage(bank : Bank){
    println("Qual valor você gostaria de depositar? ")
    val depositValue = readLine()!!.toDouble()
    println(
        "Para quem você quer depositar?\n" +
                "${bank.showAllAccounts()}" +
                "\nObs: Selecione pelo Id"
    )
    val destiny = readLine()!!.toInt()
    bank.depositRequest(depositValue, destiny)
}

fun withdrawalRequestMessage(accountOrigin: BankAccount, bank : Bank){
    println("Qual valor você gostaria de sacar? ")
    val withdrawalValue = readLine()!!.toDouble()
    bank.withdrawalRequest(accountOrigin,withdrawalValue)
}






