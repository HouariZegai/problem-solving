""" Asked by: Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

"""

# Stupid solution -_-, just for sorted array :(
def getMissing(numbers):
    if numbers[0] != 1:
        return 1
    else:
        for i in range(1, len(numbers)):
            if numbers[i] != (1 + numbers[i - 1]):
                return numbers[i - 1] + 1
        return numbers[-1] + 1
    
getMissing([1, 2, 3, 6])