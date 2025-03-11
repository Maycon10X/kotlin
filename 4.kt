fun main() {

    println("diga qual a forma geometrica que você deseja calcular: ")

    println("1 - Quadrado")
    println("2 - Trapézio")
    println("3 - Círculo")
    println("4 - Retângulo")
    println("5 - losango")
    println("6 - Paralelogramo")
    println("7 - triangulo")
    var escolha = readln()
    when (escolha) {
        "1" ->
            {   println("Qual o valor do lado do quadrado")
            var lado1 = readln().toDouble()
        }
        "2" -> {
            println("Qual o valor do lado do Trapézio")
        }
        "3" -> {
            println("Qual o valor do lado do Círculo")
        }
        "4" -> {
            println("Qual o valor do lado do retângulo")
        }
        "5" -> {
            println("Qual o valor do lado do Losango")
        }
        "6" -> {
            println("Qual o valor do lado do Paralelogramo")
        }
        "7" -> {
            println("Qual o valor do lado do Triangulo")
        }

    }

}