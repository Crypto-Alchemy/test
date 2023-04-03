package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.C6983dm;

/* compiled from: LazyJavaAnnotations.kt */
public final class LazyJavaAnnotations implements C6983dm {

    /* renamed from: a */
    public final pf3 f39450a;

    /* renamed from: d */
    public final l03 f39451d;

    /* renamed from: e */
    public final boolean f39452e;

    /* renamed from: g */
    public final ws3<h03, C9460vl> f39453g;

    public LazyJavaAnnotations(pf3 pf3, l03 l03, boolean z) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(l03, "annotationOwner");
        this.f39450a = pf3;
        this.f39451d = l03;
        this.f39452e = z;
        this.f39453g = pf3.mo65296a().mo67018u().mo51159d(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }

    /* renamed from: C0 */
    public boolean mo51224C0(u82 u82) {
        return C6983dm.C6986b.m56911b(this, u82);
    }

    public boolean isEmpty() {
        if (!this.f39451d.getAnnotations().isEmpty() || this.f39451d.mo51412D()) {
            return false;
        }
        return true;
    }

    public Iterator<C9460vl> iterator() {
        return SequencesKt___SequencesKt.m63027q(SequencesKt___SequencesKt.m63017A(SequencesKt___SequencesKt.m63034x(CollectionsKt___CollectionsKt.m47318Q(this.f39451d.getAnnotations()), this.f39453g), k03.f38828a.mo52836a(C7395c.C7396a.f39204y, this.f39451d, this.f39450a))).iterator();
    }

    /* renamed from: x */
    public C9460vl mo51226x(u82 u82) {
        C9460vl invoke;
        vx2.m53591g(u82, "fqName");
        h03 x = this.f39451d.mo51429x(u82);
        if (x == null || (invoke = this.f39453g.invoke(x)) == null) {
            return k03.f38828a.mo52836a(u82, this.f39451d, this.f39450a);
        }
        return invoke;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaAnnotations(pf3 pf3, l03 l03, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pf3, l03, (i & 4) != 0 ? false : z);
    }
}
