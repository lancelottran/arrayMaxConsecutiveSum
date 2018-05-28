int arrayMaxConsecutiveSum2(int[] inputArray) {
    if(inputArray.length == 1)
        return inputArray[0];
    
    int cur_max_sum = inputArray[0];
    int max_sum = inputArray[0];
    int sum = 0;
    
    for(int i = 1; i < inputArray.length; i++)
    {
        cur_max_sum = Math.max(inputArray[i], inputArray[i] + cur_max_sum);   
        max_sum = Math.max(cur_max_sum, max_sum);
    }
    
    return max_sum;
}
