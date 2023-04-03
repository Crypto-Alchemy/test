package com.fasterxml.jackson.core.p009io;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.fasterxml.jackson.core.io.CharacterEscapes */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public static int[] standardAsciiEscapesForJSON() {
        int[] e = ud0.m28145e();
        return Arrays.copyOf(e, e.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract qw5 getEscapeSequence(int i);
}
