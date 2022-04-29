package bank

class Client (name: String, cpf: Long, email: String, cell: Int){
    companion object { var initialCustomerId: Int = 1 }
    private var customerId: Int = 0
    private var name: String = ""
    private var cpf: Long = 0
    private var email: String = ""
    private var cell: Int = 0

    init {
        this.customerId = initialCustomerId++
        this.name = name
        this.cpf = cpf
        this.email = email
        this.cell =cell
    }

    override fun toString(): String {
        return "Client(customerId = $customerId, name ='$name', cpf = $cpf, email = '$email', cell = $cell)"
    }

}
