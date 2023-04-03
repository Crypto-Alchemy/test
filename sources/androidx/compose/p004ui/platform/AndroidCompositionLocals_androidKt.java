package androidx.compose.p004ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p004ui.platform.AndroidComposeView;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.nn0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b&\u0010\u0015¨\u0006("}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Lr37;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lfd2;Lnn0;I)V", "Landroid/content/Context;", "context", "Landroid/content/res/Configuration;", "configuration", "Lbs2;", "g", "(Landroid/content/Context;Landroid/content/res/Configuration;Lnn0;I)Lbs2;", "", "name", "", "f", "Lhy4;", "Lhy4;", "getLocalConfiguration", "()Lhy4;", "LocalConfiguration", "b", "getLocalContext", "LocalContext", "c", "getLocalImageVectorCache", "LocalImageVectorCache", "Lug3;", "d", "getLocalLifecycleOwner", "LocalLifecycleOwner", "Lil5;", "e", "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "getLocalView", "LocalView", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a */
    public static final hy4<Configuration> f1982a = CompositionLocalKt.m2036b(i56.m19414c(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE);

    /* renamed from: b */
    public static final hy4<Context> f1983b = CompositionLocalKt.m2038d(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);

    /* renamed from: c */
    public static final hy4<bs2> f1984c = CompositionLocalKt.m2038d(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);

    /* renamed from: d */
    public static final hy4<ug3> f1985d = CompositionLocalKt.m2038d(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);

    /* renamed from: e */
    public static final hy4<il5> f1986e = CompositionLocalKt.m2038d(C0415x7efe3756.INSTANCE);

    /* renamed from: f */
    public static final hy4<View> f1987f = CompositionLocalKt.m2038d(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$a */
    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class C0414a implements ComponentCallbacks2 {

        /* renamed from: a */
        public final /* synthetic */ Configuration f1988a;

        /* renamed from: d */
        public final /* synthetic */ bs2 f1989d;

        public C0414a(Configuration configuration, bs2 bs2) {
            this.f1988a = configuration;
            this.f1989d = bs2;
        }

        public void onConfigurationChanged(Configuration configuration) {
            vx2.m53591g(configuration, "configuration");
            this.f1989d.mo11791b(this.f1988a.updateFrom(configuration));
            this.f1988a.setTo(configuration);
        }

        public void onLowMemory() {
            this.f1989d.mo11790a();
        }

        public void onTrimMemory(int i) {
            this.f1989d.mo11790a();
        }
    }

    /* renamed from: a */
    public static final void m3042a(AndroidComposeView androidComposeView, fd2<? super nn0, ? super Integer, r37> fd2, nn0 nn0, int i) {
        vx2.m53591g(androidComposeView, ENS.FUNC_OWNER);
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        nn0 a = nn0.mo2929a(1396852028);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        a.mo2953i(-492369756);
        Object j = a.mo2956j();
        nn0.C2913a aVar = nn0.f15626a;
        if (j == aVar.mo23753a()) {
            j = i56.m19412a(context.getResources().getConfiguration(), i56.m19414c());
            a.mo2941e(j);
        }
        a.mo2968o();
        t04 t04 = (t04) j;
        a.mo2953i(1157296644);
        boolean p = a.mo2971p(t04);
        Object j2 = a.mo2956j();
        if (p || j2 == aVar.mo23753a()) {
            j2 = new C0416x68d8e1f6(t04);
            a.mo2941e(j2);
        }
        a.mo2968o();
        androidComposeView.setConfigurationChangeObserver((rc2) j2);
        a.mo2953i(-492369756);
        Object j3 = a.mo2956j();
        if (j3 == aVar.mo23753a()) {
            vx2.m53590f(context, "context");
            j3 = new C3269sj(context);
            a.mo2941e(j3);
        }
        a.mo2968o();
        C3269sj sjVar = (C3269sj) j3;
        AndroidComposeView.C0396b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            a.mo2953i(-492369756);
            Object j4 = a.mo2956j();
            if (j4 == aVar.mo23753a()) {
                j4 = DisposableSaveableStateRegistry_androidKt.m3077a(androidComposeView, viewTreeOwners.mo3806b());
                a.mo2941e(j4);
            }
            a.mo2968o();
            ai1 ai1 = (ai1) j4;
            vn1.m28921a(r37.f33317a, new C0417x611323aa(ai1), a, 0);
            vx2.m53590f(context, "context");
            bs2 g = m3048g(context, m3043b(t04), a, 72);
            hy4<Configuration> hy4 = f1982a;
            Configuration b = m3043b(t04);
            vx2.m53590f(b, "configuration");
            CompositionLocalKt.m2035a(new jy4[]{hy4.mo21417c(b), f1983b.mo21417c(context), f1985d.mo21417c(viewTreeOwners.mo3805a()), f1986e.mo21417c(viewTreeOwners.mo3806b()), SaveableStateRegistryKt.m2179b().mo21417c(ai1), f1987f.mo21417c(androidComposeView.getView()), f1984c.mo21417c(g)}, mn0.m22398b(a, 1471621628, true, new C0419x611323ab(androidComposeView, sjVar, fd2, i)), a, 56);
            if (ComposerKt.m1997O()) {
                ComposerKt.m2007Y();
            }
            nn5 c = a.mo2935c();
            if (c != null) {
                c.mo3065a(new C0420x611323ac(androidComposeView, fd2, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    public static final Configuration m3043b(t04<Configuration> t04) {
        return t04.getValue();
    }

    /* renamed from: c */
    public static final void m3044c(t04<Configuration> t04, Configuration configuration) {
        t04.setValue(configuration);
    }

    /* renamed from: f */
    public static final Void m3047f(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* renamed from: g */
    public static final bs2 m3048g(Context context, Configuration configuration, nn0 nn0, int i) {
        nn0.mo2953i(-485908294);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        nn0.mo2953i(-492369756);
        Object j = nn0.mo2956j();
        nn0.C2913a aVar = nn0.f15626a;
        if (j == aVar.mo23753a()) {
            j = new bs2();
            nn0.mo2941e(j);
        }
        nn0.mo2968o();
        bs2 bs2 = (bs2) j;
        nn0.mo2953i(-492369756);
        Object j2 = nn0.mo2956j();
        Configuration configuration2 = j2;
        if (j2 == aVar.mo23753a()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            nn0.mo2941e(configuration3);
            configuration2 = configuration3;
        }
        nn0.mo2968o();
        Configuration configuration4 = (Configuration) configuration2;
        nn0.mo2953i(-492369756);
        Object j3 = nn0.mo2956j();
        if (j3 == aVar.mo23753a()) {
            j3 = new C0414a(configuration4, bs2);
            nn0.mo2941e(j3);
        }
        nn0.mo2968o();
        vn1.m28921a(bs2, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (C0414a) j3), nn0, 8);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn0.mo2968o();
        return bs2;
    }
}
