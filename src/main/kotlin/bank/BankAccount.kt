package bank

class BankAccount(owner: Client, openingBalance: Double) {
    companion object {
        var accountInitialId: Int = 1
    }

    var accountId: Int = 0
        private set
    var owner: Client
        private set
    var balance: Double = 0.0
        private set

    init {
        this.accountId = accountInitialId++
        this.owner = owner
        this.balance = openingBalance
    }

    fun withdraw(withdrawalValue: Double): Boolean {
        if (this.balance >= withdrawalValue) {
            this.balance -= withdrawalValue
        } else {
            return false
        }
        return true
    }

    fun deposit(depositAmount: Double): Boolean {
        this.balance += depositAmount
        return true
    }

    fun transfer(destiny: BankAccount, transferValue: Double): Boolean {
        if (this.balance >= transferValue) {
            destiny.deposit(transferValue)
            this.withdraw(transferValue)
        } else {
            return false
        }
        return true
    }

    override fun toString(): String {
        return "BankAccount(accountId = $accountId, name = ${owner.name} balance = R$$balance)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BankAccount

        if (accountId != other.accountId) return false

        return true
    }
}
