package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.p001os.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¨\u0006\u000f"}, mo44877d2 = {"Lx47;", "", "Landroid/content/Context;", "context", "Ljava/util/Locale;", "locale", "Lr37;", "a", "(Landroid/content/Context;Ljava/util/Locale;)V", "c", "Landroid/content/res/Configuration;", "config", "b", "<init>", "()V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: x47 */
/* compiled from: UpdateLocaleDelegate.kt */
public final class x47 {
    /* renamed from: a */
    public final void mo49390a(Context context, Locale locale) {
        vx2.m53592h(context, "context");
        vx2.m53592h(locale, "locale");
        mo49392c(context, locale);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != context) {
            vx2.m53587c(applicationContext, "appContext");
            mo49392c(applicationContext, locale);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final void mo49391b(Configuration configuration, Locale locale) {
        LinkedHashSet f = ny5.m49096f(locale);
        LocaleList localeList = LocaleList.getDefault();
        vx2.m53587c(localeList, "LocaleList.getDefault()");
        int size = localeList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Locale locale2 = localeList.get(i);
            vx2.m53587c(locale2, "defaultLocales[it]");
            arrayList.add(locale2);
        }
        f.addAll(arrayList);
        Object[] array = f.toArray(new Locale[0]);
        if (array != null) {
            Locale[] localeArr = (Locale[]) array;
            configuration.setLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public final void mo49392c(Context context, Locale locale) {
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        vx2.m53587c(resources, "res");
        Configuration configuration = resources.getConfiguration();
        vx2.m53587c(configuration, "res.configuration");
        if (!vx2.m53586b(by1.m32791a(configuration), locale)) {
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            if (by1.m32792b(24)) {
                mo49391b(configuration2, locale);
            } else if (by1.m32792b(17)) {
                configuration2.setLocale(locale);
            } else {
                configuration2.locale = locale;
            }
            resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        }
    }
}
