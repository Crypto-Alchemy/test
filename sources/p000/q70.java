package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.utils.PreFetchData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f\u001a\n\u0010\u0011\u001a\u00020\u000e*\u00020\u0010¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/Coin;", "", "d", "e", "symbol", "", "cmcId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "Lw70;", "a", "g", "Lnet/safemoon/androidwallet/common/TokenType;", "selectedTokenType", "", "h", "Lzh0;", "f", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: q70 */
/* compiled from: CMC.kt */
public final class q70 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: q70$a */
    /* compiled from: CMC.kt */
    public /* synthetic */ class C9205a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44155a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20_TEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20_TEST     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f44155a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q70.C9205a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final w70 m71185a(String str, String str2) {
        T t;
        boolean z;
        boolean z2;
        vx2.m53591g(str, "<this>");
        if (vx2.m53586b(str2, "SAFEMOON")) {
            return new w70("0x8076c74c5e3f5852037f31ff0093eeb8c8add8d3", "8757", "safemoon", "SAFEMOON", 9, 56, Utils.DOUBLE_EPSILON, false);
        }
        Iterator<T> it = PreFetchData.f42593a.mo60932a().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            w70 w70 = (w70) next;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str2 != null) {
                    t = str2.toLowerCase(Locale.ROOT);
                    vx2.m53590f(t, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                String lowerCase = w70.mo66650h().toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                z2 = vx2.m53586b(t, lowerCase);
                continue;
            } else {
                String a = w70.mo66642a();
                Locale locale = Locale.ROOT;
                String lowerCase2 = a.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase3 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                z2 = vx2.m53586b(lowerCase2, lowerCase3);
                continue;
            }
            if (z2) {
                t = next;
                break;
            }
        }
        return (w70) t;
    }

    /* renamed from: b */
    public static final String m71186b(String str, String str2, Integer num) {
        T t;
        boolean z;
        boolean z2;
        String str3;
        String num2;
        vx2.m53591g(str, "<this>");
        if (vx2.m53586b(str2, "SAFEMOON")) {
            return "8757";
        }
        if (num != null && (num2 = num.toString()) != null) {
            return num2;
        }
        Iterator<T> it = PreFetchData.f42593a.mo60932a().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            w70 w70 = (w70) t;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str2 != null) {
                    str3 = str2.toLowerCase(Locale.ROOT);
                    vx2.m53590f(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str3 = null;
                }
                String lowerCase = w70.mo66650h().toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                z2 = vx2.m53586b(str3, lowerCase);
                continue;
            } else {
                String a = w70.mo66642a();
                Locale locale = Locale.ROOT;
                String lowerCase2 = a.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase3 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                z2 = vx2.m53586b(lowerCase2, lowerCase3);
                continue;
            }
            if (z2) {
                break;
            }
        }
        w70 w702 = (w70) t;
        if (w702 != null) {
            return w702.mo66644c();
        }
        return null;
    }

    /* renamed from: c */
    public static /* synthetic */ String m71187c(String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return m71186b(str, str2, num);
    }

    /* renamed from: d */
    public static final String m71188d(Coin coin) {
        vx2.m53591g(coin, "<this>");
        String name = coin.getName();
        vx2.m53590f(name, "this.name");
        return name;
    }

    /* renamed from: e */
    public static final String m71189e(String str) {
        vx2.m53591g(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (vx2.m53586b(upperCase, "PSAFEMOON")) {
            return "SAFEMOON";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0.equals("SAFEMOON") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return java.lang.Integer.valueOf(net.safemoon.androidwallet.R.drawable.safemoon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0.equals("SFM") == false) goto L_0x003f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71190f(p000.zh0 r3) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = r3.mo67301b()
            int r1 = r0.hashCode()
            r2 = -1747297266(0xffffffff97da5c0e, float:-1.4111158E-24)
            if (r1 == r2) goto L_0x0037
            r2 = -314766242(0xffffffffed3d0c5e, float:-3.656726E27)
            if (r1 == r2) goto L_0x0026
            r2 = 82010(0x1405a, float:1.1492E-40)
            if (r1 == r2) goto L_0x001d
            goto L_0x003f
        L_0x001d:
            java.lang.String r1 = "SFM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            goto L_0x005e
        L_0x0026:
            java.lang.String r1 = "PSAFEMOON"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002f
            goto L_0x003f
        L_0x002f:
            r3 = 2131231275(0x7f08022b, float:1.8078626E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0065
        L_0x0037:
            java.lang.String r1 = "SAFEMOON"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005e
        L_0x003f:
            java.lang.String r0 = r3.mo67302c()
            if (r0 == 0) goto L_0x004e
            boolean r0 = p000.yb6.m74325B(r0)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r0 = 0
            goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            if (r0 != 0) goto L_0x0056
            java.lang.String r3 = r3.mo67302c()
            goto L_0x005a
        L_0x0056:
            java.lang.Integer r3 = r3.mo67300a()
        L_0x005a:
            p000.vx2.m53588d(r3)
            goto L_0x0065
        L_0x005e:
            r3 = 2131231313(0x7f080251, float:1.8078703E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0065:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q70.m71190f(zh0):java.lang.Object");
    }

    /* renamed from: g */
    public static final String m71191g(String str, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "symbol");
        if (vx2.m53586b(str2, "PSAFEMOON")) {
            return "PSAFEMOON";
        }
        return str;
    }

    /* renamed from: h */
    public static final Object m71192h(String str, String str2, TokenType tokenType) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(tokenType, "selectedTokenType");
        int hashCode = str2.hashCode();
        if (hashCode == -1747297266 ? !str2.equals("SAFEMOON") : !(hashCode == -314766242 ? str2.equals("PSAFEMOON") : hashCode == 82010 && str2.equals("SFM"))) {
            return str;
        }
        int i = C9205a.f44155a[tokenType.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.safemoon);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.p_safemoon);
        }
        if (i == 3) {
            return Integer.valueOf(R.drawable.safemoon);
        }
        if (i != 4) {
            return str;
        }
        return Integer.valueOf(R.drawable.p_safemoon);
    }
}
