package org.huhu.leetcode.n2282;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[][] heights, int[][] ans) {
        assertThat(solution.seePeople(heights)).isDeepEqualTo(ans);
    }

    @ParameterizedTest
    @MethodSource("random")
    void testWithTarget(int[][] heights, int[][] ans) {
        assertThat(solution.seePeople(heights)).isDeepEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new int[][] { { 3, 1, 4, 2, 5 } },
                        new int[][] { { 2, 1, 2, 1, 0 } }),
                Arguments.of(
                        new int[][] { { 5, 1 }, { 3, 1 }, { 4, 1 } },
                        new int[][] { { 3, 1 }, { 2, 1 }, { 1, 0 } }));
    }

    static Collection<Arguments> random() {
        var gen = RandomGeneratorFactory.getDefault().create(System.currentTimeMillis());
        var target = new TargetSolution();
        Collection<Arguments> data = new ArrayList<>();
        for (int r = 0; r < 10; r++) {
            int m = gen.nextInt(1, 100), n = gen.nextInt(1, 100);
            int[][] heights = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    heights[i][j] = gen.nextInt(1, 100);
                }
            }
            data.add(Arguments.of(heights, target.seePeople(heights)));
        }
        return data;
    }

}
