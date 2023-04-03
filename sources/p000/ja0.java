package p000;

import android.graphics.Typeface;

/* renamed from: ja0 */
/* compiled from: CancelableFontCallback */
public final class ja0 extends dn6 {

    /* renamed from: a */
    public final Typeface f30272a;

    /* renamed from: b */
    public final C6023a f30273b;

    /* renamed from: c */
    public boolean f30274c;

    /* renamed from: ja0$a */
    /* compiled from: CancelableFontCallback */
    public interface C6023a {
        /* renamed from: a */
        void mo33093a(Typeface typeface);
    }

    public ja0(C6023a aVar, Typeface typeface) {
        this.f30272a = typeface;
        this.f30273b = aVar;
    }

    /* renamed from: a */
    public void mo29667a(int i) {
        mo44073d(this.f30272a);
    }

    /* renamed from: b */
    public void mo29668b(Typeface typeface, boolean z) {
        mo44073d(typeface);
    }

    /* renamed from: c */
    public void mo44072c() {
        this.f30274c = true;
    }

    /* renamed from: d */
    public final void mo44073d(Typeface typeface) {
        if (!this.f30274c) {
            this.f30273b.mo33093a(typeface);
        }
    }
}
