package bank

fun main(){

    val joaoClient = Client("João Vitor Reis",46587658990,"joao.reis@gmail.com",980348012)
    val accountJoao = BankAccount(joaoClient,1000.0)

    val lauraClient = Client("Laura Santos",67543289770,"laura.santos@gmail.com",969347653)
    val accountLaura = BankAccount(lauraClient,1000.0)

    val giovanaClient = Client("Giovana Simões",85647345889,"giovana.simoes@gmail.com",998764532)
    val accountGiovana = BankAccount(giovanaClient,1000.0)

    println("Bem Vindo ao GBank!!\n")
    println("Nossos clientes:\n$joaoClient\n$lauraClient\n$giovanaClient\n")
    println("Suas Contas:\n$accountJoao\n$accountLaura\n$accountGiovana\n")

    println("Transferência de Giovana para João: ")
    accountGiovana.transfer(accountJoao,50.0)
    println(accountGiovana)
    println(accountJoao)

    println("\nDeposito na conta de Laura: ")
    accountLaura.deposit(300.00)

    println("\nSaque da conta de João: ")
    accountJoao.withdraw(1100.0)

    println("\nSaque da conta de Giovana: ")
    accountGiovana.withdraw(230.0)
}
