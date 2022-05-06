/*Exercício 7:
Um anagrama é um rearranjo de letras de uma palavra que formam uma nova palavra.
Dado uma palavra e uma lista de palavras candidatas a anagramas, retornar a sublista dos anagramas da palavra.
Não deve diferenciar letras maiúsculas e minúsculas.
 */
fun main() {
    println("Qual palavra gostaria de verificar se possui anagramas?")
    val word = readLine()

    println("Digite a lista das possíveis palavras que sejam anagramas de $word")
    val candidates = readLine()?.split(",")

    val anagrams = getAnagrams(word!!,candidates!!)
    println(anagrams)
}

fun getAnagrams(word: String, candidates: List<String>): List<String> {
    val anagrams = mutableListOf<String>()
    candidates.forEach {
        if(isAnagrams(word,it)){
            anagrams.add(it)
        }
    }
    return anagrams
}

fun isAnagrams(word: String,candidate: String): Boolean {
    var tempWordTested = candidate

    if (candidate.count() == word.count()) {
        word.forEach {
            if (tempWordTested.contains(it, true)) {
                tempWordTested = tempWordTested.replaceFirst(it.toString(), "", true)
            }
        }
        return tempWordTested == ""
    }
    return false
}
