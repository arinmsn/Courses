const {
  smallest_subarray_with_given_sum
} = require("../Sliding_Window/03_smallest_subarray_sum");

describe(" find the length of the smallest contiguous subarray given S", () => {
  it("finds length of smallest subarray with a sum >= s", () => {
    expect(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 3, 2])).toEqual(2);
    expect(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 8])).toEqual(1);
    expect(smallest_subarray_with_given_sum(8, [3, 4, 1, 1, 6])).toEqual(3);
  });

  it("returns 0 if no smallest subarray found", () => {
    expect(smallest_subarray_with_given_sum(100, [3, 4, 1, 1, 6])).toEqual(0);
  });
});
