package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;

@ii1
public class GifImage implements C2687kk, C2761lk {

    /* renamed from: b */
    public static volatile boolean f9413b;

    /* renamed from: a */
    public Bitmap.Config f9414a = null;
    @ii1
    private long mNativeContext;

    @ii1
    public GifImage() {
    }

    /* renamed from: k */
    public static GifImage m13166k(ByteBuffer byteBuffer, lq2 lq2) {
        m13168m();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, lq2.f14640b, lq2.f14644f);
        nativeCreateFromDirectByteBuffer.f9414a = lq2.f14646h;
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static GifImage m13167l(long j, int i, lq2 lq2) {
        boolean z;
        m13168m();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, lq2.f14640b, lq2.f14644f);
        nativeCreateFromNativeMemory.f9414a = lq2.f14646h;
        return nativeCreateFromNativeMemory;
    }

    /* renamed from: m */
    public static synchronized void m13168m() {
        synchronized (GifImage.class) {
            if (!f9413b) {
                f9413b = true;
                u34.m28058d("gifimage");
            }
        }
    }

    /* renamed from: n */
    public static AnimatedDrawableFrameInfo.DisposalMethod m13169n(int i) {
        if (i == 0) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS;
        }
        return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
    }

    @ii1
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @ii1
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @ii1
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @ii1
    private native void nativeDispose();

    @ii1
    private native void nativeFinalize();

    @ii1
    private native int nativeGetDuration();

    @ii1
    private native GifFrame nativeGetFrame(int i);

    @ii1
    private native int nativeGetFrameCount();

    @ii1
    private native int[] nativeGetFrameDurations();

    @ii1
    private native int nativeGetHeight();

    @ii1
    private native int nativeGetLoopCount();

    @ii1
    private native int nativeGetSizeInBytes();

    @ii1
    private native int nativeGetWidth();

    @ii1
    private native boolean nativeIsAnimated();

    /* renamed from: a */
    public int mo13069a() {
        return nativeGetFrameCount();
    }

    /* renamed from: b */
    public int mo13070b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    /* renamed from: c */
    public AnimatedDrawableFrameInfo mo13071c(int i) {
        GifFrame o = mo13080i(i);
        try {
            return new AnimatedDrawableFrameInfo(i, o.mo13062b(), o.mo13063c(), o.getWidth(), o.getHeight(), AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS, m13169n(o.mo13064d()));
        } finally {
            o.dispose();
        }
    }

    /* renamed from: d */
    public C2687kk mo13072d(long j, int i, lq2 lq2) {
        return m13167l(j, i, lq2);
    }

    /* renamed from: e */
    public C2687kk mo13073e(ByteBuffer byteBuffer, lq2 lq2) {
        return m13166k(byteBuffer, lq2);
    }

    /* renamed from: f */
    public boolean mo13074f() {
        return false;
    }

    public void finalize() {
        nativeFinalize();
    }

    /* renamed from: g */
    public int mo13076g() {
        return nativeGetSizeInBytes();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    /* renamed from: h */
    public Bitmap.Config mo13079h() {
        return this.f9414a;
    }

    /* renamed from: j */
    public int[] mo13081j() {
        return nativeGetFrameDurations();
    }

    /* renamed from: o */
    public GifFrame mo13080i(int i) {
        return nativeGetFrame(i);
    }

    @ii1
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
