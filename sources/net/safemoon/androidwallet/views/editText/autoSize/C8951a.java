package net.safemoon.androidwallet.views.editText.autoSize;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: net.safemoon.androidwallet.views.editText.autoSize.a */
/* compiled from: AutofitHelper */
public class C8951a {

    /* renamed from: a */
    public TextView f43294a;

    /* renamed from: b */
    public TextPaint f43295b;

    /* renamed from: c */
    public float f43296c;

    /* renamed from: d */
    public int f43297d;

    /* renamed from: e */
    public float f43298e;

    /* renamed from: f */
    public float f43299f;

    /* renamed from: g */
    public float f43300g;

    /* renamed from: h */
    public boolean f43301h;

    /* renamed from: i */
    public boolean f43302i;

    /* renamed from: j */
    public ArrayList<C8954c> f43303j;

    /* renamed from: k */
    public TextWatcher f43304k = new C8953b();

    /* renamed from: l */
    public View.OnLayoutChangeListener f43305l = new C8952a();

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.a$a */
    /* compiled from: AutofitHelper */
    public class C8952a implements View.OnLayoutChangeListener {
        public C8952a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C8951a.this.mo62187c();
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.a$b */
    /* compiled from: AutofitHelper */
    public class C8953b implements TextWatcher {
        public C8953b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8951a.this.mo62187c();
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.a$c */
    /* compiled from: AutofitHelper */
    public interface C8954c {
        /* renamed from: b */
        void mo62166b(float f, float f2);
    }

    public C8951a(TextView textView) {
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f43294a = textView;
        this.f43295b = new TextPaint();
        mo62200v(textView.getTextSize());
        this.f43297d = m69603i(textView);
        this.f43298e = f * 8.0f;
        this.f43299f = this.f43296c;
        this.f43300g = 0.5f;
    }

    /* renamed from: d */
    public static void m69598d(TextView textView, TextPaint textPaint, float f, float f2, int i, float f3) {
        int width;
        float f4;
        TextView textView2 = textView;
        TextPaint textPaint2 = textPaint;
        float f5 = f2;
        int i2 = i;
        if (i2 > 0 && i2 != Integer.MAX_VALUE && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView);
            }
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint.set(textView.getPaint());
            textPaint.setTextSize(f2);
            if ((i2 != 1 || textPaint.measureText(text, 0, text.length()) <= ((float) width)) && m69602h(text, textPaint, f2, (float) width, displayMetrics) <= i2) {
                f4 = f5;
            } else {
                f4 = m69601g(text, textPaint, (float) width, i, Utils.FLOAT_EPSILON, f2, f3, displayMetrics);
            }
            if (f4 < f) {
                f4 = f;
            }
            textView.setTextSize(0, f4);
        }
    }

    /* renamed from: e */
    public static C8951a m69599e(TextView textView) {
        return m69600f(textView, (AttributeSet) null, 0);
    }

