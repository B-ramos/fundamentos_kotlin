class Pessoa(var nome: String, var idade: Int ){

    override fun toString(): String {
        return "Nome: ${nome}, Idade: ${idade}"
    }

}

fun main (){

    var pessoas = mutableListOf<Pessoa>()

    pessoas.add(Pessoa("Bruno", 36))
    pessoas.add(Pessoa("Joao", 50))

//    var idades = pessoas.map { it.idade }
//    println(idades)
//
//
//    var soma1 = pessoas.sumBy { it.idade }
//    println(soma1)
//
//    var soma2 = pessoas.map { it.idade }.sum()
//    println(soma2)
//
//    var nomes = pessoas.map { it.nome }
//    println(nomes)

//    var pessoa = pessoas.any{it.idade == 36}
//    println(pessoa)// true
//
    var pessoa1 = pessoas.filter{ it.idade == 36}
    println(pessoa1)// [Nome: Bruno, Idade: 36]

    var pessoa2 = pessoas.singleOrNull{ it.idade == 36}
    println(pessoa2)// Nome: Bruno, Idade: 36

    var pessoa3 = pessoas.singleOrNull{ it.idade == 38}
    println(pessoa3)// null

}