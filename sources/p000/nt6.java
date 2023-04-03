package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ&\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¨\u0006\n"}, mo44877d2 = {"Lnt6;", "", "", "noEnclosing", "Lkotlin/Function1;", "Lcu6;", "Lr37;", "body", "m", "b", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: nt6 */
/* compiled from: Transacter.kt */
public interface nt6 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 5, 1}, mo44881xi = 48)
    /* renamed from: nt6$a */
    /* compiled from: Transacter.kt */
    public static final class C6291a {
        /* renamed from: a */
        public static /* synthetic */ void m49014a(nt6 nt6, boolean z, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                nt6.mo39606m(z, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u0010\tJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$J\u000f\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R6\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001c0\n0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u00100\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0003¨\u00064"}, mo44877d2 = {"Lnt6$b;", "Ltt6;", "e", "()Lnt6$b;", "", "successful", "Lr37;", "f", "g", "()V", "Lkotlin/Function0;", "function", "a", "b", "d", "", "J", "ownerThreadId", "", "Ljava/util/List;", "j", "()Ljava/util/List;", "postCommitHooks", "c", "k", "postRollbackHooks", "", "", "", "Lrz4;", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "queriesFuncs", "Z", "m", "()Z", "o", "(Z)V", "h", "n", "childrenSuccessful", "Lnt6;", "Lnt6;", "getTransacter$runtime", "()Lnt6;", "p", "(Lnt6;)V", "transacter", "i", "enclosingTransaction", "<init>", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: nt6$b */
    /* compiled from: Transacter.kt */
    public static abstract class C6292b implements tt6 {

        /* renamed from: a */
        public final long f32178a = fe2.m44302c();

        /* renamed from: b */
        public final List<pc2<r37>> f32179b = new ArrayList();

        /* renamed from: c */
        public final List<pc2<r37>> f32180c = new ArrayList();

        /* renamed from: d */
        public final Map<Integer, pc2<List<rz4<?>>>> f32181d = new LinkedHashMap();

        /* renamed from: e */
        public boolean f32182e;

        /* renamed from: f */
        public boolean f32183f = true;

        /* renamed from: g */
        public nt6 f32184g;

        /* renamed from: a */
        public void mo39630a(pc2<r37> pc2) {
            vx2.m53591g(pc2, "function");
            mo46208d();
            this.f32179b.add(pc2);
        }

        /* renamed from: b */
        public void mo39631b(pc2<r37> pc2) {
            vx2.m53591g(pc2, "function");
            mo46208d();
            this.f32180c.add(pc2);
        }

        /* renamed from: d */
        public final void mo46208d() {
            boolean z;
            if (this.f32178a == fe2.m44302c()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.".toString());
            }
        }

        /* renamed from: e */
        public final C6292b mo46209e() {
            return mo39625i();
        }

        /* renamed from: f */
        public abstract void mo39624f(boolean z);

        /* renamed from: g */
        public final void mo46210g() {
            boolean z;
            mo46208d();
            if (!this.f32182e || !this.f32183f) {
                z = false;
            } else {
                z = true;
            }
            mo39624f(z);
        }

        /* renamed from: h */
        public final boolean mo46211h() {
            return this.f32183f;
        }

        /* renamed from: i */
        public abstract C6292b mo39625i();

        /* renamed from: j */
        public final List<pc2<r37>> mo46212j() {
            return this.f32179b;
        }

        /* renamed from: k */
        public final List<pc2<r37>> mo46213k() {
            return this.f32180c;
        }

        /* renamed from: l */
        public final Map<Integer, pc2<List<rz4<?>>>> mo46214l() {
            return this.f32181d;
        }

        /* renamed from: m */
        public final boolean mo46215m() {
            return this.f32182e;
        }

        /* renamed from: n */
        public final void mo46216n(boolean z) {
            this.f32183f = z;
        }

        /* renamed from: o */
        public final void mo46217o(boolean z) {
            this.f32182e = z;
        }

        /* renamed from: p */
        public final void mo46218p(nt6 nt6) {
            this.f32184g = nt6;
        }
    }

    /* renamed from: m */
    void mo39606m(boolean z, rc2<? super cu6, r37> rc2);
}
