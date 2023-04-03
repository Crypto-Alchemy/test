package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 \n2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\b¨\u0006\u001e"}, mo44877d2 = {"Lzf0;", "", "", "a", "[I", "values", "", "h", "()I", "middle", "b", "corners", "j", "sides", "f", "invertMiddle", "e", "invertCorners", "g", "invertSides", "i", "r", "d", "c", "cornersRotation", "k", "sidesRotation", "value", "<init>", "(I)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zf0 */
/* compiled from: ClassicIdenticonHash.kt */
public final class zf0 {

    /* renamed from: b */
    public static final C6769a f36140b = new C6769a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int[] f36141a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, mo44877d2 = {"Lzf0$a;", "", "", "i", "", "m", "a", "<init>", "()V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zf0$a */
    /* compiled from: ClassicIdenticonHash.kt */
    public static final class C6769a {
        public C6769a() {
        }

        public /* synthetic */ C6769a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo49842a(long j, int i) {
            return Math.abs((int) (j % ((long) i)));
        }
    }

    public zf0(int i) {
        int[] iArr = new int[11];
        this.f36141a = iArr;
        C6769a aVar = f36140b;
        iArr[0] = aVar.mo49842a((long) i, 8) * 4;
        iArr[1] = aVar.mo49842a((long) (i >> 3), 32);
        iArr[2] = aVar.mo49842a((long) (i >> 8), 32);
        iArr[3] = aVar.mo49842a((long) (i >> 13), 2);
        iArr[4] = aVar.mo49842a((long) (i >> 14), 2);
        iArr[5] = aVar.mo49842a((long) (i >> 15), 2);
        iArr[6] = aVar.mo49842a((long) (i >> 16), 16);
        iArr[7] = aVar.mo49842a((long) (i >> 20), 16);
        iArr[8] = aVar.mo49842a((long) (i >> 24), 16);
        iArr[9] = aVar.mo49842a((long) (i >> 28), 4);
        iArr[10] = aVar.mo49842a((long) (i >> 30), 4);
    }

    /* renamed from: a */
    public final int mo49831a() {
        return this.f36141a[8];
    }

    /* renamed from: b */
    public final int mo49832b() {
        return this.f36141a[1];
    }

    /* renamed from: c */
    public final int mo49833c() {
        return this.f36141a[9];
    }

    /* renamed from: d */
    public final int mo49834d() {
        return this.f36141a[7];
    }

    /* renamed from: e */
    public final int mo49835e() {
        return this.f36141a[4];
    }

    /* renamed from: f */
    public final int mo49836f() {
        return this.f36141a[3];
    }

    /* renamed from: g */
    public final int mo49837g() {
        return this.f36141a[5];
    }

    /* renamed from: h */
    public final int mo49838h() {
        return this.f36141a[0];
    }

    /* renamed from: i */
    public final int mo49839i() {
        return this.f36141a[6];
    }

    /* renamed from: j */
    public final int mo49840j() {
        return this.f36141a[2];
    }

    /* renamed from: k */
    public final int mo49841k() {
        return this.f36141a[10];
    }
}
