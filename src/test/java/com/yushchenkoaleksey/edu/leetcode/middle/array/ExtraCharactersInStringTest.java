package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCharactersInStringTest {
    ExtraCharactersInString extra = new ExtraCharactersInString();

    @Test()
    void test1() {
        assertEquals(1, extra.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"}));
    }

    @Test
    void test2() {
        assertEquals(3, extra.minExtraChar("sayhelloworld", new String[]{"hello", "world"}));
    }
    @Test
    void test3() {
            assertEquals(15, extra.minExtraChar("azvzulhlwxwobowijiyebeaskecvtjqwkmaqnvnaomaqnvf", new String[]{"na","i","edd","wobow","kecv","b","n","or","jj","zul","vk","yeb","qnfac","azv","grtjba","yswmjn","xowio","u","xi","pcmatm","maqnv"}));
    }
    @Test
    void test4() {
        assertEquals(10, extra.minExtraChar("jqnrwkslbhhkkvveotpfaidoftmgcojcpzcvlctsqyvvobmlzo", new String[]{"nrwks","t","mcgjko","xm","vac","ypqdr","zwlghw","gz","xbsmr","hhkkv","qviu","yvvobml","cfk","fxu","pm","nwobfce","eu","y","krzbg","xoktzxa","doftmgc","qpcpd","oj","bl","kylslpr","cpzcvlc","ogscaz","l","nztlq","ai","o","wdhlanl","ot","hqe"}));
    }//jqnrwkslbhhkkvveotpfaidoftmgcojcpzcvlctsqyvvobmlzo
//        extra.minExtraChar("dwmodizxvvbosxxw", new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"}));
//        extra.minExtraChar("eglglxa", new String[]{"rs", "j", "h", "g", "fy", "l", "fc", "s", "zf", "i", "k", "x", "gl", "qr", "qj", "b", "m", "cm", "pe", "y", "ei", "wg", "e", "c", "ll", "u", "lb", "kc", "r", "gs", "p", "ga", "pq", "o", "wq", "mp", "ms", "vp", "kg", "cu"}));
//        extra.minExtraChar("dwmodizxvvbosxxw", new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"}));
//[t, y, l, o, xm, gz, pm, eu, oj, bl, ai, ot, vac, cfk, fxu, hqe, qviu, nrwks, ypqdr, xbsmr, hhkkv, krzbg, qpcpd, nztlq, mcgjko, zwlghw, ogscaz, yvvobml, nwobfce, xoktzxa, doftmgc, kylslpr, cpzcvlc, wdhlanl]
}
//[b, i, n, u, jj, na, or, vk, xi, azv, edd, yeb, zul, kecv, maqnv, qnfac, wobow, xowio, grtjba, pcmatm, yswmjn]
//[b, i, n, u, jj, na, or, vk, xi, azv, edd, yeb, zul, kecv, maqnv, qnfac, xowio, grtjba, pcmatm, yswmjn]
//hlwjeastjqwkof

















