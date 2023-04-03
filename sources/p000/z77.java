package p000;

import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lz77;", "", "", "uri", "Lhh7;", "a", "(Ljava/lang/String;)Lhh7;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z77 */
/* compiled from: Validator.kt */
public final class z77 {

    /* renamed from: a */
    public static final z77 f35998a = new z77();

    /* renamed from: a */
    public final /* synthetic */ hh7 mo49801a(String str) {
        boolean z;
        r37 r37;
        boolean z2;
        r37 r372;
        String str2 = str;
        vx2.m53591g(str2, "uri");
        boolean z3 = false;
        if (!yb6.m74336M(str2, "wc:", false, 2, (Object) null)) {
            return null;
        }
        if (!StringsKt__StringsKt.m63081R(str2, "wc://", false, 2, (Object) null)) {
            if (StringsKt__StringsKt.m63081R(str2, "wc:/", false, 2, (Object) null)) {
                str2 = yb6.m74332I(str, "wc:/", "wc://", false, 4, (Object) null);
            } else {
                str2 = yb6.m74332I(str, "wc:", "wc://", false, 4, (Object) null);
            }
        }
        try {
            URI uri = new URI(str2);
            String userInfo = uri.getUserInfo();
            vx2.m53590f(userInfo, "pairUri.userInfo");
            if (userInfo.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String query = uri.getQuery();
            vx2.m53590f(query, "pairUri.query");
            List<String> B0 = StringsKt__StringsKt.m63061B0(query, new String[]{"&"}, false, 0, 6, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(B0, 10)), 16));
            for (String str3 : B0) {
                Pair a = wy6.m54142a(StringsKt__StringsKt.m63084S0(str3, "=", (String) null, 2, (Object) null), StringsKt__StringsKt.m63072M0(str3, "=", (String) null, 2, (Object) null));
                linkedHashMap.put(a.getFirst(), a.getSecond());
            }
            String str4 = (String) linkedHashMap.get("relay-protocol");
            if (str4 != null) {
                r37 = r37.f33317a;
            } else {
                str4 = "";
                r37 = null;
            }
            if (r37 == null) {
                return null;
            }
            if (str4.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            String str5 = (String) linkedHashMap.get("relay-data");
            String str6 = (String) linkedHashMap.get("symKey");
            if (str6 != null) {
                r372 = r37.f33317a;
            } else {
                str6 = "";
                r372 = null;
            }
            if (r372 == null) {
                return null;
            }
            if (str6.length() == 0) {
                z3 = true;
            }
            if (z3) {
                return null;
            }
            String userInfo2 = uri.getUserInfo();
            vx2.m53590f(userInfo2, "pairUri.userInfo");
            return new hh7(new es6(userInfo2), yj6.m54789c(str6), new RelayProtocolOptions(str4, str5), (String) null, 8, (DefaultConstructorMarker) null);
        } catch (URISyntaxException unused) {
            return null;
        }
    }
}
