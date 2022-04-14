/*Exercício 3:
-Faça uma função que recebe uma lista de inteiros e retorna uma outra lista contendo os mesmos números mas multiplicados por 2
*/

fun main(){
    val list = arrayListOf(2,3,6,7,5,6)

    println("ForEach\n${listForEach(list)}")
    println("\nMap\n${listMap(list)}")
}

fun listForEach (list: ArrayList<Int>) : ArrayList<Int> {
    val multipliedList = arrayListOf(0,0,0,0,0,0)
    var i = 0

    list.forEach {
        multipliedList[i] = it * 2
        i++
    }
    return multipliedList
}

fun listMap(list: ArrayList<Int>)  {
    println(list.map {it*2})
}
