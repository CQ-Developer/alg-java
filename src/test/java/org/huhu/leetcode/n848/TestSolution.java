package org.huhu.leetcode.n848;

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
        String s = "abc";
        int[] shifts = { 3, 5, 9 };
        Assertions.assertThat(solution.shiftingLetters(s, shifts)).isEqualTo("rpl");
    }

    @Test
    void testB() {
        String s = "aaa";
        int[] shifts = { 1, 2, 3 };
        Assertions.assertThat(solution.shiftingLetters(s, shifts)).isEqualTo("gfd");
    }

    @Test
    void testC() {
        String s = "mkgfzkkuxownxvfvxasy";
        int[] shifts = { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513 };
        Assertions.assertThat(solution.shiftingLetters(s, shifts)).isEqualTo("wqqwlcjnkphhsyvrkdod");
    }

}
