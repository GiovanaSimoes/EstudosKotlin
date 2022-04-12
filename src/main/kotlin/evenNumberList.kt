/*Exercício 2:
-Faça uma função que recebe uma lista de inteiros e retorna uma lista com apenas os inteiros pares.
*/

fun main(args: Array<String>) {
    println("=====ForEach=====")
    println(pairsForEach())

    println("\n=====Filter=====")
    println(pairsFilter())


}

fun pairsForEach (){
    val list = arrayListOf(5,3,7,6,1,2,4,9,8)
    var pairs = 0

    for(items in list) {
        if (items % 2 == 0) {
            var pairs = items
            println(pairs)
        }
    }
}

fun pairsFilter(){
    val list = arrayListOf(5,3,7,6,1,2,4,9,8)
    var pairs = list.filter {it % 2 ==0 }

    print(pairs)
}