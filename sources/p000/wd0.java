package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¨\u0006\b"}, mo44877d2 = {"", "", "c", "char", "", "radix", "b", "a", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/CharsKt")
/* renamed from: wd0 */
/* compiled from: CharJVM.kt */
public class wd0 {
    /* renamed from: a */
    public static final int m73569a(int i) {
        if (new rw2(2, 36).mo47514u(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new rw2(2, 36));
    }

    /* renamed from: b */
    public static final int m73570b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m73571c(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }
}
