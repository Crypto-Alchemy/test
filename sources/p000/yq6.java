package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000.uf5;

/* renamed from: yq6 */
/* compiled from: TintTypedArray */
public class yq6 {

    /* renamed from: a */
    public final Context f20314a;

    /* renamed from: b */
    public final TypedArray f20315b;

    /* renamed from: c */
    public TypedValue f20316c;

    public yq6(Context context, TypedArray typedArray) {
        this.f20314a = context;
        this.f20315b = typedArray;
    }

    /* renamed from: t */
    public static yq6 m30731t(Context context, int i, int[] iArr) {
        return new yq6(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static yq6 m30732u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new yq6(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static yq6 m30733v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new yq6(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo28175a(int i, boolean z) {
        return this.f20315b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo28176b(int i, int i2) {
        return this.f20315b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo28177c(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f20315b.hasValue(i) || (resourceId = this.f20315b.getResourceId(i, 0)) == 0 || (a = C2554in.m19713a(this.f20314a, resourceId)) == null) {
            return this.f20315b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: d */
    public float mo28178d(int i, float f) {
        return this.f20315b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo28179e(int i, int i2) {
        return this.f20315b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo28180f(int i, int i2) {
        return this.f20315b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo28181g(int i) {
        int resourceId;
        if (!this.f20315b.hasValue(i) || (resourceId = this.f20315b.getResourceId(i, 0)) == 0) {
            return this.f20315b.getDrawable(i);
        }
        return C2554in.m19714b(this.f20314a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo28182h(int i) {
        int resourceId;
        if (!this.f20315b.hasValue(i) || (resourceId = this.f20315b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C3743zm.m31368b().mo28528d(this.f20314a, resourceId, true);
    }

    /* renamed from: i */
    public float mo28183i(int i, float f) {
        return this.f20315b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo28184j(int i, int i2, uf5.C3410e eVar) {
        int resourceId = this.f20315b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f20316c == null) {
            this.f20316c = new TypedValue();
        }
        return uf5.m28226i(this.f20314a, resourceId, this.f20316c, i2, eVar);
    }

    /* renamed from: k */
    public int mo28185k(int i, int i2) {
        return this.f20315b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo28186l(int i, int i2) {
        return this.f20315b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo28187m(int i, int i2) {
        return this.f20315b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo28188n(int i, int i2) {
        return this.f20315b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo28189o(int i) {
        return this.f20315b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo28190p(int i) {
        return this.f20315b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo28191q(int i) {
        return this.f20315b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo28192r() {
        return this.f20315b;
    }

    /* renamed from: s */
    public boolean mo28193s(int i) {
        return this.f20315b.hasValue(i);
    }

    /* renamed from: w */
    public void mo28194w() {
        this.f20315b.recycle();
    }
}
