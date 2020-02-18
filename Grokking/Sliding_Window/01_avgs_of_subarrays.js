function find_averages_of_subarrays(k, arr) {
  const result = [];
  let [windowSum, windowStart] = [0, 0];
  for (let windowEnd = 0; windowEnd < arr.length; windowEnd++) {
    windowSum += arr[windowEnd];
    if (windowEnd >= k - 1) {
      result.push(windowSum / k);
      windowSum -= arr[windowStart];
      windowStart += 1;
    }
  }
  return result;
}

const result = find_averages_of_subarrays(5, [1, 3, 2, 6, -1, 4, 1, 8, 2]);
// const result = find_averages_of_subarrays(4, [3, 1, -2, 8, 9, -10, -3, 8, 9]);
console.log(`Averages of subarrays of size k: ${result}`);

module.exports = find_averages_of_subarrays;
