package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, mo44877d2 = {"", "marginPrefix", "g", "newIndent", "e", "f", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lrc2;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* compiled from: Indent.kt */
public class StringsKt__IndentKt extends rb6 {
    /* renamed from: b */
    public static final rc2<String, String> m63053b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
        }
        return new StringsKt__IndentKt$getIndentFunction$2(str);
    }

    /* renamed from: c */
    public static final int m63054c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!wd0.m73571c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: d */
    public static final String m63055d(String str, String str2) {
        int i;
        String invoke;
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "newIndent");
        List<String> m0 = StringsKt__StringsKt.m63108m0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : m0) {
            if (!yb6.m74325B((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m63054c(c)));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.m47345p0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * m0.size());
        rc2<String, String> b = m63053b(str2);
        int l = ck0.m33064l(m0);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : m0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ck0.m33072t();
            }
            String str3 = (String) next2;
            if ((i2 == 0 || i2 == l) && yb6.m74325B(str3)) {
                str3 = null;
            } else {
                String Y0 = StringsKt___StringsKt.m63123Y0(str3, i);
                if (!(Y0 == null || (invoke = b.invoke(Y0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt___CollectionsKt.m47336g0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 124, (Object) null)).toString();
        vx2.m53590f(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static final String m63056e(String str, String str2, String str3) {
        int i;
        String invoke;
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "newIndent");
        vx2.m53591g(str3, "marginPrefix");
        if (!yb6.m74325B(str3)) {
            List<String> m0 = StringsKt__StringsKt.m63108m0(str);
            int length = str.length() + (str2.length() * m0.size());
            rc2<String, String> b = m63053b(str2);
            int l = ck0.m33064l(m0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : m0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ck0.m33072t();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i2 == 0 || i2 == l) && yb6.m74325B(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!wd0.m73571c(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (yb6.m74335L(str4, str3, i, false, 4, (Object) null)) {
                            vx2.m53589e(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            vx2.m53590f(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (invoke = b.invoke(str5)) == null)) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) CollectionsKt___CollectionsKt.m47336g0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 124, (Object) null)).toString();
            vx2.m53590f(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static final String m63057f(String str) {
        vx2.m53591g(str, "<this>");
        return m63055d(str, "");
    }

    /* renamed from: g */
    public static final String m63058g(String str, String str2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "marginPrefix");
        return m63056e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m63059h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m63058g(str, str2);
    }
}
