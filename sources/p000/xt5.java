package p000;

import androidx.compose.p004ui.platform.InspectableValueKt;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aBA\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, mo44877d2 = {"Lxt5;", "Lwt5;", "Ltv2;", "", "other", "", "equals", "", "hashCode", "Lvt5;", "d", "Lvt5;", "h", "()Lvt5;", "semanticsConfiguration", "mergeDescendants", "clearAndSetSemantics", "Lkotlin/Function1;", "Leu5;", "Lr37;", "properties", "Lsv2;", "inspectorInfo", "<init>", "(ZZLrc2;Lrc2;)V", "e", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xt5 */
/* compiled from: SemanticsModifier.kt */
public final class xt5 extends tv2 implements wt5 {

    /* renamed from: e */
    public static final C3644a f19976e = new C3644a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static AtomicInteger f19977g = new AtomicInteger(0);

    /* renamed from: d */
    public final vt5 f19978d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lxt5$a;", "", "", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xt5$a */
    /* compiled from: SemanticsModifier.kt */
    public static final class C3644a {
        public C3644a() {
        }

        public /* synthetic */ C3644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo27883a() {
            return xt5.f19977g.addAndGet(1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt5(boolean z, boolean z2, rc2 rc2, rc2<sv2, r37> rc22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, rc2, (i & 8) != 0 ? InspectableValueKt.m3087a() : rc22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xt5) && vx2.m53586b(mo27600h(), ((xt5) obj).mo27600h())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public vt5 mo27600h() {
        return this.f19978d;
    }

    public int hashCode() {
        return mo27600h().hashCode();
    }

    /* renamed from: k */
    public /* synthetic */ sw3 mo3193k(sw3 sw3) {
        return rw3.m26445a(this, sw3);
    }

    /* renamed from: l */
    public /* synthetic */ boolean mo3194l(rc2 rc2) {
        return tw3.m27950a(this, rc2);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo3195n(Object obj, fd2 fd2) {
        return tw3.m27951b(this, obj, fd2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xt5(boolean z, boolean z2, rc2<? super eu5, r37> rc2, rc2<? super sv2, r37> rc22) {
        super(rc22);
        vx2.m53591g(rc2, "properties");
        vx2.m53591g(rc22, "inspectorInfo");
        vt5 vt5 = new vt5();
        vt5.mo27314B(z);
        vt5.mo27313A(z2);
        rc2.invoke(vt5);
        this.f19978d = vt5;
    }
}
