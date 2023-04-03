package com.facebook.animated.gif;

import android.graphics.Bitmap;

public class GifFrame implements C2959ok {
    @ii1
    private long mNativeContext;

    @ii1
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @ii1
    private native void nativeDispose();

    @ii1
    private native void nativeFinalize();

    @ii1
    private native int nativeGetDisposalMode();

    @ii1
    private native int nativeGetDurationMs();

    @ii1
    private native int nativeGetHeight();

    @ii1
    private native int nativeGetTransparentPixelColor();

    @ii1
    private native int nativeGetWidth();

    @ii1
    private native int nativeGetXOffset();

    @ii1
    private native int nativeGetYOffset();

    @ii1
    private native boolean nativeHasTransparency();

    @ii1
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* renamed from: a */
    public void mo13061a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    /* renamed from: b */
    public int mo13062b() {
        return nativeGetXOffset();
    }

    /* renamed from: c */
    public int mo13063c() {
        return nativeGetYOffset();
    }

    /* renamed from: d */
    public int mo13064d() {
        return nativeGetDisposalMode();
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getWidth() {
        return nativeGetWidth();
    }
}
