package org.huhu.leetcode.n1472;

class TestBrowserHistoryA extends TestBrowserHistory {

    @Override
    BrowserHistory getBrowserHistory(String homepage) {
        return new BrowserHistoryA(homepage);
    }

}
