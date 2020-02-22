/*
Given a string, find the length of the longest substring
in it with no more than K distinct characters.
*/

const longest_substring_with_k_distinct = function(str, k) {
  let [windowStart, maxLength] = [0, 0];
  let charFrequency = {};

  for (let windowEnd = 0; windowEnd < str.length; windowEnd++) {
    const rightChar = str[windowEnd];
    if (!(rightChar in charFrequency)) {
      charFrequency[rightChar] = 0;
    }
    charFrequency[rightChar] += 1;
    while (Object.keys(charFrequency).length > k) {
      const leftChar = str[windowStart];
      charFrequency[leftChar] -= 1;
      if (charFrequency[leftChar] === 0) {
        delete charFrequency[leftChar];
      }
      windowStart += 1;
    }
    // remember the max. length
    maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
  }
  return maxLength;
};

module.exports = longest_substring_with_k_distinct;
