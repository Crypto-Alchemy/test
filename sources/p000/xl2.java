package p000;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import p000.q24;

/* renamed from: xl2 */
/* compiled from: HevcConfig */
public final class xl2 {

    /* renamed from: a */
    public final List<byte[]> f19878a;

    /* renamed from: b */
    public final int f19879b;

    /* renamed from: c */
    public final int f19880c;

    /* renamed from: d */
    public final int f19881d;

    /* renamed from: e */
    public final float f19882e;

    /* renamed from: f */
    public final String f19883f;

    public xl2(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f19878a = list;
        this.f19879b = i;
        this.f19880c = i2;
        this.f19881d = i3;
        this.f19882e = f;
        this.f19883f = str;
    }

    /* renamed from: a */
    public static xl2 m30169a(gm4 gm4) throws ParserException {
        List list;
        int i;
        int i2;
        gm4 gm42 = gm4;
        try {
            gm42.mo20675Q(21);
            int D = gm4.mo20662D() & 3;
            int D2 = gm4.mo20662D();
            int e = gm4.mo20680e();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < D2; i5++) {
                gm42.mo20675Q(1);
                int J = gm4.mo20668J();
                for (int i6 = 0; i6 < J; i6++) {
                    int J2 = gm4.mo20668J();
                    i4 += J2 + 4;
                    gm42.mo20675Q(J2);
                }
            }
            gm42.mo20674P(e);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            int i10 = 0;
            while (i9 < D2) {
                int D3 = gm4.mo20662D() & 127;
                int J3 = gm4.mo20668J();
                int i11 = i3;
                while (i11 < J3) {
                    int J4 = gm4.mo20668J();
                    byte[] bArr2 = q24.f16719a;
                    int i12 = D2;
                    System.arraycopy(bArr2, i3, bArr, i10, bArr2.length);
                    int length = i10 + bArr2.length;
                    System.arraycopy(gm4.mo20679d(), gm4.mo20680e(), bArr, length, J4);
                    if (D3 == 33 && i11 == 0) {
                        q24.C3106a h = q24.m25339h(bArr, length, length + J4);
                        int i13 = h.f16730h;
                        i8 = h.f16731i;
                        f = h.f16732j;
                        i2 = D3;
                        i = J3;
                        i7 = i13;
                        str = yh0.m30586c(h.f16723a, h.f16724b, h.f16725c, h.f16726d, h.f16727e, h.f16728f);
                    } else {
                        i2 = D3;
                        i = J3;
                    }
                    i10 = length + J4;
                    gm42.mo20675Q(J4);
                    i11++;
                    D2 = i12;
                    D3 = i2;
                    J3 = i;
                    i3 = 0;
                }
                int i14 = D2;
                i9++;
                i3 = 0;
            }
            if (i4 == 0) {
                list = Collections.emptyList();
            } else {
                list = Collections.singletonList(bArr);
            }
            return new xl2(list, D + 1, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e2);
        }
    }
}
