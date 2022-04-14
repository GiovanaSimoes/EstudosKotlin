/*Exercício 2:
-Faça uma função que recebe uma lista de inteiros e retorna uma lista com apenas os inteiros pares.
*/

fun main() {
    val list = arrayListOf(5,3,7,6,1,2,4,9,8)

    println("ForEach\n${pairsForEach(list)}")
    println("\nFilter\n${pairsFilter(list)}")
}

fun pairsForEach (list : ArrayList<Int>){
    list.forEach{
        if (it % 2 == 0) {
            println(it)
        }
    }
}

fun pairsFilter(list : ArrayList<Int>){
    println(list.filter {it % 2 ==0 })
}
