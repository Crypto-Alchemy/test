package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses$classes$1 extends Lambda implements rc2<NotFoundClasses.C7414a, if0> {
    public final /* synthetic */ NotFoundClasses this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    public final if0 invoke(NotFoundClasses.C7414a aVar) {
        d31 d31;
        vx2.m53591g(aVar, "<name for destructuring parameter 0>");
        nf0 a = aVar.mo53242a();
        List<Integer> b = aVar.mo53243b();
        if (!a.mo62682k()) {
            nf0 g = a.mo62677g();
            if (g == null || (d31 = this.this$0.mo53241d(g, CollectionsKt___CollectionsKt.m47323T(b, 1))) == null) {
                vs3 b2 = this.this$0.f39246c;
                u82 h = a.mo62678h();
                vx2.m53590f(h, "classId.packageFqName");
                d31 = (rf0) b2.invoke(h);
            }
            d31 d312 = d31;
            boolean l = a.mo62683l();
            da6 c = this.this$0.f39244a;
            r24 j = a.mo62681j();
            vx2.m53590f(j, "classId.shortClassName");
            Integer num = (Integer) CollectionsKt___CollectionsKt.m47331b0(b);
            return new NotFoundClasses.C7415b(c, d312, j, l, num != null ? num.intValue() : 0);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + a);
    }
}
