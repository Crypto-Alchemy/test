package p000;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;

/* renamed from: qk7 */
/* compiled from: WebvttParserUtil */
public final class qk7 {

    /* renamed from: a */
    public static final Pattern f16967a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m25742a(gm4 gm4) {
        String p = gm4.mo20691p();
        if (p == null || !p.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static float m25743b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m25744c(String str) throws NumberFormatException {
        String[] M0 = w67.m29319M0(str, "\\.");
        long j = 0;
        for (String parseLong : w67.m29317L0(M0[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (M0.length == 2) {
            j2 += Long.parseLong(M0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static void m25745d(gm4 gm4) throws ParserException {
        int e = gm4.mo20680e();
        if (!m25742a(gm4)) {
            gm4.mo20674P(e);
            throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + gm4.mo20691p(), (Throwable) null);
        }
    }
}
