/*Exercício 3:
-Faça uma função que recebe uma lista de inteiros e retorna uma outra lista contendo os mesmos números mas multiplicados por 2
*/

fun main(){
    var list = arrayListOf<Int>(2,3,6,7,5,6)

    println("=====ForEach=====")
    println(listForEach(list))
    println("=====Map=====")
    println(listMap(list))

}

fun listForEach (list: ArrayList<Int>) : ArrayList<Int> {
    var multipliedList = arrayListOf<Int>(0,0,0,0,0,0)
    var i = 0

    for(items in list){

        multipliedList[i] = items * 2
        i++
    }
    return multipliedList
}
fun listMap(list: ArrayList<Int>)  {
    println(list.map {it*2})
}
