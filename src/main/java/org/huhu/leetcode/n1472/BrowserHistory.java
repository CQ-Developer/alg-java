package org.huhu.leetcode.n1472;

interface BrowserHistory {

    void visit(String url);

    String back(int steps);

    String forward(int steps);

}
