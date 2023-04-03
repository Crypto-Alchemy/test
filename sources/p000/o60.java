package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o60 */
/* compiled from: ByteBufferEncoder */
public class o60 implements np1<ByteBuffer> {
    /* renamed from: c */
    public boolean mo11955a(ByteBuffer byteBuffer, File file, xi4 xi4) {
        try {
            s60.m26658f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
