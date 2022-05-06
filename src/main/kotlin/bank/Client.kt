package bank

class Client(val name: String, val cpf: Long, val email: String, val cell: Int) {
    companion object {
        var initialCustomerId: Int = 1
    }

    private var customerId: Int = 0

    init {
        this.customerId = initialCustomerId++
  }

    override fun toString(): String {
        return "Client(customerId = $customerId, name ='$name', cpf = $cpf, email = '$email', cell = $cell)"
    }

}
