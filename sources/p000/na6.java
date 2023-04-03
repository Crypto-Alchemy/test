package p000;

import androidx.media3.common.C0792h;
import com.google.common.collect.ImmutableList;

/* renamed from: na6 */
/* compiled from: StreamFormatChunk */
public final class na6 implements C3763zv {

    /* renamed from: a */
    public final C0792h f15512a;

    public na6(C0792h hVar) {
        this.f15512a = hVar;
    }

    /* renamed from: a */
    public static String m23068a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m23069b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: c */
    public static C3763zv m23070c(gm4 gm4) {
        gm4.mo20675Q(4);
        int q = gm4.mo20692q();
        int q2 = gm4.mo20692q();
        gm4.mo20675Q(4);
        int q3 = gm4.mo20692q();
        String a = m23068a(q3);
        if (a == null) {
            gk3.m18132i("StreamFormatChunk", "Ignoring track with unsupported compression " + q3);
            return null;
        }
        C0792h.C0794b bVar = new C0792h.C0794b();
        bVar.mo6675j0(q).mo6656Q(q2).mo6670e0(a);
        return new na6(bVar.mo6644E());
    }

    /* renamed from: d */
    public static C3763zv m23071d(int i, gm4 gm4) {
        if (i == 2) {
            return m23070c(gm4);
        }
        if (i == 1) {
            return m23072e(gm4);
        }
        gk3.m18132i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + w67.m29359i0(i));
        return null;
    }

    /* renamed from: e */
    public static C3763zv m23072e(gm4 gm4) {
        int v = gm4.mo20697v();
        String b = m23069b(v);
        if (b == null) {
            gk3.m18132i("StreamFormatChunk", "Ignoring track with unsupported format tag " + v);
            return null;
        }
        int v2 = gm4.mo20697v();
        int q = gm4.mo20692q();
        gm4.mo20675Q(6);
        int Y = w67.m29340Y(gm4.mo20668J());
        int v3 = gm4.mo20697v();
        byte[] bArr = new byte[v3];
        gm4.mo20685j(bArr, 0, v3);
        C0792h.C0794b bVar = new C0792h.C0794b();
        bVar.mo6670e0(b).mo6647H(v2).mo6671f0(q);
        if ("audio/raw".equals(b) && Y != 0) {
            bVar.mo6664Y(Y);
        }
        if ("audio/mp4a-latm".equals(b) && v3 > 0) {
            bVar.mo6659T(ImmutableList.m36628of(bArr));
        }
        return new na6(bVar.mo6644E());
    }

    public int getType() {
        return 1718776947;
    }
}
