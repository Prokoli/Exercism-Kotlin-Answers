object EliudsEggs {

    fun eggCount(number: Int): Int{
        //takes in a decimal Number and convert binary number to string 
        val binaryNum = number.toString(2); 
    	//turn string into array 
        var totalCount = 0; 
        //iterate through string/array to count ones
        for (num in binaryNum) 
    	{
            if (num == '1')
            {
                totalCount += 1
            }
        }
        //if the current position is one, increment count
        //return count 
        return totalCount
        
    }
}
