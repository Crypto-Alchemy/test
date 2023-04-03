package p000;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u000b"}, mo44877d2 = {"Lby3;", "", "", "walletAddress", "currencyCode", "Landroid/net/Uri$Builder;", "b", "refundWalletAddress", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: by3 */
/* compiled from: MoonPay.kt */
public final class by3 {

    /* renamed from: a */
    public static final by3 f37021a = new by3();

    /* renamed from: a */
    public final Uri.Builder mo50749a(String str, String str2) {
        boolean z;
        vx2.m53591g(str, "refundWalletAddress");
        vx2.m53591g(str2, "currencyCode");
        Uri.Builder buildUpon = Uri.parse("https://sell.moonpay.com").buildUpon();
        buildUpon.appendQueryParameter("apiKey", C9384u3.f44861c);
        buildUpon.appendQueryParameter("refundWalletAddress", str);
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            buildUpon.appendQueryParameter("baseCurrencyCode", str2);
        }
        buildUpon.appendQueryParameter("colorCode", "#00a79d");
        buildUpon.appendQueryParameter("quoteCurrencyCode", "USD");
        vx2.m53590f(buildUpon, "parse(MOONPAY_SELL_URL).…cyCode\", \"USD\")\n        }");
        return buildUpon;
    }

    /* renamed from: b */
    public final Uri.Builder mo50750b(String str, String str2) {
        boolean z;
        vx2.m53591g(str, "walletAddress");
        vx2.m53591g(str2, "currencyCode");
        Uri.Builder buildUpon = Uri.parse("https://buy.moonpay.com").buildUpon();
        buildUpon.appendQueryParameter("apiKey", C9384u3.f44861c);
        buildUpon.appendQueryParameter("walletAddress", str);
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            buildUpon.appendQueryParameter("currencyCode", str2);
        }
        buildUpon.appendQueryParameter("colorCode", "#00a79d");
        buildUpon.appendQueryParameter("baseCurrencyCode", "USD");
        vx2.m53590f(buildUpon, "parse(BuildConfig.MOONPA…cyCode\", \"USD\")\n        }");
        return buildUpon;
    }
}
