// this is an extension function
// this function is written for a type without inheriting
// a base class or even using decorators
// we prefix the type we want to extend

fun<T> MutableList<T>.swap(firstIndex: Int, secondIndex: Int) {
    val tmp = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = tmp
}

