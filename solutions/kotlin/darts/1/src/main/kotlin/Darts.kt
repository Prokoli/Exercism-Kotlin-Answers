object Darts {

    fun score(x: Number, y: Number): Int {
        val newX = x.toDouble()
        val newY = y.toDouble()
        val distance = newX * newX + newY * newY //distance equals square root of x^2 + y^2, but we ignore the sqrt bc we can square it with the distance
        when {
            distance <= 1.0*1.0 -> return 10
            distance <= 5.0*5.0 -> return 5
            distance <= 10.0*10.0 -> return 1
            else -> return 0
        }
    }
}
