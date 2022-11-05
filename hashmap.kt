const val TOP_ACC_BAL: Int = 300

val Accounts:MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
val allAccounts: Map<Int, Int> = Accounts

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