package net.safemoon.androidwallet.utils;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateFormat;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.wcv2.common.WCCommon;
import org.web3j.abi.datatypes.Address;
import p000.py0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001MB\t\b\u0002¢\u0006\u0004\bK\u0010LJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0010J\u0012\u0010\u0015\u001a\u00020\u0014*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0007J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f2\b\b\u0002\u0010$\u001a\u00020\"J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fJ\u000e\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0005J\u001a\u0010-\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005J\u0018\u0010/\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100J\u0010\u00104\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tJ\n\u00106\u001a\u00020\u0005*\u00020\u0005J\n\u00107\u001a\u00020\u0005*\u00020\u0005R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010:R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u0002000\u001f8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bA\u0010?R/\u0010H\u001a\u001a\u0012\u0004\u0012\u00020D\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050C0C8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010GR/\u0010J\u001a\u001a\u0012\u0004\u0012\u00020D\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050C0C8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bI\u0010G¨\u0006N"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/Common;", "", "", "B", "u", "", "value", "Ljava/util/Date;", "z", "Landroid/content/Context;", "context", "e", "f", "j", "", "s", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "m", "url", "Lr37;", "x", "Lnet/safemoon/androidwallet/common/TokenType;", "myType", "r", "A", "date", "w", "C", "startDate", "endDate", "", "k", "symbolWithType", "", "v", "extractMultiChain", "a", "E", "smsTimeInMilis", "l", "tokenType", "qrScanCode", "t", "language", "h", "message", "y", "Lnet/safemoon/androidwallet/model/swap/Swap;", "ethSwap", "D", "address", "o", "d", "q", "c", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "universalFormat", "androidFormat", "Ljava/util/List;", "n", "()Ljava/util/List;", "listDefaultNative", "getDeletableDefaultTokens", "deletableDefaultTokens", "", "", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "addressMapCoinType", "p", "privateKeyMapCoinType", "<init>", "()V", "RequestSocketState", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Common.kt */
public final class Common {

    /* renamed from: a */
    public static final Common f42577a = new Common();

    /* renamed from: b */
    public static final SimpleDateFormat f42578b;

    /* renamed from: c */
    public static final SimpleDateFormat f42579c;

    /* renamed from: d */
    public static final List<Swap> f42580d;

    /* renamed from: e */
    public static final List<String> f42581e = bk0.m32598e("BEP_SAFEMOON");

    /* renamed from: f */
    public static final Map<Integer, Map<Long, String>> f42582f = new LinkedHashMap();

