package com.facebook.imagepipeline.animated.base;

public class AnimatedDrawableFrameInfo {

    /* renamed from: a */
    public final int f9600a;

    /* renamed from: b */
    public final int f9601b;

    /* renamed from: c */
    public final int f9602c;

    /* renamed from: d */
    public final int f9603d;

    /* renamed from: e */
    public final int f9604e;

    /* renamed from: f */
    public final BlendOperation f9605f;

    /* renamed from: g */
    public final DisposalMethod f9606g;

    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.f9600a = i;
        this.f9601b = i2;
        this.f9602c = i3;
        this.f9603d = i4;
        this.f9604e = i5;
        this.f9605f = blendOperation;
        this.f9606g = disposalMethod;
    }
}
