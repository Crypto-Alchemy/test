package p000;

import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lf56;", "T", "Lz86;", "Le56;", "La96;", "value", "Lr37;", "d", "previous", "current", "applied", "f", "", "toString", "Lh56;", "a", "Lh56;", "()Lh56;", "policy", "Lf56$a;", "Lf56$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "e", "()La96;", "firstStateRecord", "<init>", "(Ljava/lang/Object;Lh56;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f56 */
/* compiled from: SnapshotState.kt */
public class f56<T> implements z86, e56<T> {

    /* renamed from: a */
    public final h56<T> f11535a;

    /* renamed from: d */
    public C2264a<T> f11536d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00028\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lf56$a;", "T", "La96;", "a", "c", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "value", "myValue", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: f56$a */
    /* compiled from: SnapshotState.kt */
    public static final class C2264a<T> extends a96 {

        /* renamed from: c */
        public T f11537c;

        public C2264a(T t) {
            this.f11537c = t;
        }

        /* renamed from: a */
        public a96 mo128a() {
            return new C2264a(this.f11537c);
        }

        /* renamed from: f */
        public final T mo19695f() {
            return this.f11537c;
        }

        /* renamed from: g */
        public final void mo19696g(T t) {
            this.f11537c = t;
        }
    }

    public f56(T t, h56<T> h56) {
        vx2.m53591g(h56, "policy");
        this.f11535a = h56;
        this.f11536d = new C2264a<>(t);
    }

    /* renamed from: a */
    public h56<T> mo19124a() {
        return this.f11535a;
    }

    /* renamed from: d */
    public void mo19690d(a96 a96) {
        vx2.m53591g(a96, "value");
        this.f11536d = (C2264a) a96;
    }

    /* renamed from: e */
    public a96 mo19691e() {
        return this.f11536d;
    }

    /* renamed from: f */
    public a96 mo19692f(a96 a96, a96 a962, a96 a963) {
        vx2.m53591g(a96, "previous");
        vx2.m53591g(a962, "current");
        vx2.m53591g(a963, "applied");
        C2264a aVar = (C2264a) a96;
        C2264a aVar2 = (C2264a) a962;
        C2264a aVar3 = (C2264a) a963;
        if (mo19124a().mo11485b(aVar2.mo19695f(), aVar3.mo19695f())) {
            return a962;
        }
        Object a = mo19124a().mo11484a(aVar.mo19695f(), aVar2.mo19695f(), aVar3.mo19695f());
        if (a == null) {
            return null;
        }
        a96 a2 = aVar3.mo128a();
        vx2.m53589e(a2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda-2>");
        ((C2264a) a2).mo19696g(a);
        return a2;
    }

    public T getValue() {
        return ((C2264a) SnapshotKt.m2230N(this.f11536d, this)).mo19695f();
    }

    public void setValue(T t) {
        a56 b;
        C2264a aVar = (C2264a) SnapshotKt.m2217A(this.f11536d);
        if (!mo19124a().mo11485b(aVar.mo19695f(), t)) {
            C2264a<T> aVar2 = this.f11536d;
            SnapshotKt.m2220D();
            synchronized (SnapshotKt.m2219C()) {
                b = a56.f41e.mo63b();
                ((C2264a) SnapshotKt.m2227K(aVar2, this, b, aVar)).mo19696g(t);
                r37 r37 = r37.f33317a;
            }
            SnapshotKt.m2225I(b, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((C2264a) SnapshotKt.m2217A(this.f11536d)).mo19695f() + ")@" + hashCode();
    }
}
