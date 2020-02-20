const {
  longest_substring_with_k_distinct
} = require("../Sliding_Window/04_longestSubstring_with_K");

describe("longest_substring_with_k_distinct", () => {
  it("finds length of longest substring with <= k distinct characters", () => {
    expect(longest_substring_with_k_distinct("cabaaaaabbbc", 2)).toEqual(10);
    expect(longest_substring_with_k_distinct("araaci", 2)).toEqual(4);
    expect(longest_substring_with_k_distinct("araaci", 1)).toEqual(2);
    expect(longest_substring_with_k_distinct("cbbebi", 3)).toEqual(5);
    expect(longest_substring_with_k_distinct("cbbebi", 10)).toEqual(6);
  });
});
