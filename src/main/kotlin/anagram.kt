/*Exercício 7:
Um anagrama é um rearranjo de letras de uma palavra que formam uma nova palavra.
Dado uma palavra e uma lista de palavras candidatas a anagramas, retornar a sublista dos anagramas da palavra.
Não deve diferenciar letras maiúsculas e minúsculas.
 */
fun main() {

}


fun getAnagrams(word: String, candidates: List<String>): List<String> {

    /**
     *
        Input Alegria ["alergia", "regalia", "teste", "batata]
        Output: ["alergia", "regalia"]
     */

    /*
        para cada letra em Alegria
            -> verificar se a palavra a ser a palavra candidata posssui esta letra
                se sim -> remove esta letra da palavra*
                se não -> segue o baile
         -> palavra está vazia?
            -> se sim: é um anagrama
            -> se não: não é um anagrama

        Alegria
        alergia
        A -> alergia -> lergia
        l -> lergia -> ergia
        e -> ergia -> rgia
        g -> rgia -> rgia
        r -> ria -> ia
        i -> ia -> a
        a -> a -> ""

        A -> batata -> btata
        l -> btata -> btata
        e -> btata -> btata
        g -> btata -> btata
        r -> btata -> btata
        i -> btata -> btata
        a -> btata -> btta

    */
}