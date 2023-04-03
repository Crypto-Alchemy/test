package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\nB(\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R)\u0010\u0010\u001a\u00020\t8\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR)\u0010\u0014\u001a\u00020\u00118\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR \u0010\u0019\u001a\u00020\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\n\u0010\u0017\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, mo44877d2 = {"Lnz5;", "", "other", "", "equals", "", "hashCode", "", "toString", "Luk0;", "a", "J", "b", "()J", "getColor-0d7_KjU$annotations", "()V", "color", "Ltf4;", "c", "getOffset-F1C5BW0$annotations", "offset", "", "F", "()F", "getBlurRadius$annotations", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nz5 */
/* compiled from: Shadow.kt */
public final class nz5 {

    /* renamed from: d */
    public static final C2934a f15747d = new C2934a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final nz5 f15748e = new nz5(0, 0, Utils.FLOAT_EPSILON, 7, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f15749a;

    /* renamed from: b */
    public final long f15750b;

    /* renamed from: c */
    public final float f15751c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnz5$a;", "", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: nz5$a */
    /* compiled from: Shadow.kt */
    public static final class C2934a {
        public C2934a() {
        }

        public /* synthetic */ C2934a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nz5(long j, long j2, float f) {
        this.f15749a = j;
        this.f15750b = j2;
        this.f15751c = f;
    }

    public /* synthetic */ nz5(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* renamed from: a */
    public final float mo23842a() {
        return this.f15751c;
    }

    /* renamed from: b */
    public final long mo23843b() {
        return this.f15749a;
    }

    /* renamed from: c */
    public final long mo23844c() {
        return this.f15750b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz5)) {
            return false;
        }
        nz5 nz5 = (nz5) obj;
        if (!uk0.m28331h(this.f15749a, nz5.f15749a) || !tf4.m27732i(this.f15750b, nz5.f15750b)) {
            return false;
        }
        if (this.f15751c == nz5.f15751c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((uk0.m28337n(this.f15749a) * 31) + tf4.m27736m(this.f15750b)) * 31) + Float.floatToIntBits(this.f15751c);
    }

    public String toString() {
        return "Shadow(color=" + uk0.m28338o(this.f15749a) + ", offset=" + tf4.m27740q(this.f15750b) + ", blurRadius=" + this.f15751c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zk0.m31345c(4278190080L) : j, (i & 2) != 0 ? tf4.f18145b.mo26446c() : j2, (i & 4) != 0 ? Utils.FLOAT_EPSILON : f, (DefaultConstructorMarker) null);
    }
}
