package org.huhu.leetcode.n3427;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution code;

    abstract Solution getCode();

    @BeforeEach
    void setup() {
        code = getCode();
    }

    @Test
    void testA() {
        int[] nums = { 2, 3, 1 };
        Assertions.assertThat(code.subarraySum(nums)).isEqualTo(11);
    }

    void testB() {
        int[] nums = { 3, 1, 1, 2 };
        Assertions.assertThat(code.subarraySum(nums)).isEqualTo(13);
    }

}
