package p000;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: q5 */
/* compiled from: AbstractAppBarOnDestinationChangedListener */
public abstract class C3122q5 implements NavController.C1115b {

    /* renamed from: a */
    public final Context f16794a;

    /* renamed from: b */
    public final Set<Integer> f16795b;

    /* renamed from: c */
    public final WeakReference<li4> f16796c;

    /* renamed from: d */
    public ek1 f16797d;

    /* renamed from: e */
    public ValueAnimator f16798e;

    public C3122q5(Context context, C3083pm pmVar) {
        this.f16794a = context;
        this.f16795b = pmVar.mo24643b();
        li4 a = pmVar.mo24642a();
        if (a != null) {
            this.f16796c = new WeakReference<>(a);
        } else {
            this.f16796c = null;
        }
    }

    /* renamed from: a */
    public void mo38a(NavController navController, NavDestination navDestination, Bundle bundle) {
        li4 li4;
        if (!(navDestination instanceof w42)) {
            WeakReference<li4> weakReference = this.f16796c;
            if (weakReference != null) {
                li4 = weakReference.get();
            } else {
                li4 = null;
            }
            if (this.f16796c == null || li4 != null) {
                CharSequence A = navDestination.mo8546A();
                boolean z = true;
                if (A != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(A);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle == null || !bundle.containsKey(group)) {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill label " + A);
                        }
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(bundle.get(group).toString());
                    }
                    matcher.appendTail(stringBuffer);
                    mo18592d(stringBuffer);
                }
                boolean c = a54.m42c(navDestination, this.f16795b);
                if (li4 != null || !c) {
                    if (li4 == null || !c) {
                        z = false;
                    }
                    mo24942b(z);
                    return;
                }
                mo18591c((Drawable) null, 0);
                return;
            }
            navController.mo8474g0(this);
        }
    }

    /* renamed from: b */
    public final void mo24942b(boolean z) {
        boolean z2;
        int i;
        float f;
        if (this.f16797d == null) {
            this.f16797d = new ek1(this.f16794a);
            z2 = false;
        } else {
            z2 = true;
        }
        ek1 ek1 = this.f16797d;
        if (z) {
            i = u45.nav_app_bar_open_drawer_description;
        } else {
            i = u45.nav_app_bar_navigate_up_description;
        }
        mo18591c(ek1, i);
        if (z) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = 1.0f;
        }
        if (z2) {
            float a = this.f16797d.mo19270a();
            ValueAnimator valueAnimator = this.f16798e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16797d, "progress", new float[]{a, f});
            this.f16798e = ofFloat;
            ofFloat.start();
            return;
        }
        this.f16797d.setProgress(f);
    }

    /* renamed from: c */
    public abstract void mo18591c(Drawable drawable, int i);

    /* renamed from: d */
    public abstract void mo18592d(CharSequence charSequence);
}
