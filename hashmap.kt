const val TOP_ACC_BAL: Int = 300

val Accounts:MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
val allAccounts: Map<Int, Int> = Accounts

// 2 types of hashmaps in kotlin
// linked hashmaps and hashmaps, and the difference
// is that the linked one maintains insertion order
// during iteration

fun updateAccountBalance(accountId: Int) {
    if (Accounts.containsKey(accountId)) {
        println("updating account balance ...")
        Accounts[accountId] =  Accounts.getValue(accountId) +  TOP_ACC_BAL
    } else {
        println("account not found!")
    }
}

fun getAllAccounts() {
    println("printing all accounts ...")
    allAccounts.forEach {
        k, v -> println("the accounts are  $k -> $v")
    }
}

fun main() {
    val hm = LinkedHashMap<Int, String>()
    val hms = HashMap<Int, String>()

    hm[1] = "jim"
    hm[2] = "sam"

    val callOne = hm.get(1)
    val callTwo = hm[2]
    println("value of call one is $callOne")
    println("value of call two is $callTwo")

    if(hm.containsKey(2) && hm.containsValue("jim")) {
        // print success if the information is correct
        println("success! retrieved ${hm[2]} key and ${hm[1]} value")
    } else {
        println("No success !")
    }
}

// convert whatever user passes in to int
private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt()}