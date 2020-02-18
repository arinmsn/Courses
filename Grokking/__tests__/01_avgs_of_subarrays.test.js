const find_averages_of_subarrays = require("../Sliding_Window/01_avgs_of_subarrays");

describe("Find the average of all contiguous subarrays of size K", () => {
  it("K = 5 and array = [1, 3, 2, 6, -1, 4, 1, 8, 2]", () => {
    expect(
      find_averages_of_subarrays(5, [1, 3, 2, 6, -1, 4, 1, 8, 2])
    ).toEqual([2.2, 2.8, 2.4, 3.6, 2.8]);
  });

  it("K = 4 and array = [3, 1, -2, 8, 9, -10, -3, 8, 9]", () => {
    expect(
      find_averages_of_subarrays(4, [3, 1, -2, 8, 9, -10, -3, 8, 9])
    ).toEqual([2.5, 4, 1.25, 1, 1, 1]);
  });

  it("K = 3 and array = [-5, 5, 7, 8, 10, 12]", () => {
    expect(find_averages_of_subarrays(3, [5, 7, 9, 14, 13])).toEqual([
      7,
      10,
      12
    ]);
  });
});
