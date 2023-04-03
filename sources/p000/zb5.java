package p000;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.text.MatcherMatchResult;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, mo44877d2 = {"", "Lz32;", "", "j", "Ljava/util/regex/Matcher;", "from", "", "input", "Lno3;", "f", "g", "Ljava/util/regex/MatchResult;", "Lrw2;", "h", "groupIndex", "i", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: zb5 */
/* compiled from: Regex.kt */
public final class zb5 {
    /* renamed from: f */
    public static final no3 m74830f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* renamed from: g */
    public static final no3 m74831g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* renamed from: h */
    public static final rw2 m74832h(MatchResult matchResult) {
        return d75.m43395q(matchResult.start(), matchResult.end());
    }

    /* renamed from: i */
    public static final rw2 m74833i(MatchResult matchResult, int i) {
        return d75.m43395q(matchResult.start(i), matchResult.end(i));
    }

    /* renamed from: j */
    public static final int m74834j(Iterable<? extends z32> iterable) {
        int i = 0;
        for (z32 value : iterable) {
            i |= value.getValue();
        }
        return i;
    }
}
