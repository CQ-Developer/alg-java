package org.huhu.leetcode.n901;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestStockSpanner {

    StockSpanner spanner;

    abstract StockSpanner getStockSpanner();

    @BeforeEach
    void setup() {
        spanner = getStockSpanner();
    }

    @Test
    void test1() {
        assertThat(spanner.next(100)).isEqualTo(1);
        assertThat(spanner.next(80)).isEqualTo(1);
        assertThat(spanner.next(60)).isEqualTo(1);
        assertThat(spanner.next(70)).isEqualTo(2);
        assertThat(spanner.next(60)).isEqualTo(1);
        assertThat(spanner.next(75)).isEqualTo(4);
        assertThat(spanner.next(85)).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(spanner.next(31)).isEqualTo(1);
        assertThat(spanner.next(41)).isEqualTo(2);
        assertThat(spanner.next(48)).isEqualTo(3);
        assertThat(spanner.next(59)).isEqualTo(4);
        assertThat(spanner.next(79)).isEqualTo(5);
    }

}
