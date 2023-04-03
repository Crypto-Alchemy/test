package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.web3j.abi.datatypes.Utf8String;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u001c\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u001c\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u001c\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u001c\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u0012\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0000\u001a\u0012\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000\u001a4\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001a\u001c\u0010\u001f\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010 \u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010!\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a\u001c\u0010\"\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a&\u0010&\u001a\u00020\u0016*\u00020\u00002\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a&\u0010'\u001a\u00020\u0016*\u00020\u00002\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a=\u0010*\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010+\u001aG\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010.*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050,2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100\u001a&\u00101\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a&\u00103\u001a\u00020\u0016*\u00020\u00002\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a&\u00104\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a&\u00105\u001a\u00020\u0016*\u00020\u00002\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a\u001f\u00106\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002\u001a\u001f\u00107\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002\u001a?\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:*\u00020\u00002\u0006\u00108\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u0016H\u0002¢\u0006\u0004\b;\u0010<\u001aG\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030:*\u00020\u00002\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050=2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0010\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u0016H\u0000\u001a?\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050:*\u00020\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050=\"\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u0016¢\u0006\u0004\bB\u0010C\u001a?\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050D*\u00020\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050=\"\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u0016¢\u0006\u0004\bE\u0010F\u001a0\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050D*\u00020\u00002\n\u00108\u001a\u00020#\"\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u0016\u001a1\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050D*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010I\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050:*\u00020\u0000\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050D*\u00020\u0000\"\u0015\u0010N\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0015\u0010Q\u001a\u00020\u0016*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, mo44877d2 = {"", "V0", "W0", "Lrw2;", "range", "", "I0", "", "delimiter", "missingDelimiterValue", "P0", "Q0", "J0", "K0", "T0", "N0", "prefix", "s0", "suffix", "t0", "v0", "u0", "", "thisOffset", "other", "otherOffset", "length", "", "ignoreCase", "r0", "char", "E0", "S", "F0", "T", "", "chars", "startIndex", "f0", "k0", "endIndex", "last", "b0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "W", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "Z", "string", "a0", "g0", "h0", "P", "O", "delimiters", "limit", "Lhw5;", "n0", "(Ljava/lang/CharSequence;[CIZI)Lhw5;", "", "o0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lhw5;", "Lr37;", "w0", "C0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lhw5;", "", "y0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "x0", "z0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "l0", "m0", "X", "(Ljava/lang/CharSequence;)Lrw2;", "indices", "Y", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* compiled from: Strings.kt */
public class StringsKt__StringsKt extends yb6 {
    /* renamed from: A0 */
    public static /* synthetic */ List m63060A0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m63119x0(charSequence, cArr, z, i);
    }

    /* renamed from: B0 */
    public static /* synthetic */ List m63061B0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m63120y0(charSequence, strArr, z, i);
    }

    /* renamed from: C0 */
    public static final hw5<String> m63062C0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(strArr, "delimiters");
        return SequencesKt___SequencesKt.m63034x(m63112q0(charSequence, strArr, 0, z, i, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    /* renamed from: D0 */
    public static /* synthetic */ hw5 m63063D0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m63062C0(charSequence, strArr, z, i);
    }

    /* renamed from: E0 */
    public static final boolean m63064E0(CharSequence charSequence, char c, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        if (charSequence.length() <= 0 || !xd0.m73931d(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: F0 */
    public static final boolean m63065F0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return yb6.m74336M((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m63113r0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: G0 */
    public static /* synthetic */ boolean m63066G0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63064E0(charSequence, c, z);
    }

    /* renamed from: H0 */
    public static /* synthetic */ boolean m63067H0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63065F0(charSequence, charSequence2, z);
    }

    /* renamed from: I0 */
    public static final String m63068I0(CharSequence charSequence, rw2 rw2) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(rw2, "range");
        return charSequence.subSequence(rw2.mo47512e().intValue(), rw2.mo47513k().intValue() + 1).toString();
    }

    /* renamed from: J0 */
    public static final String m63069J0(String str, char c, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "missingDelimiterValue");
        int d0 = m63099d0(str, c, 0, false, 6, (Object) null);
        if (d0 == -1) {
            return str2;
        }
        String substring = str.substring(d0 + 1, str.length());
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: K0 */
    public static final String m63070K0(String str, String str2, String str3) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "delimiter");
        vx2.m53591g(str3, "missingDelimiterValue");
        int e0 = m63100e0(str, str2, 0, false, 6, (Object) null);
        if (e0 == -1) {
            return str3;
        }
        String substring = str.substring(e0 + str2.length(), str.length());
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: L0 */
    public static /* synthetic */ String m63071L0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m63069J0(str, c, str2);
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m63072M0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m63070K0(str, str2, str3);
    }

    /* renamed from: N0 */
    public static final String m63074N0(String str, char c, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "missingDelimiterValue");
        int i0 = m63104i0(str, c, 0, false, 6, (Object) null);
        if (i0 == -1) {
            return str2;
        }
        String substring = str.substring(i0 + 1, str.length());
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: O */
    public static final boolean m63075O(CharSequence charSequence, char c, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        if (m63099d0(charSequence, c, 0, z, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public static /* synthetic */ String m63076O0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m63074N0(str, c, str2);
    }

    /* renamed from: P */
    public static final boolean m63077P(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m63100e0(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m63098c0(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P0 */
    public static final String m63078P0(String str, char c, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "missingDelimiterValue");
        int d0 = m63099d0(str, c, 0, false, 6, (Object) null);
        if (d0 == -1) {
            return str2;
        }
        String substring = str.substring(0, d0);
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m63079Q(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63075O(charSequence, c, z);
    }

    /* renamed from: Q0 */
    public static final String m63080Q0(String str, String str2, String str3) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "delimiter");
        vx2.m53591g(str3, "missingDelimiterValue");
        int e0 = m63100e0(str, str2, 0, false, 6, (Object) null);
        if (e0 == -1) {
            return str3;
        }
        String substring = str.substring(0, e0);
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m63081R(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63077P(charSequence, charSequence2, z);
    }

    /* renamed from: R0 */
    public static /* synthetic */ String m63082R0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m63078P0(str, c, str2);
    }

    /* renamed from: S */
    public static final boolean m63083S(CharSequence charSequence, char c, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        if (charSequence.length() <= 0 || !xd0.m73931d(charSequence.charAt(m63094Y(charSequence)), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: S0 */
    public static /* synthetic */ String m63084S0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m63080Q0(str, str2, str3);
    }

    /* renamed from: T */
    public static final boolean m63085T(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return yb6.m74343x((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m63113r0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: T0 */
    public static final String m63086T0(String str, String str2, String str3) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "delimiter");
        vx2.m53591g(str3, "missingDelimiterValue");
        int j0 = m63105j0(str, str2, 0, false, 6, (Object) null);
        if (j0 == -1) {
            return str3;
        }
        String substring = str.substring(0, j0);
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m63087U(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63083S(charSequence, c, z);
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m63088U0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m63086T0(str, str2, str3);
    }

    /* renamed from: V */
    public static /* synthetic */ boolean m63089V(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63085T(charSequence, charSequence2, z);
    }

    /* renamed from: V0 */
    public static final CharSequence m63090V0(CharSequence charSequence) {
        int i;
        vx2.m53591g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c = wd0.m73571c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: W */
    public static final Pair<Integer, String> m63091W(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        pw2 pw2;
        T t;
        T t2;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                pw2 = new rw2(d75.m43382d(i, 0), charSequence.length());
            } else {
                pw2 = d75.m43392n(d75.m43385g(i, m63094Y(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int n = pw2.mo46910n();
                int q = pw2.mo46911q();
                int r = pw2.mo46912r();
                if ((r > 0 && n <= q) || (r < 0 && q <= n)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (yb6.m74326C(str, 0, (String) charSequence, n, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (n == q) {
                                break;
                            }
                            n += r;
                        } else {
                            return wy6.m54142a(Integer.valueOf(n), str2);
                        }
                    }
                }
            } else {
                int n2 = pw2.mo46910n();
                int q2 = pw2.mo46911q();
                int r2 = pw2.mo46912r();
                if ((r2 > 0 && n2 <= q2) || (r2 < 0 && q2 <= n2)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (m63113r0(str3, 0, charSequence, n2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (n2 == q2) {
                                break;
                            }
                            n2 += r2;
                        } else {
                            return wy6.m54142a(Integer.valueOf(n2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) CollectionsKt___CollectionsKt.m47354y0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i3 = i;
        if (!z2) {
            i2 = m63100e0(charSequence2, str6, i3, false, 4, (Object) null);
        } else {
            i2 = m63105j0(charSequence2, str6, i3, false, 4, (Object) null);
        }
        if (i2 < 0) {
            return null;
        }
        return wy6.m54142a(Integer.valueOf(i2), str5);
    }

    /* renamed from: W0 */
    public static final CharSequence m63092W0(CharSequence charSequence) {
        vx2.m53591g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!wd0.m73571c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    /* renamed from: X */
    public static final rw2 m63093X(CharSequence charSequence) {
        vx2.m53591g(charSequence, "<this>");
        return new rw2(0, charSequence.length() - 1);
    }

    /* renamed from: Y */
    public static final int m63094Y(CharSequence charSequence) {
        vx2.m53591g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: Z */
    public static final int m63095Z(CharSequence charSequence, char c, int i, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m63101f0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a0 */
    public static final int m63096a0(CharSequence charSequence, String str, int i, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m63098c0(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: b0 */
    public static final int m63097b0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        pw2 pw2;
        if (!z2) {
            pw2 = new rw2(d75.m43382d(i, 0), d75.m43385g(i2, charSequence.length()));
        } else {
            pw2 = d75.m43392n(d75.m43385g(i, m63094Y(charSequence)), d75.m43382d(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int n = pw2.mo46910n();
            int q = pw2.mo46911q();
            int r = pw2.mo46912r();
            if ((r <= 0 || n > q) && (r >= 0 || q > n)) {
                return -1;
            }
            while (true) {
                if (m63113r0(charSequence2, 0, charSequence, n, charSequence2.length(), z)) {
                    return n;
                }
                if (n == q) {
                    return -1;
                }
                n += r;
            }
        } else {
            int n2 = pw2.mo46910n();
            int q2 = pw2.mo46911q();
            int r2 = pw2.mo46912r();
            if ((r2 <= 0 || n2 > q2) && (r2 >= 0 || q2 > n2)) {
                return -1;
            }
            while (true) {
                if (yb6.m74326C((String) charSequence2, 0, (String) charSequence, n2, charSequence2.length(), z)) {
                    return n2;
                }
                if (n2 == q2) {
                    return -1;
                }
                n2 += r2;
            }
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ int m63098c0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m63097b0(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m63099d0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m63095Z(charSequence, c, i, z);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m63100e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m63096a0(charSequence, str, i, z);
    }

    /* renamed from: f0 */
    public static final int m63101f0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            lw2 s = new rw2(d75.m43382d(i, 0), m63094Y(charSequence)).iterator();
            while (s.hasNext()) {
                int nextInt = s.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (xd0.m73931d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(ArraysKt___ArraysKt.m47277c0(cArr), i);
    }

    /* renamed from: g0 */
    public static final int m63102g0(CharSequence charSequence, char c, int i, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m63106k0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: h0 */
    public static final int m63103h0(CharSequence charSequence, String str, int i, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        if (z || !(charSequence instanceof String)) {
            return m63097b0(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: i0 */
    public static /* synthetic */ int m63104i0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m63094Y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m63102g0(charSequence, c, i, z);
    }

    /* renamed from: j0 */
    public static /* synthetic */ int m63105j0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m63094Y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m63103h0(charSequence, str, i, z);
    }

    /* renamed from: k0 */
    public static final int m63106k0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int g = d75.m43385g(i, m63094Y(charSequence)); -1 < g; g--) {
                char charAt = charSequence.charAt(g);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (xd0.m73931d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return g;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ArraysKt___ArraysKt.m47277c0(cArr), i);
    }

    /* renamed from: l0 */
    public static final hw5<String> m63107l0(CharSequence charSequence) {
        vx2.m53591g(charSequence, "<this>");
        return m63063D0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: m0 */
    public static final List<String> m63108m0(CharSequence charSequence) {
        vx2.m53591g(charSequence, "<this>");
        return SequencesKt___SequencesKt.m63020D(m63107l0(charSequence));
    }

    /* renamed from: n0 */
    public static final hw5<rw2> m63109n0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m63118w0(i2);
        return new ac1(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, z));
    }

    /* renamed from: o0 */
    public static final hw5<rw2> m63110o0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m63118w0(i2);
        return new ac1(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$2(C6706xq.m54490d(strArr), z));
    }

    /* renamed from: p0 */
    public static /* synthetic */ hw5 m63111p0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m63109n0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: q0 */
    public static /* synthetic */ hw5 m63112q0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m63110o0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: r0 */
    public static final boolean m63113r0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!xd0.m73931d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s0 */
    public static final String m63114s0(String str, CharSequence charSequence) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(charSequence, "prefix");
        if (!m63067H0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: t0 */
    public static final String m63115t0(String str, CharSequence charSequence) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(charSequence, "suffix");
        if (!m63089V(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: u0 */
    public static final String m63116u0(String str, CharSequence charSequence) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(charSequence, "delimiter");
        return m63117v0(str, charSequence, charSequence);
    }

    /* renamed from: v0 */
    public static final String m63117v0(String str, CharSequence charSequence, CharSequence charSequence2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(charSequence, "prefix");
        vx2.m53591g(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m63067H0(str, charSequence, false, 2, (Object) null) || !m63089V(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w0 */
    public static final void m63118w0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: x0 */
    public static final List<String> m63119x0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(cArr, "delimiters");
        if (cArr.length == 1) {
            return m63121z0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<rw2> l = SequencesKt___SequencesKt.m63022l(m63111p0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(dk0.m43495u(l, 10));
        for (rw2 I0 : l) {
            arrayList.add(m63068I0(charSequence, I0));
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public static final List<String> m63120y0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m63121z0(charSequence, str, z, i);
            }
        }
        Iterable<rw2> l = SequencesKt___SequencesKt.m63022l(m63112q0(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(dk0.m43495u(l, 10));
        for (rw2 I0 : l) {
            arrayList.add(m63068I0(charSequence, I0));
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public static final List<String> m63121z0(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        m63118w0(i);
        int i2 = 0;
        int a0 = m63096a0(charSequence, str, 0, z);
        if (a0 == -1 || i == 1) {
            return bk0.m32598e(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = d75.m43385g(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, a0).toString());
            i2 = str.length() + a0;
            if ((z2 && arrayList.size() == i - 1) || (a0 = m63096a0(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, a0).toString());
            i2 = str.length() + a0;
            break;
        } while ((a0 = m63096a0(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }
}
