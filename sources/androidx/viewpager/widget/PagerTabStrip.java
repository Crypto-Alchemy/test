package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: P */
    public int f7281P;

    /* renamed from: Q */
    public int f7282Q;

    /* renamed from: U */
    public int f7283U;

    /* renamed from: b1 */
    public final Paint f7284b1;

    /* renamed from: e0 */
    public int f7285e0;

    /* renamed from: e1 */
    public final Rect f7286e1;

    /* renamed from: k0 */
    public int f7287k0;

    /* renamed from: o1 */
    public int f7288o1;

    /* renamed from: p1 */
    public boolean f7289p1;

    /* renamed from: q1 */
    public boolean f7290q1;

    /* renamed from: r1 */
    public int f7291r1;

    /* renamed from: s1 */
    public boolean f7292s1;

    /* renamed from: t1 */
    public float f7293t1;

    /* renamed from: u1 */
    public float f7294u1;

    /* renamed from: v0 */
    public int f7295v0;

    /* renamed from: v1 */
    public int f7296v1;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class C1468a implements View.OnClickListener {
        public C1468a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f7306a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class C1469b implements View.OnClickListener {
        public C1469b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f7306a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public void mo10611c(int i, float f, boolean z) {
        Rect rect = this.f7286e1;
        int height = getHeight();
        int left = this.f7308e.getLeft() - this.f7295v0;
        int right = this.f7308e.getRight() + this.f7295v0;
        int i2 = height - this.f7282Q;
        rect.set(left, i2, right, height);
        super.mo10611c(i, f, z);
        this.f7288o1 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f7308e.getLeft() - this.f7295v0, i2, this.f7308e.getRight() + this.f7295v0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f7289p1;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f7287k0);
    }

    public int getTabIndicatorColor() {
        return this.f7281P;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f7308e.getLeft() - this.f7295v0;
        int right = this.f7308e.getRight() + this.f7295v0;
        this.f7284b1.setColor((this.f7288o1 << 24) | (this.f7281P & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f7282Q), (float) right, f, this.f7284b1);
        if (this.f7289p1) {
            this.f7284b1.setColor(-16777216 | (this.f7281P & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f7291r1), (float) (getWidth() - getPaddingRight()), f, this.f7284b1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f7292s1) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f7293t1 = x;
            this.f7294u1 = y;
            this.f7292s1 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f7293t1) > ((float) this.f7296v1) || Math.abs(y - this.f7294u1) > ((float) this.f7296v1))) {
                this.f7292s1 = true;
            }
        } else if (x < ((float) (this.f7308e.getLeft() - this.f7295v0))) {
            ViewPager viewPager = this.f7306a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f7308e.getRight() + this.f7295v0))) {
            ViewPager viewPager2 = this.f7306a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f7290q1) {
            if ((i & -16777216) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f7289p1 = z;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f7290q1) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f7289p1 = z;
        }
    }

    public void setBackgroundResource(int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f7290q1) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f7289p1 = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f7289p1 = z;
        this.f7290q1 = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f7283U;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f7281P = i;
        this.f7284b1.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(zr0.m31440c(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f7285e0;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f7284b1 = paint;
        this.f7286e1 = new Rect();
        this.f7288o1 = 255;
        this.f7289p1 = false;
        this.f7290q1 = false;
        int i = this.f7305I;
        this.f7281P = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7282Q = (int) ((3.0f * f) + 0.5f);
        this.f7283U = (int) ((6.0f * f) + 0.5f);
        this.f7285e0 = (int) (64.0f * f);
        this.f7295v0 = (int) ((16.0f * f) + 0.5f);
        this.f7291r1 = (int) ((1.0f * f) + 0.5f);
        this.f7287k0 = (int) ((f * 32.0f) + 0.5f);
        this.f7296v1 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f7307d.setFocusable(true);
        this.f7307d.setOnClickListener(new C1468a());
        this.f7309g.setFocusable(true);
        this.f7309g.setOnClickListener(new C1469b());
        if (getBackground() == null) {
            this.f7289p1 = true;
        }
    }
}
