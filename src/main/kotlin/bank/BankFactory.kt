package bank

class BankFactory {
    fun build(): Bank {
        val bank = Bank()

        val joaoClient = Client("João Vitor Reis", 46587658990, "joao.reis@gmail.com", 980348012)
        val accountJoao = BankAccount(joaoClient, 1000.0)
        bank.addAccount(accountJoao)

        val lauraClient = Client("Laura Santos", 67543289770, "laura.santos@gmail.com", 969347653)
        val accountLaura = BankAccount(lauraClient, 1000.0)
        bank.addAccount(accountLaura)

        val giovanaClient = Client("Giovana Simões", 85647345889, "giovana.simoes@gmail.com", 998764532)
        val accountGiovana = BankAccount(giovanaClient, 1000.0)
        bank.addAccount(accountGiovana)

        val marcosClient = Client("Marcos Silva", 87906954778, "marcos.silva@gmail.com", 908765764)
        val accountMarcos = BankAccount(marcosClient, 1000.0)
        bank.addAccount(accountMarcos)

        val vandersonClient = Client("Vanderson Souza", 87906954778, "vanderson.souza@gmail.com", 912348907)
        val accountVanderson = BankAccount(vandersonClient, 1000.0)
        bank.addAccount(accountVanderson)

        val sachaClient = Client("sacha Oliveira", 87906954778, "sacha.oliveira@gmail.com", 978239023)
        val accountSacha = BankAccount(sachaClient, 1000.0)
        bank.addAccount(accountSacha)

        val mirellyClient = Client("Mirelly Novaes", 87906954778, "mirelly.novaes@gmail.com", 976456374)
        val accountMirelly = BankAccount(mirellyClient, 1000.0)
        bank.addAccount(accountMirelly)

        return bank
    }
}
