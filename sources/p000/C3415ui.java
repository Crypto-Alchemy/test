package p000;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lui;", "Ljp4;", "", "a", "Ljava/util/Locale;", "Ljava/util/Locale;", "b", "()Ljava/util/Locale;", "javaLocale", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ui */
/* compiled from: AndroidLocaleDelegate.android.kt */
public final class C3415ui implements jp4 {

    /* renamed from: a */
    public final Locale f18501a;

    public C3415ui(Locale locale) {
        vx2.m53591g(locale, "javaLocale");
        this.f18501a = locale;
    }

    /* renamed from: a */
    public String mo22030a() {
        String languageTag = this.f18501a.toLanguageTag();
        vx2.m53590f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    /* renamed from: b */
    public final Locale mo26795b() {
        return this.f18501a;
    }
}
