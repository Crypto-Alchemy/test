package p000;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0821o;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.oned.Code39Reader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: w67 */
/* compiled from: Util */
public final class w67 {

    /* renamed from: a */
    public static final int f19021a;

    /* renamed from: b */
    public static final String f19022b;

    /* renamed from: c */
    public static final String f19023c;

    /* renamed from: d */
    public static final String f19024d;

    /* renamed from: e */
    public static final String f19025e;

    /* renamed from: f */
    public static final byte[] f19026f = new byte[0];

    /* renamed from: g */
    public static final Pattern f19027g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    public static final Pattern f19028h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    public static final Pattern f19029i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    public static final Pattern f19030j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k */
    public static HashMap<String, String> f19031k;

    /* renamed from: l */
    public static final String[] f19032l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m */
    public static final String[] f19033m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n */
    public static final int[] f19034n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o */
    public static final int[] f19035o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, MlKitException.CODE_SCANNER_CANCELLED, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, Code39Reader.ASTERISK_ENCODING, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, MlKitException.CODE_SCANNER_UNAVAILABLE, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 230, 225, 232, 239, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f19021a = i;
        String str = Build.DEVICE;
        f19022b = str;
        String str2 = Build.MANUFACTURER;
        f19023c = str2;
        String str3 = Build.MODEL;
        f19024d = str3;
        f19025e = str + ", " + str3 + ", " + str2 + ", " + i;
    }

    /* renamed from: A */
    public static String m29294A(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: A0 */
    public static String m29295A0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e = C5876gr.m44841e(str);
        String str2 = m29319M0(e, "-")[0];
        if (f19031k == null) {
            f19031k = m29392z();
        }
        String str3 = f19031k.get(str2);
        if (str3 != null) {
            e = str3 + e.substring(str2.length());
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            return m29387w0(e);
        }
        return e;
    }

    /* renamed from: B */
    public static String m29296B(byte[] bArr) {
        return new String(bArr, be0.f21263c);
    }

    /* renamed from: B0 */
    public static <T> T[] m29297B0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    /* renamed from: C */
    public static String m29298C(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, be0.f21263c);
    }

    /* renamed from: C0 */
    public static <T> T[] m29299C0(T[] tArr, int i) {
        boolean z;
        if (i <= tArr.length) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: D */
    public static int m29300D(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: D0 */
    public static <T> T[] m29301D0(T[] tArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (i2 > tArr.length) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        return Arrays.copyOfRange(tArr, i, i2);
    }

    /* renamed from: E */
    public static int m29302E(int i) {
        if (i != 12) {
            switch (i) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    int i2 = f19021a;
                    if (i2 < 23 && i2 < 21) {
                        return 0;
                    }
                    return 6396;
                default:
                    return 0;
            }
        } else if (f19021a >= 32) {
            return 743676;
        } else {
            return 0;
        }
    }

    /* renamed from: E0 */
    public static long m29303E0(String str) throws ParserException {
        Matcher matcher = f19027g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i != 0) {
                return timeInMillis - (((long) i) * 60000);
            }
            return timeInMillis;
        }
        throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, (Throwable) null);
    }

    /* renamed from: F */
    public static C0821o.C0823b m29304F(C0821o oVar, C0821o.C0823b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean g = oVar.mo6701g();
        boolean O = oVar.mo6597O();
        boolean K = oVar.mo6596K();
        boolean p = oVar.mo6617p();
        boolean d0 = oVar.mo6602d0();
        boolean u = oVar.mo6619u();
        boolean u2 = oVar.mo6712x().mo6883u();
        C0821o.C0823b.C0824a d = new C0821o.C0823b.C0824a().mo6851b(bVar).mo6853d(4, !g);
        boolean z7 = false;
        if (!O || g) {
            z = false;
        } else {
            z = true;
        }
        C0821o.C0823b.C0824a d2 = d.mo6853d(5, z);
        if (!K || g) {
            z2 = false;
        } else {
            z2 = true;
        }
        C0821o.C0823b.C0824a d3 = d2.mo6853d(6, z2);
        if (u2 || ((!K && d0 && !O) || g)) {
            z3 = false;
        } else {
            z3 = true;
        }
        C0821o.C0823b.C0824a d4 = d3.mo6853d(7, z3);
        if (!p || g) {
            z4 = false;
        } else {
            z4 = true;
        }
        C0821o.C0823b.C0824a d5 = d4.mo6853d(8, z4);
        if (u2 || ((!p && (!d0 || !u)) || g)) {
            z5 = false;
        } else {
            z5 = true;
        }
        C0821o.C0823b.C0824a d6 = d5.mo6853d(9, z5).mo6853d(10, !g);
        if (!O || g) {
            z6 = false;
        } else {
            z6 = true;
        }
        C0821o.C0823b.C0824a d7 = d6.mo6853d(11, z6);
        if (O && !g) {
            z7 = true;
        }
        return d7.mo6853d(12, z7).mo6854e();
    }

    /* renamed from: F0 */
    public static long m29305F0(String str) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        Matcher matcher = f19028h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = Utils.DOUBLE_EPSILON;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j = (long) ((d10 + d6) * 1000.0d);
        if (isEmpty) {
            return -j;
        }
        return j;
    }

    /* renamed from: G */
    public static int m29306G(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i2;
        }
        return Integer.reverseBytes(i2);
    }

    /* renamed from: G0 */
    public static boolean m29307G0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: H */
    public static String m29308H(String str, int i) {
        String[] N0 = m29321N0(str);
        if (N0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : N0) {
            if (i == vv3.m29137k(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: H0 */
    public static boolean m29309H0(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static String m29310I(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: I0 */
    public static <T> void m29311I0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: J */
    public static String m29312J(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C5876gr.m44842f(networkCountryIso);
            }
        }
        return C5876gr.m44842f(Locale.getDefault().getCountry());
    }

    /* renamed from: J0 */
    public static long m29313J0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: K */
    public static Point m29314K(Context context) {
        Display display;
        DisplayManager displayManager;
        if (f19021a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            display = null;
        } else {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            display = ((WindowManager) C2725kr.m20985e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m29316L(context, display);
    }

    /* renamed from: K0 */
    public static void m29315K0(long[] jArr, long j, long j2) {
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (i >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i2 < jArr.length) {
                jArr[i2] = (long) (((double) jArr[i2]) * d);
                i2++;
            }
        } else {
            long j4 = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static Point m29316L(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && m29381t0(context)) {
            if (f19021a < 28) {
                str = m29357h0("sys.display-size");
            } else {
                str = m29357h0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] L0 = m29317L0(str.trim(), "x");
                    if (L0.length == 2) {
                        int parseInt = Integer.parseInt(L0[0]);
                        int parseInt2 = Integer.parseInt(L0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                gk3.m18126c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(f19023c) && f19024d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i = f19021a;
        if (i >= 23) {
            m29326Q(display, point);
        } else if (i >= 17) {
            m29324P(display, point);
        } else {
            m29322O(display, point);
        }
        return point;
    }

    /* renamed from: L0 */
    public static String[] m29317L0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: M */
    public static Looper m29318M() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: M0 */
    public static String[] m29319M0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: N */
    public static Locale m29320N() {
        if (f19021a >= 24) {
            return Locale.getDefault(Locale.Category.DISPLAY);
        }
        return Locale.getDefault();
    }

    /* renamed from: N0 */
    public static String[] m29321N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m29317L0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: O */
    public static void m29322O(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: O0 */
    public static ComponentName m29323O0(Context context, Intent intent) {
        if (f19021a >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }

    /* renamed from: P */
    public static void m29324P(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: P0 */
    public static long m29325P0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: Q */
    public static void m29326Q(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: Q0 */
    public static byte[] m29327Q0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: R */
    public static int m29328R(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    /* renamed from: R0 */
    public static long m29329R0(int i, int i2) {
        return m29331S0(i2) | (m29331S0(i) << 32);
    }

    /* renamed from: S */
    public static int m29330S(String str) {
        String[] L0;
        int length;
        boolean z;
        if (str == null || (length = L0.length) < 2) {
            return 0;
        }
        String str2 = L0[length - 1];
        if (length < 3 || !"neg".equals((L0 = m29317L0(str, "_"))[length - 2])) {
            z = false;
        } else {
            z = true;
        }
        try {
            int parseInt = Integer.parseInt((String) C2725kr.m20985e(str2));
            if (z) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: S0 */
    public static long m29331S0(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: T */
    public static String m29332T(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: T0 */
    public static CharSequence m29333T0(CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence;
        }
        return charSequence.subSequence(0, i);
    }

    /* renamed from: U */
    public static String m29334U(Locale locale) {
        if (f19021a >= 21) {
            return m29336V(locale);
        }
        return locale.toString();
    }

    /* renamed from: U0 */
    public static long m29335U0(long j) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j == Long.MIN_VALUE) {
            return j;
        }
        return j / 1000;
    }

    /* renamed from: V */
    public static String m29336V(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: V0 */
    public static void m29337V0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: W */
    public static long m29338W(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(((double) j) * ((double) f));
    }

    /* renamed from: X */
    public static long m29339X(long j) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: Y */
    public static int m29340Y(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: Z */
    public static C0792h m29341Z(int i, int i2, int i3) {
        return new C0792h.C0794b().mo6670e0("audio/raw").mo6647H(i2).mo6671f0(i3).mo6664Y(i).mo6644E();
    }

    /* renamed from: a0 */
    public static int m29343a0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: b */
    public static long m29344b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: b0 */
    public static long m29345b0(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(((double) j) / ((double) f));
    }

    /* renamed from: c */
    public static boolean m29346c(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public static int m29347c0(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int m29348d(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w67.m29348d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: d0 */
    public static String m29349d0(StringBuilder sb, Formatter formatter, long j) {
        String str;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = 0;
        }
        if (j < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j3), Long.valueOf(j2)}).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29350e(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L_0x0014
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r6 == 0) goto L_0x0019
            int r4 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r4 = r0
        L_0x001a:
            if (r7 == 0) goto L_0x0023
            int r3 = r3.length
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w67.m29350e(long[], long, boolean, boolean):int");
    }

    /* renamed from: e0 */
    public static String[] m29351e0() {
        String[] f0 = m29353f0();
        for (int i = 0; i < f0.length; i++) {
            f0[i] = m29295A0(f0[i]);
        }
        return f0;
    }

    /* renamed from: f */
    public static int m29352f(cl3 cl3, long j, boolean z, boolean z2) {
        int i;
        int c = cl3.mo12105c() - 1;
        int i2 = 0;
        while (i2 <= c) {
            int i3 = (i2 + c) >>> 1;
            if (cl3.mo12104b(i3) < j) {
                i2 = i3 + 1;
            } else {
                c = i3 - 1;
            }
        }
        if (z && (i = c + 1) < cl3.mo12105c() && cl3.mo12104b(i) == j) {
            return i;
        }
        if (!z2 || c != -1) {
            return c;
        }
        return 0;
    }

    /* renamed from: f0 */
    public static String[] m29353f0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f19021a >= 24) {
            return m29355g0(configuration);
        }
        return new String[]{m29334U(configuration.locale)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int m29354g(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w67.m29354g(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: g0 */
    public static String[] m29355g0(Configuration configuration) {
        return m29317L0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29356h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w67.m29356h(int[], int, boolean, boolean):int");
    }

    /* renamed from: h0 */
    public static String m29357h0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            gk3.m18127d("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29358i(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r6 == 0) goto L_0x001a
            int r3 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r3 = r0
        L_0x001b:
            if (r7 == 0) goto L_0x0022
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w67.m29358i(long[], long, boolean, boolean):int");
    }

    /* renamed from: i0 */
    public static String m29359i0(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return PublicResolver.FUNC_TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m29360j(T t) {
        return t;
    }

    /* renamed from: j0 */
    public static byte[] m29361j0(String str) {
        return str.getBytes(be0.f21263c);
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T[] m29362k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    public static int m29363k0(Uri uri) {
        int l0;
        String scheme = uri.getScheme();
        if (scheme != null && C5876gr.m44837a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (l0 = m29365l0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return l0;
        }
        Matcher matcher = f19030j.matcher((CharSequence) C2725kr.m20985e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: l */
    public static int m29364l(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: l0 */
    public static int m29365l0(String str) {
        String e = C5876gr.m44841e(str);
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case 104579:
                if (e.equals("ism")) {
                    c = 0;
                    break;
                }
                break;
            case 108321:
                if (e.equals("mpd")) {
                    c = 1;
                    break;
                }
                break;
            case 3242057:
                if (e.equals("isml")) {
                    c = 2;
                    break;
                }
                break;
            case 3299913:
                if (e.equals("m3u8")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: m */
    public static long m29366m(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: m0 */
    public static int m29367m0(Uri uri, String str) {
        if (str == null) {
            return m29363k0(uri);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: n */
    public static void m29368n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static boolean m29369n0(gm4 gm4, gm4 gm42, Inflater inflater) {
        if (gm4.mo20676a() <= 0) {
            return false;
        }
        if (gm42.mo20677b() < gm4.mo20676a()) {
            gm42.mo20678c(gm4.mo20676a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(gm4.mo20679d(), gm4.mo20680e(), gm4.mo20676a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(gm42.mo20679d(), i, gm42.mo20677b() - i);
                if (inflater.finished()) {
                    gm42.mo20673O(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == gm42.mo20677b()) {
                    gm42.mo20678c(gm42.mo20677b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: o */
    public static int m29370o(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: o0 */
    public static boolean m29371o0(Context context) {
        if (f19021a < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static float m29372p(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: p0 */
    public static boolean m29373p0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: q */
    public static int m29374q(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: q0 */
    public static boolean m29375q0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: r */
    public static long m29376r(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: r0 */
    public static boolean m29377r0(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: s */
    public static int m29378s(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f19034n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: s0 */
    public static boolean m29379s0(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static int m29380t(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f19035o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: t0 */
    public static boolean m29381t0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static Handler m29382u(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: u0 */
    public static /* synthetic */ Thread m29383u0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: v */
    public static Handler m29384v() {
        return m29386w((Handler.Callback) null);
    }

    /* renamed from: v0 */
    public static int m29385v0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static Handler m29386w(Handler.Callback callback) {
        return m29382u((Looper) C2725kr.m20989i(Looper.myLooper()), callback);
    }

    /* renamed from: w0 */
    public static String m29387w0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f19033m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: x */
    public static Handler m29388x() {
        return m29390y((Handler.Callback) null);
    }

    /* renamed from: x0 */
    public static <T> void m29389x0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    /* renamed from: y */
    public static Handler m29390y(Handler.Callback callback) {
        return m29382u(m29318M(), callback);
    }

    /* renamed from: y0 */
    public static long m29391y0(long j) {
        return (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: z */
    public static HashMap<String, String> m29392z() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f19032l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f19032l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: z0 */
    public static ExecutorService m29393z0(String str) {
        return Executors.newSingleThreadExecutor(new n67(str));
    }
}
