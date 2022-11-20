
@JvmInline
value class Width(val width:Long)

@JvmInline
value class Height(val height:Long)

// so under the hood, the compiler runs the code
// as follows -> Rectangle__(val width:Long, val height: Long)

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
