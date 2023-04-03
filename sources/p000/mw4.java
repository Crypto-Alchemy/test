package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lmw4;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "b", "()F", "current", "Luh0;", "Luh0;", "c", "()Luh0;", "range", "I", "d", "()I", "steps", "<init>", "(FLuh0;I)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mw4 */
/* compiled from: SemanticsProperties.kt */
public final class mw4 {

    /* renamed from: d */
    public static final C2854a f15263d = new C2854a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final mw4 f15264e = new mw4(Utils.FLOAT_EPSILON, c75.m32861b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON), 0, 4, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final float f15265a;

    /* renamed from: b */
    public final uh0<Float> f15266b;

    /* renamed from: c */
    public final int f15267c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lmw4$a;", "", "Lmw4;", "Indeterminate", "Lmw4;", "a", "()Lmw4;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mw4$a */
    /* compiled from: SemanticsProperties.kt */
    public static final class C2854a {
        public C2854a() {
        }

        public /* synthetic */ C2854a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final mw4 mo23418a() {
            return mw4.f15264e;
        }
    }

    public mw4(float f, uh0<Float> uh0, int i) {
        vx2.m53591g(uh0, "range");
        this.f15265a = f;
        this.f15266b = uh0;
        this.f15267c = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    /* renamed from: b */
    public final float mo23412b() {
        return this.f15265a;
    }

    /* renamed from: c */
    public final uh0<Float> mo23413c() {
        return this.f15266b;
    }

    /* renamed from: d */
    public final int mo23414d() {
        return this.f15267c;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw4)) {
            return false;
        }
        mw4 mw4 = (mw4) obj;
        if (this.f15265a == mw4.f15265a) {
            z = true;
        } else {
            z = false;
        }
        if (z && vx2.m53586b(this.f15266b, mw4.f15266b) && this.f15267c == mw4.f15267c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f15265a) * 31) + this.f15266b.hashCode()) * 31) + this.f15267c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f15265a + ", range=" + this.f15266b + ", steps=" + this.f15267c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw4(float f, uh0 uh0, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, uh0, (i2 & 4) != 0 ? 0 : i);
    }
}
