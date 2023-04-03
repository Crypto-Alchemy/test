package zendesk.belvedere;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class FloatingActionMenu extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public FloatingActionButton f46632a;

    /* renamed from: d */
    public LayoutInflater f46633d;

    /* renamed from: e */
    public final List<jl4<FloatingActionButton, View.OnClickListener>> f46634e = new ArrayList();

    /* renamed from: g */
    public View.OnClickListener f46635g;

    /* renamed from: k */
    public boolean f46636k;

    /* renamed from: r */
    public boolean f46637r = true;

    /* renamed from: s */
    public int f46638s;

    /* renamed from: x */
    public final C9788c f46639x = new C9787b();

    /* renamed from: zendesk.belvedere.FloatingActionMenu$a */
    public class C9786a extends C9788c {

        /* renamed from: a */
        public final /* synthetic */ jl4 f46640a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9786a(jl4 jl4) {
            super((C9786a) null);
            this.f46640a = jl4;
        }

        public void onAnimationEnd(Animation animation) {
            FloatingActionMenu.this.mo73650d((View) this.f46640a.f13688a, 4);
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$b */
    public class C9787b extends C9788c {
        public C9787b() {
            super((C9786a) null);
        }

        public void onAnimationEnd(Animation animation) {
            for (jl4 jl4 : FloatingActionMenu.this.f46634e) {
                FloatingActionMenu.this.mo73650d((View) jl4.f13688a, 8);
            }
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$c */
    public static abstract class C9788c implements Animation.AnimationListener {
        public C9788c() {
        }

        public /* synthetic */ C9788c(C9786a aVar) {
            this();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public FloatingActionMenu(Context context) {
        super(context);
        mo73654h(context);
    }

    /* renamed from: c */
    public void mo73649c(int i, int i2, int i3, View.OnClickListener onClickListener) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.f46633d.inflate(h45.belvedere_floating_action_menu_item, this, false);
        floatingActionButton.setOnClickListener(onClickListener);
        floatingActionButton.setImageDrawable(mo73651e(i, q15.belvedere_floating_action_menu_item_icon_color));
        floatingActionButton.setId(i2);
        floatingActionButton.setContentDescription(getResources().getString(i3));
        this.f46634e.add(jl4.m20216a(floatingActionButton, onClickListener));
        if (this.f46634e.size() == 1) {
            this.f46632a.setImageDrawable(mo73651e(i, q15.belvedere_floating_action_menu_icon_color));
            this.f46632a.setContentDescription(getResources().getString(i3));
        } else if (this.f46634e.size() == 2) {
            addView((View) this.f46634e.get(0).f13688a, 0);
            addView(floatingActionButton, 0);
            this.f46632a.setImageDrawable(mo73651e(w25.belvedere_fam_icon_add_file, q15.belvedere_floating_action_menu_icon_color));
            this.f46632a.setContentDescription(getResources().getString(q45.belvedere_fam_desc_expand_fam));
        } else {
            addView(floatingActionButton, 0);
        }
        if (!this.f46634e.isEmpty()) {
            mo73653g();
        }
    }

    /* renamed from: d */
    public final void mo73650d(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final Drawable mo73651e(int i, int i2) {
        Context context = getContext();
        Drawable r = ij1.m19659r(zr0.m31442e(context, i));
        ij1.m19655n(r, zr0.m31440c(context, i2));
        return r;
    }

    /* renamed from: f */
    public final void mo73652f() {
        mo73655i(false);
        mo73657k(false);
        this.f46632a.setContentDescription(getResources().getString(q45.belvedere_fam_desc_collapse_fam));
    }

    /* renamed from: g */
    public void mo73653g() {
        if (!this.f46634e.isEmpty()) {
            if (this.f46637r) {
                this.f46632a.setImageResource(w25.belvedere_fam_icon_add_file);
            }
            this.f46637r = false;
        }
    }

    /* renamed from: h */
    public final void mo73654h(Context context) {
        View.inflate(context, h45.belvedere_floating_action_menu, this);
        if (!isInEditMode()) {
            setOrientation(1);
            setOnClickListener(this);
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(m35.floating_action_menu_fab);
            this.f46632a = floatingActionButton;
            floatingActionButton.setOnClickListener(this);
            this.f46633d = LayoutInflater.from(context);
            this.f46638s = getResources().getInteger(y35.belvedere_fam_animation_delay_subsequent_item);
            mo73658l();
        }
    }

    /* renamed from: i */
    public final void mo73655i(boolean z) {
        if (z) {
            this.f46632a.setImageResource(w25.belvedere_fam_icon_close);
        } else {
            this.f46632a.setImageResource(w25.belvedere_fam_icon_add_file);
        }
    }

    /* renamed from: j */
    public final void mo73656j() {
        mo73655i(true);
        mo73657k(true);
        this.f46632a.setContentDescription(getResources().getString(q45.belvedere_fam_desc_expand_fam));
    }

    /* renamed from: k */
    public final void mo73657k(boolean z) {
        if (this.f46634e.isEmpty()) {
            mo73658l();
            return;
        }
        long j = 0;
        if (z) {
            for (jl4 next : this.f46634e) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), v05.belvedere_show_menu_item);
                loadAnimation.setRepeatMode(2);
                loadAnimation.setStartOffset(j);
                F f = next.f13688a;
                if (f != null) {
                    mo73650d((View) f, 0);
                    ((FloatingActionButton) next.f13688a).startAnimation(loadAnimation);
                }
                j += (long) this.f46638s;
            }
            return;
        }
        Animation animation = null;
        int size = this.f46634e.size() - 1;
        while (size >= 0) {
            jl4 jl4 = this.f46634e.get(size);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), v05.belvedere_hide_menu_item);
            loadAnimation2.setRepeatMode(2);
            loadAnimation2.setStartOffset(j);
            loadAnimation2.setAnimationListener(new C9786a(jl4));
            F f2 = jl4.f13688a;
            if (f2 != null) {
                ((FloatingActionButton) f2).startAnimation(loadAnimation2);
            }
            j += (long) this.f46638s;
            size--;
            animation = loadAnimation2;
        }
        if (animation != null) {
            animation.setAnimationListener(this.f46639x);
        }
    }

    /* renamed from: l */
    public void mo73658l() {
        this.f46637r = true;
        if (this.f46636k) {
            mo73652f();
        }
        this.f46632a.setImageResource(w25.belvedere_fam_icon_send);
    }

    /* renamed from: m */
    public final void mo73659m() {
        boolean z = !this.f46636k;
        this.f46636k = z;
        if (z) {
            mo73656j();
        } else {
            mo73652f();
        }
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener;
        if (this.f46637r && (onClickListener = this.f46635g) != null) {
            onClickListener.onClick(this);
        } else if (!this.f46634e.isEmpty()) {
            if (this.f46634e.size() == 1) {
                jl4 jl4 = this.f46634e.get(0);
                ((View.OnClickListener) jl4.f13689b).onClick((View) jl4.f13688a);
                return;
            }
            mo73659m();
        }
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        this.f46635g = onClickListener;
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo73654h(context);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo73654h(context);
    }
}
