package p000;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: as6 */
/* compiled from: TooltipCompatHandler */
public class as6 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: B */
    public static as6 f7735B;

    /* renamed from: C */
    public static as6 f7736C;

    /* renamed from: A */
    public boolean f7737A;

    /* renamed from: a */
    public final View f7738a;

    /* renamed from: d */
    public final CharSequence f7739d;

    /* renamed from: e */
    public final int f7740e;

    /* renamed from: g */
    public final Runnable f7741g = new yr6(this);

    /* renamed from: k */
    public final Runnable f7742k = new zr6(this);

    /* renamed from: r */
    public int f7743r;

    /* renamed from: s */
    public int f7744s;

    /* renamed from: x */
    public cs6 f7745x;

    /* renamed from: y */
    public boolean f7746y;

    public as6(View view, CharSequence charSequence) {
        this.f7738a = view;
        this.f7739d = charSequence;
        this.f7740e = wb7.m29440c(ViewConfiguration.get(view.getContext()));
        mo11125c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m10760e() {
        mo11128i(false);
    }

    /* renamed from: g */
    public static void m10761g(as6 as6) {
        as6 as62 = f7735B;
        if (as62 != null) {
            as62.mo11124b();
        }
        f7735B = as6;
        if (as6 != null) {
            as6.mo11127f();
        }
    }

    /* renamed from: h */
    public static void m10762h(View view, CharSequence charSequence) {
        as6 as6 = f7735B;
        if (as6 != null && as6.f7738a == view) {
            m10761g((as6) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            as6 as62 = f7736C;
            if (as62 != null && as62.f7738a == view) {
                as62.mo11126d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new as6(view, charSequence);
    }

    /* renamed from: b */
    public final void mo11124b() {
        this.f7738a.removeCallbacks(this.f7741g);
    }

    /* renamed from: c */
    public final void mo11125c() {
        this.f7737A = true;
    }

    /* renamed from: d */
    public void mo11126d() {
        if (f7736C == this) {
            f7736C = null;
            cs6 cs6 = this.f7745x;
            if (cs6 != null) {
                cs6.mo18280c();
                this.f7745x = null;
                mo11125c();
                this.f7738a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f7735B == this) {
            m10761g((as6) null);
        }
        this.f7738a.removeCallbacks(this.f7742k);
    }

    /* renamed from: f */
    public final void mo11127f() {
        this.f7738a.postDelayed(this.f7741g, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void mo11128i(boolean z) {
        long j;
        int i;
        long j2;
        if (ga7.m17746S(this.f7738a)) {
            m10761g((as6) null);
            as6 as6 = f7736C;
            if (as6 != null) {
                as6.mo11126d();
            }
            f7736C = this;
            this.f7746y = z;
            cs6 cs6 = new cs6(this.f7738a.getContext());
            this.f7745x = cs6;
            cs6.mo18282e(this.f7738a, this.f7743r, this.f7744s, this.f7746y, this.f7739d);
            this.f7738a.addOnAttachStateChangeListener(this);
            if (this.f7746y) {
                j = 2500;
            } else {
                if ((ga7.m17737M(this.f7738a) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = yt6.DEFAULT_POLLING_FREQUENCY;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f7738a.removeCallbacks(this.f7742k);
            this.f7738a.postDelayed(this.f7742k, j);
        }
    }

    /* renamed from: j */
    public final boolean mo11129j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f7737A && Math.abs(x - this.f7743r) <= this.f7740e && Math.abs(y - this.f7744s) <= this.f7740e) {
            return false;
        }
        this.f7743r = x;
        this.f7744s = y;
        this.f7737A = false;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f7745x != null && this.f7746y) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f7738a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo11125c();
                mo11126d();
            }
        } else if (this.f7738a.isEnabled() && this.f7745x == null && mo11129j(motionEvent)) {
            m10761g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f7743r = view.getWidth() / 2;
        this.f7744s = view.getHeight() / 2;
        mo11128i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo11126d();
    }
}
