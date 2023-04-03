package p000;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: qb6 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class qb6 {

    /* renamed from: a */
    public static final Pattern f33042a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m50490a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
