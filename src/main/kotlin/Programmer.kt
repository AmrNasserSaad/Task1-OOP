class Programmer(val name :String, val age :Int, override var recruiting :Boolean = true ):Employee() {
    init {
        println("$name $age "+" years")

    }
}