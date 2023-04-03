package androidx.compose.runtime.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J%\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J/\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J9\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002Ja\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, mo44877d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Lln0;", "Lr37;", "g", "Lnn0;", "composer", "f", "", "block", "h", "c", "", "changed", "a", "p1", "b", "p2", "p3", "d", "p4", "p5", "p6", "p7", "e", "I", "getKey", "()I", "key", "", "Z", "tracked", "Ljava/lang/Object;", "_block", "Lo85;", "Lo85;", "scope", "", "k", "Ljava/util/List;", "scopes", "<init>", "(IZ)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ComposableLambda.jvm.kt */
public final class ComposableLambdaImpl implements ln0 {

    /* renamed from: a */
    public final int f1565a;

    /* renamed from: d */
    public final boolean f1566d;

    /* renamed from: e */
    public Object f1567e;

    /* renamed from: g */
    public o85 f1568g;

    /* renamed from: k */
    public List<o85> f1569k;

    public ComposableLambdaImpl(int i, boolean z) {
        this.f1565a = i;
        this.f1566d = z;
    }

    /* renamed from: a */
    public Object mo3131a(nn0 nn0, int i) {
        int i2;
        vx2.m53591g(nn0, "c");
        nn0 a = nn0.mo2929a(this.f1565a);
        mo3136f(a);
        if (a.mo2971p(this)) {
            i2 = mn0.m22400d(0);
        } else {
            i2 = mn0.m22402f(0);
        }
        int i3 = i | i2;
        Object obj = this.f1567e;
        vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((fd2) t07.m52027f(obj, 2)).invoke(a, Integer.valueOf(i3));
        nn5 c = a.mo2935c();
        if (c != null) {
            vx2.m53589e(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            c.mo3065a((fd2) t07.m52027f(this, 2));
        }
        return invoke;
    }

    /* renamed from: b */
    public Object mo3132b(Object obj, nn0 nn0, int i) {
        int i2;
        vx2.m53591g(nn0, "c");
        nn0 a = nn0.mo2929a(this.f1565a);
        mo3136f(a);
        if (a.mo2971p(this)) {
            i2 = mn0.m22400d(1);
        } else {
            i2 = mn0.m22402f(1);
        }
        Object obj2 = this.f1567e;
        vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((id2) t07.m52027f(obj2, 3)).invoke(obj, a, Integer.valueOf(i2 | i));
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new ComposableLambdaImpl$invoke$1(this, obj, i));
        }
        return invoke;
    }

    /* renamed from: c */
    public Object mo3133c(Object obj, Object obj2, nn0 nn0, int i) {
        int i2;
        vx2.m53591g(nn0, "c");
        nn0 a = nn0.mo2929a(this.f1565a);
        mo3136f(a);
        if (a.mo2971p(this)) {
            i2 = mn0.m22400d(2);
        } else {
            i2 = mn0.m22402f(2);
        }
        Object obj3 = this.f1567e;
        vx2.m53589e(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((kd2) t07.m52027f(obj3, 4)).invoke(obj, obj2, a, Integer.valueOf(i2 | i));
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new ComposableLambdaImpl$invoke$2(this, obj, obj2, i));
        }
        return invoke;
    }

    /* renamed from: d */
    public Object mo3134d(Object obj, Object obj2, Object obj3, nn0 nn0, int i) {
        int i2;
        vx2.m53591g(nn0, "c");
        nn0 a = nn0.mo2929a(this.f1565a);
        mo3136f(a);
        if (a.mo2971p(this)) {
            i2 = mn0.m22400d(3);
        } else {
            i2 = mn0.m22402f(3);
        }
        Object obj4 = this.f1567e;
        vx2.m53589e(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((md2) t07.m52027f(obj4, 5)).invoke(obj, obj2, obj3, a, Integer.valueOf(i2 | i));
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i));
        }
        return invoke;
    }

    /* renamed from: e */
    public Object mo3135e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, nn0 nn0, int i) {
        int i2;
        nn0 nn02 = nn0;
        vx2.m53591g(nn02, "c");
        nn0 a = nn02.mo2929a(this.f1565a);
        mo3136f(a);
        if (a.mo2971p(this)) {
            i2 = mn0.m22400d(7);
        } else {
            i2 = mn0.m22402f(7);
        }
        Object obj8 = this.f1567e;
        vx2.m53589e(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((rd2) t07.m52027f(obj8, 9)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, a, Integer.valueOf(i | i2));
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new ComposableLambdaImpl$invoke$7(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i));
        }
        return invoke;
    }

    /* renamed from: f */
    public final void mo3136f(nn0 nn0) {
        o85 h;
        if (this.f1566d && (h = nn0.mo2950h()) != null) {
            nn0.mo2961l(h);
            if (mn0.m22401e(this.f1568g, h)) {
                this.f1568g = h;
                return;
            }
            List<o85> list = this.f1569k;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f1569k = arrayList;
                arrayList.add(h);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mn0.m22401e(list.get(i), h)) {
                    list.set(i, h);
                    return;
                }
            }
            list.add(h);
        }
    }

    /* renamed from: g */
    public final void mo3137g() {
        if (this.f1566d) {
            o85 o85 = this.f1568g;
            if (o85 != null) {
                o85.invalidate();
                this.f1568g = null;
            }
            List<o85> list = this.f1569k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    /* renamed from: h */
    public final void mo3138h(Object obj) {
        boolean z;
        vx2.m53591g(obj, "block");
        if (!vx2.m53586b(this.f1567e, obj)) {
            if (this.f1567e == null) {
                z = true;
            } else {
                z = false;
            }
            this.f1567e = obj;
            if (!z) {
                mo3137g();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo3131a((nn0) obj, ((Number) obj2).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo3132b(obj, (nn0) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return mo3133c(obj, obj2, (nn0) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return mo3134d(obj, obj2, obj3, (nn0) obj4, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return mo3135e(obj, obj2, obj3, obj4, obj5, obj6, obj7, (nn0) obj8, ((Number) obj9).intValue());
    }
}
