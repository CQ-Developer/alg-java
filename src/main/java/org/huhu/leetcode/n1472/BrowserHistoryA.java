package org.huhu.leetcode.n1472;

import java.util.ArrayList;
import java.util.List;

class BrowserHistoryA implements BrowserHistory {

    private int pos = 0;
    private final List<String> history = new ArrayList<>();

    public BrowserHistoryA(String homepage) {
        history.add(homepage);
    }

    @Override
    public void visit(String url) {
        history.subList(++pos, history.size()).clear();
        history.add(url);
    }

    @Override
    public String back(int steps) {
        pos = Math.max(pos - steps, 0);
        return history.get(pos);
    }

    @Override
    public String forward(int steps) {
        pos = Math.min(pos + steps, history.size() - 1);
        return history.get(pos);
    }

}
