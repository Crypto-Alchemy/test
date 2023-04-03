package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;

@ii1
public class WebPImage implements C2687kk, C2761lk {

    /* renamed from: a */
    public Bitmap.Config f9415a = null;
    @ii1
    private long mNativeContext;

    @ii1
    public WebPImage() {
    }

    /* renamed from: k */
    public static WebPImage m13186k(ByteBuffer byteBuffer, lq2 lq2) {
        l96.m21339a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (lq2 != null) {
            nativeCreateFromDirectByteBuffer.f9415a = lq2.f14646h;
        }
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static WebPImage m13187l(long j, int i, lq2 lq2) {
        boolean z;
        l96.m21339a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (lq2 != null) {
            nativeCreateFromNativeMemory.f9415a = lq2.f14646h;
        }
        return nativeCreateFromNativeMemory;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    /* renamed from: a */
    public int mo13069a() {
        return nativeGetFrameCount();
    }

    /* renamed from: b */
    public int mo13070b() {
        return nativeGetLoopCount();
    }

    /* renamed from: c */
    public AnimatedDrawableFrameInfo mo13071c(int i) {
        AnimatedDrawableFrameInfo.BlendOperation blendOperation;
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod;
        WebPFrame m = mo13080i(i);
        try {
            int b = m.mo13062b();
            int c = m.mo13063c();
            int width = m.getWidth();
            int height = m.getHeight();
            if (m.mo13083d()) {
                blendOperation = AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS;
            } else {
                blendOperation = AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND;
            }
            AnimatedDrawableFrameInfo.BlendOperation blendOperation2 = blendOperation;
            if (m.mo13084e()) {
                disposalMethod = AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND;
            } else {
                disposalMethod = AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
            }
            return new AnimatedDrawableFrameInfo(i, b, c, width, height, blendOperation2, disposalMethod);
        } finally {
            m.dispose();
        }
    }

    /* renamed from: d */
    public C2687kk mo13072d(long j, int i, lq2 lq2) {
        return m13187l(j, i, lq2);
    }

    /* renamed from: e */
    public C2687kk mo13073e(ByteBuffer byteBuffer, lq2 lq2) {
        return m13186k(byteBuffer, lq2);
    }

    /* renamed from: f */
    public boolean mo13074f() {
        return true;
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
        return this.f9415a;
    }

    /* renamed from: j */
    public int[] mo13081j() {
        return nativeGetFrameDurations();
    }

    /* renamed from: m */
    public WebPFrame mo13080i(int i) {
        return nativeGetFrame(i);
    }

    @ii1
    public WebPImage(long j) {
        this.mNativeContext = j;
    }
}
