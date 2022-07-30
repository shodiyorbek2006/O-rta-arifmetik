import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    if ((a == b) && (b == c)) {
        println(a)
    } else if (a == b) {
        println(a)
    } else if (b == c) {
        println(b)
    } else if (a == c) {
        println(c)
    }else{
        println((a+b+c)/3)
    }
}