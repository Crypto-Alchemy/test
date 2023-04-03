package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000.C2346g9;

/* renamed from: y76 */
/* compiled from: StandaloneActionMode */
public class y76 extends C2346g9 implements C0173e.C0174a {

    /* renamed from: e */
    public Context f20072e;

    /* renamed from: g */
    public ActionBarContextView f20073g;

    /* renamed from: k */
    public C2346g9.C2347a f20074k;

    /* renamed from: r */
    public WeakReference<View> f20075r;

    /* renamed from: s */
    public boolean f20076s;

    /* renamed from: x */
    public boolean f20077x;

    /* renamed from: y */
    public C0173e f20078y;

    public y76(Context context, ActionBarContextView actionBarContextView, C2346g9.C2347a aVar, boolean z) {
        this.f20072e = context;
        this.f20073g = actionBarContextView;
        this.f20074k = aVar;
        C0173e W = new C0173e(actionBarContextView.getContext()).mo1395W(1);
        this.f20078y = W;
        W.mo1394V(this);
        this.f20077x = z;
    }

    /* renamed from: a */
    public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
        return this.f20074k.mo1170a(this, menuItem);
    }

    /* renamed from: b */
    public void mo1100b(C0173e eVar) {
        mo1249k();
        this.f20073g.mo1608l();
    }

    /* renamed from: c */
    public void mo1243c() {
        if (!this.f20076s) {
            this.f20076s = true;
            this.f20074k.mo1171b(this);
        }
    }

    /* renamed from: d */
    public View mo1244d() {
        WeakReference<View> weakReference = this.f20075r;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo1245e() {
        return this.f20078y;
    }

    /* renamed from: f */
    public MenuInflater mo1246f() {
        return new yd6(this.f20073g.getContext());
    }

    /* renamed from: g */
    public CharSequence mo1247g() {
        return this.f20073g.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo1248i() {
        return this.f20073g.getTitle();
    }

    /* renamed from: k */
    public void mo1249k() {
        this.f20074k.mo1173d(this, this.f20078y);
    }

    /* renamed from: l */
    public boolean mo1250l() {
        return this.f20073g.mo1606j();
    }

    /* renamed from: m */
    public void mo1251m(View view) {
        WeakReference<View> weakReference;
        this.f20073g.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f20075r = weakReference;
    }

    /* renamed from: n */
    public void mo1252n(int i) {
        mo1253o(this.f20072e.getString(i));
    }

    /* renamed from: o */
    public void mo1253o(CharSequence charSequence) {
        this.f20073g.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo1254q(int i) {
        mo1255r(this.f20072e.getString(i));
    }

    /* renamed from: r */
    public void mo1255r(CharSequence charSequence) {
        this.f20073g.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo1256s(boolean z) {
        super.mo1256s(z);
        this.f20073g.setTitleOptional(z);
    }
}
