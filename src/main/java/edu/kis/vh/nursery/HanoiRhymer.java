package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INT2 = 0;

    int totalRejcted = INT2;

    public int getTotalRejcted() {
        return totalRejcted;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > getLastNumber()) {
            totalRejcted++;
        } else {
            super.countIn(in);
        }
    }
}
