package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: vv3 */
/* compiled from: MimeTypes */
public final class vv3 {

    /* renamed from: a */
    public static final ArrayList<C3511a> f18902a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f18903b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: vv3$a */
    /* compiled from: MimeTypes */
    public static final class C3511a {

        /* renamed from: a */
        public final String f18904a;

        /* renamed from: b */
        public final String f18905b;

        /* renamed from: c */
        public final int f18906c;
    }

    /* renamed from: vv3$b */
    /* compiled from: MimeTypes */
    public static final class C3512b {

        /* renamed from: a */
        public final int f18907a;

        /* renamed from: b */
        public final int f18908b;

        public C3512b(int i, int i2) {
            this.f18907a = i;
            this.f18908b = i2;
        }

        /* renamed from: a */
        public int mo27338a() {
            int i = this.f18908b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i == 22) {
                return 1073741824;
            }
            if (i != 23) {
                return 0;
            }
            return 15;
        }
    }

    /* renamed from: a */
    public static boolean m29127a(String str, String str2) {
        C3512b g;
        int a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (g = m29133g(str2)) == null || (a = g.mo27338a()) == 0 || a == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static String m29128b(String str) {
        if (str == null) {
            return null;
        }
        for (String e : w67.m29321N0(str)) {
            String e2 = m29131e(e);
            if (e2 != null && m29139m(e2)) {
                return e2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m29129c(String str) {
        int size = f18902a.size();
        for (int i = 0; i < size; i++) {
            C3511a aVar = f18902a.get(i);
            if (str.startsWith(aVar.f18905b)) {
                return aVar.f18904a;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static int m29130d(String str, String str2) {
        C3512b g;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (g = m29133g(str2)) == null) {
                    return 0;
                }
                return g.mo27338a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public static String m29131e(String str) {
        C3512b g;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e = C5876gr.m44841e(str.trim());
        if (e.startsWith("avc1") || e.startsWith("avc3")) {
            return "video/avc";
        }
        if (e.startsWith("hev1") || e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e.startsWith("dvav") || e.startsWith("dva1") || e.startsWith("dvhe") || e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e.startsWith("av01")) {
            return "video/av01";
        }
        if (e.startsWith("vp9") || e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e.startsWith("vp8") || e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e.startsWith("mp4a")) {
            if (e.startsWith("mp4a.") && (g = m29133g(e)) != null) {
                str2 = m29132f(g.f18907a);
            }
            if (str2 == null) {
                return "audio/mp4a-latm";
            }
            return str2;
        } else if (e.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (e.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (e.startsWith("ac-3") || e.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (e.startsWith("ec-3") || e.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (e.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (e.startsWith("ac-4") || e.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (e.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (e.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (e.startsWith("dtsh") || e.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (e.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (e.startsWith("opus")) {
                return "audio/opus";
            }
            if (e.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (e.startsWith("flac")) {
                return "audio/flac";
            }
            if (e.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (e.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (e.contains("cea708")) {
                return "application/cea-708";
            }
            if (e.contains("eia608") || e.contains("cea608")) {
                return "application/cea-608";
            }
            return m29129c(e);
        }
    }

    /* renamed from: f */
    public static String m29132f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: g */
    public static C3512b m29133g(String str) {
        Matcher matcher = f18903b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C2725kr.m20985e(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new C3512b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m29134h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: i */
    public static int m29135i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m29139m(str)) {
            return 1;
        }
        if (m29143q(str)) {
            return 2;
        }
        if (m29142p(str)) {
            return 3;
        }
        if (m29140n(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m29136j(str);
    }

    /* renamed from: j */
    public static int m29136j(String str) {
        int size = f18902a.size();
        for (int i = 0; i < size; i++) {
            C3511a aVar = f18902a.get(i);
            if (str.equals(aVar.f18904a)) {
                return aVar.f18906c;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public static int m29137k(String str) {
        return m29135i(m29131e(str));
    }

    /* renamed from: l */
    public static String m29138l(String str) {
        if (str == null) {
            return null;
        }
        for (String e : w67.m29321N0(str)) {
            String e2 = m29131e(e);
            if (e2 != null && m29143q(e2)) {
                return e2;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m29139m(String str) {
        return "audio".equals(m29134h(str));
    }

    /* renamed from: n */
    public static boolean m29140n(String str) {
        return "image".equals(m29134h(str));
    }

    /* renamed from: o */
    public static boolean m29141o(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m29142p(String str) {
        if (PublicResolver.FUNC_TEXT.equals(m29134h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m29143q(String str) {
        return "video".equals(m29134h(str));
    }

    /* renamed from: r */
    public static String m29144r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
