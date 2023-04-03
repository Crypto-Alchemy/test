package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\nB$\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001dR\u0014\u0010\"\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, mo44877d2 = {"Lcl0;", "", "", "component", "", "e", "d", "", "v", "i", "a", "", "toString", "other", "", "equals", "hashCode", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "name", "Lal0;", "b", "J", "f", "()J", "model", "c", "I", "()I", "id", "componentCount", "h", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cl0 */
/* compiled from: ColorSpace.kt */
public abstract class cl0 {

    /* renamed from: d */
    public static final C1685a f8455d = new C1685a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f8456a;

    /* renamed from: b */
    public final long f8457b;

    /* renamed from: c */
    public final int f8458c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lcl0$a;", "", "", "MaxId", "I", "MinId", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cl0$a */
    /* compiled from: ColorSpace.kt */
    public static final class C1685a {
        public C1685a() {
        }

        public /* synthetic */ C1685a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cl0(String str, long j, int i) {
        this.f8456a = str;
        this.f8457b = j;
        this.f8458c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ cl0(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    /* renamed from: a */
    public abstract float[] mo3284a(float[] fArr);

    /* renamed from: b */
    public final int mo12098b() {
        return al0.m356f(this.f8457b);
    }

    /* renamed from: c */
    public final int mo12099c() {
        return this.f8458c;
    }

    /* renamed from: d */
    public abstract float mo3285d(int i);

    /* renamed from: e */
    public abstract float mo3286e(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(ua5.m52727b(getClass()), ua5.m52727b(obj.getClass()))) {
            return false;
        }
        cl0 cl0 = (cl0) obj;
        if (this.f8458c == cl0.f8458c && vx2.m53586b(this.f8456a, cl0.f8456a)) {
            return al0.m355e(this.f8457b, cl0.f8457b);
        }
        return false;
    }

    /* renamed from: f */
    public final long mo12100f() {
        return this.f8457b;
    }

    /* renamed from: g */
    public final String mo12101g() {
        return this.f8456a;
    }

    /* renamed from: h */
    public boolean mo3288h() {
        return false;
    }

    public int hashCode() {
        return (((this.f8456a.hashCode() * 31) + al0.m357g(this.f8457b)) * 31) + this.f8458c;
    }

    /* renamed from: i */
    public abstract float[] mo3290i(float[] fArr);

    public String toString() {
        return this.f8456a + " (id=" + this.f8458c + ", model=" + al0.m358h(this.f8457b) + ')';
    }
}
