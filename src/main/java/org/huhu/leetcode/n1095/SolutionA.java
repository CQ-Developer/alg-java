package org.huhu.leetcode.n1095;

class SolutionA implements Solution {

    @Override
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int l = 0, r = n - 2;
        while (l < r) {
            int i = l + (r - l) / 2;
            if (mountainArr.get(i) < mountainArr.get(i + 1)) {
                l = i + 1;
            } else {
                r = i;
            }
        }
        int i = binarySearch(mountainArr, target, 0, r, false);
        if (i == -1) {
            i = binarySearch(mountainArr, -target, r + 1, n - 1, true);
        }
        return i;
    }

    private int binarySearch(MountainArray mountainArr, int target, int l, int r, boolean f) {
        while (l <= r) {
            int i = l + (r - l) / 2;
            int x = mountainArr.get(i);
            if (f) {
                x = -x;
            }
            if (x == target) {
                return i;
            }
            if (x > target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return -1;
    }

}
