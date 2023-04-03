package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.internal.Lambda;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements pc2<xc3> {
    public final /* synthetic */ f17 $this_createCapturedIfNeeded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(f17 f17) {
        super(0);
        this.$this_createCapturedIfNeeded = f17;
    }

    public final xc3 invoke() {
        xc3 type = this.$this_createCapturedIfNeeded.getType();
        vx2.m53590f(type, "this@createCapturedIfNeeded.type");
        return type;
    }
}
