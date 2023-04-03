package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lvh5;", "Li62;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "getVerticalScrollPixels", "()F", "verticalScrollPixels", "b", "getHorizontalScrollPixels", "horizontalScrollPixels", "", "c", "J", "getUptimeMillis", "()J", "uptimeMillis", "<init>", "(FFJ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vh5 */
/* compiled from: RotaryScrollEvent.kt */
public final class vh5 implements i62 {

    /* renamed from: a */
    public final float f18792a;

    /* renamed from: b */
    public final float f18793b;

    /* renamed from: c */
    public final long f18794c;

    public vh5(float f, float f2, long j) {
        this.f18792a = f;
        this.f18793b = f2;
        this.f18794c = j;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof vh5) {
            vh5 vh5 = (vh5) obj;
            if (vh5.f18792a == this.f18792a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (vh5.f18793b == this.f18793b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && vh5.f18794c == this.f18794c) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((0 + Float.floatToIntBits(this.f18792a)) * 31) + Float.floatToIntBits(this.f18793b)) * 31) + au0.m10781a(this.f18794c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f18792a + ",horizontalScrollPixels=" + this.f18793b + ",uptimeMillis=" + this.f18794c + ')';
    }
}
