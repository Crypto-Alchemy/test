package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lki;", "Lpp4;", "Lr72;", "fontWeight", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "I", "fontWeightAdjustment", "<init>", "(I)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ki */
/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class C2683ki implements pp4 {

    /* renamed from: b */
    public final int f14090b;

    public C2683ki(int i) {
        this.f14090b = i;
    }

    /* renamed from: a */
    public /* synthetic */ int mo22311a(int i) {
        return op4.m23937b(this, i);
    }

    /* renamed from: b */
    public /* synthetic */ z62 mo22312b(z62 z62) {
        return op4.m23936a(this, z62);
    }

    /* renamed from: c */
    public /* synthetic */ int mo22313c(int i) {
        return op4.m23938c(this, i);
    }

    /* renamed from: d */
    public r72 mo22314d(r72 r72) {
        vx2.m53591g(r72, "fontWeight");
        int i = this.f14090b;
        if (i == 0 || i == Integer.MAX_VALUE) {
            return r72;
        }
        return new r72(d75.m43389k(r72.mo25345h() + this.f14090b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2683ki) && this.f14090b == ((C2683ki) obj).f14090b;
    }

    public int hashCode() {
        return this.f14090b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f14090b + ')';
    }
}
