package org.huhu.leetcode.n303;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumArrayTest {

    @Test
    void testA() {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray code = new NumArray(nums);
        Assertions.assertThat(code.sumRange(0, 2)).isEqualTo(1);
        Assertions.assertThat(code.sumRange(2, 5)).isEqualTo(-1);
        Assertions.assertThat(code.sumRange(0, 5)).isEqualTo(-3);
    }

}
