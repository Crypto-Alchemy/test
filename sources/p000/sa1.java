package p000;

import android.util.SparseArray;
import androidx.media3.common.C0792h;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import p000.iy6;

/* renamed from: sa1 */
/* compiled from: DefaultTsPayloadReaderFactory */
public final class sa1 implements iy6.C2578c {

    /* renamed from: a */
    public final int f17537a;

    /* renamed from: b */
    public final List<C0792h> f17538b;

    public sa1(int i) {
        this(i, ImmutableList.m36627of());
    }

    /* renamed from: a */
    public SparseArray<iy6> mo21668a() {
        return new SparseArray<>();
    }

    /* renamed from: b */
    public iy6 mo21669b(int i, iy6.C2577b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new jo4(new jz3(bVar.f13448b));
            }
            if (i == 21) {
                return new jo4(new xp2());
            }
            if (i != 27) {
                if (i == 36) {
                    return new jo4(new gk2(mo25696c(bVar)));
                }
                if (i == 89) {
                    return new jo4(new il1(bVar.f13449c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new jo4(new C3396u7(bVar.f13448b));
                    }
                    if (i == 257) {
                        return new wr5(new rm4("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (mo25699f(2)) {
                                        return null;
                                    }
                                    return new jo4(new C2382gd(false, bVar.f13448b));
                                case 16:
                                    return new jo4(new ek2(mo25697d(bVar)));
                                case 17:
                                    if (mo25699f(2)) {
                                        return null;
                                    }
                                    return new jo4(new fe3(bVar.f13448b));
                                default:
                                    switch (i) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!mo25699f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new jo4(new C3131q7(bVar.f13448b));
                    } else if (mo25699f(16)) {
                        return null;
                    } else {
                        return new wr5(new rm4("application/x-scte35"));
                    }
                }
                return new jo4(new yk1(bVar.f13448b));
            } else if (mo25699f(4)) {
                return null;
            } else {
                return new jo4(new fk2(mo25696c(bVar), mo25699f(1), mo25699f(8)));
            }
        }
        return new jo4(new dk2(mo25697d(bVar)));
    }

    /* renamed from: c */
    public final gt5 mo25696c(iy6.C2577b bVar) {
        return new gt5(mo25698e(bVar));
    }

    /* renamed from: d */
    public final r57 mo25697d(iy6.C2577b bVar) {
        return new r57(mo25698e(bVar));
    }

    /* renamed from: e */
    public final List<C0792h> mo25698e(iy6.C2577b bVar) {
        boolean z;
        String str;
        int i;
        if (mo25699f(32)) {
            return this.f17538b;
        }
        gm4 gm4 = new gm4(bVar.f13450d);
        List<C0792h> list = this.f17538b;
        while (gm4.mo20676a() > 0) {
            int D = gm4.mo20662D();
            int e = gm4.mo20680e() + gm4.mo20662D();
            if (D == 134) {
                list = new ArrayList<>();
                int D2 = gm4.mo20662D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    String A = gm4.mo20659A(3);
                    int D3 = gm4.mo20662D();
                    boolean z2 = true;
                    if ((D3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte D4 = (byte) gm4.mo20662D();
                    gm4.mo20675Q(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        if ((D4 & 64) == 0) {
                            z2 = false;
                        }
                        list2 = yh0.m30585b(z2);
                    }
                    list.add(new C0792h.C0794b().mo6670e0(str).mo6661V(A).mo6645F(i).mo6659T(list2).mo6644E());
                }
            }
            gm4.mo20674P(e);
        }
        return list;
    }

    /* renamed from: f */
    public final boolean mo25699f(int i) {
        if ((i & this.f17537a) != 0) {
            return true;
        }
        return false;
    }

    public sa1(int i, List<C0792h> list) {
        this.f17537a = i;
        this.f17538b = list;
    }
}
