data class Person(
    val name: String,
    val age: Int,
    val location: String,
)

fun main() {
    val peopleColl = listOf<Person>(
        Person("jim", 25, "lagos"),
        Person("robert", 26, "lagos"),
        Person("favour", 20, "lagos"),
    )

    println(peopleColl)

    // make a new collection from person list
    val transformedPeople = peopleColl.map{it.name}
    println(transformedPeople)
}