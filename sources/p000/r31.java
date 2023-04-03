package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* renamed from: r31 */
/* compiled from: DecorToolbar */
public interface r31 {
    /* renamed from: a */
    boolean mo2585a();

    /* renamed from: b */
    boolean mo2586b();

    /* renamed from: c */
    boolean mo2587c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo2589d();

    /* renamed from: e */
    boolean mo2590e();

    /* renamed from: f */
    boolean mo2591f();

    /* renamed from: g */
    void mo2592g(int i);

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    Menu mo2595h();

    /* renamed from: i */
    int mo2596i();

    /* renamed from: j */
    vd7 mo2597j(int i, long j);

    /* renamed from: k */
    ViewGroup mo2598k();

    /* renamed from: l */
    void mo2599l(boolean z);

    /* renamed from: m */
    void mo2600m(int i);

    /* renamed from: n */
    void mo2601n();

    /* renamed from: o */
    void mo2602o(boolean z);

    /* renamed from: p */
    void mo2603p();

    /* renamed from: q */
    void mo2604q(ScrollingTabContainerView scrollingTabContainerView);

    /* renamed from: r */
    void mo2605r(int i);

    /* renamed from: s */
    void mo2606s(C0182i.C0183a aVar, C0173e.C0174a aVar2);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, C0182i.C0183a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    int mo2615t();

    /* renamed from: u */
    void mo2616u();

    /* renamed from: v */
    void mo2617v(Drawable drawable);
}
