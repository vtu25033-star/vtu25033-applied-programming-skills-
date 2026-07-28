class Solution(object):
    def moveZeroes(self, arr: list[int]) -> None:
        i = 0
        j = 0
        while j < len(arr):
            if arr[j] != 0:
                if j != i:
                    arr[i], arr[j] = arr[j], arr[i]
                i += 1
            j += 1
