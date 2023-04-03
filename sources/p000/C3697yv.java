package p000;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;
import p000.q24;

/* renamed from: yv */
/* compiled from: AvcConfig */
public final class C3697yv {

    /* renamed from: a */
    public final List<byte[]> f20382a;

    /* renamed from: b */
    public final int f20383b;

    /* renamed from: c */
    public final int f20384c;

    /* renamed from: d */
    public final int f20385d;

    /* renamed from: e */
    public final float f20386e;

    /* renamed from: f */
    public final String f20387f;

    public C3697yv(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f20382a = list;
        this.f20383b = i;
        this.f20384c = i2;
        this.f20385d = i3;
        this.f20386e = f;
        this.f20387f = str;
    }

    /* renamed from: a */
    public static byte[] m30840a(gm4 gm4) {
        int J = gm4.mo20668J();
        int e = gm4.mo20680e();
        gm4.mo20675Q(J);
        return yh0.m30587d(gm4.mo20679d(), e, J);
    }

    /* renamed from: b */
    public static C3697yv m30841b(gm4 gm4) throws ParserException {
        String str;
        float f;
        int i;
        try {
            gm4.mo20675Q(4);
            int D = (gm4.mo20662D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = gm4.mo20662D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    arrayList.add(m30840a(gm4));
                }
                int D3 = gm4.mo20662D();
                for (int i3 = 0; i3 < D3; i3++) {
                    arrayList.add(m30840a(gm4));
                }
                int i4 = -1;
                if (D2 > 0) {
                    q24.C3108c l = q24.m25343l((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i5 = l.f16741f;
                    int i6 = l.f16742g;
                    float f2 = l.f16743h;
                    str = yh0.m30584a(l.f16736a, l.f16737b, l.f16738c);
                    i4 = i5;
                    i = i6;
                    f = f2;
                } else {
                    f = 1.0f;
                    str = null;
                    i = -1;
                }
                return new C3697yv(arrayList, D, i4, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
