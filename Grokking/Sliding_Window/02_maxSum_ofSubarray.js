// Time complexity: O(N); Space Complexity: O(1)

function maxSumSubArray(k, arr) {
  let [maxSum, windowSum, windwoStart] = [0, 0, 0];
  for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
    windowSum += arr[windowEnd];
    if (windowEnd >= k - 1) {
      maxSum = Math.max(maxSum, windowSum);
      windowSum -= arr[windwoStart];
      windwoStart++;
    }
  }
  return maxSum;
}

exports.maxSumSubArray = maxSumSubArray;
