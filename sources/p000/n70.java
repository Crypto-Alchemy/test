package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: n70 */
/* compiled from: CCTDestination */
public final class n70 implements fp1 {

    /* renamed from: c */
    public static final String f31980c;

    /* renamed from: d */
    public static final String f31981d;

    /* renamed from: e */
    public static final String f31982e;

    /* renamed from: f */
    public static final Set<qp1> f31983f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new qp1[]{qp1.m50725b("proto"), qp1.m50725b("json")})));

    /* renamed from: g */
    public static final n70 f31984g;

    /* renamed from: h */
    public static final n70 f31985h;

    /* renamed from: a */
    public final String f31986a;

    /* renamed from: b */
    public final String f31987b;

    static {
        String a = fb6.m44244a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f31980c = a;
        String a2 = fb6.m44244a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f31981d = a2;
        String a3 = fb6.m44244a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f31982e = a3;
        f31984g = new n70(a, (String) null);
        f31985h = new n70(a2, a3);
    }

    public n70(String str, String str2) {
        this.f31986a = str;
        this.f31987b = str2;
    }

    /* renamed from: c */
    public static n70 m48646c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new n70(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<qp1> mo42641a() {
        return f31983f;
    }

    /* renamed from: b */
    public byte[] mo46004b() {
        String str = this.f31987b;
        if (str == null && this.f31986a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f31986a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String mo46005d() {
        return this.f31987b;
    }

    /* renamed from: e */
    public String mo46006e() {
        return this.f31986a;
    }

    public byte[] getExtras() {
        return mo46004b();
    }

    public String getName() {
        return "cct";
    }
}
