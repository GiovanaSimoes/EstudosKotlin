/*Exercício 1:
-Criar função que recebe uma lista de inteiros e retorna a soma dos conteúdos da lista
 */

fun main(args: Array<String>) {
    println("=====ForEach=====")
    println(sumForEach())

    println("\n=====Filter=====")
    println(sumReduce())

}

fun sumForEach (){
    var list = arrayListOf(4,6,8,10,14)
    var sum = 0

    for(items in list){
        println(items)
        sum = items + sum
    }
    println("A soma dessa lista é: $sum")
}

fun sumReduce(){
    var list = arrayListOf(4,6,8,10,14)
    var result = list.reduce { sum, number -> sum + number }

    println("A soma dessa lista é: $result")
}