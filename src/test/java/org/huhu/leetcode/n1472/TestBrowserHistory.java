package org.huhu.leetcode.n1472;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

abstract class TestBrowserHistory {

    BrowserHistory browser;

    abstract BrowserHistory getBrowserHistory(String homepage);

    @Test
    void test() {
        browser = getBrowserHistory("leetcode.com");
        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");
        assertThat(browser.back(1)).isEqualTo("facebook.com");
        assertThat(browser.back(1)).isEqualTo("google.com");
        assertThat(browser.forward(1)).isEqualTo("facebook.com");
        browser.visit("linkedin.com");
        assertThat(browser.forward(2)).isEqualTo("linkedin.com");
        assertThat(browser.back(2)).isEqualTo("google.com");
        assertThat(browser.back(7)).isEqualTo("leetcode.com");
    }

}
