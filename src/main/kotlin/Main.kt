fun main() {

    elseiflinha()
    helloWorld("Otávio")
    ifelif()
}
fun ifelif() {
    val time = 13
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
    val time2 = 20
    val sim = if (time2 < 18) {
        "Ohayo."
    } else {
        "Boa Noite."
    }
    println(sim)
}