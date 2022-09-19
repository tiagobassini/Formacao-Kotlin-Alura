fun main() {
    println("Bem vindo ao Bytebank")

}

class Conta {
    var titular: String = ""
    var numeroConta: Int = 0
    var saldo: Double = 0.0
}




fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}

fun testaRepeticoes() {

    //cria 5 contas
    for (i in 1..5) {
        //...
    }

    //cria 5 contas na ordem decrescente
    for (i in 5 downTo 1) {
        //...
    }

    //cria 3 contas de 2 em 2
    for (i in 1..5 step 2) {
        //...
    }
    //cria apenas 4 contas do 1 até 4
    for (i in 1 until 5) {
        //...
    }
}