package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.a56;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a1\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\b\u0010\u001d\u001a\u00020\u0006H\u0002\u001a-\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\bH\u0002\u001a \u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020%2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010%2\u0006\u0010,\u001a\u00020+H\u0002\u001a5\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\b2\u0006\u00101\u001a\u00028\u0000H\u0000¢\u0006\u0004\b2\u00103\u001a%\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b4\u0010.\u001a\u0018\u00105\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0001\u001a.\u0010:\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u0001092\u0006\u0010\"\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0002H\u0002\u001a\b\u0010;\u001a\u00020/H\u0002\u001a!\u0010<\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%2\u0006\u0010(\u001a\u00028\u0000H\u0001¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0000\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010F\" \u0010N\u001a\u00020\f8\u0000X\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010K\"\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010P\"\u0016\u0010S\u001a\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u00105\"\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010V\"2\u0010]\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0Z\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060Y0X8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"&\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0X8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010\\\"4\u0010f\u001a\"\u0012\f\u0012\n b*\u0004\u0018\u00010a0a0`j\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010a0a`c8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010e\" \u0010l\u001a\u00020\b8\u0000X\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010M\u001a\u0004\bi\u0010j¨\u0006m"}, mo44877d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "S", "handle", "Lr37;", "O", "La56;", "B", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "y", "parentObserver", "mergeReadObserver", "E", "writeObserver", "G", "T", "previousGlobalSnapshot", "block", "Q", "(La56;Lrc2;)Ljava/lang/Object;", "w", "(Lrc2;)Ljava/lang/Object;", "x", "R", "(Lrc2;)La56;", "snapshot", "W", "currentSnapshot", "candidateSnapshot", "U", "La96;", "data", "V", "r", "M", "(La96;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)La96;", "Lz86;", "state", "N", "(La96;Lz86;)La96;", "", "L", "candidate", "K", "(La96;Lz86;La56;La96;)La96;", "H", "I", "Ls04;", "applyingSnapshot", "invalidSnapshots", "", "J", "P", "A", "(La96;)La96;", "from", "until", "v", "a", "Lrc2;", "emptyLambda", "Ln56;", "b", "Ln56;", "threadSnapshot", "c", "Ljava/lang/Object;", "C", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", "d", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "e", "nextSnapshotId", "Lc56;", "f", "Lc56;", "pinningTable", "", "Lkotlin/Function2;", "", "g", "Ljava/util/List;", "applyObservers", "h", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "j", "La56;", "D", "()La56;", "getSnapshotInitializer$annotations", "snapshotInitializer", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class SnapshotKt {

    /* renamed from: a */
    public static final rc2<SnapshotIdSet, r37> f1582a = SnapshotKt$emptyLambda$1.INSTANCE;

    /* renamed from: b */
    public static final n56<a56> f1583b = new n56<>();

    /* renamed from: c */
    public static final Object f1584c = new Object();

    /* renamed from: d */
    public static SnapshotIdSet f1585d;

    /* renamed from: e */
    public static int f1586e;

    /* renamed from: f */
    public static final c56 f1587f = new c56();

    /* renamed from: g */
    public static final List<fd2<Set<? extends Object>, a56, r37>> f1588g = new ArrayList();

    /* renamed from: h */
    public static final List<rc2<Object, r37>> f1589h = new ArrayList();

    /* renamed from: i */
    public static final AtomicReference<GlobalSnapshot> f1590i;

    /* renamed from: j */
    public static final a56 f1591j;

    static {
        SnapshotIdSet.C0349a aVar = SnapshotIdSet.f1576k;
        f1585d = aVar.mo3167a();
        f1586e = 1;
        int i = f1586e;
        f1586e = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, aVar.mo3167a());
        f1585d = f1585d.mo3159A(globalSnapshot.mo43f());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f1590i = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        vx2.m53590f(globalSnapshot2, "currentGlobalSnapshot.get()");
        f1591j = globalSnapshot2;
    }

    /* renamed from: A */
    public static final <T extends a96> T m2217A(T t) {
        T M;
        vx2.m53591g(t, "r");
        a56.C0009a aVar = a56.f41e;
        a56 b = aVar.mo63b();
        T M2 = m2229M(t, b.mo43f(), b.mo44g());
        if (M2 != null) {
            return M2;
        }
        synchronized (m2219C()) {
            a56 b2 = aVar.mo63b();
            M = m2229M(t, b2.mo43f(), b2.mo44g());
        }
        if (M != null) {
            return M;
        }
        m2228L();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public static final a56 m2218B() {
        a56 a = f1583b.mo23520a();
        if (a != null) {
            return a;
        }
        GlobalSnapshot globalSnapshot = f1590i.get();
        vx2.m53590f(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    /* renamed from: C */
    public static final Object m2219C() {
        return f1584c;
    }

    /* renamed from: D */
    public static final a56 m2220D() {
        return f1591j;
    }

    /* renamed from: E */
    public static final rc2<Object, r37> m2221E(rc2<Object, r37> rc2, rc2<Object, r37> rc22, boolean z) {
        if (!z) {
            rc22 = null;
        }
        if (rc2 != null && rc22 != null && !vx2.m53586b(rc2, rc22)) {
            return new SnapshotKt$mergedReadObserver$1(rc2, rc22);
        }
        if (rc2 == null) {
            return rc22;
        }
        return rc2;
    }

    /* renamed from: F */
    public static /* synthetic */ rc2 m2222F(rc2 rc2, rc2 rc22, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m2221E(rc2, rc22, z);
    }

    /* renamed from: G */
    public static final rc2<Object, r37> m2223G(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        if (rc2 != null && rc22 != null && !vx2.m53586b(rc2, rc22)) {
            return new SnapshotKt$mergedWriteObserver$1(rc2, rc22);
        }
        if (rc2 == null) {
            return rc22;
        }
        return rc2;
    }

    /* renamed from: H */
    public static final <T extends a96> T m2224H(T t, z86 z86) {
        vx2.m53591g(t, "<this>");
        vx2.m53591g(z86, "state");
        T T = m2236T(z86);
        if (T != null) {
            T.mo132e(Integer.MAX_VALUE);
            return T;
        }
        T a = t.mo128a();
        a.mo132e(Integer.MAX_VALUE);
        a.mo131d(z86.mo19691e());
        vx2.m53589e(a, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecord$lambda-8");
        z86.mo19690d(a);
        vx2.m53589e(a, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecord");
        return a;
    }

    /* renamed from: I */
    public static final void m2225I(a56 a56, z86 z86) {
        vx2.m53591g(a56, "snapshot");
        vx2.m53591g(z86, "state");
        rc2<Object, r37> j = a56.mo47j();
        if (j != null) {
            j.invoke(z86);
        }
    }

    /* renamed from: J */
    public static final Map<a96, a96> m2226J(s04 s04, s04 s042, SnapshotIdSet snapshotIdSet) {
        a96 M;
        Set<z86> C = s042.mo19001C();
        int f = s04.mo43f();
        if (C == null) {
            return null;
        }
        SnapshotIdSet w = s042.mo44g().mo3159A(s042.mo43f()).mo3166w(s042.mo25590D());
        HashMap hashMap = null;
        for (z86 next : C) {
            a96 e = next.mo19691e();
            a96 M2 = m2229M(e, f, snapshotIdSet);
            if (!(M2 == null || (M = m2229M(e, f, w)) == null || vx2.m53586b(M2, M))) {
                a96 M3 = m2229M(e, s042.mo43f(), s042.mo44g());
                if (M3 != null) {
                    a96 f2 = next.mo19692f(M, M2, M3);
                    if (f2 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(M2, f2);
                    hashMap = hashMap;
                } else {
                    m2228L();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: K */
    public static final <T extends a96> T m2227K(T t, z86 z86, a56 a56, T t2) {
        vx2.m53591g(t, "<this>");
        vx2.m53591g(z86, "state");
        vx2.m53591g(a56, "snapshot");
        vx2.m53591g(t2, "candidate");
        if (a56.mo46i()) {
            a56.mo52o(z86);
        }
        int f = a56.mo43f();
        if (t2.mo130c() == f) {
            return t2;
        }
        T H = m2224H(t, z86);
        H.mo132e(f);
        a56.mo52o(z86);
        return H;
    }

    /* renamed from: L */
    public static final Void m2228L() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: M */
    public static final <T extends a96> T m2229M(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (m2238V(t, i, snapshotIdSet) && (t2 == null || t2.mo130c() < t.mo130c())) {
                t2 = t;
            }
            t = t.mo129b();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    /* renamed from: N */
    public static final <T extends a96> T m2230N(T t, z86 z86) {
        T M;
        vx2.m53591g(t, "<this>");
        vx2.m53591g(z86, "state");
        a56.C0009a aVar = a56.f41e;
        a56 b = aVar.mo63b();
        rc2<Object, r37> h = b.mo45h();
        if (h != null) {
            h.invoke(z86);
        }
        T M2 = m2229M(t, b.mo43f(), b.mo44g());
        if (M2 != null) {
            return M2;
        }
        synchronized (m2219C()) {
            a56 b2 = aVar.mo63b();
            M = m2229M(t, b2.mo43f(), b2.mo44g());
        }
        if (M != null) {
            return M;
        }
        m2228L();
        throw new KotlinNothingValueException();
    }

    /* renamed from: O */
    public static final void m2231O(int i) {
        f1587f.mo11982f(i);
    }

    /* renamed from: P */
    public static final Void m2232P() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* renamed from: Q */
    public static final <T> T m2233Q(a56 a56, rc2<? super SnapshotIdSet, ? extends T> rc2) {
        T invoke = rc2.invoke(f1585d.mo3162s(a56.mo43f()));
        synchronized (m2219C()) {
            int i = f1586e;
            f1586e = i + 1;
            f1585d = f1585d.mo3162s(a56.mo43f());
            f1590i.set(new GlobalSnapshot(i, f1585d));
            a56.mo41d();
            f1585d = f1585d.mo3159A(i);
            r37 r37 = r37.f33317a;
        }
        return invoke;
    }

    /* renamed from: R */
    public static final <T extends a56> T m2234R(rc2<? super SnapshotIdSet, ? extends T> rc2) {
        return (a56) m2262w(new SnapshotKt$takeNewSnapshot$1(rc2));
    }

    /* renamed from: S */
    public static final int m2235S(int i, SnapshotIdSet snapshotIdSet) {
        int a;
        vx2.m53591g(snapshotIdSet, "invalid");
        int u = snapshotIdSet.mo3165u(i);
        synchronized (m2219C()) {
            a = f1587f.mo11977a(u);
        }
        return a;
    }

    /* renamed from: T */
    public static final a96 m2236T(z86 z86) {
        int e = f1587f.mo11981e(f1586e) - 1;
        SnapshotIdSet a = SnapshotIdSet.f1576k.mo3167a();
        a96 a96 = null;
        for (a96 e2 = z86.mo19691e(); e2 != null; e2 = e2.mo129b()) {
            if (e2.mo130c() == 0) {
                return e2;
            }
            if (m2238V(e2, e, a)) {
                if (a96 == null) {
                    a96 = e2;
                } else if (e2.mo130c() < a96.mo130c()) {
                    return e2;
                } else {
                    return a96;
                }
            }
        }
        return null;
    }

    /* renamed from: U */
    public static final boolean m2237U(int i, int i2, SnapshotIdSet snapshotIdSet) {
        if (i2 == 0 || i2 > i || snapshotIdSet.mo3163t(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public static final boolean m2238V(a96 a96, int i, SnapshotIdSet snapshotIdSet) {
        return m2237U(i, a96.mo130c(), snapshotIdSet);
    }

    /* renamed from: W */
    public static final void m2239W(a56 a56) {
        if (!f1585d.mo3163t(a56.mo43f())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* renamed from: v */
    public static final SnapshotIdSet m2261v(SnapshotIdSet snapshotIdSet, int i, int i2) {
        vx2.m53591g(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.mo3159A(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* renamed from: w */
    public static final <T> T m2262w(rc2<? super SnapshotIdSet, ? extends T> rc2) {
        GlobalSnapshot globalSnapshot;
        T Q;
        List<T> M0;
        a56 a56 = f1591j;
        vx2.m53589e(a56, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) a56;
        synchronized (m2219C()) {
            globalSnapshot = f1590i.get();
            vx2.m53590f(globalSnapshot, "currentGlobalSnapshot.get()");
            Q = m2233Q(globalSnapshot, rc2);
        }
        Set<z86> C = globalSnapshot.mo19001C();
        if (C != null) {
            synchronized (m2219C()) {
                M0 = CollectionsKt___CollectionsKt.m47313M0(f1588g);
            }
            int size = M0.size();
            for (int i = 0; i < size; i++) {
                ((fd2) M0.get(i)).invoke(C, globalSnapshot);
            }
        }
        return Q;
    }

    /* renamed from: x */
    public static final void m2263x() {
        m2262w(SnapshotKt$advanceGlobalSnapshot$2.INSTANCE);
    }

    /* renamed from: y */
    public static final a56 m2264y(a56 a56, rc2<Object, r37> rc2, boolean z) {
        s04 s04;
        boolean z2 = a56 instanceof s04;
        if (!z2 && a56 != null) {
            return new ex6(a56, rc2, false, z);
        }
        if (z2) {
            s04 = (s04) a56;
        } else {
            s04 = null;
        }
        return new dx6(s04, rc2, (rc2<Object, r37>) null, false, z);
    }

    /* renamed from: z */
    public static /* synthetic */ a56 m2265z(a56 a56, rc2 rc2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            rc2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m2264y(a56, rc2, z);
    }
}
