package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0593c;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton {

    /* renamed from: I1 */
    public static final Property<SwitchCompat, Float> f1181I1 = new C0264a(Float.class, "thumbPos");

    /* renamed from: J1 */
    public static final int[] f1182J1 = {16842912};

    /* renamed from: A */
    public boolean f1183A;

    /* renamed from: A1 */
    public Layout f1184A1;

    /* renamed from: B */
    public int f1185B;

    /* renamed from: B1 */
    public Layout f1186B1;

    /* renamed from: C */
    public int f1187C;

    /* renamed from: C1 */
    public TransformationMethod f1188C1;

    /* renamed from: D1 */
    public ObjectAnimator f1189D1;

    /* renamed from: E1 */
    public final C2765ln f1190E1;

    /* renamed from: F1 */
    public C1640bn f1191F1;

    /* renamed from: G1 */
    public C0266c f1192G1;

    /* renamed from: H */
    public int f1193H;

    /* renamed from: H1 */
    public final Rect f1194H1;

    /* renamed from: I */
    public boolean f1195I;

    /* renamed from: L */
    public CharSequence f1196L;

    /* renamed from: M */
    public CharSequence f1197M;

    /* renamed from: P */
    public CharSequence f1198P;

    /* renamed from: Q */
    public CharSequence f1199Q;

    /* renamed from: U */
    public boolean f1200U;

    /* renamed from: a */
    public Drawable f1201a;

    /* renamed from: b1 */
    public float f1202b1;

    /* renamed from: d */
    public ColorStateList f1203d;

    /* renamed from: e */
    public PorterDuff.Mode f1204e;

    /* renamed from: e0 */
    public int f1205e0;

    /* renamed from: e1 */
    public VelocityTracker f1206e1;

    /* renamed from: g */
    public boolean f1207g;

    /* renamed from: k */
    public boolean f1208k;

    /* renamed from: k0 */
    public int f1209k0;

    /* renamed from: o1 */
    public int f1210o1;

    /* renamed from: p1 */
    public float f1211p1;

    /* renamed from: q1 */
    public int f1212q1;

    /* renamed from: r */
    public Drawable f1213r;

    /* renamed from: r1 */
    public int f1214r1;

    /* renamed from: s */
    public ColorStateList f1215s;

    /* renamed from: s1 */
    public int f1216s1;

    /* renamed from: t1 */
    public int f1217t1;

    /* renamed from: u1 */
    public int f1218u1;

    /* renamed from: v0 */
    public float f1219v0;

    /* renamed from: v1 */
    public int f1220v1;

    /* renamed from: w1 */
    public int f1221w1;

    /* renamed from: x */
    public PorterDuff.Mode f1222x;

    /* renamed from: x1 */
    public boolean f1223x1;

    /* renamed from: y */
    public boolean f1224y;

    /* renamed from: y1 */
    public final TextPaint f1225y1;

    /* renamed from: z1 */
    public ColorStateList f1226z1;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0264a extends Property<SwitchCompat, Float> {
        public C0264a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1211p1);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0265b {
        /* renamed from: a */
        public static void m1493a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    public static class C0266c extends C0593c.C0599e {

        /* renamed from: a */
        public final Reference<SwitchCompat> f1227a;

        public C0266c(SwitchCompat switchCompat) {
            this.f1227a = new WeakReference(switchCompat);
        }

        /* renamed from: a */
        public void mo2436a(Throwable th) {
            SwitchCompat switchCompat = this.f1227a.get();
            if (switchCompat != null) {
                switchCompat.mo2390j();
            }
        }

        /* renamed from: b */
        public void mo2437b() {
            SwitchCompat switchCompat = this.f1227a.get();
            if (switchCompat != null) {
                switchCompat.mo2390j();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public static float m1476f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.f1191F1 == null) {
            this.f1191F1 = new C1640bn(this);
        }
        return this.f1191F1;
    }

    private boolean getTargetCheckedState() {
        if (this.f1211p1 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (re7.m26176b(this)) {
            f = 1.0f - this.f1211p1;
        } else {
            f = this.f1211p1;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1213r;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1194H1;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1201a;
        if (drawable2 != null) {
            rect = sj1.m26922d(drawable2);
        } else {
            rect = sj1.f17670c;
        }
        return ((((this.f1212q1 - this.f1216s1) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1198P = charSequence;
        this.f1199Q = mo2370g(charSequence);
        this.f1186B1 = null;
        if (this.f1200U) {
            mo2395n();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1196L = charSequence;
        this.f1197M = mo2370g(charSequence);
        this.f1184A1 = null;
        if (this.f1200U) {
            mo2395n();
        }
    }

    /* renamed from: a */
    public final void mo2362a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1181I1, new float[]{f});
        this.f1189D1 = ofFloat;
        ofFloat.setDuration(250);
        C0265b.m1493a(this.f1189D1, true);
        this.f1189D1.start();
    }

    /* renamed from: b */
    public final void mo2363b() {
        Drawable drawable = this.f1201a;
        if (drawable == null) {
            return;
        }
        if (this.f1207g || this.f1208k) {
            Drawable mutate = ij1.m19659r(drawable).mutate();
            this.f1201a = mutate;
            if (this.f1207g) {
                ij1.m19656o(mutate, this.f1203d);
            }
            if (this.f1208k) {
                ij1.m19657p(this.f1201a, this.f1204e);
            }
            if (this.f1201a.isStateful()) {
                this.f1201a.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public final void mo2364c() {
        Drawable drawable = this.f1213r;
        if (drawable == null) {
            return;
        }
        if (this.f1224y || this.f1183A) {
            Drawable mutate = ij1.m19659r(drawable).mutate();
            this.f1213r = mutate;
            if (this.f1224y) {
                ij1.m19656o(mutate, this.f1215s);
            }
            if (this.f1183A) {
                ij1.m19657p(this.f1213r, this.f1222x);
            }
            if (this.f1213r.isStateful()) {
                this.f1213r.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public final void mo2365d() {
        ObjectAnimator objectAnimator = this.f1189D1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1194H1;
        int i3 = this.f1217t1;
        int i4 = this.f1218u1;
        int i5 = this.f1220v1;
        int i6 = this.f1221w1;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1201a;
        if (drawable != null) {
            rect = sj1.m26922d(drawable);
        } else {
            rect = sj1.f17670c;
        }
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1213r.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1213r.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1201a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f1216s1 + rect2.right;
            this.f1201a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                ij1.m19653l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1201a;
        if (drawable != null) {
            ij1.m19652k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null) {
            ij1.m19652k(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1201a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo2369e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence mo2370g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().mo11707f(this.f1188C1);
        if (f != null) {
            return f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    public int getCompoundPaddingLeft() {
        if (!re7.m26176b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1212q1;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1193H;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (re7.m26176b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1212q1;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1193H;
        }
        return compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lo6.m21663q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1200U;
    }

    public boolean getSplitTrack() {
        return this.f1195I;
    }

    public int getSwitchMinWidth() {
        return this.f1187C;
    }

    public int getSwitchPadding() {
        return this.f1193H;
    }

    public CharSequence getTextOff() {
        return this.f1198P;
    }

    public CharSequence getTextOn() {
        return this.f1196L;
    }

    public Drawable getThumbDrawable() {
        return this.f1201a;
    }

    public final float getThumbPosition() {
        return this.f1211p1;
    }

    public int getThumbTextPadding() {
        return this.f1185B;
    }

    public ColorStateList getThumbTintList() {
        return this.f1203d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1204e;
    }

    public Drawable getTrackDrawable() {
        return this.f1213r;
    }

    public ColorStateList getTrackTintList() {
        return this.f1215s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1222x;
    }

    /* renamed from: h */
    public final boolean mo2388h(float f, float f2) {
        if (this.f1201a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1201a.getPadding(this.f1194H1);
        int i = this.f1218u1;
        int i2 = this.f1209k0;
        int i3 = i - i2;
        int i4 = (this.f1217t1 + thumbOffset) - i2;
        Rect rect = this.f1194H1;
        int i5 = this.f1216s1 + i4 + rect.left + rect.right + i2;
        int i6 = this.f1221w1 + i2;
        if (f <= ((float) i4) || f >= ((float) i5) || f2 <= ((float) i3) || f2 >= ((float) i6)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final Layout mo2389i(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f1225y1;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, Utils.FLOAT_EPSILON, true);
    }

    /* renamed from: j */
    public void mo2390j() {
        setTextOnInternal(this.f1196L);
        setTextOffInternal(this.f1198P);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1201a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1189D1;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1189D1.end();
            this.f1189D1 = null;
        }
    }

    /* renamed from: k */
    public final void mo2392k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1198P;
            if (charSequence == null) {
                charSequence = getResources().getString(a55.abc_capital_off);
            }
            ga7.m17730I0(this, charSequence);
        }
    }

    /* renamed from: l */
    public final void mo2393l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1196L;
            if (charSequence == null) {
                charSequence = getResources().getString(a55.abc_capital_on);
            }
            ga7.m17730I0(this, charSequence);
        }
    }

    /* renamed from: m */
    public final void mo2394m(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    /* renamed from: n */
    public final void mo2395n() {
        if (this.f1192G1 == null && this.f1191F1.mo11703b() && C0593c.m4521h()) {
            C0593c b = C0593c.m4517b();
            int d = b.mo5620d();
            if (d == 3 || d == 0) {
                C0266c cVar = new C0266c(this);
                this.f1192G1 = cVar;
                b.mo5631s(cVar);
            }
        }
    }

    /* renamed from: o */
    public final void mo2396o(MotionEvent motionEvent) {
        boolean z;
        this.f1205e0 = 0;
        boolean z2 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f1206e1.computeCurrentVelocity(1000);
            float xVelocity = this.f1206e1.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1210o1)) {
                z2 = getTargetCheckedState();
            } else if (!re7.m26176b(this) ? xVelocity <= Utils.FLOAT_EPSILON : xVelocity >= Utils.FLOAT_EPSILON) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        mo2369e(motionEvent);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1182J1);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1194H1;
        Drawable drawable = this.f1213r;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1218u1;
        int i3 = this.f1221w1;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1201a;
        if (drawable != null) {
            if (!this.f1195I || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = sj1.m26922d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f1184A1;
        } else {
            layout = this.f1186B1;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1226z1;
            if (colorStateList != null) {
                this.f1225y1.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1225y1.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1196L;
            } else {
                charSequence = this.f1198P;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1201a != null) {
            Rect rect = this.f1194H1;
            Drawable drawable = this.f1213r;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = sj1.m26922d(this.f1201a);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (re7.m26176b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1212q1 + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1212q1) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1214r1;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1214r1;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1214r1;
            this.f1217t1 = i7;
            this.f1218u1 = i9;
            this.f1221w1 = i8;
            this.f1220v1 = i6;
        }
        i8 = i10 + i9;
        this.f1217t1 = i7;
        this.f1218u1 = i9;
        this.f1221w1 = i8;
        this.f1220v1 = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1200U) {
            if (this.f1184A1 == null) {
                this.f1184A1 = mo2389i(this.f1197M);
            }
            if (this.f1186B1 == null) {
                this.f1186B1 = mo2389i(this.f1199Q);
            }
        }
        Rect rect = this.f1194H1;
        Drawable drawable = this.f1201a;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1201a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1201a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1200U) {
            i5 = Math.max(this.f1184A1.getWidth(), this.f1186B1.getWidth()) + (this.f1185B * 2);
        } else {
            i5 = 0;
        }
        this.f1216s1 = Math.max(i5, i4);
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1213r.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1201a;
        if (drawable3 != null) {
            Rect d = sj1.m26922d(drawable3);
            i8 = Math.max(i8, d.left);
            i9 = Math.max(i9, d.right);
        }
        if (this.f1223x1) {
            i6 = Math.max(this.f1187C, (this.f1216s1 * 2) + i8 + i9);
        } else {
            i6 = this.f1187C;
        }
        int max = Math.max(i7, i3);
        this.f1212q1 = i6;
        this.f1214r1 = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1196L;
        } else {
            charSequence = this.f1198P;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1206e1
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f1205e0
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1219v0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = p000.re7.m26176b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f1211p1
            float r0 = r0 + r2
            float r0 = m1476f(r0, r4, r3)
            float r2 = r6.f1211p1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f1219v0 = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1219v0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1209k0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f1202b1
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1209k0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f1205e0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1219v0 = r0
            r6.f1202b1 = r3
            return r1
        L_0x0089:
            int r0 = r6.f1205e0
            if (r0 != r2) goto L_0x0094
            r6.mo2396o(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f1205e0 = r0
            android.view.VelocityTracker r0 = r6.f1206e1
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.mo2388h(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f1205e0 = r1
            r6.f1219v0 = r0
            r6.f1202b1 = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo11705d(z);
    }

    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            mo2393l();
        } else {
            mo2392k();
        }
        if (getWindowToken() == null || !ga7.m17747T(this)) {
            mo2365d();
            if (isChecked) {
                f = 1.0f;
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            setThumbPosition(f);
            return;
        }
        mo2362a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lo6.m21664r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo11706e(z);
        setTextOnInternal(this.f1196L);
        setTextOffInternal(this.f1198P);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f1223x1 = z;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo11702a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1200U != z) {
            this.f1200U = z;
            requestLayout();
            if (z) {
                mo2395n();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1195I = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1187C = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1193H = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        yq6 t = yq6.m30731t(context, i, j65.TextAppearance);
        ColorStateList c = t.mo28177c(j65.TextAppearance_android_textColor);
        if (c != null) {
            this.f1226z1 = c;
        } else {
            this.f1226z1 = getTextColors();
        }
        int f = t.mo28180f(j65.TextAppearance_android_textSize, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f1225y1.getTextSize()) {
                this.f1225y1.setTextSize(f2);
                requestLayout();
            }
        }
        mo2394m(t.mo28185k(j65.TextAppearance_android_typeface, -1), t.mo28185k(j65.TextAppearance_android_textStyle, -1));
        if (t.mo28175a(j65.TextAppearance_textAllCaps, false)) {
            this.f1188C1 = new C2226ef(getContext());
        } else {
            this.f1188C1 = null;
        }
        setTextOnInternal(this.f1196L);
        setTextOffInternal(this.f1198P);
        t.mo28194w();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        float f = Utils.FLOAT_EPSILON;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1225y1;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1225y1;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1225y1.setFakeBoldText(false);
        this.f1225y1.setTextSkewX(Utils.FLOAT_EPSILON);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            mo2392k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            mo2393l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1201a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1201a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f1211p1 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C2554in.m19714b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1185B = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1203d = colorStateList;
        this.f1207g = true;
        mo2363b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1204e = mode;
        this.f1208k = true;
        mo2363b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1213r;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1213r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C2554in.m19714b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1215s = colorStateList;
        this.f1224y = true;
        mo2364c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1222x = mode;
        this.f1183A = true;
        mo2364c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1201a || drawable == this.f1213r) {
            return true;
        }
        return false;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1203d = null;
        this.f1204e = null;
        this.f1207g = false;
        this.f1208k = false;
        this.f1215s = null;
        this.f1222x = null;
        this.f1224y = false;
        this.f1183A = false;
        this.f1206e1 = VelocityTracker.obtain();
        this.f1223x1 = true;
        this.f1194H1 = new Rect();
        xo6.m30262a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1225y1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j65.SwitchCompat;
        yq6 v = yq6.m30733v(context, attributeSet, iArr, i, 0);
        ga7.m17781n0(this, context, iArr, attributeSet, v.mo28192r(), i, 0);
        Drawable g = v.mo28181g(j65.SwitchCompat_android_thumb);
        this.f1201a = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo28181g(j65.SwitchCompat_track);
        this.f1213r = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        setTextOnInternal(v.mo28190p(j65.SwitchCompat_android_textOn));
        setTextOffInternal(v.mo28190p(j65.SwitchCompat_android_textOff));
        this.f1200U = v.mo28175a(j65.SwitchCompat_showText, true);
        this.f1185B = v.mo28180f(j65.SwitchCompat_thumbTextPadding, 0);
        this.f1187C = v.mo28180f(j65.SwitchCompat_switchMinWidth, 0);
        this.f1193H = v.mo28180f(j65.SwitchCompat_switchPadding, 0);
        this.f1195I = v.mo28175a(j65.SwitchCompat_splitTrack, false);
        ColorStateList c = v.mo28177c(j65.SwitchCompat_thumbTint);
        if (c != null) {
            this.f1203d = c;
            this.f1207g = true;
        }
        PorterDuff.Mode e = sj1.m26923e(v.mo28185k(j65.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1204e != e) {
            this.f1204e = e;
            this.f1208k = true;
        }
        if (this.f1207g || this.f1208k) {
            mo2363b();
        }
        ColorStateList c2 = v.mo28177c(j65.SwitchCompat_trackTint);
        if (c2 != null) {
            this.f1215s = c2;
            this.f1224y = true;
        }
        PorterDuff.Mode e2 = sj1.m26923e(v.mo28185k(j65.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1222x != e2) {
            this.f1222x = e2;
            this.f1183A = true;
        }
        if (this.f1224y || this.f1183A) {
            mo2364c();
        }
        int n = v.mo28188n(j65.SwitchCompat_switchTextAppearance, 0);
        if (n != 0) {
            setSwitchTextAppearance(context, n);
        }
        C2765ln lnVar = new C2765ln(this);
        this.f1190E1 = lnVar;
        lnVar.mo22867m(attributeSet, i);
        v.mo28194w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1209k0 = viewConfiguration.getScaledTouchSlop();
        this.f1210o1 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1225y1.getTypeface() != null && !this.f1225y1.getTypeface().equals(typeface)) || (this.f1225y1.getTypeface() == null && typeface != null)) {
            this.f1225y1.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
