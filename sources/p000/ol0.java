package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.os.Vibrator;
import android.p001os.VibrationEffect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets$Type;
import android.view.WindowMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.common.PlaybackException;
import com.bumptech.glide.C1710a;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import java.io.File;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.wallet.Convert;
import net.safemoon.androidwallet.utils.Common;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002\u001a(\u0010\f\u001a\u00020\u0003*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n\u001a\u0012\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00030\u0003*\u00020\u0002\u001a\u0012\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\n*\u00020\u0003\u001a\n\u0010\u0015\u001a\u00020\u0002*\u00020\u0003\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0011*\u00020\u0003\u001a\n\u0010\u0017\u001a\u00020\n*\u00020\u0003\u001a@\u0010!\u001a\u00020\u001f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001f0\u001e\u001a\u0014\u0010$\u001a\u00020\u0003*\u00020\"2\b\b\u0002\u0010#\u001a\u00020\n\u001a\n\u0010%\u001a\u00020\"*\u00020\u0003\u001a\n\u0010'\u001a\u00020\u001f*\u00020&\u001a\u0012\u0010)\u001a\u00020\u001f*\u00020&2\u0006\u0010(\u001a\u00020\u0003\u001a\u0012\u0010+\u001a\u00020\u001f*\u00020*2\u0006\u0010(\u001a\u00020\u0003\u001a\n\u0010,\u001a\u00020\u001f*\u00020*\u001a\u0014\u0010-\u001a\u00020\u001f*\u00020&2\b\b\u0001\u0010(\u001a\u00020\u0006\u001a\n\u0010/\u001a\u00020\u001f*\u00020.\u001a\u0012\u00101\u001a\u00020\u001f*\u00020\u00032\u0006\u00100\u001a\u00020\u0003\u001a\n\u00102\u001a\u00020\u0006*\u00020\n\u001a\n\u00103\u001a\u00020\u0006*\u00020\n\u001a\n\u00104\u001a\u00020\u0006*\u00020\n\u001a\u001a\u00107\u001a\n \r*\u0004\u0018\u00010606*\u00020\u00112\u0006\u00105\u001a\u00020\u0006\u001a\u001a\u00108\u001a\n \r*\u0004\u0018\u00010\u00110\u0011*\u00020\u00032\u0006\u00105\u001a\u00020\u0006\u001a\u001a\u00109\u001a\n \r*\u0004\u0018\u00010\u00110\u0011*\u0002062\u0006\u00105\u001a\u00020\u0006\u001a\n\u0010;\u001a\u00020\u0003*\u00020:\u001a \u0010>\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010<\u001a\u00020\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010?\u001a\u00020\u001f*\u00020.\u001a\u000e\u0010A\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003\u001a\u001a\u0010D\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\n\u001a\u0012\u0010E\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u0002\u001a\u001a\u0010F\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001a\u0010H\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0003\u001a\u001a\u0010I\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0003\u001a\u001a\u0010J\u001a\u00020\u001f*\u00020.2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\n\u001a\u0012\u0010L\u001a\u00020\u0003*\u00020\u00022\u0006\u0010K\u001a\u00020&\u001a\u001a\u0010O\u001a\u00020\u001f*\u00020\u00182\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010M\u001a\n\u0010Q\u001a\u00020P*\u00020\u0018\u001a\n\u0010T\u001a\u00020S*\u00020R\u001a\n\u0010U\u001a\u00020\u0003*\u00020R\u001a\n\u0010V\u001a\u00020\u0006*\u00020*\u001a0\u0010[\u001a\u00020Z*\u00020&2\u0006\u0010W\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u0003\u001a&\u0010]\u001a\u00020\u001f*\u00020\\2\u0006\u0010W\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010^\u001a\u00020\u001f*\u00020\\2\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010@\u001a\u00020\u0003\u001a\f\u0010`\u001a\u0004\u0018\u00010_*\u00020&\u001a\n\u0010a\u001a\u00020R*\u00020&\u001a\n\u0010b\u001a\u00020R*\u00020&\u001a\u0012\u0010d\u001a\u00020\u001f*\u00020&2\u0006\u0010c\u001a\u00020\u0003\u001a\u0012\u0010e\u001a\u00020\u001f*\u00020*2\u0006\u0010c\u001a\u00020\u0003\u001a\n\u0010f\u001a\u00020\u0003*\u00020\u0003\u001a\u001a\u0010h\u001a\u00020\u0002*\u0012\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0006\u0012\u0004\u0018\u00010:0g\u001a\n\u0010i\u001a\u00020\u0003*\u00020\u0003\u001a$\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000j\"\u0004\b\u0000\u0010I*\b\u0012\u0004\u0012\u00028\u00000j2\u0006\u0010l\u001a\u00020k\u001a\u000e\u0010n\u001a\u0004\u0018\u000106*\u0004\u0018\u000106\u001a\n\u0010o\u001a\u00020\u0003*\u00020\u0006\"\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010r\"\u0018\u0010u\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010r¨\u0006v"}, mo44877d2 = {"Ljava/text/DecimalFormatSymbols;", "k", "", "", "m", "n", "", "scale", "Ljava/math/RoundingMode;", "_roundingMode", "", "smallestForce", "o", "kotlin.jvm.PlatformType", "j", "i", "L", "Ljava/math/BigDecimal;", "maximumScale", "f0", "i0", "J", "K", "H", "Landroid/view/View;", "view", "msg", "length", "", "actionMessage", "Lkotlin/Function1;", "Lr37;", "action", "c0", "", "withPrefix", "e0", "F", "Landroid/content/Context;", "E", "message", "Z", "Landroid/app/Activity;", "a0", "G", "Y", "Landroid/widget/TextView;", "U", "tag", "b0", "l0", "j0", "k0", "decimal", "Ljava/math/BigInteger;", "h0", "q", "r", "Lnet/safemoon/androidwallet/model/swap/Swap;", "D", "chainId", "address", "C", "V", "symbol", "t", "balance", "showUnit", "M", "Q", "R", "tokenSymbol", "S", "T", "N", "context", "y", "Lkotlin/Function0;", "unit", "W", "", "u", "Lnet/safemoon/androidwallet/common/TokenType;", "Li30;", "s", "x", "A", "iconResId", "imageName", "cmcId", "", "w", "Landroid/widget/ImageView;", "P", "O", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "c", "e", "f", "text", "h", "g", "d", "Lkotlin/Pair;", "B", "v", "", "Ljava/lang/reflect/Type;", "itemType", "l", "I", "z", "Landroid/widget/Toast;", "a", "Landroid/widget/Toast;", "toast", "b", "toastCenter", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ol0 */
/* compiled from: Common.kt */
public final class ol0 {

    /* renamed from: a */
    public static Toast f43732a;

    /* renamed from: b */
    public static Toast f43733b;

    /* renamed from: A */
    public static final int m70321A(Activity activity) {
        vx2.m53591g(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics a = activity.getWindowManager().getCurrentWindowMetrics();
            vx2.m53590f(a, "windowManager.currentWindowMetrics");
            Insets a2 = a.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            vx2.m53590f(a2, "windowMetrics.windowInse…Insets.Type.systemBars())");
            return (a.getBounds().width() - a2.left) - a2.right;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: B */
    public static final double m70322B(Pair<? extends Swap, ? extends Swap> pair) {
        Double d;
        double d2;
        double d3;
        int i;
        vx2.m53591g(pair, "<this>");
        Swap swap = (Swap) pair.getFirst();
        Double d4 = null;
        if (swap != null) {
            d = swap.sellSlippage;
        } else {
            d = null;
        }
        if (d == null) {
            d2 = 0.0d;
        } else {
            d2 = d.doubleValue();
        }
        Swap swap2 = (Swap) pair.getSecond();
        if (swap2 != null) {
            d4 = swap2.buySlippage;
        }
        if (d4 == null) {
            d3 = 0.0d;
        } else {
            d3 = d4.doubleValue();
        }
        double d5 = d2 + d3;
        if (d2 <= Utils.DOUBLE_EPSILON || d3 <= Utils.DOUBLE_EPSILON) {
            i = 0;
        } else {
            i = 1;
        }
        return d5 + ((double) i);
    }

    /* renamed from: C */
    public static final String m70323C(String str, int i, String str2) {
        vx2.m53591g(str, "<this>");
        if (i == 1 && vx2.m53586b(str, "ETH")) {
            return "0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2";
        }
        if (i == 56 && vx2.m53586b(str, "BNB")) {
            return "0xbb4CdB9CBd36B01bD1cBaEBF2De08d9173bc095c";
        }
        if (i != 97 || !vx2.m53586b(str, "BNB")) {
            return str2;
        }
        return "0xae13d989dac2f0debff460ac112a837c89baa7cd";
    }

    /* renamed from: D */
    public static final String m70324D(Swap swap) {
        vx2.m53591g(swap, "<this>");
        Integer num = swap.chainId;
        if (num != null && num.intValue() == 1 && vx2.m53586b(swap.symbol, "ETH")) {
            return "0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2";
        }
        Integer num2 = swap.chainId;
        if (num2 != null && num2.intValue() == 56 && vx2.m53586b(swap.symbol, "BNB")) {
            return "0xbb4CdB9CBd36B01bD1cBaEBF2De08d9173bc095c";
        }
        Integer num3 = swap.chainId;
        if (num3 != null && num3.intValue() == 97 && vx2.m53586b(swap.symbol, "BNB")) {
            return "0xae13d989dac2f0debff460ac112a837c89baa7cd";
        }
        String str = swap.address;
        vx2.m53590f(str, "this.address");
        return str;
    }

    /* renamed from: E */
    public static final void m70325E(Context context) {
        vx2.m53591g(context, "<this>");
        Object systemService = context.getSystemService("vibrator");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50, 10));
        } else {
            vibrator.vibrate(50);
        }
    }

    /* renamed from: F */
    public static final byte[] m70326F(String str) {
        String str2 = str;
        vx2.m53591g(str2, "<this>");
        byte[] bArr = new byte[(str.length() / 2)];
        pw2 p = d75.m43394p(d75.m43395q(0, str.length()), 2);
        int n = p.mo46910n();
        int q = p.mo46911q();
        int r = p.mo46912r();
        if ((r > 0 && n <= q) || (r < 0 && q <= n)) {
            while (true) {
                bArr[n >> 1] = (byte) ((StringsKt__StringsKt.m63099d0("0123456789ABCDEF", Character.toUpperCase(str2.charAt(n)), 0, false, 6, (Object) null) << 4) | StringsKt__StringsKt.m63099d0("0123456789ABCDEF", Character.toUpperCase(str2.charAt(n + 1)), 0, false, 6, (Object) null));
                if (n == q) {
                    break;
                }
                n += r;
            }
        }
        return bArr;
    }

    /* renamed from: G */
    public static final void m70327G(Activity activity) {
        vx2.m53591g(activity, "<this>");
        Toast toast = f43733b;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* renamed from: H */
    public static final boolean m70328H(String str) {
        Object obj;
        vx2.m53591g(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        switch (lowerCase.hashCode()) {
            case -2095018025:
                if (lowerCase.equals("aquagoat")) {
                    return false;
                }
                break;
            case 97686:
                if (lowerCase.equals("bnb")) {
                    return false;
                }
                break;
            case 113786:
                if (lowerCase.equals("sfm")) {
                    return false;
                }
                break;
            case 3006252:
                if (lowerCase.equals("avax")) {
                    return false;
                }
                break;
            case 1765043214:
                if (lowerCase.equals("safemoon")) {
                    return false;
                }
                break;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Coin> arrayList2 = MyApplicationClass.m64669c().f41190r;
        vx2.m53590f(arrayList2, "get().cmcCoins");
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String symbol = ((Coin) obj).getSymbol();
                vx2.m53590f(symbol, "it.symbol");
                Locale locale = Locale.ROOT;
                String lowerCase2 = symbol.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase3 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (vx2.m53586b(lowerCase2, lowerCase3)) {
                }
            } else {
                obj = null;
            }
        }
        if (((Coin) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static final BigInteger m70329I(BigInteger bigInteger) {
        if (bigInteger != null) {
            BigDecimal multiply = new BigDecimal(bigInteger).multiply(new BigDecimal(1.1d));
            vx2.m53590f(multiply, "this.multiply(other)");
            if (multiply != null) {
                return multiply.toBigInteger();
            }
        }
        return null;
    }

    /* renamed from: J */
    public static final double m70330J(String str) {
        vx2.m53591g(str, "<this>");
        try {
            BigDecimal K = m70331K(str);
            if (K != null) {
                return K.doubleValue();
            }
            return Utils.DOUBLE_EPSILON;
        } catch (Exception unused) {
            return Utils.DOUBLE_EPSILON;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[Catch:{ Exception -> 0x00b4 }] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.math.BigDecimal m70331K(java.lang.String r17) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r17
            p000.vx2.m53591g(r1, r0)
            r0 = 0
            java.lang.CharSequence r2 = kotlin.text.StringsKt__StringsKt.m63090V0(r17)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b4 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00b4 }
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x001a
            r2 = r4
            goto L_0x001b
        L_0x001a:
            r2 = r3
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00b4 }
            java.text.NumberFormat r2 = java.text.NumberFormat.getInstance(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.m63090V0(r17)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = " "
            java.lang.String r7 = ""
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r11 = p000.yb6.m74332I(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00b4 }
            char[] r12 = new char[r4]     // Catch:{ Exception -> 0x00b4 }
            java.text.DecimalFormatSymbols r1 = m70367k()     // Catch:{ Exception -> 0x00b4 }
            char r1 = r1.getDecimalSeparator()     // Catch:{ Exception -> 0x00b4 }
            r12[r3] = r1     // Catch:{ Exception -> 0x00b4 }
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r1 = kotlin.text.StringsKt__StringsKt.m63060A0(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00b4 }
            boolean r5 = r1.isEmpty()     // Catch:{ Exception -> 0x00b4 }
            r5 = r5 ^ r4
            java.lang.String r6 = "0"
            if (r5 == 0) goto L_0x006f
            java.lang.Object r5 = r1.get(r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x00b4 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00b4 }
            if (r5 <= 0) goto L_0x0065
            r5 = r4
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            if (r5 == 0) goto L_0x006f
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0070
        L_0x006f:
            r3 = r6
        L_0x0070:
            java.lang.Number r2 = r2.parse(r3)     // Catch:{ Exception -> 0x00b4 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x00b4 }
            int r5 = r1.size()     // Catch:{ Exception -> 0x00b4 }
            if (r5 <= r4) goto L_0x009a
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00b4 }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b4 }
            java.text.DecimalFormatSymbols r1 = m70367k()     // Catch:{ Exception -> 0x00b4 }
            char r1 = r1.getGroupingSeparator()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = ""
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r6 = p000.yb6.m74332I(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00b4 }
        L_0x009a:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ Exception -> 0x00b4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4 }
            r4.<init>()     // Catch:{ Exception -> 0x00b4 }
            r4.append(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = "."
            r4.append(r2)     // Catch:{ Exception -> 0x00b4 }
            r4.append(r6)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00b4 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00b4 }
            r0 = r1
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ol0.m70331K(java.lang.String):java.math.BigDecimal");
    }

    /* renamed from: L */
    public static final String m70332L(double d) {
        if (d < 1000.0d) {
            return m70371m(d);
        }
        if (d < 1000.0d || d >= 1000000.0d) {
            String m = m70371m(d / ((double) PlaybackException.CUSTOM_ERROR_CODE_BASE));
            return m + "M";
        }
        String m2 = m70371m(d / ((double) 1000));
        return m2 + "K";
    }

    /* renamed from: M */
    public static final void m70333M(TextView textView, double d, boolean z) {
        String str;
        String str2;
        TextView textView2 = textView;
        vx2.m53591g(textView2, "<this>");
        if (!f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            str = "****";
        } else if (z) {
            String b = rz1.f44501a.mo65772b();
            if (b.length() > 1) {
                str2 = "%s %s";
            } else {
                str2 = "%s%s";
            }
            cb6 cb6 = cb6.f21669a;
            str = String.format(Locale.getDefault(), str2, Arrays.copyOf(new Object[]{b, m70374p(sz1.m72124a(d), 2, (RoundingMode) null, false, 6, (Object) null)}, 2));
            vx2.m53590f(str, "format(locale, format, *args)");
        } else {
            cb6 cb62 = cb6.f21669a;
            str = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{m70374p(sz1.m72124a(d), 2, (RoundingMode) null, false, 6, (Object) null)}, 1));
            vx2.m53590f(str, "format(locale, format, *args)");
        }
        textView2.setText(str);
    }

    /* renamed from: N */
    public static final void m70334N(TextView textView, double d, boolean z) {
        String str;
        String str2;
        TextView textView2 = textView;
        vx2.m53591g(textView2, "<this>");
        if (z) {
            rz1.C9291a aVar = rz1.f44501a;
            if (aVar.mo65772b().length() > 1) {
                str2 = "%s %s";
            } else {
                str2 = "%s%s";
            }
            cb6 cb6 = cb6.f21669a;
            str = String.format(Locale.getDefault(), str2, Arrays.copyOf(new Object[]{aVar.mo65772b(), m70374p(sz1.m72124a(d), 2, (RoundingMode) null, false, 6, (Object) null)}, 2));
            vx2.m53590f(str, "format(locale, format, *args)");
        } else {
            cb6 cb62 = cb6.f21669a;
            str = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{m70374p(sz1.m72124a(d), 2, (RoundingMode) null, false, 6, (Object) null)}, 1));
            vx2.m53590f(str, "format(locale, format, *args)");
        }
        textView2.setText(str);
    }

    /* renamed from: O */
    public static final void m70335O(ImageView imageView, String str, String str2) {
        vx2.m53591g(imageView, "<this>");
        vx2.m53591g(str2, "symbol");
        if (str != null && xb6.m73916n(str) != null) {
            ((be5) C1710a.m12225u(imageView).mo23163x(C9384u3.m72567h(Integer.parseInt(str), str2)).mo22581g0(150, 150)).mo11567a(qe5.m25623x0()).mo11553K0(imageView);
        }
    }

    /* renamed from: P */
    public static final void m70336P(ImageView imageView, int i, String str, String str2) {
        Object obj;
        boolean z;
        vx2.m53591g(imageView, "<this>");
        me5 u = C1710a.m12225u(imageView);
        if (i > 0) {
            obj = Integer.valueOf(i);
        } else if (str == null || xb6.m73916n(str) == null) {
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    boolean exists = new File(str).exists();
                    obj = str;
                    if (exists) {
                        obj = new File(str);
                    }
                }
            }
            obj = Integer.valueOf(R.drawable.ic_default_empty_coin);
        } else {
            obj = C9384u3.m72567h(Integer.parseInt(str), str2);
        }
        ((be5) u.mo23163x(obj).mo22581g0(150, 150)).mo11567a(qe5.m25623x0()).mo11553K0(imageView);
    }

    /* renamed from: Q */
    public static final void m70337Q(TextView textView, double d) {
        String str;
        vx2.m53591g(textView, "<this>");
        if (f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            str = m70374p(d, 0, (RoundingMode) null, false, 7, (Object) null);
        } else {
            str = "****";
        }
        textView.setText(str);
    }

    /* renamed from: R */
    public static final void m70338R(TextView textView, double d, int i) {
        String str;
        vx2.m53591g(textView, "<this>");
        if (f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            str = m70374p(d, i, (RoundingMode) null, false, 6, (Object) null);
        } else {
            str = "****";
        }
        textView.setText(str);
    }

    /* renamed from: S */
    public static final void m70339S(TextView textView, double d, String str) {
        String str2;
        vx2.m53591g(textView, "<this>");
        vx2.m53591g(str, "tokenSymbol");
        if (f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            str2 = textView.getResources().getString(R.string.currency_usdt_balance_display_name, new Object[]{m70374p(d, 0, (RoundingMode) null, false, 7, (Object) null), str});
        } else {
            str2 = "****";
        }
        vx2.m53590f(str2, "if (balanceShow) resourc…nSymbol\n    ) else \"****\"");
        textView.setText(str2);
    }

    /* renamed from: T */
    public static final void m70340T(TextView textView, double d, String str) {
        String str2;
        vx2.m53591g(textView, "<this>");
        vx2.m53591g(str, "tokenSymbol");
        if (f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            str2 = textView.getResources().getString(R.string.currency_usdt_balance_display_name, new Object[]{m70380v(m70360g0(new BigDecimal(String.valueOf(d)), 0, 1, (Object) null)), str});
        } else {
            str2 = "****";
        }
        vx2.m53590f(str2, "if (balanceShow) resourc…nSymbol\n    ) else \"****\"");
        textView.setText(str2);
    }

    /* renamed from: U */
    public static final void m70341U(TextView textView) {
        vx2.m53591g(textView, "<this>");
        textView.getPaint().setShader(new LinearGradient(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, textView.getTextSize(), textView.getContext().getColor(R.color.color_edit), -1, Shader.TileMode.CLAMP));
    }

    /* renamed from: V */
    public static final void m70342V(TextView textView) {
        String str;
        vx2.m53591g(textView, "<this>");
        if (f06.m57514e(textView.getContext(), "SHOW_BALANCE", true)) {
            rz1.C9291a aVar = rz1.f44501a;
            if (aVar.mo65772b().length() > 1) {
                str = aVar.mo65772b() + " ";
            } else {
                str = aVar.mo65772b();
            }
        } else {
            str = "";
        }
        textView.setText(str);
    }

    /* renamed from: W */
    public static final void m70343W(View view, pc2<r37> pc2) {
        vx2.m53591g(view, "<this>");
        view.setOnClickListener(new ml0(view, pc2));
    }

    /* renamed from: X */
    public static final void m70344X(View view, pc2 pc2, View view2) {
        vx2.m53591g(view, "$this_setToggleForBalance");
        f06.m57523n(view.getContext(), "SHOW_BALANCE", Boolean.valueOf(!f06.m57514e(view.getContext(), "SHOW_BALANCE", true)));
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: Y */
    public static final void m70345Y(Context context, int i) {
        vx2.m53591g(context, "<this>");
        Toast toast = f43732a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, context.getString(i), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        f43732a = makeText;
    }

    /* renamed from: Z */
    public static final void m70346Z(Context context, String str) {
        vx2.m53591g(context, "<this>");
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        Toast toast = f43732a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        f43732a = makeText;
    }

    /* renamed from: a0 */
    public static final void m70348a0(Activity activity, String str) {
        vx2.m53591g(activity, "<this>");
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        View inflate = activity.getLayoutInflater().inflate(R.layout.custom_toast_view, (ViewGroup) activity.findViewById(R.id.toast_container));
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        Toast toast = new Toast(activity);
        f43733b = toast;
        toast.cancel();
        Toast toast2 = f43733b;
        if (toast2 != null) {
            toast2.setGravity(17, 0, 0);
            toast2.setDuration(1);
            toast2.setView(inflate);
            toast2.show();
        }
    }

    /* renamed from: b0 */
    public static final void m70350b0(String str, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "tag");
    }

    /* renamed from: c */
    public static final Wallet m70351c(Context context) {
        vx2.m53591g(context, "<this>");
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(context, "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(this, SharedPr…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            return wallet2;
        }
        return null;
    }

    /* renamed from: c0 */
    public static final void m70352c0(View view, View view2, String str, int i, CharSequence charSequence, rc2<? super View, r37> rc2) {
        vx2.m53591g(view, "<this>");
        vx2.m53591g(view2, "view");
        vx2.m53591g(str, "msg");
        vx2.m53591g(rc2, "action");
        Snackbar b0 = Snackbar.m35953b0(view2, str, i);
        vx2.m53590f(b0, "make(view, msg, length)");
        if (charSequence != null) {
            b0.mo33553e0(charSequence, new nl0(rc2, view)).mo33494Q();
        } else {
            b0.mo33494Q();
        }
    }

    /* renamed from: d */
    public static final String m70353d(String str) {
        vx2.m53591g(str, "<this>");
        if (str.length() <= 13) {
            return str;
        }
        CharSequence subSequence = str.subSequence(0, 6);
        CharSequence subSequence2 = str.subSequence(str.length() - 6, str.length());
        return subSequence + "..." + subSequence2;
    }

    /* renamed from: d0 */
    public static final void m70354d0(rc2 rc2, View view, View view2) {
        vx2.m53591g(rc2, "$action");
        vx2.m53591g(view, "$this_showSnackbar");
        rc2.invoke(view);
    }

    /* renamed from: e */
    public static final TokenType m70355e(Context context) {
        vx2.m53591g(context, "<this>");
        TokenType.C8246a aVar = TokenType.Companion;
        String j = f06.m57519j(context, "DEFAULT_GATEWAY", "BEP_20");
        vx2.m53590f(j, "getString(\n            t…ype.BEP_20.name\n        )");
        TokenType c = aVar.mo57100c(j);
        Wallet c2 = m70351c(context);
        boolean z = true;
        if (c2 == null || !c2.hasPassphrase()) {
            z = false;
        }
        if (z || c.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
            return c;
        }
        return TokenType.BEP_20;
    }

    /* renamed from: e0 */
    public static final String m70356e0(byte[] bArr, boolean z) {
        vx2.m53591g(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("0x");
        }
        for (byte b : bArr) {
            cb6 cb6 = cb6.f21669a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf((byte) (b & -1))}, 1));
            vx2.m53590f(format, "format(format, *args)");
            sb.append(format);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: f */
    public static final TokenType m70357f(Context context) {
        vx2.m53591g(context, "<this>");
        TokenType.C8246a aVar = TokenType.Companion;
        String j = f06.m57519j(context, "DEFAULT_GATEWAY_COLLECTIONS", m70355e(context).name());
        vx2.m53590f(j, "getString(this, SharedPr…OLLECTIONS, chain().name)");
        TokenType c = aVar.mo57100c(j);
        Wallet c2 = m70351c(context);
        boolean z = true;
        if (c2 == null || !c2.hasPassphrase()) {
            z = false;
        }
        if (z || c.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
            return c;
        }
        return TokenType.BEP_20;
    }

    /* renamed from: f0 */
    public static final String m70358f0(BigDecimal bigDecimal, int i) {
        boolean z;
        String str;
        vx2.m53591g(bigDecimal, "<this>");
        boolean z2 = false;
        int d = d75.m43382d(bigDecimal.scale(), 0);
        if (1 > i || i >= d) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = d;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "#";
        }
        String U = ArraysKt___ArraysKt.m47269U(strArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        if (U.length() > 0) {
            z2 = true;
        }
        if (z2) {
            str = "." + U;
        } else {
            str = "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#" + str);
        decimalFormat.setDecimalFormatSymbols(m70367k());
        String format = decimalFormat.format(bigDecimal);
        if (Common.f42577a.mo60892B() == ',') {
            vx2.m53590f(format, "plainString");
            return yb6.m74332I(format, ".", ",", false, 4, (Object) null);
        }
        vx2.m53590f(format, "{\n        plainString\n    }");
        return format;
    }

    /* renamed from: g */
    public static final void m70359g(Activity activity, String str) {
        vx2.m53591g(activity, "<this>");
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        Object systemService = activity.getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", str));
        m70345Y(activity, R.string.copied_to_clipboard);
    }

    /* renamed from: g0 */
    public static /* synthetic */ String m70360g0(BigDecimal bigDecimal, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m70358f0(bigDecimal, i);
    }

    /* renamed from: h */
    public static final void m70361h(Context context, String str) {
        vx2.m53591g(context, "<this>");
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        Object systemService = context.getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", str));
        m70345Y(context, R.string.copied_to_clipboard);
    }

    /* renamed from: h0 */
    public static final BigInteger m70362h0(BigDecimal bigDecimal, int i) {
        vx2.m53591g(bigDecimal, "<this>");
        return Convert.m68282d(bigDecimal, Convert.Unit.fromDecmal(i)).toBigInteger();
    }

    /* renamed from: i */
    public static final String m70363i(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("###,##0.00############");
        decimalFormat.setDecimalFormatSymbols(m70367k());
        return decimalFormat.format(new BigDecimal(d).setScale(14, RoundingMode.FLOOR));
    }

    /* renamed from: i0 */
    public static final boolean m70364i0(String str) {
        vx2.m53591g(str, "<this>");
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                break;
            }
            if (str.charAt(i) != m70367k().getDecimalSeparator()) {
                z = false;
            }
            if (z) {
                i2++;
            }
            i++;
        }
        if (i2 <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final String m70365j(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("###,##0.00######");
        decimalFormat.setDecimalFormatSymbols(m70367k());
        return decimalFormat.format(new BigDecimal(d).setScale(8, RoundingMode.FLOOR));
    }

    /* renamed from: j0 */
    public static final int m70366j0(boolean z) {
        return z ? 8 : 0;
    }

    /* renamed from: k */
    public static final DecimalFormatSymbols m70367k() {
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance();
        vx2.m53590f(instance, "getInstance()");
        return instance;
    }

    /* renamed from: k0 */
    public static final int m70368k0(boolean z) {
        return z ? 4 : 0;
    }

    /* renamed from: l */
    public static final <T> List<T> m70369l(List<? extends T> list, Type type) {
        vx2.m53591g(list, "<this>");
        vx2.m53591g(type, "itemType");
        Object fromJson = new Gson().fromJson(new Gson().toJson((Object) list, type), type);
        vx2.m53590f(fromJson, "Gson().fromJson<List<T>>…his, itemType), itemType)");
        return (List) fromJson;
    }

    /* renamed from: l0 */
    public static final int m70370l0(boolean z) {
        return z ? 0 : 8;
    }

    /* renamed from: m */
    public static final String m70371m(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setDecimalFormatSymbols(m70367k());
        String format = decimalFormat.format(d);
        vx2.m53590f(format, "DecimalFormat(\"0.00\")\n  …Separtor() }.format(this)");
        return format;
    }

    /* renamed from: n */
    public static final String m70372n(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setDecimalFormatSymbols(m70367k());
        String format = decimalFormat.format(d);
        vx2.m53590f(format, "DecimalFormat(\"0.##\")\n  …Separtor() }.format(this)");
        return format;
    }

    /* renamed from: o */
    public static final String m70373o(double d, int i, RoundingMode roundingMode, boolean z) {
        boolean z2;
        String str;
        vx2.m53591g(roundingMode, "_roundingMode");
        if (d == Utils.DOUBLE_EPSILON) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "0" + Common.f42577a.mo60892B() + "0";
        } else if (d > 1.0E8d) {
            DecimalFormat decimalFormat = new DecimalFormat("###,##0.##");
            decimalFormat.setDecimalFormatSymbols(m70367k());
            decimalFormat.setRoundingMode(roundingMode);
            String format = decimalFormat.format(new BigDecimal(d).setScale(2, roundingMode));
            vx2.m53590f(format, "{\n        DecimalFormat(…(2, _roundingMode))\n    }");
            return format;
        } else if (d >= 1.0E-8d || d <= Utils.DOUBLE_EPSILON) {
            String str2 = "###,##0.00######";
            if (i == 0) {
                DecimalFormat decimalFormat2 = new DecimalFormat(str2);
                decimalFormat2.setDecimalFormatSymbols(m70367k());
                str = decimalFormat2.format(new BigDecimal(d).setScale(8, RoundingMode.DOWN));
            } else if (d <= Utils.DOUBLE_EPSILON || d >= 0.01d) {
                if (i == 5) {
                    str2 = "###,##0.00###";
                } else if (i != 8) {
                    str2 = "###,##0.00";
                }
                DecimalFormat decimalFormat3 = new DecimalFormat(str2);
                decimalFormat3.setDecimalFormatSymbols(m70367k());
                decimalFormat3.setRoundingMode(roundingMode);
                str = decimalFormat3.format(new BigDecimal(d));
            } else {
                DecimalFormat decimalFormat4 = new DecimalFormat(str2);
                decimalFormat4.setDecimalFormatSymbols(m70367k());
                decimalFormat4.setRoundingMode(roundingMode);
                str = decimalFormat4.format(new BigDecimal(d).setScale(8, roundingMode));
            }
            vx2.m53590f(str, "{\n        if (scale == 0…        }\n        }\n    }");
            return str;
        } else {
            double d2 = d;
            int i2 = 0;
            while (d2 < 1.0d) {
                d2 *= (double) 10;
                i2++;
            }
            int i3 = i2 - 1;
            if (i3 < 12) {
                BigDecimal scale = new BigDecimal(String.valueOf(d)).setScale(i3 + 2, roundingMode);
                vx2.m53590f(scale, "this.toBigDecimal().setS…zeros + 2, _roundingMode)");
                return m70360g0(scale, 0, 1, (Object) null);
            } else if (z) {
                return m70360g0(new BigDecimal(String.valueOf(d)), 0, 1, (Object) null);
            } else {
                return "0" + Common.f42577a.mo60892B() + "0";
            }
        }
    }

    /* renamed from: p */
    public static /* synthetic */ String m70374p(double d, int i, RoundingMode roundingMode, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m70373o(d, i, roundingMode, z);
    }

    /* renamed from: q */
    public static final BigDecimal m70375q(String str, int i) {
        vx2.m53591g(str, "<this>");
        return Convert.m68279a(str, Convert.Unit.fromDecmal(i));
    }

    /* renamed from: r */
    public static final BigDecimal m70376r(BigInteger bigInteger, int i) {
        vx2.m53591g(bigInteger, "<this>");
        return Convert.m68279a(bigInteger.toString(), Convert.Unit.fromDecmal(i));
    }

    /* renamed from: s */
    public static final i30 m70377s(TokenType tokenType) {
        vx2.m53591g(tokenType, "<this>");
        i30 f = C9384u3.m72565f(tokenType);
        vx2.m53590f(f, "getBlockChainClient(this)");
        return f;
    }

    /* renamed from: t */
    public static final String m70378t(String str) {
        vx2.m53591g(str, "symbol");
        if (str.length() > 1) {
            return "%s %s";
        }
        return "%s%s";
    }

    /* renamed from: u */
    public static final float m70379u(View view) {
        vx2.m53591g(view, "<this>");
        return ((float) view.getWidth()) * 0.15f;
    }

    /* renamed from: v */
    public static final String m70380v(String str) {
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3 = str;
        vx2.m53591g(str3, "<this>");
        Common common = Common.f42577a;
        if (common.mo60914u() != '.') {
            z = true;
        } else {
            z = false;
        }
        if (common.mo60892B() == ',') {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = Build.MANUFACTURER;
        vx2.m53590f(str4, "MANUFACTURER");
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean b = vx2.m53586b(lowerCase, "samsung");
        List A0 = StringsKt__StringsKt.m63060A0(StringsKt__StringsKt.m63090V0(yb6.m74332I(str, String.valueOf(common.mo60914u()), "", false, 4, (Object) null)).toString(), new char[]{common.mo60892B()}, false, 0, 6, (Object) null);
        if (z2 && b && z && StringsKt__StringsKt.m63079Q(str3, '.', false, 2, (Object) null)) {
            A0 = StringsKt__StringsKt.m63060A0(StringsKt__StringsKt.m63090V0(yb6.m74332I(str, String.valueOf(common.mo60914u()), "", false, 4, (Object) null)).toString(), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        String str5 = (String) A0.get(0);
        if (z2 && b) {
            if (str5.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                str5 = "0";
            }
        }
        if (StringsKt__StringsKt.m63087U(str3, common.mo60892B(), false, 2, (Object) null)) {
            str2 = String.valueOf(common.mo60892B());
        } else if (A0.size() > 1) {
            str2 = common.mo60892B() + ((String) A0.get(1));
        } else if (StringsKt__StringsKt.m63087U(str3, common.mo60914u(), false, 2, (Object) null) && z2 && b) {
            str2 = String.valueOf(common.mo60892B());
        } else if (!StringsKt__StringsKt.m63087U(str3, '.', false, 2, (Object) null) || !z2 || !b || !z) {
            str2 = "";
        } else {
            str2 = String.valueOf(common.mo60892B());
        }
        new String();
        cb6 cb6 = cb6.f21669a;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{new BigInteger(str5)}, 1));
        vx2.m53590f(format, "format(format, *args)");
        return format + str2;
    }

    /* renamed from: w */
    public static final Object m70381w(Context context, int i, String str, String str2, String str3) {
        Integer num;
        Object obj;
        boolean z;
        vx2.m53591g(context, "<this>");
        if (str3 != null) {
            num = xb6.m73916n(str3);
        } else {
            num = null;
        }
        boolean z2 = true;
        if (num != null && Integer.parseInt(str3) > 0) {
            if (str2 == null || !m70328H(str2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = C9384u3.m72567h(Integer.parseInt(str3), str2);
                vx2.m53590f(obj, "when {\n        cmcId?.to…_default_empty_coin\n    }");
                return obj;
            }
        }
        if (i > 0) {
            obj = Integer.valueOf(i);
        } else if (str == null || xb6.m73916n(str) == null) {
            if (str != null) {
                if (str.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    boolean exists = new File(str).exists();
                    obj = str;
                    if (exists) {
                        obj = new File(str);
                    }
                }
            }
            obj = Integer.valueOf(R.drawable.ic_default_empty_coin);
        } else {
            obj = C9384u3.m72567h(Integer.parseInt(str), str2);
        }
        vx2.m53590f(obj, "when {\n        cmcId?.to…_default_empty_coin\n    }");
        return obj;
    }

    /* renamed from: x */
    public static final String m70382x(TokenType tokenType) {
        vx2.m53591g(tokenType, "<this>");
        return tokenType.getAssignKey();
    }

    /* renamed from: y */
    public static final String m70383y(double d, Context context) {
        vx2.m53591g(context, "context");
        if (f06.m57514e(context, "SHOW_BALANCE", true)) {
            return m70374p(d, 0, (RoundingMode) null, false, 7, (Object) null);
        }
        return "****";
    }

    /* renamed from: z */
    public static final String m70384z(int i) {
        if (i == TokenType.ERC_20.getChainId()) {
            String str = C9384u3.f44862d;
            return "https://mainnet.infura.io/v3/" + str;
        } else if (i == TokenType.ERC_20_TEST.getChainId()) {
            String str2 = C9384u3.f44862d;
            return "https://goerli.infura.io/v3/" + str2;
        } else if (i == TokenType.BEP_20.getChainId()) {
            return "https://bsc-dataseed.binance.org/";
        } else {
            if (i == TokenType.BEP_20_TEST.getChainId()) {
                return "https://data-seed-prebsc-1-s1.binance.org:8545/";
            }
            if (i == TokenType.POLYGON.getChainId()) {
                return "https://polygon-rpc.com/";
            }
            if (i == TokenType.POLYGON_TEST.getChainId()) {
                return "https://rpc-mumbai.matic.today/";
            }
            if (i == TokenType.AVALANCHE_C.getChainId()) {
                return "https://api.avax.network/ext/bc/C/rpc";
            }
            if (i == TokenType.AVALANCHE_FUJI_TEST.getChainId()) {
                return "https://api.avax-test.network/ext/bc/C/rpc";
            }
            if (i == TokenType.SOLANA.getChainId()) {
                return "https://api.mainnet-beta.solana.com/";
            }
            return "http://nourl/";
        }
    }
}
