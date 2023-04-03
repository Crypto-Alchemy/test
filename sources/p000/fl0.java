package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\n8VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, mo44877d2 = {"Lfl0;", "Lnn6;", "", "toString", "", "hashCode", "", "other", "", "equals", "Luk0;", "b", "J", "getValue-0d7_KjU", "()J", "value", "a", "color", "Li40;", "c", "()Li40;", "brush", "", "()F", "alpha", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fl0 */
/* compiled from: TextForegroundStyle.kt */
public final class fl0 implements nn6 {

    /* renamed from: b */
    public final long f11908b;

    public fl0(long j) {
        this.f11908b = j;
        if (!(j != uk0.f18515b.mo26824d())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ fl0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public long mo19953a() {
        return this.f11908b;
    }

    /* renamed from: b */
    public float mo19954b() {
        return uk0.m28332i(mo19953a());
    }

    /* renamed from: c */
    public i40 mo19955c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl0) && uk0.m28331h(this.f11908b, ((fl0) obj).f11908b);
    }

    public int hashCode() {
        return uk0.m28337n(this.f11908b);
    }

    public String toString() {
        return "ColorStyle(value=" + uk0.m28338o(this.f11908b) + ')';
    }
}
