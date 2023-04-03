package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C0675e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: l92 */
/* compiled from: FragmentController */
public class l92 {

    /* renamed from: a */
    public final C0675e<?> f14455a;

    public l92(C0675e<?> eVar) {
        this.f14455a = eVar;
    }

    /* renamed from: b */
    public static l92 m21322b(C0675e<?> eVar) {
        return new l92((C0675e) gu4.m18429g(eVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo22694a(Fragment fragment) {
        C0675e<?> eVar = this.f14455a;
        eVar.f3836k.mo5991o(eVar, eVar, fragment);
    }

    /* renamed from: c */
    public void mo22695c() {
        this.f14455a.f3836k.mo5912A();
    }

    /* renamed from: d */
    public boolean mo22696d(MenuItem menuItem) {
        return this.f14455a.f3836k.mo5920D(menuItem);
    }

    /* renamed from: e */
    public void mo22697e() {
        this.f14455a.f3836k.mo5922E();
    }

    /* renamed from: f */
    public void mo22698f() {
        this.f14455a.f3836k.mo5925G();
    }

    /* renamed from: g */
    public void mo22699g() {
        this.f14455a.f3836k.mo5942P();
    }

    /* renamed from: h */
    public void mo22700h() {
        this.f14455a.f3836k.mo5949T();
    }

    /* renamed from: i */
    public void mo22701i() {
        this.f14455a.f3836k.mo5950U();
    }

    /* renamed from: j */
    public void mo22702j() {
        this.f14455a.f3836k.mo5952W();
    }

    /* renamed from: k */
    public boolean mo22703k() {
        return this.f14455a.f3836k.mo5965d0(true);
    }

    /* renamed from: l */
    public FragmentManager mo22704l() {
        return this.f14455a.f3836k;
    }

    /* renamed from: m */
    public void mo22705m() {
        this.f14455a.f3836k.mo5962b1();
    }

    /* renamed from: n */
    public View mo22706n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f14455a.f3836k.mo6021y0().onCreateView(view, str, context, attributeSet);
    }
}
