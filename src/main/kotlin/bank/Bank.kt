package bank

import javax.print.attribute.standard.JobName

class Bank {
    private var accounts = mutableListOf<BankAccount>()

    fun registerAccount(customer: Client, openingBalance: Double): BankAccount {
        val account = BankAccount(customer, openingBalance)
        this.addAccount(account)
        return account
    }

    fun newCustomer(name: String, cpf: Long, email: String, cell: Int): Client {
        return Client(name, cpf, email, cell)
    }


    fun transferRequest(accountOrigin : BankAccount, destiny : Int, transferValue : Double) {
        val destinyAccount = accounts.filter { it.accountId == (destiny) }.first()
        val resultTransfer = accountOrigin.transfer(destinyAccount, transferValue)
        transferMessage(resultTransfer, accountOrigin.balance)
    }

    fun depositRequest(depositValue : Double, destiny : Int) {
        val destinyAccount = accounts.filter { it.accountId == destiny }.first()
        val resultDeposit = destinyAccount.deposit(depositValue)
        depositMessage(resultDeposit)
    }

    fun withdrawalRequest(accountOrigin: BankAccount, withdrawalValue : Double) {
        val resultWithdrawal = accountOrigin.withdraw(withdrawalValue)
        withdrawalMessage(resultWithdrawal, withdrawalValue, accountOrigin.balance)
    }

    fun login(): BankAccount {
        do {
            println("Digite seu e-mail: ")
            val email = readLine()!!
            val filteredAccount = accounts.filter { it.owner.email == email }
            if (filteredAccount.isNotEmpty()) {
                return filteredAccount.first()
            }
            println("E-mail inválido!")
        } while (true)
    }

    fun addAccount(account: BankAccount) {
        accounts.add(account)
    }

    fun showSomeAccounts(accountOrigin: BankAccount) {
        for (account in accounts) {
            if (account != accountOrigin) {
                println(account)
            }
        }
    }

    fun showAllAccounts() {
        for (account in accounts) {
            println(account)
        }
    }
}
