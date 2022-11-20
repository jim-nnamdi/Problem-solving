inline class Width(val width: Long)
inline class Height(val height: Long)

class Rectangle(val width: Width, val height: Height) {
    val w: Width? = width
    val h: Height? = height


    fun checkValues(): Unit {
        println(w.hashCode() ?: 0)
        println(h.hashCode() ?: 0)
    }
}

fun main(){
    // instantiate the class
    val w = Width(100L)
    var h = Height(300L)
    val rectClass = Rectangle(w, h)

    rectClass.checkValues()
}
