package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INT2 = 0;

    int totalRejected = INT2;

    public int getTotalRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > getLastNumber()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
