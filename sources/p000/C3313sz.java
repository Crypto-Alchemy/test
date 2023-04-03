package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b@\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0001\u0011\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"Lsz;", "", "", "e", "(F)Ljava/lang/String;", "", "d", "(F)I", "other", "", "c", "(FLjava/lang/Object;)Z", "", "a", "F", "getMultiplier", "()F", "multiplier", "b", "(F)F", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sz */
/* compiled from: BaselineShift.kt */
public final class C3313sz {

    /* renamed from: b */
    public static final C3314a f17838b = new C3314a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f17839c = m27199b(0.5f);

    /* renamed from: d */
    public static final float f17840d = m27199b(-0.5f);

    /* renamed from: e */
    public static final float f17841e = m27199b(Utils.FLOAT_EPSILON);

    /* renamed from: a */
    public final float f17842a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lsz$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sz$a */
    /* compiled from: BaselineShift.kt */
    public static final class C3314a {
        public C3314a() {
        }

        public /* synthetic */ C3314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C3313sz(float f) {
        this.f17842a = f;
    }

    /* renamed from: a */
    public static final /* synthetic */ C3313sz m27198a(float f) {
        return new C3313sz(f);
    }

    /* renamed from: b */
    public static float m27199b(float f) {
        return f;
    }

    /* renamed from: c */
    public static boolean m27200c(float f, Object obj) {
        if (!(obj instanceof C3313sz)) {
            return false;
        }
        return vx2.m53586b(Float.valueOf(f), Float.valueOf(((C3313sz) obj).mo25999f()));
    }

    /* renamed from: d */
    public static int m27201d(float f) {
        return Float.floatToIntBits(f);
    }

    /* renamed from: e */
    public static String m27202e(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m27200c(this.f17842a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ float mo25999f() {
        return this.f17842a;
    }

    public int hashCode() {
        return m27201d(this.f17842a);
    }

    public String toString() {
        return m27202e(this.f17842a);
    }
}
