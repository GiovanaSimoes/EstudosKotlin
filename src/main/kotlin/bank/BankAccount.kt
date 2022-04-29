package bank

class BankAccount (owner: Client, openingBalance: Double){
    companion object{
        var accountInitialId: Int = 1
    }
    private var accountId: Int = 0
    private var owner: Client
    private var balance: Double = 0.0

    init {
        this.accountId = accountInitialId++
        this.owner = owner
        this.balance = openingBalance
    }

    fun withdraw(withdrawalValue: Double){
        if(this.balance>=withdrawalValue){
            this.balance-= withdrawalValue
            println("Saque de R$$withdrawalValue efetuado com sucesso!!\nSeu saldo atual é: R$${this.balance}\n")
            cashMachine(withdrawalValue.toInt())
        }else{
            println("Saldo Insuficiente, operação não efetuada!")
        }

    }
    private fun cashMachine(amount: Int){
        val remainingOneHundred = getRemainingAmount(amount,Notes.ONEHUNDRED.weight)
        val remainingFifty = getRemainingAmount(remainingOneHundred.getValue("value"), Notes.FIFTY.weight)
        val remainingTen  = getRemainingAmount(remainingFifty.getValue("value"), Notes.TEN.weight)
        val remainingFive = getRemainingAmount(remainingTen.getValue("value"), Notes.FIVE.weight)
        val remainingOne = getRemainingAmount(remainingFive.getValue("value"), Notes.ONE.weight)

        println("Você irá receber: \n" +
                "${remainingOneHundred.getValue("notes")} notas de R$100\n" +
                "${remainingFifty.getValue("notes")} notas de R$50\n" +
                "${remainingTen.getValue("notes")} notas de R$10\n" +
                "${remainingFive.getValue("notes")} notas de R$5\n" +
                "${remainingOne.getValue("notes")} notas de R$1\n")
    }

    private fun getRemainingAmount(amount: Int, noteValue: Int) : Map<String, Int>{
        val qtdNotes = (amount/noteValue)
        val quantity = amount - (qtdNotes * noteValue)
        return mapOf("notes" to qtdNotes,"value" to quantity)
    }

    enum class Notes(var weight : Int){
        ONE (1),
        FIVE (5),
        TEN (10),
        FIFTY (50),
        ONEHUNDRED (100)
    }

    fun deposit(depositAmount: Double){
        this.balance += depositAmount
        println("Deposito de R$$depositAmount concluído com sucesso!!\nSeu saldo atual é: R$${this.balance}")
    }

    fun transfer(destiny: BankAccount, transferValue: Double){
        if(this.balance >= transferValue){
            destiny.balance += transferValue
            this.balance -= transferValue
            println("Tranferência de R$$transferValue concluída com sucesso!!\nSeu saldo atual é: R\$${this.balance}")
        }else{
            println("Saldo Insuficiente, operação não efetuada!")
        }
    }

    override fun toString(): String {
        return "BankAccount(accountId = $accountId, balance = R$$balance)"
    }
}
