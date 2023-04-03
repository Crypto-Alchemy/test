package p000;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lvi;", "Lkp4;", "", "languageTag", "Ljp4;", "b", "", "a", "()Ljava/util/List;", "current", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vi */
/* compiled from: AndroidLocaleDelegate.android.kt */
public final class C3488vi implements kp4 {
    /* renamed from: a */
    public List<jp4> mo22471a() {
        Locale locale = Locale.getDefault();
        vx2.m53590f(locale, "getDefault()");
        return bk0.m32598e(new C3415ui(locale));
    }

    /* renamed from: b */
    public jp4 mo22472b(String str) {
        vx2.m53591g(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        vx2.m53590f(forLanguageTag, "forLanguageTag(languageTag)");
        return new C3415ui(forLanguageTag);
    }
}
