package zendesk.belvedere;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class SelectableView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public C9799c f46675a;

    /* renamed from: d */
    public View f46676d;

    /* renamed from: e */
    public View f46677e;

    /* renamed from: g */
    public String f46678g;

    /* renamed from: k */
    public String f46679k;

    /* renamed from: zendesk.belvedere.SelectableView$a */
    public class C9797a implements ValueAnimator.AnimatorUpdateListener {
        public C9797a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.mo73715g(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$b */
    public class C9798b implements ValueAnimator.AnimatorUpdateListener {
        public C9798b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SelectableView.this.mo73711c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: zendesk.belvedere.SelectableView$c */
    public interface C9799c {
        /* renamed from: a */
        boolean mo73722a(boolean z);
    }

    public SelectableView(Context context) {
        super(context);
        mo73714f();
    }

    private View getChild() {
        View view = this.f46676d;
        if (view != null) {
            return view;
        }
        if (getChildCount() == 2) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt.getId() != m35.belvedere_selectable_view_checkbox) {
                    this.f46676d = childAt;
                    break;
                }
                i++;
            }
            return this.f46676d;
        }
        throw new RuntimeException("More then one child added to SelectableView");
    }

    private void setContentDesc(boolean z) {
        if (z) {
            setContentDescription(this.f46678g);
        } else {
            setContentDescription(this.f46679k);
        }
    }

    /* renamed from: c */
    public final void mo73711c(float f) {
        getChild().setAlpha(f);
    }

    /* renamed from: d */
    public final void mo73712d(boolean z) {
        if (z) {
            this.f46677e.setVisibility(0);
            this.f46677e.bringToFront();
            ga7.m17801x0(this.f46677e, ga7.m17798w(this.f46676d) + 1.0f);
            return;
        }
        this.f46677e.setVisibility(8);
    }

    /* renamed from: e */
    public final ImageView mo73713e(int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(m35.belvedere_selectable_view_checkbox);
        imageView.setImageDrawable(zr0.m31442e(getContext(), w25.belvedere_ic_check_circle));
        ga7.m17793t0(imageView, zr0.m31442e(getContext(), w25.belvedere_ic_check_bg));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(8);
        n77.m75285b(imageView, i);
        return imageView;
    }

    /* renamed from: f */
    public final void mo73714f() {
        setClickable(true);
        setFocusable(true);
        setOnClickListener(this);
        ImageView e = mo73713e(n77.m75284a(getContext(), c15.colorPrimary));
        this.f46677e = e;
        addView(e);
    }

    /* renamed from: g */
    public final void mo73715g(float f) {
        getChild().setScaleX(f);
        getChild().setScaleY(f);
    }

    public void onClick(View view) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z = true;
        boolean z2 = !isSelected();
        C9799c cVar = this.f46675a;
        if (cVar != null) {
            z = cVar.mo73722a(z2);
        }
        if (z) {
            setSelected(z2);
            if (z2) {
                valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.9f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f});
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.9f, 1.0f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
            }
            valueAnimator.addUpdateListener(new C9797a());
            valueAnimator2.addUpdateListener(new C9798b());
            valueAnimator2.setDuration(75);
            valueAnimator.setDuration(75);
            valueAnimator.start();
            valueAnimator2.start();
        }
    }

    public void setContentDescriptionStrings(String str, String str2) {
        this.f46678g = str;
        this.f46679k = str2;
        setContentDesc(isSelected());
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            mo73715g(0.9f);
            mo73711c(0.8f);
            mo73712d(true);
            setContentDesc(true);
            return;
        }
        mo73715g(1.0f);
        mo73711c(1.0f);
        mo73712d(false);
        setContentDesc(false);
    }

    public void setSelectionListener(C9799c cVar) {
        this.f46675a = cVar;
    }

    public SelectableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo73714f();
    }

    public SelectableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo73714f();
    }
}
