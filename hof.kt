// higher order functions are functions
// that can take a function as an argument
// or return another function

fun hofAnalysis(x: Int, y:Int, operation:(Int, Int) -> Int):Int {
    return operation(x, y)
}

fun sumTwo(x: Int, y: Int):Int {
    return x + y
}