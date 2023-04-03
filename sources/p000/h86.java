package p000;

/* renamed from: h86 */
/* compiled from: StartOffsetExtractorInput */
public final class h86 extends i82 {

    /* renamed from: b */
    public final long f12781b;

    public h86(iy1 iy1, long j) {
        super(iy1);
        boolean z;
        if (iy1.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f12781b = j;
    }

    public long getLength() {
        return super.getLength() - this.f12781b;
    }

    public long getPosition() {
        return super.getPosition() - this.f12781b;
    }

    /* renamed from: h */
    public long mo89h() {
        return super.mo89h() - this.f12781b;
    }
}
