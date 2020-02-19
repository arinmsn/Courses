const { maxSumSubArray } = require("../Sliding_Window/02_maxSum_ofSubarray");

describe("find max sum of any contiguous subarray of size K", () => {
  it("k=3, arr=[2, 1, 5, 1, 3, 2]", () => {
    expect(maxSumSubArray(3, [2, 1, 5, 1, 3, 2])).toEqual(9);
  });

  it("k=2, arr=[2, 3, 4, 1, 5]", () => {
    expect(maxSumSubArray(2, [2, 3, 4, 1, 5])).toEqual(7);
  });

  it("k=2, arr=[-5,2,-1,9,3,11]", () => {
    expect(maxSumSubArray(2, [-5, 2, -1, 9, 3, 11])).toEqual(14);
  });
});
