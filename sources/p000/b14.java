package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0003¨\u0006\u0013"}, mo44877d2 = {"Lb14;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "context", "", "language", "e", "Landroid/content/res/Configuration;", "config", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "b", "a", "locale", "Lr37;", "d", "c", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: b14 */
/* compiled from: MyContextWrapper.kt */
public final class b14 extends ContextWrapper {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b14(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    @TargetApi(24)
    /* renamed from: a */
    public final Locale mo50445a(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    /* renamed from: b */
    public final Locale mo50446b(Configuration configuration) {
        return configuration.locale;
    }

    @TargetApi(24)
    /* renamed from: c */
    public final void mo50447c(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    /* renamed from: d */
    public final void mo50448d(Configuration configuration, Locale locale) {
        configuration.locale = locale;
    }

    /* renamed from: e */
    public final ContextWrapper mo50449e(Context context, String str) {
        Locale locale;
        Locale locale2;
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "language");
        Configuration configuration = context.getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            vx2.m53590f(configuration, "config");
            locale = mo50445a(configuration);
        } else {
            vx2.m53590f(configuration, "config");
            locale = mo50446b(configuration);
        }
        if (!vx2.m53586b(str, "")) {
            vx2.m53588d(locale);
            if (!vx2.m53586b(locale.getLanguage(), str)) {
                if (StringsKt__StringsKt.m63081R(str, "-r", false, 2, (Object) null)) {
                    List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{"-r"}, false, 0, 6, (Object) null);
                    locale2 = new Locale((String) B0.get(0), (String) B0.get(1));
                } else {
                    locale2 = new Locale(str);
                }
                Locale.setDefault(locale2);
                if (i >= 24) {
                    mo50447c(configuration, locale2);
                } else {
                    mo50448d(configuration, locale2);
                }
            }
        }
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        vx2.m53590f(createConfigurationContext, "newContext.createConfigurationContext(config)");
        return new b14(createConfigurationContext);
    }
}
