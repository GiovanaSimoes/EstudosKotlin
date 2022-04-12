/*Exercício 5:
-Contar número de letras duplicadas:
-Dada uma string qualquer com apenas uma palavra conte o número de caracteres alfa númericos que se repetem na string mais de uma vez. Os caracteres devem então
ser printados seguidos da quantidade de vezes que apareceram.
-Não diferencie maiúsculas de minúsculas

Passos:
-Identificar o que é alfa númerico
-Contar quais caracteres se repetem
-Exibir a quantidade de vezes que ele se repete
-Tranformar countWords em uma lista
-Remover os itens que aparecem uma unica vez
*/

fun main(){
    val text = "a.b.c.d.a.b.c.c.d.D / 12333"
    
    val text1 = "aabbdddeeeef"
    println(countChar(text))
}

fun countChar(word: String): Map <Char, Int>{

    val alfaWord = word.lowercase().filter { it.isLetterOrDigit()}.groupingBy { it }.eachCount().filter{it.value>1}
    return alfaWord

}