    /* renamed from: f */
    public static C8951a m69600f(TextView textView, AttributeSet attributeSet, int i) {
        C8951a aVar = new C8951a(textView);
        boolean z = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            float l = aVar.mo62190l();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y55.AutofitEditText, i, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, (int) aVar.mo62189k());
            float f = obtainStyledAttributes.getFloat(1, l);
            obtainStyledAttributes.recycle();
            aVar.mo62196r(0, (float) dimensionPixelSize).mo62197s(f);
            z = z2;
        }
        aVar.mo62192n(z);
        return aVar;
    }

    /* renamed from: g */
    public static float m69601g(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i2;
        float f5;
        TextPaint textPaint2 = textPaint;
        float f6 = f;
        int i3 = i;
        float f7 = (f2 + f3) / 2.0f;
        textPaint2.setTextSize(TypedValue.applyDimension(0, f7, displayMetrics));
        if (i3 != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f6, Layout.Alignment.ALIGN_NORMAL, 1.0f, Utils.FLOAT_EPSILON, true);
            i2 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i2 = 1;
        }
        if (i2 > i3) {
            if (f3 - f2 < f4) {
                return f2;
            }
            return m69601g(charSequence, textPaint, f, i, f2, f7, f4, displayMetrics);
        } else if (i2 < i3) {
            return m69601g(charSequence, textPaint, f, i, f7, f3, f4, displayMetrics);
        } else {
            float f8 = Utils.FLOAT_EPSILON;
            if (i3 == 1) {
                f5 = textPaint2.measureText(charSequence, 0, charSequence.length());
            } else {
                CharSequence charSequence2 = charSequence;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (staticLayout.getLineWidth(i4) > f8) {
                        f8 = staticLayout.getLineWidth(i4);
                    }
                }
                f5 = f8;
            }
            if (f3 - f2 < f4) {
                return f2;
            }
            if (f5 > f6) {
                return m69601g(charSequence, textPaint, f, i, f2, f7, f4, displayMetrics);
            }
            if (f5 < f6) {
                return m69601g(charSequence, textPaint, f, i, f7, f3, f4, displayMetrics);
            }
            return f7;
        }
    }

    /* renamed from: h */
    public static int m69602h(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, Utils.FLOAT_EPSILON, true).getLineCount();
    }

    /* renamed from: i */
    public static int m69603i(TextView textView) {
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod == null || !(transformationMethod instanceof SingleLineTransformationMethod)) {
            return textView.getMaxLines();
        }
        return 1;
    }

    /* renamed from: b */
    public C8951a mo62186b(C8954c cVar) {
        if (this.f43303j == null) {
            this.f43303j = new ArrayList<>();
        }
        this.f43303j.add(cVar);
        return this;
    }

    /* renamed from: c */
    public final void mo62187c() {
        float textSize = this.f43294a.getTextSize();
        this.f43302i = true;
        m69598d(this.f43294a, this.f43295b, this.f43298e, this.f43299f, this.f43297d, this.f43300g);
        this.f43302i = false;
        float textSize2 = this.f43294a.getTextSize();
        if (textSize2 != textSize) {
            mo62191m(textSize2, textSize);
        }
    }

    /* renamed from: j */
    public float mo62188j() {
        return this.f43299f;
    }

    /* renamed from: k */
    public float mo62189k() {
        return this.f43298e;
    }

    /* renamed from: l */
    public float mo62190l() {
        return this.f43300g;
    }

    /* renamed from: m */
    public final void mo62191m(float f, float f2) {
        ArrayList<C8954c> arrayList = this.f43303j;
        if (arrayList != null) {
            Iterator<C8954c> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo62166b(f, f2);
            }
        }
    }

    /* renamed from: n */
    public C8951a mo62192n(boolean z) {
        if (this.f43301h != z) {
            this.f43301h = z;
            if (z) {
                this.f43294a.addTextChangedListener(this.f43304k);
                this.f43294a.addOnLayoutChangeListener(this.f43305l);
                mo62187c();
            } else {
                this.f43294a.removeTextChangedListener(this.f43304k);
                this.f43294a.removeOnLayoutChangeListener(this.f43305l);
                this.f43294a.setTextSize(0, this.f43296c);
            }
        }
        return this;
    }

    /* renamed from: o */
    public C8951a mo62193o(int i) {
        if (this.f43297d != i) {
            this.f43297d = i;
            mo62187c();
        }
        return this;
    }

    /* renamed from: p */
    public C8951a mo62194p(float f) {
        return mo62195q(2, f);
    }

    /* renamed from: q */
    public C8951a mo62195q(int i, float f) {
        Context context = this.f43294a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        mo62198t(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: r */
    public C8951a mo62196r(int i, float f) {
        Context context = this.f43294a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        mo62199u(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: s */
    public C8951a mo62197s(float f) {
        if (this.f43300g != f) {
            this.f43300g = f;
            mo62187c();
        }
        return this;
    }

    /* renamed from: t */
    public final void mo62198t(float f) {
        if (f != this.f43299f) {
            this.f43299f = f;
            mo62187c();
        }
    }

    /* renamed from: u */
    public final void mo62199u(float f) {
        if (f != this.f43298e) {
            this.f43298e = f;
            mo62187c();
        }
    }

    /* renamed from: v */
    public final void mo62200v(float f) {
        if (this.f43296c != f) {
            this.f43296c = f;
        }
    }

    /* renamed from: w */
    public void mo62201w(int i, float f) {
        if (!this.f43302i) {
            Context context = this.f43294a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            mo62200v(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        }
    }
}
