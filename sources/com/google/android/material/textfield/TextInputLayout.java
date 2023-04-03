package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C4332a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: z2 */
    public static final int f24443z2 = e55.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public boolean f24444A;

    /* renamed from: A1 */
    public int f24445A1;

    /* renamed from: B */
    public int f24446B;

    /* renamed from: B1 */
    public int f24447B1;

    /* renamed from: C */
    public boolean f24448C;

    /* renamed from: C1 */
    public int f24449C1;

    /* renamed from: D1 */
    public int f24450D1;

    /* renamed from: E1 */
    public int f24451E1;

    /* renamed from: F1 */
    public final Rect f24452F1;

    /* renamed from: G1 */
    public final Rect f24453G1;

    /* renamed from: H */
    public TextView f24454H;

    /* renamed from: H1 */
    public final RectF f24455H1;

    /* renamed from: I */
    public int f24456I;

    /* renamed from: I1 */
    public Typeface f24457I1;

    /* renamed from: J1 */
    public final CheckableImageButton f24458J1;

    /* renamed from: K1 */
    public ColorStateList f24459K1;

    /* renamed from: L */
    public int f24460L;

    /* renamed from: L1 */
    public boolean f24461L1;

    /* renamed from: M */
    public CharSequence f24462M;

    /* renamed from: M1 */
    public PorterDuff.Mode f24463M1;

    /* renamed from: N1 */
    public boolean f24464N1;

    /* renamed from: O1 */
    public Drawable f24465O1;

    /* renamed from: P */
    public boolean f24466P;

    /* renamed from: P1 */
    public int f24467P1;

    /* renamed from: Q */
    public TextView f24468Q;

    /* renamed from: Q1 */
    public View.OnLongClickListener f24469Q1;

    /* renamed from: R1 */
    public final LinkedHashSet<C4410f> f24470R1;

    /* renamed from: S1 */
    public int f24471S1;

    /* renamed from: T1 */
    public final SparseArray<wp1> f24472T1;

    /* renamed from: U */
    public ColorStateList f24473U;

    /* renamed from: U1 */
    public final CheckableImageButton f24474U1;

    /* renamed from: V1 */
    public final LinkedHashSet<C4411g> f24475V1;

    /* renamed from: W1 */
    public ColorStateList f24476W1;

    /* renamed from: X1 */
    public boolean f24477X1;

    /* renamed from: Y1 */
    public PorterDuff.Mode f24478Y1;

    /* renamed from: Z1 */
    public boolean f24479Z1;

    /* renamed from: a */
    public final FrameLayout f24480a;

    /* renamed from: a2 */
    public Drawable f24481a2;

    /* renamed from: b1 */
    public CharSequence f24482b1;

    /* renamed from: b2 */
    public int f24483b2;

    /* renamed from: c2 */
    public Drawable f24484c2;

    /* renamed from: d */
    public final LinearLayout f24485d;

    /* renamed from: d2 */
    public View.OnLongClickListener f24486d2;

    /* renamed from: e */
    public final LinearLayout f24487e;

    /* renamed from: e0 */
    public int f24488e0;

    /* renamed from: e1 */
    public final TextView f24489e1;

    /* renamed from: e2 */
    public View.OnLongClickListener f24490e2;

    /* renamed from: f2 */
    public final CheckableImageButton f24491f2;

    /* renamed from: g */
    public final FrameLayout f24492g;

    /* renamed from: g2 */
    public ColorStateList f24493g2;

    /* renamed from: h2 */
    public ColorStateList f24494h2;

    /* renamed from: i2 */
    public ColorStateList f24495i2;

    /* renamed from: j2 */
    public int f24496j2;

    /* renamed from: k */
    public EditText f24497k;

    /* renamed from: k0 */
    public ColorStateList f24498k0;

    /* renamed from: k2 */
    public int f24499k2;

    /* renamed from: l2 */
    public int f24500l2;

    /* renamed from: m2 */
    public ColorStateList f24501m2;

    /* renamed from: n2 */
    public int f24502n2;

    /* renamed from: o1 */
    public CharSequence f24503o1;

    /* renamed from: o2 */
    public int f24504o2;

    /* renamed from: p1 */
    public final TextView f24505p1;

    /* renamed from: p2 */
    public int f24506p2;

    /* renamed from: q1 */
    public boolean f24507q1;

    /* renamed from: q2 */
    public int f24508q2;

    /* renamed from: r */
    public CharSequence f24509r;

    /* renamed from: r1 */
    public CharSequence f24510r1;

    /* renamed from: r2 */
    public int f24511r2;

    /* renamed from: s */
    public int f24512s;

    /* renamed from: s1 */
    public boolean f24513s1;

    /* renamed from: s2 */
    public boolean f24514s2;

    /* renamed from: t1 */
    public uo3 f24515t1;

    /* renamed from: t2 */
    public final C4332a f24516t2;

    /* renamed from: u1 */
    public uo3 f24517u1;

    /* renamed from: u2 */
    public boolean f24518u2;

    /* renamed from: v0 */
    public ColorStateList f24519v0;

    /* renamed from: v1 */
    public rz5 f24520v1;

    /* renamed from: v2 */
    public boolean f24521v2;

    /* renamed from: w1 */
    public final int f24522w1;

    /* renamed from: w2 */
    public ValueAnimator f24523w2;

    /* renamed from: x */
    public int f24524x;

    /* renamed from: x1 */
    public int f24525x1;

    /* renamed from: x2 */
    public boolean f24526x2;

    /* renamed from: y */
    public final au2 f24527y;

    /* renamed from: y1 */
    public int f24528y1;

    /* renamed from: y2 */
    public boolean f24529y2;

    /* renamed from: z1 */
    public int f24530z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4404a();

        /* renamed from: e */
        public CharSequence f24531e;

        /* renamed from: g */
        public boolean f24532g;

        /* renamed from: k */
        public CharSequence f24533k;

        /* renamed from: r */
        public CharSequence f24534r;

        /* renamed from: s */
        public CharSequence f24535s;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public static class C4404a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f24531e + " hint=" + this.f24533k + " helperText=" + this.f24534r + " placeholderText=" + this.f24535s + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f24531e, parcel, i);
            parcel.writeInt(this.f24532g ? 1 : 0);
            TextUtils.writeToParcel(this.f24533k, parcel, i);
            TextUtils.writeToParcel(this.f24534r, parcel, i);
            TextUtils.writeToParcel(this.f24535s, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24531e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24532g = parcel.readInt() != 1 ? false : true;
            this.f24533k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24534r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24535s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C4405a implements TextWatcher {
        public C4405a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo33969v0(!textInputLayout.f24529y2);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f24444A) {
                textInputLayout2.mo33863n0(editable.length());
            }
            if (TextInputLayout.this.f24466P) {
                TextInputLayout.this.mo33977z0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C4406b implements Runnable {
        public C4406b() {
        }

        public void run() {
            TextInputLayout.this.f24474U1.performClick();
            TextInputLayout.this.f24474U1.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C4407c implements Runnable {
        public C4407c() {
        }

        public void run() {
            TextInputLayout.this.f24497k.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C4408d implements ValueAnimator.AnimatorUpdateListener {
        public C4408d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f24516t2.mo33072p0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C4409e extends C3715z7 {

        /* renamed from: d */
        public final TextInputLayout f24540d;

        public C4409e(TextInputLayout textInputLayout) {
            this.f24540d = textInputLayout;
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            Editable editable;
            boolean z;
            String str;
            super.mo5479g(view, t8Var);
            EditText editText = this.f24540d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f24540d.getHint();
            CharSequence error = this.f24540d.getError();
            CharSequence placeholderText = this.f24540d.getPlaceholderText();
            int counterMaxLength = this.f24540d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f24540d.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f24540d.mo33777N();
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            if (z2) {
                t8Var.mo26211M0(editable);
            } else if (!TextUtils.isEmpty(str)) {
                t8Var.mo26211M0(str);
                if (z4 && placeholderText != null) {
                    t8Var.mo26211M0(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                t8Var.mo26211M0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    t8Var.mo26264s0(str);
                } else {
                    if (z2) {
                        str = editable + ", " + str;
                    }
                    t8Var.mo26211M0(str);
                }
                t8Var.mo26203I0(!z2);
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            t8Var.mo26273w0(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                t8Var.mo26257o0(error);
            }
            if (editText != null) {
                editText.setLabelFor(g35.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C4410f {
        /* renamed from: a */
        void mo33991a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C4411g {
        /* renamed from: a */
        void mo33992a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: U */
    public static void m36095U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m36095U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: b0 */
    public static void m36098b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean O = ga7.m17741O(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (O || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(O);
        checkableImageButton.setPressable(O);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        ga7.m17714A0(checkableImageButton, i);
    }

    /* renamed from: c0 */
    public static void m36100c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m36098b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    public static void m36102d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m36098b0(checkableImageButton, onLongClickListener);
    }

    private wp1 getEndIconDelegate() {
        wp1 wp1 = this.f24472T1.get(this.f24471S1);
        if (wp1 != null) {
            return wp1;
        }
        return this.f24472T1.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f24491f2.getVisibility() == 0) {
            return this.f24491f2;
        }
        if (!mo33772I() || !mo33774K()) {
            return null;
        }
        return this.f24474U1;
    }

    /* renamed from: o0 */
    public static void m36103o0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = y45.character_counter_overflowed_content_description;
        } else {
            i3 = y45.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private void setEditText(EditText editText) {
        if (this.f24497k == null) {
            if (this.f24471S1 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f24497k = editText;
            setMinWidth(this.f24512s);
            setMaxWidth(this.f24524x);
            mo33782S();
            setTextInputAccessibilityDelegate(new C4409e(this));
            this.f24516t2.mo33020C0(this.f24497k.getTypeface());
            this.f24516t2.mo33066m0(this.f24497k.getTextSize());
            int gravity = this.f24497k.getGravity();
            this.f24516t2.mo33046c0((gravity & -113) | 48);
            this.f24516t2.mo33064l0(gravity);
            this.f24497k.addTextChangedListener(new C4405a());
            if (this.f24494h2 == null) {
                this.f24494h2 = this.f24497k.getHintTextColors();
            }
            if (this.f24507q1) {
                if (TextUtils.isEmpty(this.f24510r1)) {
                    CharSequence hint = this.f24497k.getHint();
                    this.f24509r = hint;
                    setHint(hint);
                    this.f24497k.setHint((CharSequence) null);
                }
                this.f24513s1 = true;
            }
            if (this.f24454H != null) {
                mo33863n0(this.f24497k.getText().length());
            }
            mo33876s0();
            this.f24527y.mo29110e();
            this.f24485d.bringToFront();
            this.f24487e.bringToFront();
            this.f24492g.bringToFront();
            this.f24491f2.bringToFront();
            mo33760B();
            mo33759A0();
            mo33765D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo33971w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i;
        CheckableImageButton checkableImageButton = this.f24491f2;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        FrameLayout frameLayout = this.f24492g;
        if (z) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        mo33765D0();
        if (!mo33772I()) {
            mo33874r0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f24510r1)) {
            this.f24510r1 = charSequence;
            this.f24516t2.mo33016A0(charSequence);
            if (!this.f24514s2) {
                mo33783T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f24466P != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f24468Q = appCompatTextView;
                appCompatTextView.setId(g35.textinput_placeholder);
                ga7.m17789r0(this.f24468Q, 1);
                setPlaceholderTextAppearance(this.f24488e0);
                setPlaceholderTextColor(this.f24473U);
                mo33799g();
            } else {
                mo33788Z();
                this.f24468Q = null;
            }
            this.f24466P = z;
        }
    }

    /* renamed from: A */
    public final boolean mo33758A() {
        if (!this.f24507q1 || TextUtils.isEmpty(this.f24510r1) || !(this.f24515t1 instanceof bz0)) {
            return false;
        }
        return true;
    }

    /* renamed from: A0 */
    public final void mo33759A0() {
        int i;
        if (this.f24497k != null) {
            if (mo33780Q()) {
                i = 0;
            } else {
                i = ga7.m17725G(this.f24497k);
            }
            ga7.m17722E0(this.f24489e1, i, this.f24497k.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(k25.material_input_text_to_prefix_suffix_padding), this.f24497k.getCompoundPaddingBottom());
        }
    }

    /* renamed from: B */
    public final void mo33760B() {
        Iterator<C4410f> it = this.f24470R1.iterator();
        while (it.hasNext()) {
            it.next().mo33991a(this);
        }
    }

    /* renamed from: B0 */
    public final void mo33761B0() {
        int i;
        TextView textView = this.f24489e1;
        if (this.f24482b1 == null || mo33777N()) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        mo33874r0();
    }

    /* renamed from: C */
    public final void mo33762C(int i) {
        Iterator<C4411g> it = this.f24475V1.iterator();
        while (it.hasNext()) {
            it.next().mo33992a(this, i);
        }
    }

    /* renamed from: C0 */
    public final void mo33763C0(boolean z, boolean z2) {
        int defaultColor = this.f24501m2.getDefaultColor();
        int colorForState = this.f24501m2.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f24501m2.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f24450D1 = colorForState2;
        } else if (z2) {
            this.f24450D1 = colorForState;
        } else {
            this.f24450D1 = defaultColor;
        }
    }

    /* renamed from: D */
    public final void mo33764D(Canvas canvas) {
        uo3 uo3 = this.f24517u1;
        if (uo3 != null) {
            Rect bounds = uo3.getBounds();
            bounds.top = bounds.bottom - this.f24445A1;
            this.f24517u1.draw(canvas);
        }
    }

    /* renamed from: D0 */
    public final void mo33765D0() {
        int i;
        if (this.f24497k != null) {
            if (mo33774K() || mo33775L()) {
                i = 0;
            } else {
                i = ga7.m17723F(this.f24497k);
            }
            ga7.m17722E0(this.f24505p1, getContext().getResources().getDimensionPixelSize(k25.material_input_text_to_prefix_suffix_padding), this.f24497k.getPaddingTop(), i, this.f24497k.getPaddingBottom());
        }
    }

    /* renamed from: E */
    public final void mo33766E(Canvas canvas) {
        if (this.f24507q1) {
            this.f24516t2.mo33065m(canvas);
        }
    }

    /* renamed from: E0 */
    public final void mo33767E0() {
        boolean z;
        int visibility = this.f24505p1.getVisibility();
        int i = 0;
        if (this.f24503o1 == null || mo33777N()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.f24505p1;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f24505p1.getVisibility()) {
            getEndIconDelegate().mo33994c(z);
        }
        mo33874r0();
    }

    /* renamed from: F */
    public final void mo33768F(boolean z) {
        ValueAnimator valueAnimator = this.f24523w2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24523w2.cancel();
        }
        if (!z || !this.f24521v2) {
            this.f24516t2.mo33072p0(Utils.FLOAT_EPSILON);
        } else {
            mo33852i(Utils.FLOAT_EPSILON);
        }
        if (mo33758A() && ((bz0) this.f24515t1).mo29803p0()) {
            mo33974y();
        }
        this.f24514s2 = true;
        mo33773J();
        mo33761B0();
        mo33767E0();
    }

    /* renamed from: F0 */
    public void mo33769F0() {
        boolean z;
        boolean z2;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f24515t1 != null && this.f24528y1 != 0) {
            boolean z3 = false;
            if (isFocused() || ((editText2 = this.f24497k) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f24497k) != null && editText.isHovered())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!isEnabled()) {
                this.f24450D1 = this.f24511r2;
            } else if (this.f24527y.mo29116k()) {
                if (this.f24501m2 != null) {
                    mo33763C0(z, z2);
                } else {
                    this.f24450D1 = this.f24527y.mo29120o();
                }
            } else if (!this.f24448C || (textView = this.f24454H) == null) {
                if (z) {
                    this.f24450D1 = this.f24500l2;
                } else if (z2) {
                    this.f24450D1 = this.f24499k2;
                } else {
                    this.f24450D1 = this.f24496j2;
                }
            } else if (this.f24501m2 != null) {
                mo33763C0(z, z2);
            } else {
                this.f24450D1 = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.f24527y.mo29129x() && this.f24527y.mo29116k()) {
                z3 = true;
            }
            setErrorIconVisible(z3);
            mo33785W();
            mo33787Y();
            mo33784V();
            if (getEndIconDelegate().mo34017d()) {
                mo33855j0(this.f24527y.mo29116k());
            }
            if (!z || !isEnabled()) {
                this.f24445A1 = this.f24447B1;
            } else {
                this.f24445A1 = this.f24449C1;
            }
            if (this.f24528y1 == 2) {
                mo33872q0();
            }
            if (this.f24528y1 == 1) {
                if (!isEnabled()) {
                    this.f24451E1 = this.f24504o2;
                } else if (z2 && !z) {
                    this.f24451E1 = this.f24508q2;
                } else if (z) {
                    this.f24451E1 = this.f24506p2;
                } else {
                    this.f24451E1 = this.f24502n2;
                }
            }
            mo33854j();
        }
    }

    /* renamed from: G */
    public final int mo33770G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f24497k.getCompoundPaddingLeft();
        if (this.f24482b1 == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - this.f24489e1.getMeasuredWidth()) + this.f24489e1.getPaddingLeft();
    }

    /* renamed from: H */
    public final int mo33771H(int i, boolean z) {
        int compoundPaddingRight = i - this.f24497k.getCompoundPaddingRight();
        if (this.f24482b1 == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (this.f24489e1.getMeasuredWidth() - this.f24489e1.getPaddingRight());
    }

    /* renamed from: I */
    public final boolean mo33772I() {
        if (this.f24471S1 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void mo33773J() {
        TextView textView = this.f24468Q;
        if (textView != null && this.f24466P) {
            textView.setText((CharSequence) null);
            this.f24468Q.setVisibility(4);
        }
    }

    /* renamed from: K */
    public boolean mo33774K() {
        if (this.f24492g.getVisibility() == 0 && this.f24474U1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean mo33775L() {
        if (this.f24491f2.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public boolean mo33776M() {
        return this.f24527y.mo29130y();
    }

    /* renamed from: N */
    public final boolean mo33777N() {
        return this.f24514s2;
    }

    /* renamed from: O */
    public boolean mo33778O() {
        return this.f24513s1;
    }

    /* renamed from: P */
    public final boolean mo33779P() {
        if (this.f24528y1 != 1 || this.f24497k.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public boolean mo33780Q() {
        if (this.f24458J1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final int[] mo33781R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    public final void mo33782S() {
        mo33869p();
        mo33789a0();
        mo33769F0();
        mo33857k0();
        mo33850h();
        if (this.f24528y1 != 0) {
            mo33967u0();
        }
    }

    /* renamed from: T */
    public final void mo33783T() {
        if (mo33758A()) {
            RectF rectF = this.f24455H1;
            this.f24516t2.mo33071p(rectF, this.f24497k.getWidth(), this.f24497k.getGravity());
            mo33858l(rectF);
            int i = this.f24445A1;
            this.f24525x1 = i;
            rectF.top = Utils.FLOAT_EPSILON;
            rectF.bottom = (float) i;
            rectF.offset((float) (-getPaddingLeft()), Utils.FLOAT_EPSILON);
            ((bz0) this.f24515t1).mo29809v0(rectF);
        }
    }

    /* renamed from: V */
    public void mo33784V() {
        mo33786X(this.f24474U1, this.f24476W1);
    }

    /* renamed from: W */
    public void mo33785W() {
        mo33786X(this.f24491f2, this.f24493g2);
    }

    /* renamed from: X */
    public final void mo33786X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(mo33781R(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = ij1.m19659r(drawable).mutate();
            ij1.m19656o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: Y */
    public void mo33787Y() {
        mo33786X(this.f24458J1, this.f24459K1);
    }

    /* renamed from: Z */
    public final void mo33788Z() {
        TextView textView = this.f24468Q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    public final void mo33789a0() {
        if (mo33851h0()) {
            ga7.m17793t0(this.f24497k, this.f24515t1);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f24480a.addView(view, layoutParams2);
            this.f24480a.setLayoutParams(layoutParams);
            mo33967u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f24497k;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f24509r != null) {
            boolean z = this.f24513s1;
            this.f24513s1 = false;
            CharSequence hint = editText.getHint();
            this.f24497k.setHint(this.f24509r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f24497k.setHint(hint);
                this.f24513s1 = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f24480a.getChildCount());
            for (int i2 = 0; i2 < this.f24480a.getChildCount(); i2++) {
                View childAt = this.f24480a.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f24497k) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f24529y2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f24529y2 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo33766E(canvas);
        mo33764D(canvas);
    }

    public void drawableStateChanged() {
        boolean z;
        if (!this.f24526x2) {
            boolean z2 = true;
            this.f24526x2 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C4332a aVar = this.f24516t2;
            if (aVar != null) {
                z = aVar.mo33092z0(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f24497k != null) {
                if (!ga7.m17747T(this) || !isEnabled()) {
                    z2 = false;
                }
                mo33969v0(z2);
            }
            mo33876s0();
            mo33769F0();
            if (z) {
                invalidate();
            }
            this.f24526x2 = false;
        }
    }

    /* renamed from: e */
    public void mo33795e(C4410f fVar) {
        this.f24470R1.add(fVar);
        if (this.f24497k != null) {
            fVar.mo33991a(this);
        }
    }

    /* renamed from: e0 */
    public void mo33796e0(TextView textView, int i) {
        boolean z = true;
        try {
            lo6.m21661o(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            lo6.m21661o(textView, e55.TextAppearance_AppCompat_Caption);
            textView.setTextColor(zr0.m31440c(getContext(), w15.design_error));
        }
    }

    /* renamed from: f */
    public void mo33797f(C4411g gVar) {
        this.f24475V1.add(gVar);
    }

    /* renamed from: f0 */
    public final boolean mo33798f0() {
        if ((this.f24491f2.getVisibility() == 0 || ((mo33772I() && mo33774K()) || this.f24503o1 != null)) && this.f24487e.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo33799g() {
        TextView textView = this.f24468Q;
        if (textView != null) {
            this.f24480a.addView(textView);
            this.f24468Q.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    public final boolean mo33800g0() {
        if ((getStartIconDrawable() != null || this.f24482b1 != null) && this.f24485d.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    public int getBaseline() {
        EditText editText = this.f24497k;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + mo33968v();
        }
        return super.getBaseline();
    }

    public uo3 getBoxBackground() {
        int i = this.f24528y1;
        if (i == 1 || i == 2) {
            return this.f24515t1;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f24451E1;
    }

    public int getBoxBackgroundMode() {
        return this.f24528y1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f24515t1.mo48472s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f24515t1.mo48474t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f24515t1.mo48424J();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f24515t1.mo48423I();
    }

    public int getBoxStrokeColor() {
        return this.f24500l2;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f24501m2;
    }

    public int getBoxStrokeWidth() {
        return this.f24447B1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f24449C1;
    }

    public int getCounterMaxLength() {
        return this.f24446B;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f24444A || !this.f24448C || (textView = this.f24454H) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f24498k0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f24498k0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f24494h2;
    }

    public EditText getEditText() {
        return this.f24497k;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f24474U1.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f24474U1.getDrawable();
    }

    public int getEndIconMode() {
        return this.f24471S1;
    }

    public CheckableImageButton getEndIconView() {
        return this.f24474U1;
    }

    public CharSequence getError() {
        if (this.f24527y.mo29129x()) {
            return this.f24527y.mo29119n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f24527y.mo29118m();
    }

    public int getErrorCurrentTextColors() {
        return this.f24527y.mo29120o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f24491f2.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f24527y.mo29120o();
    }

    public CharSequence getHelperText() {
        if (this.f24527y.mo29130y()) {
            return this.f24527y.mo29122q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f24527y.mo29123r();
    }

    public CharSequence getHint() {
        if (this.f24507q1) {
            return this.f24510r1;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f24516t2.mo33077s();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f24516t2.mo33085w();
    }

    public ColorStateList getHintTextColor() {
        return this.f24495i2;
    }

    public int getMaxWidth() {
        return this.f24524x;
    }

    public int getMinWidth() {
        return this.f24512s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f24474U1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f24474U1.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f24466P) {
            return this.f24462M;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f24488e0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f24473U;
    }

    public CharSequence getPrefixText() {
        return this.f24482b1;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f24489e1.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f24489e1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f24458J1.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f24458J1.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f24503o1;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f24505p1.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f24505p1;
    }

    public Typeface getTypeface() {
        return this.f24457I1;
    }

    /* renamed from: h */
    public final void mo33850h() {
        if (this.f24497k != null && this.f24528y1 == 1) {
            if (to3.m52397h(getContext())) {
                EditText editText = this.f24497k;
                ga7.m17722E0(editText, ga7.m17725G(editText), getResources().getDimensionPixelSize(k25.material_filled_edittext_font_2_0_padding_top), ga7.m17723F(this.f24497k), getResources().getDimensionPixelSize(k25.material_filled_edittext_font_2_0_padding_bottom));
            } else if (to3.m52396g(getContext())) {
                EditText editText2 = this.f24497k;
                ga7.m17722E0(editText2, ga7.m17725G(editText2), getResources().getDimensionPixelSize(k25.material_filled_edittext_font_1_3_padding_top), ga7.m17723F(this.f24497k), getResources().getDimensionPixelSize(k25.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    public final boolean mo33851h0() {
        EditText editText = this.f24497k;
        if (editText == null || this.f24515t1 == null || editText.getBackground() != null || this.f24528y1 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo33852i(float f) {
        if (this.f24516t2.mo33021D() != f) {
            if (this.f24523w2 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f24523w2 = valueAnimator;
                valueAnimator.setInterpolator(C5807el.f28629b);
                this.f24523w2.setDuration(167);
                this.f24523w2.addUpdateListener(new C4408d());
            }
            this.f24523w2.setFloatValues(new float[]{this.f24516t2.mo33021D(), f});
            this.f24523w2.start();
        }
    }

    /* renamed from: i0 */
    public final void mo33853i0() {
        TextView textView = this.f24468Q;
        if (textView != null && this.f24466P) {
            textView.setText(this.f24462M);
            this.f24468Q.setVisibility(0);
            this.f24468Q.bringToFront();
        }
    }

    /* renamed from: j */
    public final void mo33854j() {
        uo3 uo3 = this.f24515t1;
        if (uo3 != null) {
            uo3.setShapeAppearanceModel(this.f24520v1);
            if (mo33970w()) {
                this.f24515t1.mo48455i0((float) this.f24445A1, this.f24450D1);
            }
            int q = mo33871q();
            this.f24451E1 = q;
            this.f24515t1.mo48440a0(ColorStateList.valueOf(q));
            if (this.f24471S1 == 3) {
                this.f24497k.getBackground().invalidateSelf();
            }
            mo33856k();
            invalidate();
        }
    }

    /* renamed from: j0 */
    public final void mo33855j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            mo33860m();
            return;
        }
        Drawable mutate = ij1.m19659r(getEndIconDrawable()).mutate();
        ij1.m19655n(mutate, this.f24527y.mo29120o());
        this.f24474U1.setImageDrawable(mutate);
    }

    /* renamed from: k */
    public final void mo33856k() {
        if (this.f24517u1 != null) {
            if (mo33972x()) {
                this.f24517u1.mo48440a0(ColorStateList.valueOf(this.f24450D1));
            }
            invalidate();
        }
    }

    /* renamed from: k0 */
    public final void mo33857k0() {
        if (this.f24528y1 != 1) {
            return;
        }
        if (to3.m52397h(getContext())) {
            this.f24530z1 = getResources().getDimensionPixelSize(k25.material_font_2_0_box_collapsed_padding_top);
        } else if (to3.m52396g(getContext())) {
            this.f24530z1 = getResources().getDimensionPixelSize(k25.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: l */
    public final void mo33858l(RectF rectF) {
        float f = rectF.left;
        int i = this.f24522w1;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: l0 */
    public final void mo33859l0(Rect rect) {
        uo3 uo3 = this.f24517u1;
        if (uo3 != null) {
            int i = rect.bottom;
            uo3.setBounds(rect.left, i - this.f24449C1, rect.right, i);
        }
    }

    /* renamed from: m */
    public final void mo33860m() {
        mo33862n(this.f24474U1, this.f24477X1, this.f24476W1, this.f24479Z1, this.f24478Y1);
    }

    /* renamed from: m0 */
    public final void mo33861m0() {
        int i;
        if (this.f24454H != null) {
            EditText editText = this.f24497k;
            if (editText == null) {
                i = 0;
            } else {
                i = editText.getText().length();
            }
            mo33863n0(i);
        }
    }

    /* renamed from: n */
    public final void mo33862n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = ij1.m19659r(drawable).mutate();
            if (z) {
                ij1.m19656o(drawable, colorStateList);
            }
            if (z2) {
                ij1.m19657p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: n0 */
    public void mo33863n0(int i) {
        boolean z;
        boolean z2 = this.f24448C;
        int i2 = this.f24446B;
        if (i2 == -1) {
            this.f24454H.setText(String.valueOf(i));
            this.f24454H.setContentDescription((CharSequence) null);
            this.f24448C = false;
        } else {
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            this.f24448C = z;
            m36103o0(getContext(), this.f24454H, i, this.f24446B, this.f24448C);
            if (z2 != this.f24448C) {
                mo33870p0();
            }
            this.f24454H.setText(f10.m16439c().mo19572j(getContext().getString(y45.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f24446B)})));
        }
        if (this.f24497k != null && z2 != this.f24448C) {
            mo33969v0(false);
            mo33769F0();
            mo33876s0();
        }
    }

    /* renamed from: o */
    public final void mo33864o() {
        mo33862n(this.f24458J1, this.f24461L1, this.f24459K1, this.f24464N1, this.f24463M1);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f24497k;
        if (editText != null) {
            Rect rect = this.f24452F1;
            rc1.m51059a(this, editText, rect);
            mo33859l0(rect);
            if (this.f24507q1) {
                this.f24516t2.mo33066m0(this.f24497k.getTextSize());
                int gravity = this.f24497k.getGravity();
                this.f24516t2.mo33046c0((gravity & -113) | 48);
                this.f24516t2.mo33064l0(gravity);
                this.f24516t2.mo33040Y(mo33873r(rect));
                this.f24516t2.mo33056h0(mo33966u(rect));
                this.f24516t2.mo33037U();
                if (mo33758A() && !this.f24514s2) {
                    mo33783T();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean t0 = mo33965t0();
        boolean r0 = mo33874r0();
        if (t0 || r0) {
            this.f24497k.post(new C4407c());
        }
        mo33973x0();
        mo33759A0();
        mo33765D0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        setError(savedState.f24531e);
        if (savedState.f24532g) {
            this.f24474U1.post(new C4406b());
        }
        setHint(savedState.f24533k);
        setHelperText(savedState.f24534r);
        setPlaceholderText(savedState.f24535s);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f24527y.mo29116k()) {
            savedState.f24531e = getError();
        }
        if (!mo33772I() || !this.f24474U1.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f24532g = z;
        savedState.f24533k = getHint();
        savedState.f24534r = getHelperText();
        savedState.f24535s = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p */
    public final void mo33869p() {
        int i = this.f24528y1;
        if (i == 0) {
            this.f24515t1 = null;
            this.f24517u1 = null;
        } else if (i == 1) {
            this.f24515t1 = new uo3(this.f24520v1);
            this.f24517u1 = new uo3();
        } else if (i == 2) {
            if (!this.f24507q1 || (this.f24515t1 instanceof bz0)) {
                this.f24515t1 = new uo3(this.f24520v1);
            } else {
                this.f24515t1 = new bz0(this.f24520v1);
            }
            this.f24517u1 = null;
        } else {
            throw new IllegalArgumentException(this.f24528y1 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: p0 */
    public final void mo33870p0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f24454H;
        if (textView != null) {
            if (this.f24448C) {
                i = this.f24456I;
            } else {
                i = this.f24460L;
            }
            mo33796e0(textView, i);
            if (!this.f24448C && (colorStateList2 = this.f24498k0) != null) {
                this.f24454H.setTextColor(colorStateList2);
            }
            if (this.f24448C && (colorStateList = this.f24519v0) != null) {
                this.f24454H.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: q */
    public final int mo33871q() {
        int i = this.f24451E1;
        if (this.f24528y1 == 1) {
            return ro3.m51201g(ro3.m51199e(this, j15.colorSurface, 0), this.f24451E1);
        }
        return i;
    }

    /* renamed from: q0 */
    public final void mo33872q0() {
        if (mo33758A() && !this.f24514s2 && this.f24525x1 != this.f24445A1) {
            mo33974y();
            mo33783T();
        }
    }

    /* renamed from: r */
    public final Rect mo33873r(Rect rect) {
        boolean z;
        if (this.f24497k != null) {
            Rect rect2 = this.f24453G1;
            if (ga7.m17715B(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            rect2.bottom = rect.bottom;
            int i = this.f24528y1;
            if (i == 1) {
                rect2.left = mo33770G(rect.left, z);
                rect2.top = rect.top + this.f24530z1;
                rect2.right = mo33771H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = mo33770G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = mo33771H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f24497k.getPaddingLeft();
                rect2.top = rect.top - mo33968v();
                rect2.right = rect.right - this.f24497k.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33874r0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f24497k
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.mo33800g0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f24485d
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f24497k
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f24465O1
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f24467P1
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f24465O1 = r6
            r10.f24467P1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f24497k
            android.graphics.drawable.Drawable[] r0 = p000.lo6.m21647a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f24465O1
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f24497k
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            p000.lo6.m21656j(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f24465O1
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f24497k
            android.graphics.drawable.Drawable[] r0 = p000.lo6.m21647a(r0)
            android.widget.EditText r6 = r10.f24497k
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            p000.lo6.m21656j(r6, r2, r7, r8, r0)
            r10.f24465O1 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.mo33798f0()
            if (r6 == 0) goto L_0x00d1
            android.widget.TextView r2 = r10.f24505p1
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f24497k
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p000.do3.m15248b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f24497k
            android.graphics.drawable.Drawable[] r6 = p000.lo6.m21647a(r6)
            android.graphics.drawable.Drawable r7 = r10.f24481a2
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f24483b2
            if (r8 == r2) goto L_0x00ad
            r10.f24483b2 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f24497k
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f24481a2
            r4 = r6[r4]
            p000.lo6.m21656j(r0, r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f24481a2 = r7
            r10.f24483b2 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f24481a2
            if (r2 == r3) goto L_0x00cf
            r10.f24484c2 = r2
            android.widget.EditText r0 = r10.f24497k
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            p000.lo6.m21656j(r0, r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00cf:
            r5 = r0
            goto L_0x00f2
        L_0x00d1:
            android.graphics.drawable.Drawable r6 = r10.f24481a2
            if (r6 == 0) goto L_0x00f3
            android.widget.EditText r6 = r10.f24497k
            android.graphics.drawable.Drawable[] r6 = p000.lo6.m21647a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f24481a2
            if (r3 != r7) goto L_0x00ef
            android.widget.EditText r0 = r10.f24497k
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f24484c2
            r4 = r6[r4]
            p000.lo6.m21656j(r0, r1, r3, r7, r4)
            goto L_0x00f0
        L_0x00ef:
            r5 = r0
        L_0x00f0:
            r10.f24481a2 = r2
        L_0x00f2:
            r0 = r5
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo33874r0():boolean");
    }

    /* renamed from: s */
    public final int mo33875s(Rect rect, Rect rect2, float f) {
        if (mo33779P()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f24497k.getCompoundPaddingBottom();
    }

    /* renamed from: s0 */
    public void mo33876s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f24497k;
        if (editText != null && this.f24528y1 == 0 && (background = editText.getBackground()) != null) {
            if (sj1.m26919a(background)) {
                background = background.mutate();
            }
            if (this.f24527y.mo29116k()) {
                background.setColorFilter(C3743zm.m31369e(this.f24527y.mo29120o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f24448C || (textView = this.f24454H) == null) {
                ij1.m19644c(background);
                this.f24497k.refreshDrawableState();
            } else {
                background.setColorFilter(C3743zm.m31369e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f24451E1 != i) {
            this.f24451E1 = i;
            this.f24502n2 = i;
            this.f24506p2 = i;
            this.f24508q2 = i;
            mo33854j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(zr0.m31440c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f24502n2 = defaultColor;
        this.f24451E1 = defaultColor;
        this.f24504o2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f24506p2 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f24508q2 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo33854j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f24528y1) {
            this.f24528y1 = i;
            if (this.f24497k != null) {
                mo33782S();
            }
        }
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        uo3 uo3 = this.f24515t1;
        if (uo3 == null || uo3.mo48423I() != f || this.f24515t1.mo48424J() != f2 || this.f24515t1.mo48474t() != f4 || this.f24515t1.mo48472s() != f3) {
            this.f24520v1 = this.f24520v1.mo47585v().mo47593E(f).mo47597I(f2).mo47611z(f4).mo47607v(f3).mo47599m();
            mo33854j();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.f24500l2 != i) {
            this.f24500l2 = i;
            mo33769F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f24496j2 = colorStateList.getDefaultColor();
            this.f24511r2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f24499k2 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f24500l2 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f24500l2 != colorStateList.getDefaultColor()) {
            this.f24500l2 = colorStateList.getDefaultColor();
        }
        mo33769F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f24501m2 != colorStateList) {
            this.f24501m2 = colorStateList;
            mo33769F0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f24447B1 = i;
        mo33769F0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f24449C1 = i;
        mo33769F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f24444A != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f24454H = appCompatTextView;
                appCompatTextView.setId(g35.textinput_counter);
                Typeface typeface = this.f24457I1;
                if (typeface != null) {
                    this.f24454H.setTypeface(typeface);
                }
                this.f24454H.setMaxLines(1);
                this.f24527y.mo29109d(this.f24454H, 2);
                do3.m15250d((ViewGroup.MarginLayoutParams) this.f24454H.getLayoutParams(), getResources().getDimensionPixelOffset(k25.mtrl_textinput_counter_margin_start));
                mo33870p0();
                mo33861m0();
            } else {
                this.f24527y.mo29131z(this.f24454H, 2);
                this.f24454H = null;
            }
            this.f24444A = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f24446B != i) {
            if (i > 0) {
                this.f24446B = i;
            } else {
                this.f24446B = -1;
            }
            if (this.f24444A) {
                mo33861m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f24456I != i) {
            this.f24456I = i;
            mo33870p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f24519v0 != colorStateList) {
            this.f24519v0 = colorStateList;
            mo33870p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f24460L != i) {
            this.f24460L = i;
            mo33870p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f24498k0 != colorStateList) {
            this.f24498k0 = colorStateList;
            mo33870p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f24494h2 = colorStateList;
        this.f24495i2 = colorStateList;
        if (this.f24497k != null) {
            mo33969v0(false);
        }
    }

    public void setEnabled(boolean z) {
        m36095U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f24474U1.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f24474U1.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C2554in.m19714b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.f24471S1;
        this.f24471S1 = i;
        mo33762C(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().mo34016b(this.f24528y1)) {
            getEndIconDelegate().mo33993a();
            mo33860m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f24528y1 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m36100c0(this.f24474U1, onClickListener, this.f24486d2);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f24486d2 = onLongClickListener;
        m36102d0(this.f24474U1, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f24476W1 != colorStateList) {
            this.f24476W1 = colorStateList;
            this.f24477X1 = true;
            mo33860m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f24478Y1 != mode) {
            this.f24478Y1 = mode;
            this.f24479Z1 = true;
            mo33860m();
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (mo33774K() != z) {
            CheckableImageButton checkableImageButton = this.f24474U1;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo33765D0();
            mo33874r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f24527y.mo29129x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f24527y.mo29106M(charSequence);
        } else {
            this.f24527y.mo29125t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f24527y.mo29095B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f24527y.mo29096C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C2554in.m19714b(getContext(), i) : null);
        mo33785W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m36100c0(this.f24491f2, onClickListener, this.f24490e2);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f24490e2 = onLongClickListener;
        m36102d0(this.f24491f2, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f24493g2 = colorStateList;
        Drawable drawable = this.f24491f2.getDrawable();
        if (drawable != null) {
            drawable = ij1.m19659r(drawable).mutate();
            ij1.m19656o(drawable, colorStateList);
        }
        if (this.f24491f2.getDrawable() != drawable) {
            this.f24491f2.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f24491f2.getDrawable();
        if (drawable != null) {
            drawable = ij1.m19659r(drawable).mutate();
            ij1.m19657p(drawable, mode);
        }
        if (this.f24491f2.getDrawable() != drawable) {
            this.f24491f2.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f24527y.mo29097D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f24527y.mo29098E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f24518u2 != z) {
            this.f24518u2 = z;
            mo33969v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo33776M()) {
                setHelperTextEnabled(true);
            }
            this.f24527y.mo29107N(charSequence);
        } else if (mo33776M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f24527y.mo29101H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f24527y.mo29100G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f24527y.mo29099F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f24507q1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f24521v2 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f24507q1) {
            this.f24507q1 = z;
            if (!z) {
                this.f24513s1 = false;
                if (!TextUtils.isEmpty(this.f24510r1) && TextUtils.isEmpty(this.f24497k.getHint())) {
                    this.f24497k.setHint(this.f24510r1);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f24497k.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f24510r1)) {
                        setHint(hint);
                    }
                    this.f24497k.setHint((CharSequence) null);
                }
                this.f24513s1 = true;
            }
            if (this.f24497k != null) {
                mo33967u0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f24516t2.mo33041Z(i);
        this.f24495i2 = this.f24516t2.mo33073q();
        if (this.f24497k != null) {
            mo33969v0(false);
            mo33967u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f24495i2 != colorStateList) {
            if (this.f24494h2 == null) {
                this.f24516t2.mo33044b0(colorStateList);
            }
            this.f24495i2 = colorStateList;
            if (this.f24497k != null) {
                mo33969v0(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f24524x = i;
        EditText editText = this.f24497k;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.f24512s = i;
        EditText editText = this.f24497k;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C2554in.m19714b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f24471S1 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f24476W1 = colorStateList;
        this.f24477X1 = true;
        mo33860m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f24478Y1 = mode;
        this.f24479Z1 = true;
        mo33860m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f24466P || !TextUtils.isEmpty(charSequence)) {
            if (!this.f24466P) {
                setPlaceholderTextEnabled(true);
            }
            this.f24462M = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        mo33975y0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f24488e0 = i;
        TextView textView = this.f24468Q;
        if (textView != null) {
            lo6.m21661o(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f24473U != colorStateList) {
            this.f24473U = colorStateList;
            TextView textView = this.f24468Q;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f24482b1 = charSequence2;
        this.f24489e1.setText(charSequence);
        mo33761B0();
    }

    public void setPrefixTextAppearance(int i) {
        lo6.m21661o(this.f24489e1, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f24489e1.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f24458J1.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C2554in.m19714b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m36100c0(this.f24458J1, onClickListener, this.f24469Q1);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f24469Q1 = onLongClickListener;
        m36102d0(this.f24458J1, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f24459K1 != colorStateList) {
            this.f24459K1 = colorStateList;
            this.f24461L1 = true;
            mo33864o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f24463M1 != mode) {
            this.f24463M1 = mode;
            this.f24464N1 = true;
            mo33864o();
        }
    }

    public void setStartIconVisible(boolean z) {
        int i;
        if (mo33780Q() != z) {
            CheckableImageButton checkableImageButton = this.f24458J1;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo33759A0();
            mo33874r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f24503o1 = charSequence2;
        this.f24505p1.setText(charSequence);
        mo33767E0();
    }

    public void setSuffixTextAppearance(int i) {
        lo6.m21661o(this.f24505p1, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f24505p1.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4409e eVar) {
        EditText editText = this.f24497k;
        if (editText != null) {
            ga7.m17785p0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f24457I1) {
            this.f24457I1 = typeface;
            this.f24516t2.mo33020C0(typeface);
            this.f24527y.mo29103J(typeface);
            TextView textView = this.f24454H;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final int mo33964t(Rect rect, float f) {
        if (mo33779P()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f24497k.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    public final boolean mo33965t0() {
        int max;
        if (this.f24497k == null || this.f24497k.getMeasuredHeight() >= (max = Math.max(this.f24487e.getMeasuredHeight(), this.f24485d.getMeasuredHeight()))) {
            return false;
        }
        this.f24497k.setMinimumHeight(max);
        return true;
    }

    /* renamed from: u */
    public final Rect mo33966u(Rect rect) {
        if (this.f24497k != null) {
            Rect rect2 = this.f24453G1;
            float B = this.f24516t2.mo33017B();
            rect2.left = rect.left + this.f24497k.getCompoundPaddingLeft();
            rect2.top = mo33964t(rect, B);
            rect2.right = rect.right - this.f24497k.getCompoundPaddingRight();
            rect2.bottom = mo33875s(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    public final void mo33967u0() {
        if (this.f24528y1 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24480a.getLayoutParams();
            int v = mo33968v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f24480a.requestLayout();
            }
        }
    }

    /* renamed from: v */
    public final int mo33968v() {
        float s;
        if (!this.f24507q1) {
            return 0;
        }
        int i = this.f24528y1;
        if (i == 0 || i == 1) {
            s = this.f24516t2.mo33077s();
        } else if (i != 2) {
            return 0;
        } else {
            s = this.f24516t2.mo33077s() / 2.0f;
        }
        return (int) s;
    }

    /* renamed from: v0 */
    public void mo33969v0(boolean z) {
        mo33971w0(z, false);
    }

    /* renamed from: w */
    public final boolean mo33970w() {
        if (this.f24528y1 != 2 || !mo33972x()) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    public final void mo33971w0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f24497k;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f24497k;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean k = this.f24527y.mo29116k();
        ColorStateList colorStateList2 = this.f24494h2;
        if (colorStateList2 != null) {
            this.f24516t2.mo33044b0(colorStateList2);
            this.f24516t2.mo33062k0(this.f24494h2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f24494h2;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f24511r2);
            } else {
                i = this.f24511r2;
            }
            this.f24516t2.mo33044b0(ColorStateList.valueOf(i));
            this.f24516t2.mo33062k0(ColorStateList.valueOf(i));
        } else if (k) {
            this.f24516t2.mo33044b0(this.f24527y.mo29121p());
        } else if (this.f24448C && (textView = this.f24454H) != null) {
            this.f24516t2.mo33044b0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f24495i2) != null) {
            this.f24516t2.mo33044b0(colorStateList);
        }
        if (z3 || !this.f24518u2 || (isEnabled() && z4)) {
            if (z2 || this.f24514s2) {
                mo33976z(z);
            }
        } else if (z2 || !this.f24514s2) {
            mo33768F(z);
        }
    }

    /* renamed from: x */
    public final boolean mo33972x() {
        if (this.f24445A1 <= -1 || this.f24450D1 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    public final void mo33973x0() {
        EditText editText;
        if (this.f24468Q != null && (editText = this.f24497k) != null) {
            this.f24468Q.setGravity(editText.getGravity());
            this.f24468Q.setPadding(this.f24497k.getCompoundPaddingLeft(), this.f24497k.getCompoundPaddingTop(), this.f24497k.getCompoundPaddingRight(), this.f24497k.getCompoundPaddingBottom());
        }
    }

    /* renamed from: y */
    public final void mo33974y() {
        if (mo33758A()) {
            ((bz0) this.f24515t1).mo29806s0();
        }
    }

    /* renamed from: y0 */
    public final void mo33975y0() {
        int i;
        EditText editText = this.f24497k;
        if (editText == null) {
            i = 0;
        } else {
            i = editText.getText().length();
        }
        mo33977z0(i);
    }

    /* renamed from: z */
    public final void mo33976z(boolean z) {
        ValueAnimator valueAnimator = this.f24523w2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24523w2.cancel();
        }
        if (!z || !this.f24521v2) {
            this.f24516t2.mo33072p0(1.0f);
        } else {
            mo33852i(1.0f);
        }
        this.f24514s2 = false;
        if (mo33758A()) {
            mo33783T();
        }
        mo33975y0();
        mo33761B0();
        mo33767E0();
    }

    /* renamed from: z0 */
    public final void mo33977z0(int i) {
        if (i != 0 || this.f24514s2) {
            mo33773J();
        } else {
            mo33853i0();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f24474U1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f24474U1.setImageDrawable(drawable);
        mo33784V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f24458J1.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f24458J1.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo33787Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f24443z2
            r1 = r27
            android.content.Context r1 = p000.xo3.m54461c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f24512s = r10
            r0.f24524x = r10
            au2 r1 = new au2
            r1.<init>(r0)
            r0.f24527y = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f24452F1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f24453G1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f24455H1 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f24470R1 = r1
            r11 = 0
            r0.f24471S1 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f24472T1 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f24475V1 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f24516t2 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.f24480a = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.f24485d = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f24487e = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.f24492g = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = p000.C5807el.f28628a
            r1.mo33018B0(r2)
            r1.mo33088x0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo33046c0(r2)
            int[] r3 = p000.u55.TextInputLayout
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = p000.u55.TextInputLayout_counterTextAppearance
            r2[r11] = r1
            int r11 = p000.u55.TextInputLayout_counterOverflowTextAppearance
            r2[r14] = r11
            int r10 = p000.u55.TextInputLayout_errorTextAppearance
            r14 = 2
            r2[r14] = r10
            int r14 = p000.u55.TextInputLayout_helperTextTextAppearance
            r16 = r12
            r12 = 3
            r2[r12] = r14
            int r12 = p000.u55.TextInputLayout_hintTextAppearance
            r17 = 4
            r2[r17] = r12
            r17 = r15
            r15 = r1
            r1 = r13
            r18 = r2
            r2 = r28
            r19 = r4
            r4 = r29
            r20 = r11
            r11 = r5
            r5 = r9
            r6 = r18
            yq6 r1 = p000.wo6.m54005i(r1, r2, r3, r4, r5, r6)
            int r2 = p000.u55.TextInputLayout_hintEnabled
            r3 = 1
            boolean r2 = r1.mo28175a(r2, r3)
            r0.f24507q1 = r2
            int r2 = p000.u55.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = p000.u55.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.mo28175a(r2, r3)
            r0.f24521v2 = r2
            int r2 = p000.u55.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.mo28175a(r2, r3)
            r0.f24518u2 = r2
            int r2 = p000.u55.TextInputLayout_android_minWidth
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x0122
            r3 = -1
            int r2 = r1.mo28180f(r2, r3)
            r0.setMinWidth(r2)
            goto L_0x0123
        L_0x0122:
            r3 = -1
        L_0x0123:
            int r2 = p000.u55.TextInputLayout_android_maxWidth
            boolean r4 = r1.mo28193s(r2)
            if (r4 == 0) goto L_0x0132
            int r2 = r1.mo28180f(r2, r3)
            r0.setMaxWidth(r2)
        L_0x0132:
            rz5$b r2 = p000.rz5.m51450e(r13, r7, r8, r9)
            rz5 r2 = r2.mo47599m()
            r0.f24520v1 = r2
            android.content.res.Resources r2 = r13.getResources()
            int r3 = p000.k25.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f24522w1 = r2
            int r2 = p000.u55.TextInputLayout_boxCollapsedPaddingTop
            r3 = 0
            int r2 = r1.mo28179e(r2, r3)
            r0.f24530z1 = r2
            int r2 = p000.u55.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r13.getResources()
            int r4 = p000.k25.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo28180f(r2, r3)
            r0.f24447B1 = r2
            int r2 = p000.u55.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r13.getResources()
            int r4 = p000.k25.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo28180f(r2, r3)
            r0.f24449C1 = r2
            int r2 = r0.f24447B1
            r0.f24445A1 = r2
            int r2 = p000.u55.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo28178d(r2, r3)
            int r4 = p000.u55.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.mo28178d(r4, r3)
            int r5 = p000.u55.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.mo28178d(r5, r3)
            int r6 = p000.u55.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.mo28178d(r6, r3)
            rz5 r6 = r0.f24520v1
            rz5$b r6 = r6.mo47585v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x01a1
            r6.mo47593E(r2)
        L_0x01a1:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a8
            r6.mo47597I(r4)
        L_0x01a8:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01af
            r6.mo47611z(r5)
        L_0x01af:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01b6
            r6.mo47607v(r3)
        L_0x01b6:
            rz5 r2 = r6.mo47599m()
            r0.f24520v1 = r2
            int r2 = p000.u55.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            if (r2 == 0) goto L_0x021f
            int r3 = r2.getDefaultColor()
            r0.f24502n2 = r3
            r0.f24451E1 = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01fa
            r3 = 1
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r4
            r3 = -1
            int r4 = r2.getColorForState(r5, r3)
            r0.f24504o2 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r2.getColorForState(r5, r3)
            r0.f24506p2 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r5, r3)
            r0.f24508q2 = r2
            goto L_0x022a
        L_0x01fa:
            r3 = -1
            int r2 = r0.f24502n2
            r0.f24506p2 = r2
            int r2 = p000.w15.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p000.C2554in.m19713a(r13, r2)
            r5 = 1
            int[] r6 = new int[r5]
            r7 = 0
            r6[r7] = r4
            int r4 = r2.getColorForState(r6, r3)
            r0.f24504o2 = r4
            int[] r4 = new int[r5]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r7] = r5
            int r2 = r2.getColorForState(r4, r3)
            r0.f24508q2 = r2
            goto L_0x022a
        L_0x021f:
            r7 = 0
            r0.f24451E1 = r7
            r0.f24502n2 = r7
            r0.f24504o2 = r7
            r0.f24506p2 = r7
            r0.f24508q2 = r7
        L_0x022a:
            int r2 = p000.u55.TextInputLayout_android_textColorHint
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x023a
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.f24495i2 = r2
            r0.f24494h2 = r2
        L_0x023a:
            int r2 = p000.u55.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r3 = p000.to3.m52390a(r13, r1, r2)
            r4 = 0
            int r2 = r1.mo28176b(r2, r4)
            r0.f24500l2 = r2
            int r2 = p000.w15.mtrl_textinput_default_box_stroke_color
            int r2 = p000.zr0.m31440c(r13, r2)
            r0.f24496j2 = r2
            int r2 = p000.w15.mtrl_textinput_disabled_color
            int r2 = p000.zr0.m31440c(r13, r2)
            r0.f24511r2 = r2
            int r2 = p000.w15.mtrl_textinput_hovered_box_stroke_color
            int r2 = p000.zr0.m31440c(r13, r2)
            r0.f24499k2 = r2
            if (r3 == 0) goto L_0x0264
            r0.setBoxStrokeColorStateList(r3)
        L_0x0264:
            int r2 = p000.u55.TextInputLayout_boxStrokeErrorColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x0273
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0273:
            r2 = -1
            int r3 = r1.mo28188n(r12, r2)
            if (r3 == r2) goto L_0x0283
            r2 = 0
            int r3 = r1.mo28188n(r12, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x0284
        L_0x0283:
            r2 = 0
        L_0x0284:
            int r3 = r1.mo28188n(r10, r2)
            int r4 = p000.u55.TextInputLayout_errorContentDescription
            java.lang.CharSequence r4 = r1.mo28190p(r4)
            int r5 = p000.u55.TextInputLayout_errorEnabled
            boolean r5 = r1.mo28175a(r5, r2)
            android.content.Context r6 = r26.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = p000.c45.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r11, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f24491f2 = r6
            int r8 = p000.g35.text_input_error_icon
            r6.setId(r8)
            r8 = 8
            r6.setVisibility(r8)
            boolean r9 = p000.to3.m52396g(r13)
            if (r9 == 0) goto L_0x02bf
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            p000.do3.m15250d(r9, r2)
        L_0x02bf:
            int r2 = p000.u55.TextInputLayout_errorIconDrawable
            boolean r9 = r1.mo28193s(r2)
            if (r9 == 0) goto L_0x02ce
            android.graphics.drawable.Drawable r2 = r1.mo28181g(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02ce:
            int r2 = p000.u55.TextInputLayout_errorIconTint
            boolean r9 = r1.mo28193s(r2)
            if (r9 == 0) goto L_0x02dd
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02dd:
            int r2 = p000.u55.TextInputLayout_errorIconTintMode
            boolean r9 = r1.mo28193s(r2)
            r10 = 0
            if (r9 == 0) goto L_0x02f2
            r9 = -1
            int r2 = r1.mo28185k(r2, r9)
            android.graphics.PorterDuff$Mode r2 = p000.pe7.m49903i(r2, r10)
            r0.setErrorIconTintMode(r2)
        L_0x02f2:
            android.content.res.Resources r2 = r26.getResources()
            int r9 = p000.y45.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r9)
            r6.setContentDescription(r2)
            r2 = 2
            p000.ga7.m17714A0(r6, r2)
            r2 = 0
            r6.setClickable(r2)
            r6.setPressable(r2)
            r6.setFocusable(r2)
            int r9 = r1.mo28188n(r14, r2)
            int r12 = p000.u55.TextInputLayout_helperTextEnabled
            boolean r12 = r1.mo28175a(r12, r2)
            int r14 = p000.u55.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.mo28190p(r14)
            int r10 = p000.u55.TextInputLayout_placeholderTextAppearance
            int r10 = r1.mo28188n(r10, r2)
            int r8 = p000.u55.TextInputLayout_placeholderText
            java.lang.CharSequence r8 = r1.mo28190p(r8)
            r18 = r10
            int r10 = p000.u55.TextInputLayout_prefixTextAppearance
            int r10 = r1.mo28188n(r10, r2)
            int r2 = p000.u55.TextInputLayout_prefixText
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r21 = r10
            int r10 = p000.u55.TextInputLayout_suffixTextAppearance
            r22 = r2
            r2 = 0
            int r10 = r1.mo28188n(r10, r2)
            int r2 = p000.u55.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r23 = r10
            int r10 = p000.u55.TextInputLayout_counterEnabled
            r24 = r2
            r2 = 0
            boolean r10 = r1.mo28175a(r10, r2)
            int r2 = p000.u55.TextInputLayout_counterMaxLength
            r25 = r10
            r10 = -1
            int r2 = r1.mo28185k(r2, r10)
            r0.setCounterMaxLength(r2)
            r2 = 0
            int r10 = r1.mo28188n(r15, r2)
            r0.f24460L = r10
            r10 = r20
            int r10 = r1.mo28188n(r10, r2)
            r0.f24456I = r10
            android.content.Context r10 = r26.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r15 = p000.c45.design_text_input_start_icon
            r20 = r8
            r8 = r17
            android.view.View r10 = r10.inflate(r15, r8, r2)
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f24458J1 = r10
            r15 = 8
            r10.setVisibility(r15)
            boolean r15 = p000.to3.m52396g(r13)
            if (r15 == 0) goto L_0x0398
            android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            p000.do3.m15249c(r15, r2)
        L_0x0398:
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = p000.u55.TextInputLayout_startIconDrawable
            boolean r15 = r1.mo28193s(r2)
            if (r15 == 0) goto L_0x03c7
            android.graphics.drawable.Drawable r2 = r1.mo28181g(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p000.u55.TextInputLayout_startIconContentDescription
            boolean r15 = r1.mo28193s(r2)
            if (r15 == 0) goto L_0x03bd
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x03bd:
            int r2 = p000.u55.TextInputLayout_startIconCheckable
            r15 = 1
            boolean r2 = r1.mo28175a(r2, r15)
            r0.setStartIconCheckable(r2)
        L_0x03c7:
            int r2 = p000.u55.TextInputLayout_startIconTint
            boolean r15 = r1.mo28193s(r2)
            if (r15 == 0) goto L_0x03d6
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x03d6:
            int r2 = p000.u55.TextInputLayout_startIconTintMode
            boolean r15 = r1.mo28193s(r2)
            if (r15 == 0) goto L_0x03eb
            r15 = -1
            int r2 = r1.mo28185k(r2, r15)
            r15 = 0
            android.graphics.PorterDuff$Mode r2 = p000.pe7.m49903i(r2, r15)
            r0.setStartIconTintMode(r2)
        L_0x03eb:
            int r2 = p000.u55.TextInputLayout_boxBackgroundMode
            r15 = 0
            int r2 = r1.mo28185k(r2, r15)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r26.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r17 = r4
            r4 = r19
            android.view.View r2 = r2.inflate(r7, r4, r15)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f24474U1 = r2
            r4.addView(r2)
            r7 = 8
            r2.setVisibility(r7)
            boolean r7 = p000.to3.m52396g(r13)
            if (r7 == 0) goto L_0x0420
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            p000.do3.m15250d(r2, r15)
        L_0x0420:
            zx0 r2 = new zx0
            r2.<init>(r0)
            r7 = r16
            r15 = -1
            r7.append(r15, r2)
            n74 r2 = new n74
            r2.<init>(r0)
            r15 = 0
            r7.append(r15, r2)
            com.google.android.material.textfield.c r2 = new com.google.android.material.textfield.c
            r2.<init>(r0)
            r15 = 1
            r7.append(r15, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r15 = 2
            r7.append(r15, r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r15 = 3
            r7.append(r15, r2)
            int r2 = p000.u55.TextInputLayout_endIconMode
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x0488
            r7 = 0
            int r2 = r1.mo28185k(r2, r7)
            r0.setEndIconMode(r2)
            int r2 = p000.u55.TextInputLayout_endIconDrawable
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x046e
            android.graphics.drawable.Drawable r2 = r1.mo28181g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x046e:
            int r2 = p000.u55.TextInputLayout_endIconContentDescription
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x047d
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x047d:
            int r2 = p000.u55.TextInputLayout_endIconCheckable
            r7 = 1
            boolean r2 = r1.mo28175a(r2, r7)
            r0.setEndIconCheckable(r2)
            goto L_0x04ce
        L_0x0488:
            int r2 = p000.u55.TextInputLayout_passwordToggleEnabled
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x04ce
            r7 = 0
            boolean r2 = r1.mo28175a(r2, r7)
            r0.setEndIconMode(r2)
            int r2 = p000.u55.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.mo28181g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p000.u55.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.mo28190p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p000.u55.TextInputLayout_passwordToggleTint
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x04b9
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04b9:
            int r2 = p000.u55.TextInputLayout_passwordToggleTintMode
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x04ce
            r7 = -1
            int r2 = r1.mo28185k(r2, r7)
            r7 = 0
            android.graphics.PorterDuff$Mode r2 = p000.pe7.m49903i(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04ce:
            int r2 = p000.u55.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.mo28193s(r2)
            if (r2 != 0) goto L_0x04fa
            int r2 = p000.u55.TextInputLayout_endIconTint
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x04e5
            android.content.res.ColorStateList r2 = p000.to3.m52390a(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e5:
            int r2 = p000.u55.TextInputLayout_endIconTintMode
            boolean r7 = r1.mo28193s(r2)
            if (r7 == 0) goto L_0x04fa
            r7 = -1
            int r2 = r1.mo28185k(r2, r7)
            r7 = 0
            android.graphics.PorterDuff$Mode r2 = p000.pe7.m49903i(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04fa:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f24489e1 = r2
            int r7 = p000.g35.textinput_prefix_text
            r2.setId(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r7.<init>(r15, r15)
            r2.setLayoutParams(r7)
            r7 = 1
            p000.ga7.m17789r0(r2, r7)
            r8.addView(r10)
            r8.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f24505p1 = r2
            int r7 = p000.g35.textinput_suffix_text
            r2.setId(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r7.<init>(r15, r15, r8)
            r2.setLayoutParams(r7)
            r7 = 1
            p000.ga7.m17789r0(r2, r7)
            r11.addView(r2)
            r11.addView(r6)
            r11.addView(r4)
            r0.setHelperTextEnabled(r12)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorEnabled(r5)
            r0.setErrorTextAppearance(r3)
            r2 = r17
            r0.setErrorContentDescription(r2)
            int r2 = r0.f24460L
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f24456I
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r20
            r0.setPlaceholderText(r2)
            r2 = r18
            r0.setPlaceholderTextAppearance(r2)
            r2 = r22
            r0.setPrefixText(r2)
            r2 = r21
            r0.setPrefixTextAppearance(r2)
            r2 = r24
            r0.setSuffixText(r2)
            r2 = r23
            r0.setSuffixTextAppearance(r2)
            int r2 = p000.u55.TextInputLayout_errorTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x0587
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setErrorTextColor(r2)
        L_0x0587:
            int r2 = p000.u55.TextInputLayout_helperTextTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x0596
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setHelperTextColor(r2)
        L_0x0596:
            int r2 = p000.u55.TextInputLayout_hintTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05a5
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setHintTextColor(r2)
        L_0x05a5:
            int r2 = p000.u55.TextInputLayout_counterTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05b4
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setCounterTextColor(r2)
        L_0x05b4:
            int r2 = p000.u55.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05c3
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05c3:
            int r2 = p000.u55.TextInputLayout_placeholderTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05d2
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05d2:
            int r2 = p000.u55.TextInputLayout_prefixTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05e1
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05e1:
            int r2 = p000.u55.TextInputLayout_suffixTextColor
            boolean r3 = r1.mo28193s(r2)
            if (r3 == 0) goto L_0x05f0
            android.content.res.ColorStateList r2 = r1.mo28177c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05f0:
            r2 = r25
            r0.setCounterEnabled(r2)
            int r2 = p000.u55.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.mo28175a(r2, r3)
            r0.setEnabled(r2)
            r1.mo28194w()
            r1 = 2
            p000.ga7.m17714A0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x060f
            p000.ga7.m17716B0(r0, r3)
        L_0x060f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f24491f2.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f24527y.mo29129x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f24474U1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f24474U1.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
