package com.orgexample;

import junit.framework.TestCase;

public class UtilsTest extends TestCase {

    public void testSetTurnOnOffThread() {
        Long lg = 1l;
        Utils ut = new Utils(lg);
        Boolean bl = false;
        ut.setTurnOnOffThread(false);
        assertEquals(ut.getTurnOnOffThread(), bl);
    }

    public void testShowCacheList() {
        Utils.showCacheList("AA");
        assertTrue(true);
    }

    public void testGetCountProcess() {
        assertNotNull(Utils.getCountProcess());
    }

}