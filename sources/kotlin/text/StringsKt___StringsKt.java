package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0010\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0007\u001a.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007\u001aH\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0010*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0011H\u0007¨\u0006\u0014"}, mo44877d2 = {"", "", "a1", "", "", "n", "Y0", "Z0", "b1", "size", "", "X0", "step", "", "partialWindows", "c1", "R", "Lkotlin/Function1;", "transform", "d1", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* compiled from: _Strings.kt */
public class StringsKt___StringsKt extends zb6 {
    /* renamed from: X0 */
    public static final List<String> m63122X0(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "<this>");
        return m63127c1(charSequence, i, i, true);
    }

    /* renamed from: Y0 */
    public static final String m63123Y0(String str, int i) {
        boolean z;
        vx2.m53591g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(d75.m43385g(i, str.length()));
            vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: Z0 */
    public static final String m63124Z0(String str, int i) {
        boolean z;
        vx2.m53591g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m63126b1(str, d75.m43382d(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: a1 */
    public static final char m63125a1(CharSequence charSequence) {
        boolean z;
        vx2.m53591g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(StringsKt__StringsKt.m63094Y(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: b1 */
    public static final String m63126b1(String str, int i) {
        boolean z;
        vx2.m53591g(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, d75.m43385g(i, str.length()));
            vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: c1 */
    public static final List<String> m63127c1(CharSequence charSequence, int i, int i2, boolean z) {
        vx2.m53591g(charSequence, "<this>");
        return m63128d1(charSequence, i, i2, z, StringsKt___StringsKt$windowed$1.INSTANCE);
    }

    /* renamed from: d1 */
    public static final <R> List<R> m63128d1(CharSequence charSequence, int i, int i2, boolean z, rc2<? super CharSequence, ? extends R> rc2) {
        int i3;
        boolean z2;
        vx2.m53591g(charSequence, "<this>");
        vx2.m53591g(rc2, "transform");
        o46.m49154a(i, i2);
        int length = charSequence.length();
        int i4 = length / i2;
        if (length % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList(i4 + i3);
        int i5 = 0;
        while (true) {
            if (i5 < 0 || i5 >= length) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                break;
            }
            int i6 = i5 + i;
            if (i6 < 0 || i6 > length) {
                if (!z) {
                    break;
                }
                i6 = length;
            }
            arrayList.add(rc2.invoke(charSequence.subSequence(i5, i6)));
            i5 += i2;
        }
        return arrayList;
    }
}
