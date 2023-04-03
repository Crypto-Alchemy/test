package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements rc2<nf0, a66> {
    public final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    public final a66 invoke(nf0 nf0) {
        vx2.m53591g(nf0, "it");
        sd1 G0 = this.this$0.f40146y;
        if (G0 != null) {
            return G0;
        }
        a66 a66 = a66.f36360a;
        vx2.m53590f(a66, "NO_SOURCE");
        return a66;
    }
}
