package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejcted = 0;

    public int getTotalRejcted() {
        return totalRejcted;
    }

    public void countIn(int in) {
        if (!callCheck() && in > getLastNumber()) {
            totalRejcted++;
        } else {
            super.countIn(in);
        }
    }
}
