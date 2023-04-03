package p000;

import androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p000.vp2;

/* renamed from: wp2 */
/* compiled from: Id3Peeker */
public final class wp2 {

    /* renamed from: a */
    public final gm4 f19215a = new gm4(10);

    /* renamed from: a */
    public Metadata mo27591a(iy1 iy1, vp2.C3504a aVar) throws IOException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                iy1.mo94n(this.f19215a.mo20679d(), 0, 10);
                this.f19215a.mo20674P(0);
                if (this.f19215a.mo20665G() != 4801587) {
                    break;
                }
                this.f19215a.mo20675Q(3);
                int C = this.f19215a.mo20661C();
                int i2 = C + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f19215a.mo20679d(), 0, bArr, 0, 10);
                    iy1.mo94n(bArr, 10, C);
                    metadata = new vp2(aVar).mo27289e(bArr, i2);
                } else {
                    iy1.mo90i(C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iy1.mo85e();
        iy1.mo90i(i);
        return metadata;
    }
}
