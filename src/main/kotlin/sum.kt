/*Exercício 1:
-Criar função que recebe uma lista de inteiros e retorna a soma dos conteúdos da lista
 */

fun main() {
    val list = arrayListOf(4,6,8,10,14)

    println("ForEach\n ${sumForEach(list)}")
    println("\nFilter ${sumReduce(list)}")
}

fun sumForEach (list : ArrayList<Int>){
    var sum = 0

    list.forEach {
        println(it)
        sum += it
    }
    println("A soma dessa lista é: $sum")
}

fun sumReduce(list : ArrayList<Int>){
    println("A soma dessa lista é: ${list.reduce { sum, number -> sum + number }}")
}
