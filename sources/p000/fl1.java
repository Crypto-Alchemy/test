package p000;

import java.util.List;

/* renamed from: fl1 */
/* compiled from: DvbDecoder */
public final class fl1 extends z26 {

    /* renamed from: o */
    public final gl1 f11909o;

    public fl1(List<byte[]> list) {
        super("DvbDecoder");
        gm4 gm4 = new gm4(list.get(0));
        this.f11909o = new gl1(gm4.mo20668J(), gm4.mo20668J());
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f11909o.mo20635r();
        }
        return new hl1(this.f11909o.mo20634b(bArr, i));
    }
}
