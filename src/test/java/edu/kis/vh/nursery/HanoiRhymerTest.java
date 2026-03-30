package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest
{
    @Test
    public void shouldAcceptFirstElement(){
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        Assert.assertEquals(5, rhymer.peekaboo());
        Assert.assertEquals(0, rhymer.reportRejected());
    }
    @Test
    public void shouldRejectGreater(){
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(8);
        Assert.assertEquals(5, rhymer.peekaboo());
        Assert.assertEquals(1, rhymer.reportRejected());
    }
    @Test
    public void shouldAcceptSmaller(){
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(9);
        rhymer.countIn(5);
        Assert.assertEquals(5, rhymer.peekaboo());
        Assert.assertEquals(0, rhymer.reportRejected());
    }
    @Test
    public void shouldCountMultipleRejection (){
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(6);
        rhymer.countIn(16);
        rhymer.countIn(26);
        rhymer.countIn(36);
        rhymer.countIn(3);
        Assert.assertEquals(3, rhymer.peekaboo());
        Assert.assertEquals(3, rhymer.reportRejected());
    }
}
