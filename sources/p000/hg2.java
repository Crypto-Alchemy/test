package p000;

import android.graphics.Bitmap;
import p000.ig2;

/* renamed from: hg2 */
/* compiled from: GifBitmapProvider */
public final class hg2 implements ig2.C2541a {

    /* renamed from: a */
    public final t20 f12881a;

    /* renamed from: b */
    public final C2982oq f12882b;

    public hg2(t20 t20, C2982oq oqVar) {
        this.f12881a = t20;
        this.f12882b = oqVar;
    }

    /* renamed from: a */
    public void mo21169a(Bitmap bitmap) {
        this.f12881a.mo25118c(bitmap);
    }

    /* renamed from: b */
    public byte[] mo21170b(int i) {
        C2982oq oqVar = this.f12882b;
        if (oqVar == null) {
            return new byte[i];
        }
        return (byte[]) oqVar.mo24041c(i, byte[].class);
    }

    /* renamed from: c */
    public Bitmap mo21171c(int i, int i2, Bitmap.Config config) {
        return this.f12881a.mo26026e(i, i2, config);
    }

    /* renamed from: d */
    public int[] mo21172d(int i) {
        C2982oq oqVar = this.f12882b;
        if (oqVar == null) {
            return new int[i];
        }
        return (int[]) oqVar.mo24041c(i, int[].class);
    }

    /* renamed from: e */
    public void mo21173e(byte[] bArr) {
        C2982oq oqVar = this.f12882b;
        if (oqVar != null) {
            oqVar.put(bArr);
        }
    }

    /* renamed from: f */
    public void mo21174f(int[] iArr) {
        C2982oq oqVar = this.f12882b;
        if (oqVar != null) {
            oqVar.put(iArr);
        }
    }
}
