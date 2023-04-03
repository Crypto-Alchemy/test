package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;

public class Legend extends ComponentBase {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<FSize> mCalculatedLabelSizes;
    private List<FSize> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private LegendEntry[] mEntries;
    private LegendEntry[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* renamed from: com.github.mikephil.charting.components.Legend$1 */
    public static /* synthetic */ class C20941 {

        /* renamed from: $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation */
        public static final /* synthetic */ int[] f10179x9c9dbef;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10179x9c9dbef = r0
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10179x9c9dbef     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.C20941.<clinit>():void");
        }
    }

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.mEntries = new LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = Utils.FLOAT_EPSILON;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = Utils.FLOAT_EPSILON;
        this.mNeededHeight = Utils.FLOAT_EPSILON;
        this.mTextHeightMax = Utils.FLOAT_EPSILON;
        this.mTextWidthMax = Utils.FLOAT_EPSILON;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(3.0f);
    }

    public void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        boolean z;
        float f;
        int i;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        float f8;
        float f9;
        Paint paint2 = paint;
        float convertDpToPixel = Utils.convertDpToPixel(this.mFormSize);
        float convertDpToPixel2 = Utils.convertDpToPixel(this.mStackSpace);
        float convertDpToPixel3 = Utils.convertDpToPixel(this.mFormToTextSpace);
        float convertDpToPixel4 = Utils.convertDpToPixel(this.mXEntrySpace);
        float convertDpToPixel5 = Utils.convertDpToPixel(this.mYEntrySpace);
        boolean z3 = this.mWordWrapEnabled;
        LegendEntry[] legendEntryArr = this.mEntries;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i3 = C20941.f10179x9c9dbef[this.mOrientation.ordinal()];
        if (i3 == 1) {
            float f10 = convertDpToPixel;
            float f11 = convertDpToPixel2;
            LegendEntry[] legendEntryArr2 = legendEntryArr;
            float lineHeight = Utils.getLineHeight(paint);
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            boolean z4 = false;
            for (int i4 = 0; i4 < length; i4++) {
                LegendEntry legendEntry = legendEntryArr2[i4];
                if (legendEntry.form != LegendForm.NONE) {
                    z = true;
                } else {
                    z = false;
                }
                if (Float.isNaN(legendEntry.formSize)) {
                    f = f10;
                } else {
                    f = Utils.convertDpToPixel(legendEntry.formSize);
                }
                String str = legendEntry.label;
                if (!z4) {
                    f14 = 0.0f;
                }
                if (z) {
                    if (z4) {
                        f14 += f11;
                    }
                    f14 += f;
                }
                if (str != null) {
                    if (z && !z4) {
                        f14 += convertDpToPixel3;
                    } else if (z4) {
                        f12 = Math.max(f12, f14);
                        f13 += lineHeight + convertDpToPixel5;
                        f14 = 0.0f;
                        z4 = false;
                    }
                    f14 += (float) Utils.calcTextWidth(paint2, str);
                    if (i4 < length - 1) {
                        f13 += lineHeight + convertDpToPixel5;
                    }
                } else {
                    f14 += f;
                    if (i4 < length - 1) {
                        f14 += f11;
                    }
                    z4 = true;
                }
                f12 = Math.max(f12, f14);
            }
            this.mNeededWidth = f12;
            this.mNeededHeight = f13;
        } else if (i3 == 2) {
            float lineHeight2 = Utils.getLineHeight(paint);
            float lineSpacing = Utils.getLineSpacing(paint) + convertDpToPixel5;
            float contentWidth = viewPortHandler.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i5 = 0;
            float f15 = Utils.FLOAT_EPSILON;
            int i6 = -1;
            float f16 = Utils.FLOAT_EPSILON;
            float f17 = Utils.FLOAT_EPSILON;
            while (i5 < length) {
                LegendEntry legendEntry2 = legendEntryArr[i5];
                float f18 = convertDpToPixel;
                float f19 = convertDpToPixel4;
                if (legendEntry2.form != LegendForm.NONE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Float.isNaN(legendEntry2.formSize)) {
                    f2 = f18;
                } else {
                    f2 = Utils.convertDpToPixel(legendEntry2.formSize);
                }
                String str2 = legendEntry2.label;
                LegendEntry[] legendEntryArr3 = legendEntryArr;
                float f20 = lineSpacing;
                this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
                if (i6 == -1) {
                    f3 = Utils.FLOAT_EPSILON;
                } else {
                    f3 = f16 + convertDpToPixel2;
                }
                if (str2 != null) {
                    f4 = convertDpToPixel2;
                    this.mCalculatedLabelSizes.add(Utils.calcTextSize(paint2, str2));
                    if (z2) {
                        f9 = convertDpToPixel3 + f2;
                    } else {
                        f9 = Utils.FLOAT_EPSILON;
                    }
                    f5 = f3 + f9 + this.mCalculatedLabelSizes.get(i5).width;
                } else {
                    f4 = convertDpToPixel2;
                    float f21 = f2;
                    this.mCalculatedLabelSizes.add(FSize.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
                    if (z2) {
                        f8 = f21;
                    } else {
                        f8 = Utils.FLOAT_EPSILON;
                    }
                    f5 = f3 + f8;
                    if (i6 == -1) {
                        i6 = i5;
                    }
                }
                if (str2 != null || i5 == length - 1) {
                    float f22 = f17;
                    int i7 = (f22 > Utils.FLOAT_EPSILON ? 1 : (f22 == Utils.FLOAT_EPSILON ? 0 : -1));
                    if (i7 == 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f19;
                    }
                    if (!z3 || i7 == 0 || contentWidth - f22 >= f6 + f5) {
                        f7 = f22 + f6 + f5;
                    } else {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f22, lineHeight2));
                        float max = Math.max(f15, f22);
                        List<Boolean> list = this.mCalculatedLabelBreakPoints;
                        if (i6 > -1) {
                            i2 = i6;
                        } else {
                            i2 = i5;
                        }
                        list.set(i2, Boolean.TRUE);
                        f15 = max;
                        f7 = f5;
                    }
                    if (i5 == length - 1) {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f7, lineHeight2));
                        f15 = Math.max(f15, f7);
                    }
                    f17 = f7;
                }
                if (str2 != null) {
                    i6 = -1;
                }
                i5++;
                convertDpToPixel2 = f4;
                convertDpToPixel = f18;
                convertDpToPixel4 = f19;
                lineSpacing = f20;
                f16 = f5;
                legendEntryArr = legendEntryArr3;
            }
            float f23 = lineSpacing;
            this.mNeededWidth = f15;
            float size = lineHeight2 * ((float) this.mCalculatedLineSizes.size());
            if (this.mCalculatedLineSizes.size() == 0) {
                i = 0;
            } else {
                i = this.mCalculatedLineSizes.size() - 1;
            }
            this.mNeededHeight = size + (f23 * ((float) i));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public LegendEntry[] getEntries() {
        return this.mEntries;
    }

    public LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f = Utils.FLOAT_EPSILON;
        for (LegendEntry legendEntry : this.mEntries) {
            String str = legendEntry.label;
            if (str != null) {
                float calcTextHeight = (float) Utils.calcTextHeight(paint, str);
                if (calcTextHeight > f) {
                    f = calcTextHeight;
                }
            }
        }
        return f;
    }

    public float getMaximumEntryWidth(Paint paint) {
        float f;
        float convertDpToPixel = Utils.convertDpToPixel(this.mFormToTextSpace);
        float f2 = Utils.FLOAT_EPSILON;
        float f3 = 0.0f;
        for (LegendEntry legendEntry : this.mEntries) {
            if (Float.isNaN(legendEntry.formSize)) {
                f = this.mFormSize;
            } else {
                f = legendEntry.formSize;
            }
            float convertDpToPixel2 = Utils.convertDpToPixel(f);
            if (convertDpToPixel2 > f3) {
                f3 = convertDpToPixel2;
            }
            String str = legendEntry.label;
            if (str != null) {
                float calcTextWidth = (float) Utils.calcTextWidth(paint, str);
                if (calcTextWidth > f2) {
                    f2 = calcTextWidth;
                }
            }
        }
        return f2 + f3 + convertDpToPixel;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setCustom(LegendEntry[] legendEntryArr) {
        this.mEntries = legendEntryArr;
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setDrawInside(boolean z) {
        this.mDrawInside = z;
    }

    public void setEntries(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public void setExtra(List<LegendEntry> list) {
        this.mExtraEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f) {
        this.mFormLineWidth = f;
    }

    public void setFormSize(float f) {
        this.mFormSize = f;
    }

    public void setFormToTextSpace(float f) {
        this.mFormToTextSpace = f;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public void setMaxSizePercent(float f) {
        this.mMaxSizePercent = f;
    }

    public void setOrientation(LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    public void setStackSpace(float f) {
        this.mStackSpace = f;
    }

    public void setVerticalAlignment(LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public void setWordWrapEnabled(boolean z) {
        this.mWordWrapEnabled = z;
    }

    public void setXEntrySpace(float f) {
        this.mXEntrySpace = f;
    }

    public void setYEntrySpace(float f) {
        this.mYEntrySpace = f;
    }

    public void setExtra(LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new LegendEntry[0];
        }
        this.mExtraEntries = legendEntryArr;
    }

    public void setCustom(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void setExtra(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(iArr.length, strArr.length); i++) {
            LegendEntry legendEntry = new LegendEntry();
            int i2 = iArr[i];
            legendEntry.formColor = i2;
            legendEntry.label = strArr[i];
            if (i2 == 1122868 || i2 == 0) {
                legendEntry.form = LegendForm.NONE;
            } else if (i2 == 1122867) {
                legendEntry.form = LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mExtraEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
    }

    public Legend(LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr != null) {
            this.mEntries = legendEntryArr;
            return;
        }
        throw new IllegalArgumentException("entries array is NULL");
    }
}
