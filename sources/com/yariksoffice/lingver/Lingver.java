package com.yariksoffice.lingver;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\"\u0010\u001f\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, mo44877d2 = {"Lcom/yariksoffice/lingver/Lingver;", "", "Landroid/content/Context;", "context", "", "language", "country", "variant", "Lr37;", "k", "Ljava/util/Locale;", "locale", "l", "Landroid/app/Application;", "application", "h", "(Landroid/app/Application;)V", "i", "f", "Landroid/content/res/Configuration;", "config", "j", "Landroid/app/Activity;", "activity", "e", "a", "Ljava/util/Locale;", "getSystemLocale$com_yariksoffice_lingver_library", "()Ljava/util/Locale;", "setSystemLocale$com_yariksoffice_lingver_library", "(Ljava/util/Locale;)V", "systemLocale", "Lyj3;", "b", "Lyj3;", "store", "Lx47;", "c", "Lx47;", "delegate", "<init>", "(Lyj3;Lx47;)V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* compiled from: Lingver.kt */
public final class Lingver {
    @SuppressLint({"ConstantLocale"})

    /* renamed from: d */
    public static final Locale f27844d;

    /* renamed from: e */
    public static Lingver f27845e;

    /* renamed from: f */
    public static final C5710a f27846f = new C5710a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Locale f27847a;

    /* renamed from: b */
    public final yj3 f27848b;

    /* renamed from: c */
    public final x47 f27849c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lcom/yariksoffice/lingver/Lingver$a;", "", "Lcom/yariksoffice/lingver/Lingver;", "b", "Landroid/app/Application;", "application", "", "defaultLanguage", "d", "Ljava/util/Locale;", "defaultLocale", "e", "Lyj3;", "store", "c", "Ljava/util/Locale;", "instance", "Lcom/yariksoffice/lingver/Lingver;", "<init>", "()V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: com.yariksoffice.lingver.Lingver$a */
    /* compiled from: Lingver.kt */
    public static final class C5710a {
        public C5710a() {
        }

        public /* synthetic */ C5710a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Lingver mo41597b() {
            boolean z;
            if (Lingver.f27845e != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Lingver b = Lingver.f27845e;
                if (b == null) {
                    vx2.m53605u("instance");
                }
                return b;
            }
            throw new IllegalStateException("Lingver should be initialized first".toString());
        }

        /* renamed from: c */
        public final Lingver mo41598c(Application application, yj3 yj3) {
            boolean z;
            vx2.m53592h(application, "application");
            vx2.m53592h(yj3, "store");
            if (Lingver.f27845e == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Lingver lingver = new Lingver(yj3, new x47(), (DefaultConstructorMarker) null);
                lingver.mo41592h(application);
                Lingver.f27845e = lingver;
                return lingver;
            }
            throw new IllegalStateException("Already initialized".toString());
        }

        /* renamed from: d */
        public final Lingver mo41599d(Application application, String str) {
            vx2.m53592h(application, "application");
            vx2.m53592h(str, "defaultLanguage");
            return mo41600e(application, new Locale(str));
        }

        /* renamed from: e */
        public final Lingver mo41600e(Application application, Locale locale) {
            vx2.m53592h(application, "application");
            vx2.m53592h(locale, "defaultLocale");
            return mo41598c(application, new ou4(application, locale, (String) null, 4, (DefaultConstructorMarker) null));
        }
    }

    static {
        Locale locale = Locale.getDefault();
        vx2.m53587c(locale, "Locale.getDefault()");
        f27844d = locale;
    }

    public Lingver(yj3 yj3, x47 x47) {
        this.f27848b = yj3;
        this.f27849c = x47;
        this.f27847a = f27844d;
    }

    /* renamed from: g */
    public static final Lingver m43063g(Application application, String str) {
        return f27846f.mo41599d(application, str);
    }

    /* renamed from: m */
    public static /* synthetic */ void m43064m(Lingver lingver, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        lingver.mo41595k(context, str, str2, str3);
    }

    /* renamed from: e */
    public final void mo41590e(Activity activity) {
        mo41591f(activity);
        by1.m32793c(activity);
    }

    /* renamed from: f */
    public final void mo41591f(Context context) {
        this.f27849c.mo49390a(context, this.f27848b.mo46545d());
    }

    /* renamed from: h */
    public final void mo41592h(Application application) {
        Locale locale;
        vx2.m53592h(application, "application");
        application.registerActivityLifecycleCallbacks(new ph3(new Lingver$initialize$1(this)));
        application.registerComponentCallbacks(new qh3(new Lingver$initialize$2(this, application)));
        if (this.f27848b.mo46543b()) {
            locale = this.f27847a;
        } else {
            locale = this.f27848b.mo46545d();
        }
        mo41593i(application, locale);
    }

    /* renamed from: i */
    public final void mo41593i(Context context, Locale locale) {
        this.f27848b.mo46544c(locale);
        this.f27849c.mo49390a(context, locale);
    }

    /* renamed from: j */
    public final void mo41594j(Context context, Configuration configuration) {
        this.f27847a = by1.m32791a(configuration);
        if (this.f27848b.mo46543b()) {
            mo41593i(context, this.f27847a);
        } else {
            mo41591f(context);
        }
    }

    /* renamed from: k */
    public final void mo41595k(Context context, String str, String str2, String str3) {
        vx2.m53592h(context, "context");
        vx2.m53592h(str, "language");
        vx2.m53592h(str2, "country");
        vx2.m53592h(str3, "variant");
        mo41596l(context, new Locale(str, str2, str3));
    }

    /* renamed from: l */
    public final void mo41596l(Context context, Locale locale) {
        vx2.m53592h(context, "context");
        vx2.m53592h(locale, "locale");
        this.f27848b.mo46542a(false);
        mo41593i(context, locale);
    }

    public /* synthetic */ Lingver(yj3 yj3, x47 x47, DefaultConstructorMarker defaultConstructorMarker) {
        this(yj3, x47);
    }
}
