package com.squareup.sqldelight;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0004H\u0004J$\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0016J7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lcom/squareup/sqldelight/a;", "Lnt6;", "", "identifier", "Lkotlin/Function0;", "", "Lrz4;", "queryList", "Lr37;", "f0", "", "noEnclosing", "Lkotlin/Function1;", "Lcu6;", "body", "m", "R", "Lcom/squareup/sqldelight/b;", "wrapperBody", "g0", "(ZLrc2;)Ljava/lang/Object;", "Lm76;", "c", "Lm76;", "driver", "<init>", "(Lm76;)V", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: com.squareup.sqldelight.a */
/* compiled from: Transacter.kt */
public abstract class C5463a implements nt6 {

    /* renamed from: c */
    public final m76 f26946c;

    public C5463a(m76 m76) {
        vx2.m53591g(m76, "driver");
        this.f26946c = m76;
    }

    /* renamed from: f0 */
    public final void mo39604f0(int i, pc2<? extends List<? extends rz4<?>>> pc2) {
        vx2.m53591g(pc2, "queryList");
        nt6.C6292b H0 = this.f26946c.mo39617H0();
        if (H0 == null) {
            for (rz4 f : (Iterable) pc2.invoke()) {
                f.mo47570f();
            }
        } else if (!H0.mo46214l().containsKey(Integer.valueOf(i))) {
            H0.mo46214l().put(Integer.valueOf(i), pc2);
        }
    }

    /* renamed from: g0 */
    public final <R> R mo39605g0(boolean z, rc2<? super C5467b<R>, ? extends R> rc2) {
        boolean z2;
        nt6.C6292b v0 = this.f26946c.mo39623v0();
        nt6.C6292b e = v0.mo46209e();
        boolean z3 = false;
        if (e == null || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                v0.mo46218p(this);
                R invoke = rc2.invoke(new C5467b(v0));
                v0.mo46217o(true);
                v0.mo46210g();
                if (e != null) {
                    if (v0.mo46215m() && v0.mo46211h()) {
                        z3 = true;
                    }
                    e.mo46216n(z3);
                    e.mo46212j().addAll(v0.mo46212j());
                    e.mo46213k().addAll(v0.mo46213k());
                    e.mo46214l().putAll(v0.mo46214l());
                } else if (!v0.mo46215m() || !v0.mo46211h()) {
                    for (pc2 invoke2 : v0.mo46213k()) {
                        invoke2.invoke();
                    }
                    v0.mo46213k().clear();
                } else {
                    Map<Integer, pc2<List<rz4<?>>>> l = v0.mo46214l();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<Integer, pc2<List<rz4<?>>>> value : l.entrySet()) {
                        hk0.m45275z(arrayList, (List) ((pc2) value.getValue()).invoke());
                    }
                    for (rz4 f : CollectionsKt___CollectionsKt.m47322S(arrayList)) {
                        f.mo47570f();
                    }
                    v0.mo46214l().clear();
                    for (pc2 invoke3 : v0.mo46212j()) {
                        invoke3.invoke();
                    }
                    v0.mo46212j().clear();
                }
                return invoke;
            } catch (Throwable th) {
                throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th + "\nwith cause " + th.getCause() + "\n\nRollback exception: " + th, th);
            }
        } else {
            throw new IllegalStateException("Already in a transaction".toString());
        }
    }

    /* renamed from: m */
    public void mo39606m(boolean z, rc2<? super cu6, r37> rc2) {
        vx2.m53591g(rc2, "body");
        mo39605g0(z, rc2);
    }
}
