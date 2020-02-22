/*
Given an array of positive numbers and a positive number ‘S’,
find the length of the smallest contiguous subarray whose sum
is greater than or equal to ‘S’. Return 0, if no such subarray exists.
*/

/*  Time Complexity: outer for loop runs for all elements
    and inner while loop processes each element only once. 
    O(N + N) = O(N)
    Space Complexity: O(1)
*/

const smallest_subarray_with_given_sum = function(s, arr) {
  let [windowSum, minLength, windowStart] = [0, Infinity, 0];
  for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
    windowSum += arr[windowEnd]; // add next element
    while (windowSum >= s) {
      minLength = Math.min(minLength, windowEnd - windowStart + 1);
      windowSum -= arr[windowStart];
      windowStart += 1;
    }
  }

  if (minLength === Infinity) {
    return 0;
  }

  return minLength;
};

export default { smallest_subarray_with_given_sum };
