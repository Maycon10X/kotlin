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
            println("O valor da area do quadrado é: " + lado1*lado1 )
        }
        "2" -> {
            println("Qual o valor da altura do Trapézio")
            var h = readln().toDouble()
            println("Qual o valor da base maior do Trapézio")
            var basemaior = readln().toDouble()
            println("Qual o valor da base menor do Trapézio")
            var basemenor = readln().toDouble()
            println("O valor da area do trapézio é: " + (( basemaior + basemenor ) * h) / 2)
        }
        "3" -> {
            val pi = 3.14
            println("Qual o valor do raio do Círculo")
            var r = readln().toDouble()
            println("O valor da area do  circulo é: " + (r * r) * pi )
        }
        "4" -> {
            println("Qual o valor da base do Retângulo")
            var base = readln().toDouble()
            println("Qual o valor da altura do Retângulo")
            var h = readln().toDouble()
            println("O valor da area do quadrado é: " + h*base )
        }
        "5" -> {
            println("Qual o valor da diagonal maior do losango")
            var digmaior = readln().toDouble()
            println("Qual o valor da base menor do losango")
            var digmenor = readln().toDouble()
            println("O valor da area do Losango é: " + ( digmaior + digmenor ) / 2)
        }
        "6" -> {
            println("Qual o valor da base do Paralelograma")
            var base = readln().toDouble()
            println("Qual o valor da altura do Paralelogramo")
            var h = readln().toDouble()
            println("O valor da area do Paralelogramo é: " + h*base )
        }
        "7" -> {
            println("Qual o valor da base do Triângulo")
            var base = readln().toDouble()
            println("Qual o valor da altura do Triangulo")
            var h = readln().toDouble()
            println("O valor da area do Triangulo é: " + h*base )
        }

    }

}
