package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Lan4;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "Lw40;", "a", "Lw40;", "upstream", "d", "Lm40;", "buffer", "Lct5;", "e", "Lct5;", "expectedSegment", "", "g", "I", "expectedPos", "", "k", "Z", "closed", "r", "J", "pos", "<init>", "(Lw40;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: an4 */
/* compiled from: PeekSource.kt */
public final class an4 implements z56 {

    /* renamed from: a */
    public final w40 f36519a;

    /* renamed from: d */
    public final m40 f36520d;

    /* renamed from: e */
    public ct5 f36521e;

    /* renamed from: g */
    public int f36522g;

    /* renamed from: k */
    public boolean f36523k;

    /* renamed from: r */
    public long f36524r;

    public an4(w40 w40) {
        int i;
        vx2.m53591g(w40, "upstream");
        this.f36519a = w40;
        m40 r = w40.mo56081r();
        this.f36520d = r;
        ct5 ct5 = r.f40752a;
        this.f36521e = ct5;
        if (ct5 == null) {
            i = -1;
        } else {
            i = ct5.f37201b;
        }
        this.f36522g = i;
    }

    public void close() {
        this.f36523k = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f37201b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(p000.m40 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p000.vx2.m53591g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f36523k
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x007b
            ct5 r5 = r8.f36521e
            if (r5 == 0) goto L_0x002a
            m40 r6 = r8.f36520d
            ct5 r6 = r6.f40752a
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f36522g
            p000.vx2.m53588d(r6)
            int r6 = r6.f37201b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            w40 r0 = r8.f36519a
            long r1 = r8.f36524r
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            ct5 r0 = r8.f36521e
            if (r0 != 0) goto L_0x0053
            m40 r0 = r8.f36520d
            ct5 r0 = r0.f40752a
            if (r0 == 0) goto L_0x0053
            r8.f36521e = r0
            p000.vx2.m53588d(r0)
            int r0 = r0.f37201b
            r8.f36522g = r0
        L_0x0053:
            m40 r0 = r8.f36520d
            long r0 = r0.size()
            long r2 = r8.f36524r
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            m40 r2 = r8.f36520d
            long r4 = r8.f36524r
            r3 = r9
            r6 = r10
            r2.mo56058g(r3, r4, r6)
            long r0 = r8.f36524r
            long r0 = r0 + r10
            r8.f36524r = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = p000.vx2.m53598n(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.an4.read(m40, long):long");
    }

    public qq6 timeout() {
        return this.f36519a.timeout();
    }
}
