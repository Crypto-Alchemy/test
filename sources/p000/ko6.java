package p000;

import android.util.Patterns;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\n\u0010\f\u001a\u00020\u0004*\u00020\u0002J\u0012\u0010\u000f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¨\u0006\u0015"}, mo44877d2 = {"Lko6;", "", "", "password", "", "f", "email", "d", "data", "b", "e", "g", "c", "", "chainId", "h", "text", "pattern", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ko6 */
/* compiled from: TextValidationUtil.kt */
public final class ko6 {

    /* renamed from: a */
    public static final ko6 f38933a = new ko6();

    /* renamed from: b */
    public static final boolean m59870b(String str) {
        return f38933a.mo52964a(str, "(?=.*[A-Z])(?=\\S+$).+$");
    }

    /* renamed from: d */
    public static final boolean m59871d(String str) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        if (str == null) {
            str = "";
        }
        return pattern.matcher(str).matches();
    }

    /* renamed from: e */
    public static final boolean m59872e(String str) {
        return f38933a.mo52964a(str, "^(?=.*[0-9])(?=\\S+$).+$");
    }

    /* renamed from: f */
    public static final boolean m59873f(String str) {
        return f38933a.mo52964a(str, "^(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=\\S+$).{4,}$");
    }

    /* renamed from: g */
    public static final boolean m59874g(String str) {
        return f38933a.mo52964a(str, "(?=.*[^A-Za-z0-9])(?=\\S+$).+$");
    }

    /* renamed from: a */
    public final boolean mo52964a(String str, String str2) {
        Pattern compile = Pattern.compile(str2);
        if (str == null) {
            str = "";
        }
        return compile.matcher(str).matches();
    }

    /* renamed from: c */
    public final boolean mo52965c(String str) {
        vx2.m53591g(str, "<this>");
        if (StringsKt__StringsKt.m63090V0(str).toString().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo52966h(String str, int i) {
        vx2.m53591g(str, "<this>");
        return a14.f36348a.mo50042b(TokenType.Companion.mo57099b(i), str);
    }
}
