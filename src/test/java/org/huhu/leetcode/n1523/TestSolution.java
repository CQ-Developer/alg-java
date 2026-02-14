package org.huhu.leetcode.n1523;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        Assertions.assertThat(solution.countOdds(3, 7)).isEqualTo(3);
    }

    @Test
    void testB() {
        Assertions.assertThat(solution.countOdds(8, 10)).isEqualTo(1);
    }

}
