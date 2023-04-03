package p000;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0001\u0006B-\u0012\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H&J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\nR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u001b"}, mo44877d2 = {"Lrz4;", "", "RowType", "Lr37;", "f", "Ll76;", "a", "", "b", "c", "()Ljava/lang/Object;", "d", "", "Ljava/util/List;", "queries", "Lkotlin/Function1;", "Lrc2;", "e", "()Lrc2;", "mapper", "Ll05;", "Ll05;", "listenerLock", "Lrz4$a;", "listeners", "<init>", "(Ljava/util/List;Lrc2;)V", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: rz4 */
/* compiled from: Query.kt */
public abstract class rz4<RowType> {

    /* renamed from: a */
    public final List<rz4<?>> f33671a;

    /* renamed from: b */
    public final rc2<l76, RowType> f33672b;

    /* renamed from: c */
    public final l05 f33673c = new l05();

    /* renamed from: d */
    public final List<C6468a> f33674d = fe2.m44301b();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo44877d2 = {"Lrz4$a;", "", "Lr37;", "a", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: rz4$a */
    /* compiled from: Query.kt */
    public interface C6468a {
        /* renamed from: a */
        void mo47571a();
    }

    public rz4(List<rz4<?>> list, rc2<? super l76, ? extends RowType> rc2) {
        vx2.m53591g(list, "queries");
        vx2.m53591g(rc2, "mapper");
        this.f33671a = list;
        this.f33672b = rc2;
    }

    /* renamed from: a */
    public abstract l76 mo40552a();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        p000.lh0.m47807a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<RowType> mo47566b() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l76 r1 = r3.mo40552a()
        L_0x0009:
            boolean r2 = r1.next()     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x001b
            rc2 r2 = r3.mo47569e()     // Catch:{ all -> 0x0022 }
            java.lang.Object r2 = r2.invoke(r1)     // Catch:{ all -> 0x0022 }
            r0.add(r2)     // Catch:{ all -> 0x0022 }
            goto L_0x0009
        L_0x001b:
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x0022 }
            r2 = 0
            p000.lh0.m47807a(r1, r2)
            return r0
        L_0x0022:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            p000.lh0.m47807a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rz4.mo47566b():java.util.List");
    }

    /* renamed from: c */
    public final RowType mo47567c() {
        RowType d = mo47568d();
        if (d != null) {
            return d;
        }
        throw new NullPointerException(vx2.m53598n("ResultSet returned null for ", this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        p000.lh0.m47807a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final RowType mo47568d() {
        /*
            r4 = this;
            l76 r0 = r4.mo40552a()
            boolean r1 = r0.next()     // Catch:{ all -> 0x0033 }
            r2 = 0
            if (r1 != 0) goto L_0x000f
            p000.lh0.m47807a(r0, r2)
            return r2
        L_0x000f:
            rc2 r1 = r4.mo47569e()     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.invoke(r0)     // Catch:{ all -> 0x0033 }
            boolean r3 = r0.next()     // Catch:{ all -> 0x0033 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0023
            p000.lh0.m47807a(r0, r2)
            return r1
        L_0x0023:
            java.lang.String r1 = "ResultSet returned more than 1 row for "
            java.lang.String r1 = p000.vx2.m53598n(r1, r4)     // Catch:{ all -> 0x0033 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            p000.lh0.m47807a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rz4.mo47568d():java.lang.Object");
    }

    /* renamed from: e */
    public final rc2<l76, RowType> mo47569e() {
        return this.f33672b;
    }

    /* renamed from: f */
    public final void mo47570f() {
        synchronized (this.f33673c) {
            for (C6468a a : this.f33674d) {
                a.mo47571a();
            }
            r37 r37 = r37.f33317a;
        }
    }
}
