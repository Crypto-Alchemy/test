package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: B */
    long mo13164B();

    boolean isClosed();

    int size();

    /* renamed from: t */
    int mo13167t(int i, byte[] bArr, int i2, int i3);

    /* renamed from: u */
    ByteBuffer mo13168u();

    /* renamed from: w */
    byte mo13169w(int i);
}
