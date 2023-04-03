package androidx.compose.runtime.snapshots;

import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001-B!\u0012\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b+\u0010,JA\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u0004J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006."}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "T", "scope", "Lkotlin/Function1;", "Lr37;", "onValueChangedForScope", "Lkotlin/Function0;", "block", "i", "(Ljava/lang/Object;Lrc2;Lpc2;)V", "", "predicate", "g", "j", "k", "f", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "h", "a", "Lrc2;", "onChangedExecutor", "Lkotlin/Function2;", "", "La56;", "b", "Lfd2;", "applyObserver", "c", "readObserver", "Lv04;", "d", "Lv04;", "observedScopeMaps", "Lqf4;", "e", "Lqf4;", "applyUnsubscribe", "Z", "isPaused", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMap", "<init>", "(Lrc2;)V", "ObservedScopeMap", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SnapshotStateObserver.kt */
public final class SnapshotStateObserver {

    /* renamed from: a */
    public final rc2<pc2<r37>, r37> f1592a;

    /* renamed from: b */
    public final fd2<Set<? extends Object>, a56, r37> f1593b = new SnapshotStateObserver$applyObserver$1(this);

    /* renamed from: c */
    public final rc2<Object, r37> f1594c = new SnapshotStateObserver$readObserver$1(this);

    /* renamed from: d */
    public final v04<ObservedScopeMap> f1595d = new v04<>(new ObservedScopeMap[16], 0);

    /* renamed from: e */
    public qf4 f1596e;

    /* renamed from: f */
    public boolean f1597f;