    /* renamed from: g */
    public static final Map<Integer, Map<Long, String>> f42583g = new LinkedHashMap();

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "", "(Ljava/lang/String;I)V", "NONE", "LOGIN", "GET_BLOB", "PUT_BLOB", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Common.kt */
    public enum RequestSocketState {
        NONE,
        LOGIN,
        GET_BLOB,
        PUT_BLOB
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.utils.Common$a */
    /* compiled from: Common.kt */
    public /* synthetic */ class C8634a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42585a;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
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
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20_TEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20_TEST     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON_TEST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_C     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_FUJI_TEST     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f42585a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.Common.C8634a.<clinit>():void");
        }
    }

    static {
        Locale locale = Locale.US;
        f42578b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        f42579c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
        Swap swap = new Swap();
        swap.address = "";
        swap.chainId = 56;
        swap.decimals = 18;
        swap.name = "Smart Chain";
        swap.symbol = "BNB";
        swap.logoURI = "";
        swap.imageResource = R.drawable.binance;
        swap.cmcId = "1839";
        swap.cmcSlug = "bnb";
        r37 r37 = r37.f33317a;
        Swap swap2 = new Swap();
        swap2.address = "";
        swap2.chainId = 1;
        swap2.decimals = 18;
        swap2.name = "Ethereum";
        swap2.symbol = "ETH";
        swap2.logoURI = "";
        swap2.imageResource = R.drawable.ethereum;
        swap2.cmcId = "1027";
        swap2.cmcSlug = "ethereum";
        f42580d = ck0.m33065m(swap, swap2);
    }

    /* renamed from: b */
    public static /* synthetic */ List m68290b(Common common, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return common.mo60896a(z);
    }

    /* renamed from: i */
    public static /* synthetic */ String m68291i(Common common, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return common.mo60902h(context, str);
    }

    /* renamed from: A */
    public final Date mo60891A(String str) {
        vx2.m53591g(str, "value");
        try {
            return f42578b.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: B */
    public final char mo60892B() {
        return DecimalFormatSymbols.getInstance().getDecimalSeparator();
    }

    /* renamed from: C */
    public final long mo60893C(Date date) {
        vx2.m53591g(date, "date");
        return date.getTime() / 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60894D(net.safemoon.androidwallet.model.swap.Swap r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0061
            net.safemoon.androidwallet.MyApplicationClass r0 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r1 = r6.address
            r0.f41183B = r1
            java.util.List<net.safemoon.androidwallet.model.swap.PairsData> r6 = r6.pairs
            r0 = 0
            if (r6 == 0) goto L_0x0055
            java.lang.String r1 = "pairs"
            p000.vx2.m53590f(r6, r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0018:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r6.next()
            r2 = r1
            net.safemoon.androidwallet.model.swap.PairsData r2 = (net.safemoon.androidwallet.model.swap.PairsData) r2
            net.safemoon.androidwallet.model.swap.Token r3 = r2.getToken0()
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.getSymbol()
            goto L_0x0031
        L_0x0030:
            r3 = r0
        L_0x0031:
            java.lang.String r4 = "USDC"
            boolean r3 = p000.vx2.m53586b(r3, r4)
            if (r3 == 0) goto L_0x004f
            net.safemoon.androidwallet.model.swap.Token r2 = r2.getToken1()
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r2.getSymbol()
            goto L_0x0045
        L_0x0044:
            r2 = r0
        L_0x0045:
            java.lang.String r3 = "WETH"
            boolean r2 = p000.vx2.m53586b(r2, r3)
            if (r2 == 0) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x0018
            r0 = r1
        L_0x0053:
            net.safemoon.androidwallet.model.swap.PairsData r0 = (net.safemoon.androidwallet.model.swap.PairsData) r0
        L_0x0055:
            if (r0 == 0) goto L_0x0061
            net.safemoon.androidwallet.MyApplicationClass r6 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r0 = r0.getPairAddress()
            r6.f41182A = r0
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.Common.mo60894D(net.safemoon.androidwallet.model.swap.Swap):void");
    }

    /* renamed from: E */
    public final List<TokenType> mo60895E() {
        boolean z;
        TokenType[] values = TokenType.values();
        ArrayList arrayList = new ArrayList();
        for (TokenType tokenType : values) {
            if (!vx2.m53586b(Boolean.valueOf(tokenType.isTestNet()), y40.f35761c) || !tokenType.isEnable() || tokenType.getCoinType().getSimilarTypeGroup() != SimilarTypeGroup.EVM_CAPABILITY) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(tokenType);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<TokenType> mo60896a(boolean z) {
        TokenType[] values = TokenType.values();
        ArrayList arrayList = new ArrayList();
        for (TokenType tokenType : values) {
            boolean z2 = true;
            if (!z ? !vx2.m53586b(Boolean.valueOf(tokenType.isTestNet()), y40.f35761c) || !tokenType.isEnable() : !vx2.m53586b(Boolean.valueOf(tokenType.isTestNet()), y40.f35761c) || ((!tokenType.isEnable() && !tokenType.isPartOfMultiChainTokens()) || tokenType == TokenType.MULTI_COIN)) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(tokenType);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo60897c(String str) {
        vx2.m53591g(str, "<this>");
        String replaceAll = Pattern.compile("[\\x{10000}-\\x{10FFFF}]", 66).matcher(str).replaceAll("");
        vx2.m53590f(replaceAll, "emojiSecondClear");
        return replaceAll;
    }

    /* renamed from: d */
    public final void mo60898d(Context context) {
        boolean z;
        vx2.m53591g(context, "context");
        String d = up1.m72959d(context, "API_KEY", "");
        vx2.m53590f(d, "apiKey");
        boolean z2 = true;
        if (d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TokenType.C8246a aVar = TokenType.Companion;
            if (aVar.mo57101d().length() <= 0) {
                z2 = false;
            }
            if (!z2) {
                ex7 ex7 = new ex7();
                ex7.mo19535t(C2540id3.m19564f(C2935o.m23574i(d)));
                String b = ex7.mo19517b("e3fYo7c6GT[SMRu2rzSxCu2WLLcwORIjH[lu[jXUwAVeUMTRC.XHtfVIT1yPXtRh9Q[5XIDRD5YO8nL.IKDN7g]]");
                vx2.m53590f(b, "apiCm.DecryptText(Consts…ApiKeys.explorerKeyBep20)");
                aVar.mo57103f(b);
                String b2 = ex7.mo19517b("8t9oReQC59Xlc4hCFIsipRuP3IXvHaK8GtOLddNlkcLRvEJ7iL2[gWcoLZRsuteN8Ry70.RSohaTcyY.yG.CQQ]]");
                vx2.m53590f(b2, "apiCm.DecryptText(Consts…ApiKeys.explorerKeyErc20)");
                aVar.mo57104g(b2);
                String b3 = ex7.mo19517b("1DJ1iFkcATP0Tztt6lMnnpv4.g7iv6F3mwoPezC6M4QbfTuPgG8W5O0TA2F9qY4CGbKJuVwPUU7UBQS07.Ai6w]]");
                vx2.m53590f(b3, "apiCm.DecryptText(Consts…ApiKeys.explorerKeyMatic)");
                aVar.mo57105h(b3);
                String b4 = ex7.mo19517b("7QOOwL74FFM8TeCgxgOb8FwcNNF95Y5xxE246HYMw.Y4wTfUrLWnu7Z4OxUaeM[c4dDXeNg[TsFnKAeDqByqZA]]");
                vx2.m53590f(b4, "apiCm.DecryptText(Consts…ys.explorerKeyAvalancheC)");
                aVar.mo57102e(b4);
                C9384u3.f44859a = ex7.mo19517b("FOX.FyH.dJ0Go49tTZUDr8Q.a4QqXu8.o3XE86UL8Xht4uIFDES07hod[xzGEpGOXGK1dyD7BTuaEK28OQYFXA]]");
                C9384u3.f44860b = ex7.mo19517b("fMCLo.oLrNj8mBvjkSB9CXmLRPdG3opGK9orJmfVUfFQ5K3kqiCv1Y[gHTjZjtxR3DaNrGHKzmJWVy3gqDa3ml1OZJ0u1IZo8r7y.eH24tjhenDgAsFuJwUr7jqNQ2Nm");
                C9384u3.f44862d = ex7.mo19517b("vkD.hvXhdxXb.7ADB1K..XIGZcoYJDvUW[kYobY6xKp.nWoOsKtGFWQFImg5ASuSXPS2P4oX5TDuqGAf57NTMA]]");
                C9384u3.f44861c = ex7.mo19517b("z0NYeEAKccTrcaK3oxpw7c0Amr7VDS5.W.mzH[Y[zRpu182x106aTC9VLiu4Qld5.MlWd1iCgi3ZVnzcp[AAfj3[Cw0hUngYJW.9WDuBvPg]");
                C9384u3.f44863e = ex7.mo19517b("6LNE5OGvnPt4j7YCNdxU7RGNqt6MBICyxq2jW9n[hiIsW2IvK4xMfxz1tpX.0XBTmPemx8vELLsg0ec.jEftbg]]");
                C9384u3.f44864f = ex7.mo19517b("adV9nO5I9KjECc1TIAtICHeiqNK6sq8UMzZX7nUoEk[xrmU[zQZP4cwc1DUQ482.ppOFzYYfAMMmlKl0Wa7t59[DSte5AFGKxIL9EFROMFE]");
                C9384u3.f44865g = ex7.mo19517b("kWxvrKN.YTSdXIEJCoVC.IWAE2tNiwuH[7hTu[rGgBeNZKtUEUsD1HIO0nOG6XyC9oJjUWcy.vUqyOxwH8XAXA]]");
                C9384u3.f44866h = ex7.mo19517b("miVBsHtR9P74fvj3KiBYvxxjIYLlp[LfVAuRZDVOag[XSOeZhsg6ZNHg.MgddHrxkG0ySMlwXtl50pra7pOfkg]]");
                C9384u3.f44867i = ex7.mo19517b("Wv20.anP33Ko36dyTYOj16HPC[8P6TN5UDrHcshbUdagPimzkyzF5JdGRQX7Fd1.YCBjSC4K8Fetna.nJifokQ]]");
                C9384u3.f44868j = ex7.mo19517b("Pc6IWj9svBf[YCCiDEtbXV[9MC8UbhVQbMPo0LRPTKhsLe6Ri2xFxKVGAGwgNavu8fcdbZ.NiUELWNEAswM8jSBH81e3IKyNLUtARNQhRlFaDcsfG4bHuo5K2CsJLU[U18D4EsoaZfEFkUisKUFUzbPO2iK.qR[gqlnteuI.igHqoHxjjn4jIlwF8jt[g.wxeKryF62Py5tRzMA8LBe3OzxhaEMT6H3RCgUWdaDKG.z5aVY3vOOc6Fc[HzD3AmcpnAHPYXtP6FBjNU0xiZYi.W9Nx4CEyToqEImlj4dnM.InykN17EHl3IeuHW34Ajd4");
                OneSignal.m40309B1(ex7.mo19517b("8TtBFdsIUpbVC[WNy5ZmyAn.RgS5ZtNvZHZ7INDicL77KyC32sYd33.P.fz2KtTETXn037jWf5Rgw[[iqszCZQ]]"));
                WCCommon wCCommon = WCCommon.f43197a;
                MyApplicationClass c = MyApplicationClass.m64669c();
                vx2.m53590f(c, "get()");
                wCCommon.mo62055a(c);
            }
        }
    }

    /* renamed from: e */
    public final String mo60899e(Date date, Context context) {
        vx2.m53591g(date, "value");
        vx2.m53591g(context, "context");
        String c = l21.f40561a.mo55806c(context);
        String string = context.getString(R.string.common_format_read_string_extend);
        String format = new SimpleDateFormat(c + " " + string, Locale.getDefault()).format(date);
        vx2.m53590f(format, "SimpleDateFormat(pattern…tDefault()).format(value)");
        return format;
    }

    /* renamed from: f */
    public final String mo60900f(Date date, Context context) {
        vx2.m53591g(date, "value");
        vx2.m53591g(context, "context");
        String format = new SimpleDateFormat(l21.f40561a.mo55806c(context), Locale.getDefault()).format(date);
        vx2.m53590f(format, "SimpleDateFormat(getDefa…          value\n        )");
        return format;
    }

    /* renamed from: g */
    public final Map<Integer, Map<Long, String>> mo60901g() {
        return f42582f;
    }

    /* renamed from: h */
    public final String mo60902h(Context context, String str) {
        vx2.m53591g(context, "context");
        if (str == null) {
            str = g06.f37938a.mo51832a(context);
        }
        switch (str.hashCode()) {
            case -1295765506:
                if (str.equals("es-rMX")) {
                    return "mx";
                }
                break;
            case -979921671:
                if (str.equals("pt-rBR")) {
                    return "pt-BR";
                }
                break;
            case -979921235:
                if (str.equals("pt-rPT")) {
                    return "pt";
                }
                break;
            case -704712234:
                if (str.equals("zh-rHK")) {
                    return "zh-hk";
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    return "de";
                }
                break;
            case 3241:
                boolean equals = str.equals("en");
                break;
            case 3246:
                if (str.equals("es")) {
                    return "es";
                }
                break;
            case 3259:
                if (str.equals("fa")) {
                    return "fa";
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    return "fr";
                }
                break;
            case 3329:
                if (str.equals("hi")) {
                    return "hi";
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    return "id";
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    return "it";
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    return "nl";
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    return "pl";
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    return "tr";
                }
                break;
            case 3763:
                if (str.equals("vi")) {
                    return "vi";
                }
                break;
            case 3886:
                if (str.equals("zh")) {
                    return "zh-cn";
                }
                break;
        }
        return "en";
    }

    /* renamed from: j */
    public final String mo60903j() {
        SimpleDateFormat simpleDateFormat = f42578b;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar instance = Calendar.getInstance();
        instance.add(12, -1);
        String format = simpleDateFormat.format(instance.getTime());
        vx2.m53590f(format, "sdf.format(calendar.time)");
        return format;
    }

    /* renamed from: k */
    public final List<Date> mo60904k(Date date, Date date2) {
        vx2.m53591g(date, "startDate");
        vx2.m53591g(date2, "endDate");
        ArrayList arrayList = new ArrayList();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        while (gregorianCalendar.getTime().compareTo(mo60916w(date2)) <= 0) {
            Date time = gregorianCalendar.getTime();
            if (!vx2.m53586b(date, time)) {
                vx2.m53590f(time, "result");
                arrayList.add(mo60916w(time));
            }
            gregorianCalendar.add(5, 1);
        }
        if (arrayList.size() > 0 && !vx2.m53586b(date2, CollectionsKt___CollectionsKt.m47340k0(arrayList))) {
            arrayList.add(mo60916w(date2));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final String mo60905l(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        if (instance2.get(5) == instance.get(5)) {
            CharSequence format = DateFormat.format("h:mm aa", instance);
            return "Today at " + format;
        } else if (instance2.get(5) - instance.get(5) == 1) {
            CharSequence format2 = DateFormat.format("h:mm aa", instance);
            return "Yesterday at " + format2;
        } else if (instance2.get(1) == instance.get(1)) {
            return DateFormat.format("EEEE, MMMM d, h:mm aa", instance).toString();
        } else {
            return DateFormat.format("MMMM dd yyyy, h:mm aa", instance).toString();
        }
    }

    /* renamed from: m */
    public final BigDecimal mo60906m(BigDecimal bigDecimal) {
        vx2.m53591g(bigDecimal, "<this>");
        return bigDecimal.subtract(bigDecimal.setScale(0, RoundingMode.FLOOR)).movePointRight(bigDecimal.scale());
    }

    /* renamed from: n */
    public final List<Swap> mo60907n() {
        return f42580d;
    }

    /* renamed from: o */
    public final String mo60908o(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str2 = MyApplicationClass.m64669c().f41183B;
        vx2.m53590f(str2, "get().wETHTokenAddress");
        String lowerCase2 = str2.toLowerCase(locale);
        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (vx2.m53586b(lowerCase, lowerCase2)) {
            return MyApplicationClass.m64669c().f41182A;
        }
        return null;
    }

    /* renamed from: p */
    public final Map<Integer, Map<Long, String>> mo60909p() {
        return f42583g;
    }

    /* renamed from: q */
    public final String mo60910q(String str) {
        vx2.m53591g(str, "<this>");
        Charset charset = StandardCharsets.UTF_8;
        vx2.m53590f(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C2540id3.m19564f(bytes);
        vx2.m53590f(f, "GetStringFromBytes(asByte)");
        return f;
    }

    /* renamed from: r */
    public final String mo60911r(TokenType tokenType) {
        vx2.m53591g(tokenType, "myType");
        switch (C8634a.f42585a[tokenType.ordinal()]) {
            case 1:
                return "https://bscscan.com/tx/";
            case 2:
                return "https://testnet.bscscan.com/tx/";
            case 3:
                return "https://etherscan.io/tx/";
            case 4:
                return "https://goerli.etherscan.io/tx/";
            case 5:
                return "https://polygonscan.com/tx/";
            case 6:
                return "https://mumbai.polygonscan.com/tx/";
            case 7:
                return "https://snowtrace.io/tx/";
            case 8:
                return "https://testnet.explorer.avax.network/tx/";
            case 9:
                return "https://solscan.io/tx/";
            case 10:
                return "https://blockchair.com/bitcoin/transaction/";
            case 11:
                return "https://blockchair.com/dogecoin/transaction/";
            default:
                throw new Exception("Invalid Chains");
        }
    }

    /* renamed from: s */
    public final long mo60912s() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: t */
    public final String mo60913t(TokenType tokenType, String str) {
        String str2;
        String str3 = str;
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(str3, "qrScanCode");
        if (tokenType.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.NON_EVM_CAPABILITY) {
            return str3;
        }
        String I = yb6.m74332I(str, " ", "", false, 4, (Object) null);
        if (StringsKt__StringsKt.m63081R(str3, "ethereum:", false, 2, (Object) null) && StringsKt__StringsKt.m63081R(str3, "@1", false, 2, (Object) null)) {
            str2 = yb6.m74332I(yb6.m74332I(I, "ethereum:", "", false, 4, (Object) null), "@1", "", false, 4, (Object) null);
        } else if (!StringsKt__StringsKt.m63081R(str3, "ethereum:", false, 2, (Object) null) || !StringsKt__StringsKt.m63081R(str3, "/transfer?address=", false, 2, (Object) null)) {
            String I2 = yb6.m74332I(I, "ethereum:", "", false, 4, (Object) null);
            if (StringsKt__StringsKt.m63081R(I2, "@", false, 2, (Object) null)) {
                str2 = (String) StringsKt__StringsKt.m63061B0(I2, new String[]{"@"}, false, 0, 6, (Object) null).get(0);
            } else {
                str2 = I2;
            }
        } else {
            str2 = yb6.m74332I(I, "ethereum:", "", false, 4, (Object) null);
            List B0 = StringsKt__StringsKt.m63061B0(str2, new String[]{"/transfer?address="}, false, 0, 6, (Object) null);
            if (B0.size() == 1) {
                str2 = (String) B0.get(0);
            } else if (B0.size() > 1) {
                str2 = (String) CollectionsKt___CollectionsKt.m47340k0(B0);
            }
        }
        return StringsKt___StringsKt.m63126b1(str2, 42);
    }

    /* renamed from: u */
    public final char mo60914u() {
        return DecimalFormatSymbols.getInstance().getGroupingSeparator();
    }

    /* renamed from: v */
    public final boolean mo60915v(String str) {
        T t;
        vx2.m53591g(str, "symbolWithType");
        Iterator<T> it = f42581e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (vx2.m53586b((String) t, str)) {
                break;
            }
        }
        if (t != null || yb6.m74336M(str, "CUSTOM_", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final Date mo60916w(Date date) {
        vx2.m53591g(date, "date");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 1);
        instance.set(14, 0);
        Date time = instance.getTime();
        vx2.m53590f(time, "getInstance().apply {\n  …ECOND, 0);\n        }.time");
        return time;
    }

    /* renamed from: x */
    public final void mo60917x(Context context, String str) {
        vx2.m53591g(context, "<this>");
        vx2.m53591g(str, "url");
        py0 a = new py0.C3103a().mo24794a();
        vx2.m53590f(a, "builder.build()");
        a.mo24793a(context, Uri.parse(str));
    }

    /* renamed from: y */
    public final String mo60918y(Context context, String str) {
        String str2;
        vx2.m53591g(context, "context");
        if (str == null) {
            str = "";
        }
        if (yb6.m74334K(str, "LSON", false)) {
            List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{"="}, false, 0, 6, (Object) null);
            if (B0.size() > 1) {
                str = AKTServerFunctions.m12040h0(context, (String) B0.get(1));
                vx2.m53590f(str, "receiveIceBerg(context, firstItem)");
            }
        }
        int i0 = StringsKt__StringsKt.m63104i0(str, '|', 0, false, 6, (Object) null);
        int length = str.length();
        if (i0 > length - 3) {
            str2 = str.substring(0, length - 1);
            vx2.m53590f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = str;
        }
        int d0 = StringsKt__StringsKt.m63099d0(str2, '|', 0, false, 6, (Object) null);
        if (d0 >= 12) {
            return str;
        }
        String substring = str2.substring(d0 + 1);
        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: z */
    public final Date mo60919z(String str) {
        vx2.m53591g(str, "value");
        try {
            return f42579c.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
