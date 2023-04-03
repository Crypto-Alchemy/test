package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/Triple;", "Ld83;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lc83;", "invoke", "()Lkotlin/Triple;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$metadata$2 extends Lambda implements pc2<Triple<? extends d83, ? extends ProtoBuf$Package, ? extends c83>> {
    public final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Triple<d83, ProtoBuf$Package, c83> invoke() {
        KotlinClassHeader a;
        pa5 b = this.this$0.mo53059c();
        if (b == null || (a = b.mo65261a()) == null) {
            return null;
        }
        String[] a2 = a.mo53820a();
        String[] g = a.mo53826g();
        if (a2 == null || g == null) {
            return null;
        }
        Pair<d83, ProtoBuf$Package> m = i83.m58875m(a2, g);
        return new Triple<>(m.component1(), m.component2(), a.mo53823d());
    }
}
