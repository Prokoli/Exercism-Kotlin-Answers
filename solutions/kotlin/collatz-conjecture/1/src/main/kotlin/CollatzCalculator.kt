object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        //if the number is less than 1, it's invalid, return zero
        /*
        if (start < 1) 
            throw IllegalArgumentException("Only positive integers are allowed");
        else if (start == 1) 
        {
            return 0;
        }
        else if (start % 2 == 0)
        {
            return 1 + computeStepCount(start / 2);
        }
        else 
        {
            return 1 + computeStepCount((start*3) + 1);    
        }
        */
        if (start < 1) 
            throw IllegalArgumentException("Only positive integers are allowed");
        var newStart = start;
        var steps = 0; 
        while (newStart > 1) 
        {
            if (newStart % 2 == 0)
            {
                newStart /= 2;
            }
            else {
                newStart = (newStart * 3) + 1;
            }
            steps += 1;
        }
        return steps; 
    }
}
