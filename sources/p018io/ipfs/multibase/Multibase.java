package p018io.ipfs.multibase;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.ipfs.multibase.Multibase */
public class Multibase {

    /* renamed from: io.ipfs.multibase.Multibase$Base */
    public enum Base {
        Base1('1'),
        Base2('0'),
        Base8('7'),
        Base10('9'),
        Base16('f'),
        Base16Upper('F'),
        Base32('b'),
        Base32Upper('B'),
        Base32Pad('c'),
        Base32PadUpper('C'),
        Base32Hex('v'),
        Base32HexUpper('V'),
        Base32HexPad('t'),
        Base32HexPadUpper('T'),
        Base36('k'),
        Base36Upper('K'),
        Base58BTC('z'),
        Base58Flickr('Z'),
        Base64('m'),
        Base64Url('u'),
        Base64Pad('M'),
        Base64UrlPad('U');
        

        /* renamed from: a */
        public static Map<Character, Base> f29994a;
        public char prefix;

        /* access modifiers changed from: public */
        static {
            f29994a = new TreeMap();
            for (Base base : values()) {
                f29994a.put(Character.valueOf(base.prefix), base);
            }
        }

        /* access modifiers changed from: public */
        Base(char c) {
            this.prefix = c;
        }

        public static Base lookup(char c) {
            if (f29994a.containsKey(Character.valueOf(c))) {
                return f29994a.get(Character.valueOf(c));
            }
            throw new IllegalStateException("Unknown Multibase type: " + c);
        }
    }

    /* renamed from: io.ipfs.multibase.Multibase$a */
    public static /* synthetic */ class C5977a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29996a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.ipfs.multibase.Multibase$Base[] r0 = p018io.ipfs.multibase.Multibase.Base.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29996a = r0
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base58BTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base16     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base16Upper     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32Pad     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32PadUpper     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32Upper     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32Hex     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32HexPad     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32HexPadUpper     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base32HexUpper     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base36     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x009c }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base36Upper     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base64Url     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base64Pad     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f29996a     // Catch:{ NoSuchFieldError -> 0x00cc }
                io.ipfs.multibase.Multibase$Base r1 = p018io.ipfs.multibase.Multibase.Base.Base64UrlPad     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.ipfs.multibase.Multibase.C5977a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m45830a(Base base, byte[] bArr) {
        switch (C5977a.f29996a[base.ordinal()]) {
            case 1:
                char c = base.prefix;
                String c2 = C6296nx.m49065c(bArr);
                return c + c2;
            case 2:
                char c3 = base.prefix;
                String c4 = C6132jx.m46802c(bArr);
                return c3 + c4;
            case 3:
                char c5 = base.prefix;
                String upperCase = C6132jx.m46802c(bArr).toUpperCase();
                return c5 + upperCase;
            case 4:
                char c6 = base.prefix;
                String replaceAll = new String(new C6231lx().mo29393d(bArr)).toLowerCase().replaceAll("=", "");
                return c6 + replaceAll;
            case 5:
                char c7 = base.prefix;
                String lowerCase = new String(new C6231lx().mo29393d(bArr)).toLowerCase();
                return c7 + lowerCase;
            case 6:
                char c8 = base.prefix;
                String str = new String(new C6231lx().mo29393d(bArr));
                return c8 + str;
            case 7:
                char c9 = base.prefix;
                String replaceAll2 = new String(new C6231lx().mo29393d(bArr)).replaceAll("=", "");
                return c9 + replaceAll2;
            case 8:
                char c10 = base.prefix;
                String replaceAll3 = new String(new C6231lx(true).mo29393d(bArr)).toLowerCase().replaceAll("=", "");
                return c10 + replaceAll3;
            case 9:
                char c11 = base.prefix;
                String lowerCase2 = new String(new C6231lx(true).mo29393d(bArr)).toLowerCase();
                return c11 + lowerCase2;
            case 10:
                char c12 = base.prefix;
                String str2 = new String(new C6231lx(true).mo29393d(bArr));
                return c12 + str2;
            case 11:
                char c13 = base.prefix;
                String replaceAll4 = new String(new C6231lx(true).mo29393d(bArr)).replaceAll("=", "");
                return c13 + replaceAll4;
            case 12:
                char c14 = base.prefix;
                String a = C6266mx.m48524a(bArr);
                return c14 + a;
            case 13:
                char c15 = base.prefix;
                String upperCase2 = C6266mx.m48524a(bArr).toUpperCase();
                return c15 + upperCase2;
            case 14:
                char c16 = base.prefix;
                String replaceAll5 = C6379px.m50179p(bArr).replaceAll("=", "");
                return c16 + replaceAll5;
            case 15:
                char c17 = base.prefix;
                String replaceAll6 = C6379px.m50180q(bArr).replaceAll("=", "");
                return c17 + replaceAll6;
            case 16:
                char c18 = base.prefix;
                String p = C6379px.m50179p(bArr);
                return c18 + p;
            case 17:
                char c19 = base.prefix;
                String replaceAll7 = C6379px.m50179p(bArr).replaceAll("\\+", "-").replaceAll("/", "_");
                return c19 + replaceAll7;
            default:
                String name = base.name();
                throw new IllegalStateException("Unsupported base encoding: " + name);
        }
    }
}
