object Bob {
    fun hey(input: String): String {
        //if ? reply "Sure."
        val trimmed = input.trim();
        
        if (trimmed.isEmpty()) {
            return "Fine. Be that way!"
        }

        val yelling = trimmed.any{it.isLetter()}&& trimmed == trimmed.uppercase(); 
        val question = trimmed.endsWith("?");
        
        return when {
            yelling && question -> "Calm down, I know what I'm doing!"
            yelling -> "Whoa, chill out!"
            question -> "Sure."
            else -> "Whatever."
        }
    }
}
