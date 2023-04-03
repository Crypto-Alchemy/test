package p000;

import androidx.media3.common.C0792h;

/* renamed from: zc6 */
/* compiled from: SubtitleDecoderFactory */
public interface zc6 {

    /* renamed from: a */
    public static final zc6 f20528a = new C3724a();

    /* renamed from: zc6$a */
    /* compiled from: SubtitleDecoderFactory */
    public class C3724a implements zc6 {
        /* renamed from: a */
        public boolean mo28419a(C0792h hVar) {
            String str = hVar.f4175C;
            if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public yc6 mo28420b(C0792h hVar) {
            String str = hVar.f4175C;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new fl1(hVar.f4177I);
                    case 1:
                        return new ko4();
                    case 2:
                        return new hz3();
                    case 3:
                        return new pk7();
                    case 4:
                        return new az6(hVar.f4177I);
                    case 5:
                        return new p76(hVar.f4177I);
                    case 6:
                    case 8:
                        return new dc0(str, hVar.f4197q1, 16000);
                    case 7:
                        return new ex1();
                    case 9:
                        return new fc0(hVar.f4197q1, hVar.f4177I);
                    case 10:
                        return new lc6();
                    case 11:
                        return new ly6();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo28419a(C0792h hVar);

    /* renamed from: b */
    yc6 mo28420b(C0792h hVar);
}
