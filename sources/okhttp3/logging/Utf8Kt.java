package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo44877d2 = {"Lm40;", "", "isProbablyUtf8", "okhttp-logging-interceptor"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: utf8.kt */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(m40 m40) {
        vx2.m53591g(m40, "<this>");
        try {
            m40 m402 = new m40();
            m40.mo56058g(m402, 0, d75.m43386h(m40.size(), 64));
            int i = 0;
            while (i < 16) {
                i++;
                if (m402.mo56024I0()) {
                    return true;
                }
                int J = m402.mo56025J();
                if (Character.isISOControl(J) && !Character.isWhitespace(J)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
