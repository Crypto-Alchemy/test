package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: hs0 */
/* compiled from: ContextThemeWrapper */
public class hs0 extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f13053f;

    /* renamed from: a */
    public int f13054a;

    /* renamed from: b */
    public Resources.Theme f13055b;

    /* renamed from: c */
    public LayoutInflater f13056c;

    /* renamed from: d */
    public Configuration f13057d;

    /* renamed from: e */
    public Resources f13058e;

    /* renamed from: hs0$a */
    /* compiled from: ContextThemeWrapper */
    public static class C2511a {
        /* renamed from: a */
        public static Context m19249a(hs0 hs0, Configuration configuration) {
            return hs0.createConfigurationContext(configuration);
        }
    }

    public hs0() {
        super((Context) null);
    }

    /* renamed from: e */
    public static boolean m19243e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f13053f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = Utils.FLOAT_EPSILON;
            f13053f = configuration2;
        }
        return configuration.equals(f13053f);
    }

    /* renamed from: a */
    public void mo21369a(Configuration configuration) {
        if (this.f13058e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f13057d == null) {
            this.f13057d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources mo21371b() {
        if (this.f13058e == null) {
            Configuration configuration = this.f13057d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m19243e(configuration))) {
                this.f13058e = super.getResources();
            } else {
                this.f13058e = C2511a.m19249a(this, this.f13057d).getResources();
            }
        }
        return this.f13058e;
    }

    /* renamed from: c */
    public int mo21372c() {
        return this.f13054a;
    }

    /* renamed from: d */
    public final void mo21373d() {
        boolean z;
        if (this.f13055b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f13055b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13055b.setTo(theme);
            }
        }
        mo21374f(this.f13055b, this.f13054a, z);
    }

    /* renamed from: f */
    public void mo21374f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return mo21371b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13056c == null) {
            this.f13056c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13056c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f13055b;
        if (theme != null) {
            return theme;
        }
        if (this.f13054a == 0) {
            this.f13054a = h55.Theme_AppCompat_Light;
        }
        mo21373d();
        return this.f13055b;
    }

    public void setTheme(int i) {
        if (this.f13054a != i) {
            this.f13054a = i;
            mo21373d();
        }
    }

    public hs0(Context context, int i) {
        super(context);
        this.f13054a = i;
    }

    public hs0(Context context, Resources.Theme theme) {
        super(context);
        this.f13055b = theme;
    }
}
