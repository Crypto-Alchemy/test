package p000;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 +2\u00020\u0001:\u0001\u001cB\u0019\b\u0004\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0011J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H ¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0010@\u0010X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188\u0016@PX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u00102\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00104\u0001\u00049:;<¨\u0006="}, mo44877d2 = {"La56;", "", "Lr37;", "d", "Lkotlin/Function1;", "readObserver", "v", "k", "snapshot", "r", "l", "(La56;)V", "m", "Lz86;", "state", "o", "(Lz86;)V", "n", "()V", "b", "c", "q", "x", "p", "", "w", "()I", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "a", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "g", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "u", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "<set-?>", "I", "f", "t", "(I)V", "id", "", "Z", "e", "()Z", "s", "(Z)V", "disposed", "pinningTrackingHandle", "i", "readOnly", "h", "()Lrc2;", "j", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Ls04;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Ls75;", "Lex6;", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: a56 */
/* compiled from: Snapshot.kt */
public abstract class a56 {

    /* renamed from: e */
    public static final C0009a f41e = new C0009a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f42f = 8;

    /* renamed from: a */
    public SnapshotIdSet f43a;

    /* renamed from: b */
    public int f44b;

    /* renamed from: c */
    public boolean f45c;

    /* renamed from: d */
    public int f46d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002JQ\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0001J&\u0010\u0013\u001a\u00020\u00122\u001e\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u000fJ\u001a\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"La56$a;", "", "Lkotlin/Function1;", "Lr37;", "readObserver", "writeObserver", "Ls04;", "h", "T", "Lkotlin/Function0;", "block", "d", "(Lrc2;Lrc2;Lpc2;)Ljava/lang/Object;", "La56;", "a", "Lkotlin/Function2;", "", "observer", "Lqf4;", "e", "f", "c", "g", "b", "()La56;", "current", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a56$a */
    /* compiled from: Snapshot.kt */
    public static final class C0009a {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: a56$a$a */
        /* compiled from: Snapshot.kt */
        public static final class C0010a implements qf4 {

            /* renamed from: a */
            public final /* synthetic */ fd2<Set<? extends Object>, a56, r37> f47a;

            public C0010a(fd2<? super Set<? extends Object>, ? super a56, r37> fd2) {
                this.f47a = fd2;
            }

