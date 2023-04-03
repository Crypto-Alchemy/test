package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: o5 */
/* compiled from: AbsActionBarView */
public abstract class C2940o5 extends ViewGroup {

    /* renamed from: a */
    public final C2941a f15803a;

    /* renamed from: d */
    public final Context f15804d;

    /* renamed from: e */
    public ActionMenuView f15805e;

    /* renamed from: g */
    public ActionMenuPresenter f15806g;

    /* renamed from: k */
    public int f15807k;

    /* renamed from: r */
    public vd7 f15808r;

    /* renamed from: s */
    public boolean f15809s;

    /* renamed from: x */
    public boolean f15810x;

    /* renamed from: o5$a */
    /* compiled from: AbsActionBarView */
    public class C2941a implements xd7 {

        /* renamed from: a */
        public boolean f15811a = false;

        /* renamed from: b */
        public int f15812b;

        public C2941a() {
        }

        /* renamed from: a */
        public void mo2623a(View view) {
            this.f15811a = true;
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            if (!this.f15811a) {
                C2940o5 o5Var = C2940o5.this;
                o5Var.f15808r = null;
                C2940o5.super.setVisibility(this.f15812b);
            }
        }

        /* renamed from: c */
        public void mo1163c(View view) {
            C2940o5.super.setVisibility(0);
            this.f15811a = false;
        }

        /* renamed from: d */
        public C2941a mo23905d(vd7 vd7, int i) {
            C2940o5.this.f15808r = vd7;
            this.f15812b = i;
            return this;
        }
    }

    public C2940o5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public static int m23663d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public int mo23902c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: e */
    public int mo23903e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public vd7 mo1596f(int i, long j) {
        vd7 vd7 = this.f15808r;
        if (vd7 != null) {
            vd7.mo27116c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(Utils.FLOAT_EPSILON);
            }
            vd7 b = ga7.m17762e(this).mo27115b(1.0f);
            b.mo27118f(j);
            b.mo27120h(this.f15803a.mo23905d(b, i));
            return b;
        }
        vd7 b2 = ga7.m17762e(this).mo27115b(Utils.FLOAT_EPSILON);
        b2.mo27118f(j);
        b2.mo27120h(this.f15803a.mo23905d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.f15808r != null) {
            return this.f15803a.f15812b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f15807k;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j65.ActionBar, m15.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j65.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f15806g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1697I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15810x = false;
        }
        if (!this.f15810x) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f15810x = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f15810x = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15809s = false;
        }
        if (!this.f15809s) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f15809s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15809s = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f15807k = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            vd7 vd7 = this.f15808r;
            if (vd7 != null) {
                vd7.mo27116c();
            }
            super.setVisibility(i);
        }
    }

    public C2940o5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15803a = new C2941a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(m15.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f15804d = context;
        } else {
            this.f15804d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
