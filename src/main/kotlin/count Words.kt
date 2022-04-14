/*Exercício 4:
-Contar palavras:
-Dada uma string com uma frase qualquer você deve contar a ocorrência de cada uma das palavras (não diferencie maiúsculas de minúsculas) e printar a quantidade que cada palavra aparece.
-As palavras serão separadas por espaços, tabs ou novas linhas;
-Caracteres especiais como aspas e pontuação devem ser desconsiderados.
*/
fun main(){
    val text = "Essa é a senha: 'Senha 123'!, falou o agente especial.\n A senha era muito fraca."

    countWords(text)
}

fun countByWord(list: List<String>) {
    val frequencyMap: MutableMap<String, Int> = HashMap()

    list.forEach{
        var count = frequencyMap[it]
        if (count == null)
            count = 0
            frequencyMap[it] = count + 1
    }
    println(frequencyMap)
}

fun countWords(text: String) = text
        .lowercase()
        .filter { it.isLetterOrDigit() || it == ' ' }
        .split(" ", "    ", "\n")
        .let { countByWord(it) }
