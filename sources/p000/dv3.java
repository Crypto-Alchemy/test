package p000;

import androidx.media3.common.C0792h;

/* renamed from: dv3 */
/* compiled from: MetadataDecoderFactory */
public interface dv3 {

    /* renamed from: a */
    public static final dv3 f10900a = new C2203a();

    /* renamed from: dv3$a */
    /* compiled from: MetadataDecoderFactory */
    public class C2203a implements dv3 {
        /* renamed from: a */
        public boolean mo18950a(C0792h hVar) {
            String str = hVar.f4175C;
            if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public cv3 mo18951b(C0792h hVar) {
            String str = hVar.f4175C;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C3746zn();
                    case 1:
                        return new tp2();
                    case 2:
                        return new vp2();
                    case 3:
                        return new zt1();
                    case 4:
                        return new u66();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo18950a(C0792h hVar);

    /* renamed from: b */
    cv3 mo18951b(C0792h hVar);
}
