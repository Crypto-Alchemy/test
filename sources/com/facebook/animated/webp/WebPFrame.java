package com.facebook.animated.webp;

import android.graphics.Bitmap;

public class WebPFrame implements C2959ok {
    @ii1
    private long mNativeContext;

    @ii1
    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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
    public boolean mo13083d() {
        return nativeIsBlendWithPreviousFrame();
    }

    public void dispose() {
        nativeDispose();
    }

    /* renamed from: e */
    public boolean mo13084e() {
        return nativeShouldDisposeToBackgroundColor();
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
