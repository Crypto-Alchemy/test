package p000;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, mo44877d2 = {"Lct5;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "Lr37;", "a", "sink", "g", "", "[B", "data", "I", "pos", "limit", "", "Z", "shared", "owner", "Lct5;", "next", "prev", "<init>", "()V", "([BIIZZ)V", "h", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ct5 */
/* compiled from: Segment.kt */
public final class ct5 {

    /* renamed from: h */
    public static final C6953a f37199h = new C6953a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final byte[] f37200a;

    /* renamed from: b */
    public int f37201b;

    /* renamed from: c */
    public int f37202c;

    /* renamed from: d */
    public boolean f37203d;

    /* renamed from: e */
    public boolean f37204e;

    /* renamed from: f */
    public ct5 f37205f;

    /* renamed from: g */
    public ct5 f37206g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lct5$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ct5$a */
    /* compiled from: Segment.kt */
    public static final class C6953a {
        public C6953a() {
        }

        public /* synthetic */ C6953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ct5() {
        this.f37200a = new byte[8192];
        this.f37204e = true;
        this.f37203d = false;
    }

    /* renamed from: a */
    public final void mo51002a() {
        boolean z;
        ct5 ct5 = this.f37206g;
        int i = 0;
        if (ct5 != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vx2.m53588d(ct5);
            if (ct5.f37204e) {
                int i2 = this.f37202c - this.f37201b;
                ct5 ct52 = this.f37206g;
                vx2.m53588d(ct52);
                int i3 = 8192 - ct52.f37202c;
                ct5 ct53 = this.f37206g;
                vx2.m53588d(ct53);
                if (!ct53.f37203d) {
                    ct5 ct54 = this.f37206g;
                    vx2.m53588d(ct54);
                    i = ct54.f37201b;
                }
                if (i2 <= i3 + i) {
                    ct5 ct55 = this.f37206g;
                    vx2.m53588d(ct55);
                    mo51008g(ct55, i2);
                    mo51003b();
                    et5.m57488b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final ct5 mo51003b() {
        ct5 ct5 = this.f37205f;
        if (ct5 == this) {
            ct5 = null;
        }
        ct5 ct52 = this.f37206g;
        vx2.m53588d(ct52);
        ct52.f37205f = this.f37205f;
        ct5 ct53 = this.f37205f;
        vx2.m53588d(ct53);
        ct53.f37206g = this.f37206g;
        this.f37205f = null;
        this.f37206g = null;
        return ct5;
    }

    /* renamed from: c */
    public final ct5 mo51004c(ct5 ct5) {
        vx2.m53591g(ct5, "segment");
        ct5.f37206g = this;
        ct5.f37205f = this.f37205f;
        ct5 ct52 = this.f37205f;
        vx2.m53588d(ct52);
        ct52.f37206g = ct5;
        this.f37205f = ct5;
        return ct5;
    }

    /* renamed from: d */
    public final ct5 mo51005d() {
        this.f37203d = true;
        return new ct5(this.f37200a, this.f37201b, this.f37202c, true, false);
    }

    /* renamed from: e */
    public final ct5 mo51006e(int i) {
        boolean z;
        ct5 ct5;
        if (i <= 0 || i > this.f37202c - this.f37201b) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                ct5 = mo51005d();
            } else {
                ct5 = et5.m57489c();
                byte[] bArr = this.f37200a;
                byte[] bArr2 = ct5.f37200a;
                int i2 = this.f37201b;
                C6706xq.m54496j(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            ct5.f37202c = ct5.f37201b + i;
            this.f37201b += i;
            ct5 ct52 = this.f37206g;
            vx2.m53588d(ct52);
            ct52.mo51004c(ct5);
            return ct5;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final ct5 mo51007f() {
        byte[] bArr = this.f37200a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ct5(copyOf, this.f37201b, this.f37202c, false, true);
    }

    /* renamed from: g */
    public final void mo51008g(ct5 ct5, int i) {
        vx2.m53591g(ct5, "sink");
        if (ct5.f37204e) {
            int i2 = ct5.f37202c;
            if (i2 + i > 8192) {
                if (!ct5.f37203d) {
                    int i3 = ct5.f37201b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = ct5.f37200a;
                        C6706xq.m54496j(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        ct5.f37202c -= ct5.f37201b;
                        ct5.f37201b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f37200a;
            byte[] bArr3 = ct5.f37200a;
            int i4 = ct5.f37202c;
            int i5 = this.f37201b;
            C6706xq.m54491e(bArr2, bArr3, i4, i5, i5 + i);
            ct5.f37202c += i;
            this.f37201b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public ct5(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        vx2.m53591g(bArr, "data");
        this.f37200a = bArr;
        this.f37201b = i;
        this.f37202c = i2;
        this.f37203d = z;
        this.f37204e = z2;
    }
}
