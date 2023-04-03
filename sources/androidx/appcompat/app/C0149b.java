package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000.C2346g9;

/* renamed from: androidx.appcompat.app.b */
/* compiled from: AppCompatDelegate */
public abstract class C0149b {

    /* renamed from: a */
    public static int f611a = -100;

    /* renamed from: d */
    public static final C3162qq<WeakReference<C0149b>> f612d = new C3162qq<>();

    /* renamed from: e */
    public static final Object f613e = new Object();

    /* renamed from: A */
    public static void m867A(C0149b bVar) {
        synchronized (f613e) {
            m868B(bVar);
        }
    }

    /* renamed from: B */
    public static void m868B(C0149b bVar) {
        synchronized (f613e) {
            Iterator<WeakReference<C0149b>> it = f612d.iterator();
            while (it.hasNext()) {
                C0149b bVar2 = (C0149b) it.next().get();
                if (bVar2 == bVar || bVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    public static void m869G(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f611a != i) {
            f611a = i;
            m871f();
        }
    }

    /* renamed from: c */
    public static void m870c(C0149b bVar) {
        synchronized (f613e) {
            m868B(bVar);
            f612d.add(new WeakReference(bVar));
        }
    }

    /* renamed from: f */
    public static void m871f() {
        synchronized (f613e) {
            Iterator<WeakReference<C0149b>> it = f612d.iterator();
            while (it.hasNext()) {
                C0149b bVar = (C0149b) it.next().get();
                if (bVar != null) {
                    bVar.mo1105e();
                }
            }
        }
    }

    /* renamed from: i */
    public static C0149b m872i(Activity activity, C3208rm rmVar) {
        return new AppCompatDelegateImpl(activity, rmVar);
    }

    /* renamed from: j */
    public static C0149b m873j(Dialog dialog, C3208rm rmVar) {
        return new AppCompatDelegateImpl(dialog, rmVar);
    }

    /* renamed from: l */
    public static int m874l() {
        return f611a;
    }

    /* renamed from: C */
    public abstract boolean mo1060C(int i);

    /* renamed from: D */
    public abstract void mo1062D(int i);

    /* renamed from: E */
    public abstract void mo1064E(View view);

    /* renamed from: F */
    public abstract void mo1066F(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: H */
    public abstract void mo1069H(Toolbar toolbar);

    /* renamed from: I */
    public void mo1071I(int i) {
    }

    /* renamed from: J */
    public abstract void mo1073J(CharSequence charSequence);

    /* renamed from: K */
    public abstract C2346g9 mo1075K(C2346g9.C2347a aVar);

    /* renamed from: d */
    public abstract void mo1103d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public abstract boolean mo1105e();

    @Deprecated
    /* renamed from: g */
    public void mo1214g(Context context) {
    }

    /* renamed from: h */
    public Context mo1108h(Context context) {
        mo1214g(context);
        return context;
    }

    /* renamed from: k */
    public abstract <T extends View> T mo1112k(int i);

    /* renamed from: m */
    public abstract C1671c9 mo1115m();

    /* renamed from: n */
    public int mo1117n() {
        return -100;
    }

    /* renamed from: o */
    public abstract MenuInflater mo1119o();

    /* renamed from: p */
    public abstract ActionBar mo1123p();

    /* renamed from: q */
    public abstract void mo1125q();

    /* renamed from: r */
    public abstract void mo1127r();

    /* renamed from: s */
    public abstract void mo1129s(Configuration configuration);

    /* renamed from: t */
    public abstract void mo1131t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo1133u();

    /* renamed from: v */
    public abstract void mo1135v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo1137w();

    /* renamed from: x */
    public abstract void mo1139x(Bundle bundle);

    /* renamed from: y */
    public abstract void mo1141y();

    /* renamed from: z */
    public abstract void mo1143z();
}
