package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {

    /* renamed from: b1 */
    public static float f2638b1;

    /* renamed from: v0 */
    public static int f2639v0;

    /* renamed from: C */
    public ConstraintLayout f2640C;

    /* renamed from: H */
    public int f2641H;

    /* renamed from: I */
    public float[] f2642I;

    /* renamed from: L */
    public int[] f2643L;

    /* renamed from: M */
    public int f2644M;

    /* renamed from: P */
    public int f2645P;

    /* renamed from: Q */
    public String f2646Q;

    /* renamed from: U */
    public String f2647U;

    /* renamed from: e0 */
    public Float f2648e0;

    /* renamed from: k0 */
    public Integer f2649k0;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str != null) {
            int i = 0;
            this.f2645P = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo4596y(str.substring(i).trim());
                    return;
                } else {
                    mo4596y(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i = 0;
            this.f2644M = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo4597z(str.substring(i).trim());
                    return;
                } else {
                    mo4597z(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo4590A() {
        this.f2640C = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f3071d; i++) {
            View i2 = this.f2640C.mo5078i(this.f3070a[i]);
            if (i2 != null) {
                int i3 = f2639v0;
                float f = f2638b1;
                int[] iArr = this.f2643L;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.f2649k0;
                    if (num == null || num.intValue() == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append(this.f3078y.get(Integer.valueOf(i2.getId())));
                    } else {
                        this.f2644M++;
                        if (this.f2643L == null) {
                            this.f2643L = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2643L = radius;
                        radius[this.f2644M - 1] = i3;
                    }
                } else {
                    i3 = iArr[i];
                }
                float[] fArr = this.f2642I;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.f2648e0;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append(this.f3078y.get(Integer.valueOf(i2.getId())));
                    } else {
                        this.f2645P++;
                        if (this.f2642I == null) {
                            this.f2642I = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2642I = angles;
                        angles[this.f2645P - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) i2.getLayoutParams();
                layoutParams.f3161q = f;
                layoutParams.f3157o = this.f2641H;
                layoutParams.f3159p = i3;
                i2.setLayoutParams(layoutParams);
            }
        }
        mo5049h();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2642I, this.f2645P);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2643L, this.f2644M);
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f2641H = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == c65.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2646Q = string;
                    setAngles(string);
                } else if (index == c65.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2647U = string2;
                    setRadius(string2);
                } else if (index == c65.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f2638b1));
                    this.f2648e0 = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == c65.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f2639v0));
                    this.f2649k0 = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2646Q;
        if (str != null) {
            this.f2642I = new float[1];
            setAngles(str);
        }
        String str2 = this.f2647U;
        if (str2 != null) {
            this.f2643L = new int[1];
            setRadius(str2);
        }
        Float f = this.f2648e0;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f2649k0;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        mo4590A();
    }

    public void setDefaultAngle(float f) {
        f2638b1 = f;
    }

    public void setDefaultRadius(int i) {
        f2639v0 = i;
    }

    /* renamed from: y */
    public final void mo4596y(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f3072e != null && (fArr = this.f2642I) != null) {
            if (this.f2645P + 1 > fArr.length) {
                this.f2642I = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f2642I[this.f2645P] = (float) Integer.parseInt(str);
            this.f2645P++;
        }
    }

    /* renamed from: z */
    public final void mo4597z(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f3072e != null && (iArr = this.f2643L) != null) {
            if (this.f2644M + 1 > iArr.length) {
                this.f2643L = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f2643L[this.f2644M] = (int) (((float) Integer.parseInt(str)) * this.f3072e.getResources().getDisplayMetrics().density);
            this.f2644M++;
        }
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
