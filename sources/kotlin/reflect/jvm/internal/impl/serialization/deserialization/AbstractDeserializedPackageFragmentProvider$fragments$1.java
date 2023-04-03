package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends Lambda implements rc2<u82, fk4> {
    public final /* synthetic */ AbstractDeserializedPackageFragmentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        super(1);
        this.this$0 = abstractDeserializedPackageFragmentProvider;
    }

    public final fk4 invoke(u82 u82) {
        vx2.m53591g(u82, "fqName");
        vd1 d = this.this$0.mo55108d(u82);
        if (d == null) {
            return null;
        }
        d.mo55126F0(this.this$0.mo55109e());
        return d;
    }
}
