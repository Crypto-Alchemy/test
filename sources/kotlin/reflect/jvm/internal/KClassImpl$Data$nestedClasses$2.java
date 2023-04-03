package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p000.we5;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "T", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$nestedClasses$2 extends Lambda implements pc2<List<? extends KClassImpl<? extends Object>>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$nestedClasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final List<KClassImpl<? extends Object>> invoke() {
        MemberScope O = this.this$0.mo53009m().mo52461O();
        vx2.m53590f(O, "descriptor.unsubstitutedInnerClassesScope");
        Collection a = we5.C9516a.m73584a(O, (yc1) null, (rc2) null, 3, (Object) null);
        ArrayList<d31> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (!dd1.m56797B((d31) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (d31 d31 : arrayList) {
            if0 if0 = d31 instanceof if0 ? (if0) d31 : null;
            Class<?> p = if0 != null ? y67.m74286p(if0) : null;
            KClassImpl kClassImpl = p != null ? new KClassImpl(p) : null;
            if (kClassImpl != null) {
                arrayList2.add(kClassImpl);
            }
        }
        return arrayList2;
    }
}
