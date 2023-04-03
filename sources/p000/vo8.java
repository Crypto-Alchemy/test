package p000;

import android.content.Context;

/* renamed from: vo8 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class vo8 extends nf3 {

    /* renamed from: b */
    public final bw3 f34984b;

    public vo8(bw3 bw3) {
        this.f34984b = bw3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29570a(Object obj) {
        x09 x09;
        C6011ix ixVar = (C6011ix) obj;
        Context b = this.f34984b.mo29797b();
        ce9 b2 = df9.m43478b(ra8.m51016a());
        if (r69.m50962a(b) || zh2.m55108h().mo49850b(b) >= 204500000) {
            x09 = new r69(b, ixVar, b2);
        } else {
            x09 = new gb9(b, ixVar, b2);
        }
        return new dy8(this.f34984b, ixVar, x09, b2);
    }
}
