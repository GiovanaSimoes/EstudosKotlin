/*Exercício 4:
-Contar palavras:
-Dada uma string com uma frase qualquer você deve contar a ocorrência de cada uma das palavras (não diferencie maiúsculas de minúsculas) e printar a quantidade que cada palavra aparece.
-As palavras serão separadas por espaços, tabs ou novas linhas;
-Caracteres especiais como aspas e pontuação devem ser desconsiderados.
*/


fun main(){
    val text = "Essa é a senha: 'Senha 123'!, falou o agente especial.\n A senha era muito fraca."
   countWords2(text)
}
fun countWords(text: String) : String{
    var text = text.lowercase().replace(".","").replace("'","")
        .replace("'","").replace(":","").replace("!","").replace("\n","")
        .replace(",","").split(" ","    ","\n")

    println(text)
    countByWord(text)
    return ""
}
fun countByWord(list: List<String>) {
    val frequencyMap: MutableMap<String, Int> = HashMap()

    for (word in list)
    {
        var count = frequencyMap[word]
        if (count == null) count = 0
        frequencyMap[word] = count + 1
    }
    println(frequencyMap)
}
fun countWords2(text: String) = text
        .toLowerCase()
        .filter { it.isLetterOrDigit() || it.equals(' ') }
        .split(" ", "    ", "\n")
        .let { countByWord(it) }



