package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, mo44877d2 = {"", "other", "", "ignoreCase", "d", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/CharsKt")
/* renamed from: xd0 */
/* compiled from: Char.kt */
public class xd0 extends wd0 {
    /* renamed from: d */
    public static final boolean m73931d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
