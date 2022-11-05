fun nullAnalysis(maybeString: String?): String {
    return if(!maybeString.isNullOrEmpty() && maybeString.isNotEmpty()) {
        "the length of the string is ${maybeString.length}"
    } else {
        "the string is empty"
    }
}
