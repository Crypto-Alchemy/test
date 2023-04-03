package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, mo44877d2 = {"Lqn6;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "()F", "scaleX", "b", "skewX", "<init>", "(FF)V", "c", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qn6 */
/* compiled from: TextGeometricTransform.kt */
public final class qn6 {

    /* renamed from: c */
    public static final C3157a f16991c = new C3157a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final qn6 f16992d = new qn6(1.0f, Utils.FLOAT_EPSILON);

    /* renamed from: a */
    public final float f16993a;

    /* renamed from: b */
    public final float f16994b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lqn6$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: qn6$a */
    /* compiled from: TextGeometricTransform.kt */
    public static final class C3157a {
        public C3157a() {
        }

        public /* synthetic */ C3157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public qn6() {
        this(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 3, (DefaultConstructorMarker) null);
    }

    public qn6(float f, float f2) {
        this.f16993a = f;
        this.f16994b = f2;
    }

    /* renamed from: a */
    public final float mo25181a() {
        return this.f16993a;
    }

    /* renamed from: b */
    public final float mo25182b() {
        return this.f16994b;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn6)) {
            return false;
        }
        qn6 qn6 = (qn6) obj;
        if (this.f16993a == qn6.f16993a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f16994b == qn6.f16994b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f16993a) * 31) + Float.floatToIntBits(this.f16994b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f16993a + ", skewX=" + this.f16994b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn6(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? Utils.FLOAT_EPSILON : f2);
    }
}
