package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r27 */
/* compiled from: TypefaceProvider */
public class r27 {

    /* renamed from: a */
    public static final Map<CharSequence, Typeface> f33312a = new HashMap();

    /* renamed from: b */
    public static final Map<CharSequence, sp2> f33313b = new HashMap();

    /* renamed from: a */
    public static Collection<sp2> m50929a() {
        return f33313b.values();
    }

    /* renamed from: b */
    public static Typeface m50930b(Context context, sp2 sp2) {
        String charSequence = sp2.mo47848b().toString();
        Map<CharSequence, Typeface> map = f33312a;
        if (map.get(charSequence) == null) {
            map.put(charSequence, Typeface.createFromAsset(context.getAssets(), charSequence));
        }
        return map.get(charSequence);
    }

    /* renamed from: c */
    public static sp2 m50931c(String str, boolean z) {
        sp2 sp2 = f33313b.get(str);
        if (sp2 != null || z) {
            return sp2;
        }
        throw new RuntimeException(String.format("Font '%s' not properly registered", new Object[]{str}));
    }
}
