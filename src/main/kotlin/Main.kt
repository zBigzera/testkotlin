fun main() {

    elseiflinha()
    helloWorld("Otávio")
    ifelif()
}
fun ifelif() {
    var time = 13
    if (time < 12) {
        println("Bom Dia.")
    } else if (time < 18) {
        println("Boa Tarde.")
    } else {
        println("Boa Noite.")
    }
}
fun helloWorld(name: String) {
    val message = "Olá, $name!"
    println(message)
}
fun elseiflinha(){
    var time2 = 20
    var sim = if (time2 < 18) {
        "Ohayo."
    } else {
        "Boa Noite."
    }
    println(sim)
}
fun abobora(){a}