            public final void dispose() {
                fd2<Set<? extends Object>, a56, r37> fd2 = this.f47a;
                synchronized (SnapshotKt.m2219C()) {
                    SnapshotKt.f1588g.remove(fd2);
                    r37 r37 = r37.f33317a;
                }
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: a56$a$b */
        /* compiled from: Snapshot.kt */
        public static final class C0011b implements qf4 {

            /* renamed from: a */
            public final /* synthetic */ rc2<Object, r37> f48a;

            public C0011b(rc2<Object, r37> rc2) {
                this.f48a = rc2;
            }

            public final void dispose() {
                rc2<Object, r37> rc2 = this.f48a;
                synchronized (SnapshotKt.m2219C()) {
                    SnapshotKt.f1589h.remove(rc2);
                }
                SnapshotKt.m2263x();
            }
        }

        public C0009a() {
        }

        public /* synthetic */ C0009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final a56 mo62a() {
            return SnapshotKt.m2265z((a56) SnapshotKt.f1583b.mo23520a(), (rc2) null, false, 6, (Object) null);
        }

        /* renamed from: b */
        public final a56 mo63b() {
            return SnapshotKt.m2218B();
        }

        /* renamed from: c */
        public final void mo64c() {
            SnapshotKt.m2218B().mo51n();
        }

        /* renamed from: d */
        public final <T> T mo65d(rc2<Object, r37> rc2, rc2<Object, r37> rc22, pc2<? extends T> pc2) {
            a56 a56;
            a56 k;
            s04 s04;
            vx2.m53591g(pc2, "block");
            if (rc2 == null && rc22 == null) {
                return pc2.invoke();
            }
            a56 a562 = (a56) SnapshotKt.f1583b.mo23520a();
            if (a562 == null || (a562 instanceof s04)) {
                if (a562 instanceof s04) {
                    s04 = (s04) a562;
                } else {
                    s04 = null;
                }
                a56 = new dx6(s04, rc2, rc22, true, false);
            } else if (rc2 == null) {
                return pc2.invoke();
            } else {
                a56 = a562.mo59v(rc2);
            }
            try {
                k = a56.mo48k();
                T invoke = pc2.invoke();
                a56.mo55r(k);
                a56.mo41d();
                return invoke;
            } catch (Throwable th) {
                a56.mo41d();
                throw th;
            }
        }

        /* renamed from: e */
        public final qf4 mo66e(fd2<? super Set<? extends Object>, ? super a56, r37> fd2) {
            vx2.m53591g(fd2, "observer");
            Object unused = SnapshotKt.m2262w(SnapshotKt.f1582a);
            synchronized (SnapshotKt.m2219C()) {
                SnapshotKt.f1588g.add(fd2);
            }
            return new C0010a(fd2);
        }

        /* renamed from: f */
        public final qf4 mo67f(rc2<Object, r37> rc2) {
            vx2.m53591g(rc2, "observer");
            synchronized (SnapshotKt.m2219C()) {
                SnapshotKt.f1589h.add(rc2);
            }
            SnapshotKt.m2263x();
            return new C0011b(rc2);
        }

        /* renamed from: g */
        public final void mo68g() {
            boolean z;
            synchronized (SnapshotKt.m2219C()) {
                Set<z86> C = ((GlobalSnapshot) SnapshotKt.f1590i.get()).mo19001C();
                z = false;
                if (C != null && (!C.isEmpty())) {
                    z = true;
                }
            }
            if (z) {
                SnapshotKt.m2263x();
            }
        }

        /* renamed from: h */
        public final s04 mo69h(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
            s04 s04;
            s04 N;
            a56 B = SnapshotKt.m2218B();
            if (B instanceof s04) {
                s04 = (s04) B;
            } else {
                s04 = null;
            }
            if (s04 != null && (N = s04.mo3150N(rc2, rc22)) != null) {
                return N;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }

    public a56(int i, SnapshotIdSet snapshotIdSet) {
        this.f43a = snapshotIdSet;
        this.f44b = i;
        this.f46d = i != 0 ? SnapshotKt.m2235S(i, mo44g()) : -1;
    }

    public /* synthetic */ a56(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    /* renamed from: b */
    public final void mo39b() {
        synchronized (SnapshotKt.m2219C()) {
            mo40c();
            mo54q();
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: c */
    public void mo40c() {
        SnapshotKt.f1585d = SnapshotKt.f1585d.mo3162s(mo43f());
    }

    /* renamed from: d */
    public void mo41d() {
        this.f45c = true;
        synchronized (SnapshotKt.m2219C()) {
            mo53p();
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: e */
    public final boolean mo42e() {
        return this.f45c;
    }

    /* renamed from: f */
    public int mo43f() {
        return this.f44b;
    }

    /* renamed from: g */
    public SnapshotIdSet mo44g() {
        return this.f43a;
    }

    /* renamed from: h */
    public abstract rc2<Object, r37> mo45h();

    /* renamed from: i */
    public abstract boolean mo46i();

    /* renamed from: j */
    public abstract rc2<Object, r37> mo47j();

    /* renamed from: k */
    public a56 mo48k() {
        a56 a56 = (a56) SnapshotKt.f1583b.mo23520a();
        SnapshotKt.f1583b.mo23521b(this);
        return a56;
    }

    /* renamed from: l */
    public abstract void mo49l(a56 a56);

    /* renamed from: m */
    public abstract void mo50m(a56 a56);

    /* renamed from: n */
    public abstract void mo51n();

    /* renamed from: o */
    public abstract void mo52o(z86 z86);

    /* renamed from: p */
    public final void mo53p() {
        int i = this.f46d;
        if (i >= 0) {
            SnapshotKt.m2231O(i);
            this.f46d = -1;
        }
    }

    /* renamed from: q */
    public void mo54q() {
        mo53p();
    }

    /* renamed from: r */
    public void mo55r(a56 a56) {
        SnapshotKt.f1583b.mo23521b(a56);
    }

    /* renamed from: s */
    public final void mo56s(boolean z) {
        this.f45c = z;
    }

    /* renamed from: t */
    public void mo57t(int i) {
        this.f44b = i;
    }

    /* renamed from: u */
    public void mo58u(SnapshotIdSet snapshotIdSet) {
        vx2.m53591g(snapshotIdSet, "<set-?>");
        this.f43a = snapshotIdSet;
    }

    /* renamed from: v */
    public abstract a56 mo59v(rc2<Object, r37> rc2);

    /* renamed from: w */
    public final int mo60w() {
        int i = this.f46d;
        this.f46d = -1;
        return i;
    }

    /* renamed from: x */
    public final void mo61x() {
        if (!(!this.f45c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