    /* renamed from: g */
    public ObservedScopeMap f1598g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u001a\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\t\u001a\u00020\u0003J\u0014\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nJ\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R'\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b/\u0010\u0014R'\u00103\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0014R\u0016\u00105\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001fR\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R<\u0010;\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u000306\u0012\u0006\u0012\u0004\u0018\u00010\u000108j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000306\u0012\u0006\u0012\u0004\u0018\u00010\u0001`98\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:¨\u0006>"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "value", "Lr37;", "r", "Lkotlin/Function1;", "", "predicate", "t", "k", "", "changes", "q", "p", "scope", "l", "s", "a", "Lrc2;", "o", "()Lrc2;", "onChanged", "b", "Ljava/lang/Object;", "currentScope", "Ldq2;", "c", "Ldq2;", "currentScopeReads", "", "d", "I", "currentToken", "Lgq2;", "e", "Lgq2;", "valueToScopes", "Leq2;", "f", "Leq2;", "scopeToValues", "Lfq2;", "g", "Lfq2;", "invalidated", "Lr86;", "h", "m", "derivedStateEnterObserver", "i", "n", "derivedStateExitObserver", "j", "deriveStateScopeCount", "Lqc1;", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "<init>", "(Lrc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SnapshotStateObserver.kt */
    public static final class ObservedScopeMap {

        /* renamed from: a */
        public final rc2<Object, r37> f1599a;

        /* renamed from: b */
        public Object f1600b;

        /* renamed from: c */
        public dq2 f1601c;

        /* renamed from: d */
        public int f1602d = -1;

        /* renamed from: e */
        public final gq2<Object> f1603e = new gq2<>();

        /* renamed from: f */
        public final eq2<Object, dq2> f1604f = new eq2<>(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: g */
        public final fq2<Object> f1605g = new fq2<>();

        /* renamed from: h */
        public final rc2<r86<?>, r37> f1606h = new C0350x6befda94(this);

        /* renamed from: i */
        public final rc2<r86<?>, r37> f1607i = new C0351xa5f2bac8(this);

        /* renamed from: j */
        public int f1608j;

        /* renamed from: k */
        public final gq2<qc1<?>> f1609k = new gq2<>();

        /* renamed from: l */
        public final HashMap<qc1<?>, Object> f1610l = new HashMap<>();

        public ObservedScopeMap(rc2<Object, r37> rc2) {
            vx2.m53591g(rc2, "onChanged");
            this.f1599a = rc2;
        }

        /* renamed from: k */
        public final void mo3178k() {
            this.f1603e.mo20797d();
            this.f1604f.mo19455a();
            this.f1609k.mo20797d();
            this.f1610l.clear();
        }

        /* renamed from: l */
        public final void mo3179l(Object obj) {
            boolean z;
            dq2 dq2 = this.f1601c;
            if (dq2 != null) {
                int e = dq2.mo18880e();
                int i = 0;
                for (int i2 = 0; i2 < e; i2++) {
                    Object obj2 = dq2.mo18879d()[i2];
                    vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i3 = dq2.mo18881f()[i2];
                    if (i3 != this.f1602d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        mo3186s(obj, obj2);
                    }
                    if (!z) {
                        if (i != i2) {
                            dq2.mo18879d()[i] = obj2;
                            dq2.mo18881f()[i] = i3;
                        }
                        i++;
                    }
                }
                int e2 = dq2.mo18880e();
                for (int i4 = i; i4 < e2; i4++) {
                    dq2.mo18879d()[i4] = null;
                }
                dq2.mo18882g(i);
            }
        }

        /* renamed from: m */
        public final rc2<r86<?>, r37> mo3180m() {
            return this.f1606h;
        }

        /* renamed from: n */
        public final rc2<r86<?>, r37> mo3181n() {
            return this.f1607i;
        }

        /* renamed from: o */
        public final rc2<Object, r37> mo3182o() {
            return this.f1599a;
        }

        /* renamed from: p */
        public final void mo3183p() {
            fq2<Object> fq2 = this.f1605g;
            rc2<Object, r37> rc2 = this.f1599a;
            int size = fq2.size();
            for (int i = 0; i < size; i++) {
                rc2.invoke(fq2.get(i));
            }
            this.f1605g.clear();
        }

        /* renamed from: q */
        public final boolean mo3184q(Set<? extends Object> set) {
            gq2<qc1<?>> gq2;
            int a;
            gq2<Object> gq22;
            int a2;
            vx2.m53591g(set, "changes");
            boolean z = false;
            for (Object next : set) {
                if (this.f1609k.mo20798e(next) && (a = gq2.mo20799f(next)) >= 0) {
                    fq2 b = (gq2 = this.f1609k).mo20808o(a);
                    int size = b.size();
                    for (int i = 0; i < size; i++) {
                        qc1 qc1 = (qc1) b.get(i);
                        vx2.m53589e(qc1, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj = this.f1610l.get(qc1);
                        h56 a3 = qc1.mo25070a();
                        if (a3 == null) {
                            a3 = i56.m19417f();
                        }
                        if (!a3.mo11485b(qc1.mo25071c(), obj) && (a2 = gq22.mo20799f(qc1)) >= 0) {
                            fq2 b2 = (gq22 = this.f1603e).mo20808o(a2);
                            int size2 = b2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                this.f1605g.add(b2.get(i2));
                                i2++;
                                z = true;
                            }
                        }
                    }
                }
                gq2<Object> gq23 = this.f1603e;
                int a4 = gq23.mo20799f(next);
                if (a4 >= 0) {
                    fq2 b3 = gq23.mo20808o(a4);
                    int size3 = b3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        this.f1605g.add(b3.get(i3));
                        i3++;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: r */
        public final void mo3185r(Object obj) {
            vx2.m53591g(obj, "value");
            if (this.f1608j <= 0) {
                Object obj2 = this.f1600b;
                vx2.m53588d(obj2);
                dq2 dq2 = this.f1601c;
                if (dq2 == null) {
                    dq2 = new dq2();
                    this.f1601c = dq2;
                    this.f1604f.mo19465k(obj2, dq2);
                }
                int a = dq2.mo18876a(obj, this.f1602d);
                if ((obj instanceof qc1) && a != this.f1602d) {
                    qc1 qc1 = (qc1) obj;
                    for (Object obj3 : qc1.mo25072g()) {
                        if (obj3 == null) {
                            break;
                        }
                        this.f1609k.mo20796c(obj3, obj);
                    }
                    this.f1610l.put(obj, qc1.mo25071c());
                }
                if (a == -1) {
                    this.f1603e.mo20796c(obj, obj2);
                }
            }
        }

        /* renamed from: s */
        public final void mo3186s(Object obj, Object obj2) {
            this.f1603e.mo20806m(obj2, obj);
            if ((obj2 instanceof qc1) && !this.f1603e.mo20798e(obj2)) {
                this.f1609k.mo20807n(obj2);
                this.f1610l.remove(obj2);
            }
        }

        /* renamed from: t */
        public final void mo3187t(rc2<Object, Boolean> rc2) {
            vx2.m53591g(rc2, "predicate");
            eq2<Object, dq2> eq2 = this.f1604f;
            int g = eq2.mo19461g();
            int i = 0;
            for (int i2 = 0; i2 < g; i2++) {
                Object obj = eq2.mo19460f()[i2];
                vx2.m53589e(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                dq2 dq2 = (dq2) eq2.mo19462h()[i2];
                Boolean invoke = rc2.invoke(obj);
                if (invoke.booleanValue()) {
                    int e = dq2.mo18880e();
                    for (int i3 = 0; i3 < e; i3++) {
                        Object obj2 = dq2.mo18879d()[i3];
                        vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = dq2.mo18881f()[i3];
                        mo3186s(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i != i2) {
                        eq2.mo19460f()[i] = obj;
                        eq2.mo19462h()[i] = eq2.mo19462h()[i2];
                    }
                    i++;
                }
            }
            if (eq2.mo19461g() > i) {
                int g2 = eq2.mo19461g();
                for (int i5 = i; i5 < g2; i5++) {
                    eq2.mo19460f()[i5] = null;
                    eq2.mo19462h()[i5] = null;
                }
                eq2.mo19466l(i);
            }
        }
    }

    public SnapshotStateObserver(rc2<? super pc2<r37>, r37> rc2) {
        vx2.m53591g(rc2, "onChangedExecutor");
        this.f1592a = rc2;
    }

    /* renamed from: f */
    public final void mo3172f() {
        synchronized (this.f1595d) {
            v04 b = this.f1595d;
            int n = b.mo26963n();
            if (n > 0) {
                int i = 0;
                Object[] m = b.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((ObservedScopeMap) m[i]).mo3178k();
                    i++;
                } while (i < n);
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: g */
    public final void mo3173g(rc2<Object, Boolean> rc2) {
        vx2.m53591g(rc2, "predicate");
        synchronized (this.f1595d) {
            v04 b = this.f1595d;
            int n = b.mo26963n();
            if (n > 0) {
                int i = 0;
                Object[] m = b.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((ObservedScopeMap) m[i]).mo3187t(rc2);
                    i++;
                } while (i < n);
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap mo3174h(p000.rc2<? super T, p000.r37> r8) {
        /*
            r7 = this;
            v04<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r0 = r7.f1595d
            int r1 = r0.mo26963n()
            r2 = 1
            if (r1 <= 0) goto L_0x0029
            java.lang.Object[] r0 = r0.mo26962m()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r0, r3)
            r3 = 0
            r4 = r3
        L_0x0014:
            r5 = r0[r4]
            r6 = r5
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r6 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r6
            rc2 r6 = r6.mo3182o()
            if (r6 != r8) goto L_0x0021
            r6 = r2
            goto L_0x0022
        L_0x0021:
            r6 = r3
        L_0x0022:
            if (r6 == 0) goto L_0x0025
            goto L_0x002a
        L_0x0025:
            int r4 = r4 + 1
            if (r4 < r1) goto L_0x0014
        L_0x0029:
            r5 = 0
        L_0x002a:
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r5 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r5
            if (r5 != 0) goto L_0x0044
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r0 = new androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            p000.vx2.m53589e(r8, r1)
            java.lang.Object r8 = p000.t07.m52027f(r8, r2)
            rc2 r8 = (p000.rc2) r8
            r0.<init>(r8)
            v04<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r8 = r7.f1595d
            r8.mo26953c(r0)
            return r0
        L_0x0044:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.mo3174h(rc2):androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap");
    }

    /* renamed from: i */
    public final <T> void mo3175i(T t, rc2<? super T, r37> rc2, pc2<r37> pc2) {
        ObservedScopeMap h;
        vx2.m53591g(t, "scope");
        vx2.m53591g(rc2, "onValueChangedForScope");
        vx2.m53591g(pc2, "block");
        synchronized (this.f1595d) {
            h = mo3174h(rc2);
        }
        boolean z = this.f1597f;
        ObservedScopeMap observedScopeMap = this.f1598g;
        try {
            this.f1597f = false;
            this.f1598g = h;
            Object b = h.f1600b;
            dq2 c = h.f1601c;
            int d = h.f1602d;
            h.f1600b = t;
            h.f1601c = (dq2) h.f1604f.mo19459e(t);
            if (h.f1602d == -1) {
                h.f1602d = SnapshotKt.m2218B().mo43f();
            }
            i56.m19415d(h.mo3180m(), h.mo3181n(), new SnapshotStateObserver$observeReads$1$1(this, pc2));
            Object b2 = h.f1600b;
            vx2.m53588d(b2);
            h.mo3179l(b2);
            h.f1600b = b;
            h.f1601c = c;
            h.f1602d = d;
        } finally {
            this.f1598g = observedScopeMap;
            this.f1597f = z;
        }
    }

    /* renamed from: j */
    public final void mo3176j() {
        this.f1596e = a56.f41e.mo66e(this.f1593b);
    }

    /* renamed from: k */
    public final void mo3177k() {
        qf4 qf4 = this.f1596e;
        if (qf4 != null) {
            qf4.dispose();
        }
    }
}
