package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\b\u001a\u00020\u00072.\u0010\u0006\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00040\u0004H\u0001J#\u0010\u000b\u001a\u00020\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lt52;", "Lkg3;", "Lvy4;", "Lkg3$a;", "Lnc6;", "kotlin.jvm.PlatformType", "p0", "Lr37;", "a", "", "others", "c", "([Lkg3;)Lkg3;", "Lg52;", "Lg52;", "flowable", "Lnm5;", "d", "Lnm5;", "scheduler", "<init>", "(Lg52;Lnm5;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: t52 */
/* compiled from: FlowableLifecycle.kt */
public final class t52 implements kg3, vy4<kg3.C6147a> {

    /* renamed from: a */
    public final g52<kg3.C6147a> f34114a;

    /* renamed from: d */
    public final nm5 f34115d;

    public t52(g52<kg3.C6147a> g52, nm5 nm5) {
        vx2.m53591g(g52, "flowable");
        vx2.m53591g(nm5, "scheduler");
        this.f34114a = g52;
        this.f34115d = nm5;
    }

    /* renamed from: d */
    public static final List m52079d(Object[] objArr) {
        vx2.m53591g(objArr, "it");
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            lq6 lq6 = objArr[i];
            if (lq6 != null) {
                arrayList.add(lq6);
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type io.reactivex.schedulers.Timed<com.tinder.scarlet.Lifecycle.State>");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo40232a(nc6<? super kg3.C6147a> nc6) {
        this.f34114a.mo40232a(nc6);
    }

    /* renamed from: c */
    public kg3 mo47992c(kg3... kg3Arr) {
        vx2.m53591g(kg3Arr, "others");
        List<kg3> w0 = CollectionsKt___CollectionsKt.m47352w0(bk0.m32598e(this), kg3Arr);
        ArrayList arrayList = new ArrayList(dk0.m43495u(w0, 10));
        for (kg3 C : w0) {
            arrayList.add(g52.m44525C(C).mo42764P(this.f34115d));
        }
        g52 D = g52.m44528e(arrayList, new r52()).mo42753D(new s52());
        vx2.m53590f(D, "flowable");
        return new t52(D, this.f34115d);
    }
}
