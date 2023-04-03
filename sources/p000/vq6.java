package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: vq6 */
/* compiled from: TintContextWrapper */
public class vq6 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f18884c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<vq6>> f18885d;

    /* renamed from: a */
    public final Resources f18886a;

    /* renamed from: b */
    public final Resources.Theme f18887b;

    public vq6(Context context) {
        super(context);
        if (u87.m28120c()) {
            u87 u87 = new u87(this, context.getResources());
            this.f18886a = u87;
            Resources.Theme newTheme = u87.newTheme();
            this.f18887b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f18886a = new xq6(this, context.getResources());
        this.f18887b = null;
    }

    /* renamed from: a */
    public static boolean m29074a(Context context) {
        if ((context instanceof vq6) || (context.getResources() instanceof xq6) || (context.getResources() instanceof u87) || !u87.m28120c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m29075b(Context context) {
        vq6 vq6;
        if (!m29074a(context)) {
            return context;
        }
        synchronized (f18884c) {
            ArrayList<WeakReference<vq6>> arrayList = f18885d;
            if (arrayList == null) {
                f18885d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f18885d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f18885d.remove(size);
                    }
                }
                for (int size2 = f18885d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f18885d.get(size2);
                    if (weakReference2 != null) {
                        vq6 = (vq6) weakReference2.get();
                    } else {
                        vq6 = null;
                    }
                    if (vq6 != null && vq6.getBaseContext() == context) {
                        return vq6;
                    }
                }
            }
            vq6 vq62 = new vq6(context);
            f18885d.add(new WeakReference(vq62));
            return vq62;
        }
    }

    public AssetManager getAssets() {
        return this.f18886a.getAssets();
    }

    public Resources getResources() {
        return this.f18886a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f18887b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f18887b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
