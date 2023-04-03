package p000;

import android.util.Base64;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¨\u0006\u0006"}, mo44877d2 = {"", "token", "b", "c", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: db6 */
/* compiled from: String.kt */
public final class db6 {
    /* renamed from: a */
    public static final byte[] m56792a(String str) {
        vx2.m53591g(str, "<this>");
        byte[] decode = Base64.decode(str, 0);
        vx2.m53590f(decode, "decode(this, Base64.DEFAULT)");
        return decode;
    }

    /* renamed from: b */
    public static final String m56793b(String str) {
        vx2.m53591g(str, "token");
        return "https://cloudflare-ipfs.com/ipfs/" + str;
    }

    /* renamed from: c */
    public static final String m56794c(String str) {
        String str2;
        vx2.m53591g(str, "<this>");
        if (yb6.m74336M(str, "ipfs", false, 2, (Object) null)) {
            List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{"://"}, false, 0, 6, (Object) null);
            if (B0.size() >= 2) {
                str2 = (String) B0.get(1);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return m56793b(str2);
            }
            return null;
        } else if (!yb6.m74336M(str, "http", false, 2, (Object) null)) {
            return null;
        } else {
            if (StringsKt__StringsKt.m63081R(str, "pinata.cloud", false, 2, (Object) null) && StringsKt__StringsKt.m63081R(str, "ipfs/", false, 2, (Object) null)) {
                List B02 = StringsKt__StringsKt.m63061B0(str, new String[]{"/ipfs/"}, false, 0, 6, (Object) null);
                if (B02.size() >= 2) {
                    str = m56793b((String) B02.get(1));
                }
            }
            return str;
        }
    }
}
