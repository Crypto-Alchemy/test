package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sn */
/* compiled from: AppCompatTextViewAutoSizeHelper */
public class C3284sn {

    /* renamed from: l */
    public static final RectF f17736l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f17737m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f17738n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f17739a = 0;

    /* renamed from: b */
    public boolean f17740b = false;

    /* renamed from: c */
    public float f17741c = -1.0f;

    /* renamed from: d */
    public float f17742d = -1.0f;

    /* renamed from: e */
    public float f17743e = -1.0f;

    /* renamed from: f */
    public int[] f17744f = new int[0];

    /* renamed from: g */
    public boolean f17745g = false;

    /* renamed from: h */
    public TextPaint f17746h;

    /* renamed from: i */
    public final TextView f17747i;

    /* renamed from: j */
    public final Context f17748j;

    /* renamed from: k */
    public final C3290f f17749k;

    /* renamed from: sn$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class C3285a {
        /* renamed from: a */
        public static StaticLayout m27008a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m27009b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: sn$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class C3286b {
        /* renamed from: a */
        public static boolean m27010a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: sn$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class C3287c {
        /* renamed from: a */
        public static StaticLayout m27011a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C3290f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo25900a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* renamed from: sn$d */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class C3288d extends C3290f {
        /* renamed from: a */
        public void mo25900a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3284sn.m26983m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: sn$e */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class C3289e extends C3288d {
        /* renamed from: a */
        public void mo25900a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo25901b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: sn$f */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class C3290f {
        /* renamed from: a */
        public void mo25900a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo25901b(TextView textView) {
            return ((Boolean) C3284sn.m26983m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3284sn(TextView textView) {
        this.f17747i = textView;
        this.f17748j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17749k = new C3289e();
        } else {
            this.f17749k = new C3288d();
        }
    }

    /* renamed from: k */
    public static Method m26982k(String str) {
        try {
            Method method = f17737m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f17737m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to invoke TextView#");
        r2.append(r3);
        r2.append("() method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m26983m(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r0 = m26982k(r3)     // Catch:{ Exception -> 0x000e }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            goto L_0x0021
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000c }
            r2.<init>()     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "Failed to invoke TextView#"
            r2.append(r0)     // Catch:{ all -> 0x000c }
            r2.append(r3)     // Catch:{ all -> 0x000c }
            java.lang.String r3 = "() method"
            r2.append(r3)     // Catch:{ all -> 0x000c }
        L_0x0020:
            return r4
        L_0x0021:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3284sn.m26983m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public void mo25876a() {
        int i;
        if (mo25887n()) {
            if (this.f17740b) {
                if (this.f17747i.getMeasuredHeight() > 0 && this.f17747i.getMeasuredWidth() > 0) {
                    if (this.f17749k.mo25901b(this.f17747i)) {
                        i = 1048576;
                    } else {
                        i = (this.f17747i.getMeasuredWidth() - this.f17747i.getTotalPaddingLeft()) - this.f17747i.getTotalPaddingRight();
                    }
                    int height = (this.f17747i.getHeight() - this.f17747i.getCompoundPaddingBottom()) - this.f17747i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f17736l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float e = (float) mo25880e(rectF);
                            if (e != this.f17747i.getTextSize()) {
                                mo25893t(0, e);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f17740b = true;
        }
    }

    /* renamed from: b */
    public final int[] mo25877b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void mo25878c() {
        this.f17739a = 0;
        this.f17742d = -1.0f;
        this.f17743e = -1.0f;
        this.f17741c = -1.0f;
        this.f17744f = new int[0];
        this.f17740b = false;
    }

    /* renamed from: d */
    public StaticLayout mo25879d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C3287c.m27011a(charSequence, alignment, i, i2, this.f17747i, this.f17746h, this.f17749k);
    }

    /* renamed from: e */
    public final int mo25880e(RectF rectF) {
        int length = this.f17744f.length;
        if (length != 0) {
            int i = 0;
            int i2 = 1;
            int i3 = length - 1;
            while (true) {
                int i4 = i2;
                int i5 = i;
                i = i4;
                while (i <= i3) {
                    int i6 = (i + i3) / 2;
                    if (mo25897x(this.f17744f[i6], rectF)) {
                        i2 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i3 = i5;
                    }
                }
                return this.f17744f[i5];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public int mo25881f() {
        return Math.round(this.f17743e);
    }

    /* renamed from: g */
    public int mo25882g() {
        return Math.round(this.f17742d);
    }

    /* renamed from: h */
    public int mo25883h() {
        return Math.round(this.f17741c);
    }

    /* renamed from: i */
    public int[] mo25884i() {
        return this.f17744f;
    }

    /* renamed from: j */
    public int mo25885j() {
        return this.f17739a;
    }

    /* renamed from: l */
    public void mo25886l(int i) {
        TextPaint textPaint = this.f17746h;
        if (textPaint == null) {
            this.f17746h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f17746h.set(this.f17747i.getPaint());
        this.f17746h.setTextSize((float) i);
    }

    /* renamed from: n */
    public boolean mo25887n() {
        if (!mo25898y() || this.f17739a == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo25888o(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f17748j;
        int[] iArr = j65.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f17747i;
        ga7.m17781n0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = j65.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f17739a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = j65.AppCompatTextView_autoSizeStepGranularity;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = j65.AppCompatTextView_autoSizeMinTextSize;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = j65.AppCompatTextView_autoSizeMaxTextSize;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = j65.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            mo25895v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!mo25898y()) {
            this.f17739a = 0;
        } else if (this.f17739a == 1) {
            if (!this.f17745g) {
                DisplayMetrics displayMetrics = this.f17748j.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                mo25899z(f2, f3, f);
            }
            mo25894u();
        }
    }

    /* renamed from: p */
    public void mo25889p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (mo25898y()) {
            DisplayMetrics displayMetrics = this.f17748j.getResources().getDisplayMetrics();
            mo25899z(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (mo25894u()) {
                mo25876a();
            }
        }
    }

    /* renamed from: q */
    public void mo25890q(int[] iArr, int i) throws IllegalArgumentException {
        if (mo25898y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f17748j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f17744f = mo25877b(iArr2);
                if (!mo25896w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f17745g = false;
            }
            if (mo25894u()) {
                mo25876a();
            }
        }
    }

    /* renamed from: r */
    public void mo25891r(int i) {
        if (!mo25898y()) {
            return;
        }
        if (i == 0) {
            mo25878c();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f17748j.getResources().getDisplayMetrics();
            mo25899z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (mo25894u()) {
                mo25876a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* renamed from: s */
    public final void mo25892s(float f) {
        if (f != this.f17747i.getPaint().getTextSize()) {
            this.f17747i.getPaint().setTextSize(f);
            boolean a = C3286b.m27010a(this.f17747i);
            if (this.f17747i.getLayout() != null) {
                this.f17740b = false;
                try {
                    Method k = m26982k("nullLayouts");
                    if (k != null) {
                        k.invoke(this.f17747i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a) {
                    this.f17747i.requestLayout();
                } else {
                    this.f17747i.forceLayout();
                }
                this.f17747i.invalidate();
            }
        }
    }

    /* renamed from: t */
    public void mo25893t(int i, float f) {
        Resources resources;
        Context context = this.f17748j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        mo25892s(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: u */
    public final boolean mo25894u() {
        if (!mo25898y() || this.f17739a != 1) {
            this.f17740b = false;
        } else {
            if (!this.f17745g || this.f17744f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f17743e - this.f17742d) / this.f17741c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f17742d + (((float) i) * this.f17741c));
                }
                this.f17744f = mo25877b(iArr);
            }
            this.f17740b = true;
        }
        return this.f17740b;
    }

    /* renamed from: v */
    public final void mo25895v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f17744f = mo25877b(iArr);
            mo25896w();
        }
    }

    /* renamed from: w */
    public final boolean mo25896w() {
        boolean z;
        int[] iArr = this.f17744f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f17745g = z;
        if (z) {
            this.f17739a = 1;
            this.f17742d = (float) iArr[0];
            this.f17743e = (float) iArr[length - 1];
            this.f17741c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean mo25897x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f17747i.getText();
        TransformationMethod transformationMethod = this.f17747i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f17747i)) == null)) {
            text = transformation;
        }
        int b = C3285a.m27009b(this.f17747i);
        mo25886l(i);
        StaticLayout d = mo25879d(text, (Layout.Alignment) m26983m(this.f17747i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        if ((b == -1 || (d.getLineCount() <= b && d.getLineEnd(d.getLineCount() - 1) == text.length())) && ((float) d.getHeight()) <= rectF.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo25898y() {
        return !(this.f17747i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    public final void mo25899z(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= Utils.FLOAT_EPSILON) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > Utils.FLOAT_EPSILON) {
            this.f17739a = 1;
            this.f17742d = f;
            this.f17743e = f2;
            this.f17741c = f3;
            this.f17745g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
