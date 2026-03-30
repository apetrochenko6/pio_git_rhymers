
/**
 * Klasa HanoiRhymer rozszerza DefaultCountingOutRhymer i wprowadza dodatkową logikę
 * ograniczającą dodawanie elementów.
 * Element może zostać dodany tylko wtedy, gdy:
 *      1. struktura jest pusta
 *      2. lub nowy element  jest mniejszy lub równy elementowi na szczycie
 *
 */
package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Początkowa liczba odrzuconych elementów.
     */
    public static final int INITIAL_COUNT = 0;

    /**
     * Liczba odrzuconych elementów.
     */
    private int totalRejected = INITIAL_COUNT;

    /**
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element do struktury zgodnie z zasadami HanoiRhymer.
     *
     * @param in in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
