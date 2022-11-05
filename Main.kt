fun sequenceSteps(arrData: Array<Int>, maxNo:Int, steps: Int): Int{

    for(item in arrData) {
        // check that no item in the array is
        // greater than the maxNo
        if (item > maxNo) {
            // run another iteration
            // display notice before that
            println("the max number we can have is $maxNo")
            var currSteps = 0
            for(num in 0..maxNo){

                // check if num is divisible by step
                // then return the corresponding values
                // using the modulo function
                if(num % steps == 0 ) {
                    println(num)
                }
            }
        }
    }
    return 0
}

fun main(){
    var result = sequenceSteps(arrayOf(2,3,4,5), 4, 3)
    println(result)

    // extension
    var list = mutableListOf<Int>(1,2)
    list.swap(0,2)
}