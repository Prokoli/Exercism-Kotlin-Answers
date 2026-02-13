fun reverse(input: String): String {
    var result = "";
    val length = input.length;
    for (c in input.indices) { 
        result += input[length - 1 - c];
    }
    return result;
}