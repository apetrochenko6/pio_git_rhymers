package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int START = 1;
    public static final int LIMIT = 15;
    public static final int USED = 3;
    public static final int RANDOM = 20;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = START; i < LIMIT; i++)
            for (int j = 0; j < USED; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = START; i < LIMIT; i++)
            rhymers[USED].countIn(rn.nextInt(RANDOM));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[USED]).reportRejected());
    }

}