package com.jama.carouselview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1329n;
import androidx.recyclerview.widget.C1343v;
import androidx.recyclerview.widget.RecyclerView;
import com.jama.carouselview.enums.IndicatorAnimationType;
import com.jama.carouselview.enums.OffsetType;
import com.p011rd.PageIndicatorView;
import com.p011rd.animation.type.AnimationType;

public class CarouselView extends FrameLayout {

    /* renamed from: A */
    public boolean f25822A;

    /* renamed from: B */
    public boolean f25823B;

    /* renamed from: C */
    public int f25824C;

    /* renamed from: H */
    public Handler f25825H;

    /* renamed from: I */
    public boolean f25826I;

    /* renamed from: L */
    public int f25827L;

    /* renamed from: M */
    public int f25828M;

    /* renamed from: P */
    public int f25829P;

    /* renamed from: Q */
    public int f25830Q;

    /* renamed from: U */
    public boolean f25831U = false;

    /* renamed from: a */
    public Context f25832a;

    /* renamed from: d */
    public PageIndicatorView f25833d;

    /* renamed from: e */
    public RecyclerView f25834e;

    /* renamed from: g */
    public CarouselLinearLayoutManager f25835g;

    /* renamed from: k */
    public zb0 f25836k;

    /* renamed from: r */
    public vb0 f25837r;

    /* renamed from: s */
    public IndicatorAnimationType f25838s;

    /* renamed from: x */
    public OffsetType f25839x;

    /* renamed from: y */
    public C1343v f25840y;

    /* renamed from: com.jama.carouselview.CarouselView$a */
    public class C5058a implements Runnable {
        public C5058a() {
        }

        public void run() {
            if (CarouselView.this.getAutoPlay()) {
                if (CarouselView.this.getSize() - 1 == CarouselView.this.getCurrentItem()) {
                    CarouselView.this.setCurrentItem(0);
                } else {
                    CarouselView carouselView = CarouselView.this;
                    carouselView.setCurrentItem(carouselView.getCurrentItem() + 1);
                }
                CarouselView.this.f25825H.postDelayed(this, (long) CarouselView.this.getAutoPlayDelay());
            }
        }
    }

    /* renamed from: com.jama.carouselview.CarouselView$b */
    public static /* synthetic */ class C5059b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25842a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25843b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.jama.carouselview.enums.IndicatorAnimationType[] r0 = com.jama.carouselview.enums.IndicatorAnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25843b = r0
                r1 = 1
                com.jama.carouselview.enums.IndicatorAnimationType r2 = com.jama.carouselview.enums.IndicatorAnimationType.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.FILL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.SWAP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.WORM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.COLOR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.SCALE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.SLIDE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r2 = f25843b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.jama.carouselview.enums.IndicatorAnimationType r3 = com.jama.carouselview.enums.IndicatorAnimationType.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.jama.carouselview.enums.OffsetType[] r2 = com.jama.carouselview.enums.OffsetType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f25842a = r2
                com.jama.carouselview.enums.OffsetType r3 = com.jama.carouselview.enums.OffsetType.CENTER     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r1 = f25842a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.jama.carouselview.enums.OffsetType r2 = com.jama.carouselview.enums.OffsetType.START     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jama.carouselview.CarouselView.C5059b.<clinit>():void");
        }
    }

    public CarouselView(Context context) {
        super(context);
        this.f25832a = context;
        mo38306j((AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m40004l() {
        int[] c;
        this.f25834e.mo8963B1();
        this.f25834e.stopNestedScroll();
        this.f25834e.mo9092o1(this.f25830Q);
        View N = this.f25834e.getLayoutManager().mo8888N(this.f25830Q);
        if (N != null && (c = this.f25840y.mo9911c(this.f25834e.getLayoutManager(), N)) != null) {
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f25834e.mo9120s1(i, c[1]);
            }
        }
    }

    /* renamed from: d */
    public void mo38285d() {
        this.f25834e.post(new xb0(this));
    }

    /* renamed from: e */
    public final void mo38286e() {
        this.f25825H.postDelayed(new C5058a(), (long) getAutoPlayDelay());
    }

    /* renamed from: f */
    public void mo38287f(boolean z) {
        this.f25822A = z;
    }

    /* renamed from: g */
    public final IndicatorAnimationType mo38288g(int i) {
        switch (i) {
            case 1:
                return IndicatorAnimationType.FILL;
            case 2:
                return IndicatorAnimationType.DROP;
            case 3:
                return IndicatorAnimationType.SWAP;
            case 4:
                return IndicatorAnimationType.WORM;
            case 5:
                return IndicatorAnimationType.COLOR;
            case 6:
                return IndicatorAnimationType.SCALE;
            case 7:
                return IndicatorAnimationType.SLIDE;
            case 8:
                return IndicatorAnimationType.THIN_WORM;
            case 9:
                return IndicatorAnimationType.SCALE_DOWN;
            default:
                return IndicatorAnimationType.NONE;
        }
    }

    public boolean getAutoPlay() {
        return this.f25823B;
    }

    public int getAutoPlayDelay() {
        return this.f25824C;
    }

    public OffsetType getCarouselOffset() {
        return this.f25839x;
    }

    public vb0 getCarouselScrollListener() {
        return this.f25837r;
    }

    public zb0 getCarouselViewListener() {
        return this.f25836k;
    }

    public int getCurrentItem() {
        return this.f25830Q;
    }

    public IndicatorAnimationType getIndicatorAnimationType() {
        return this.f25838s;
    }

    public int getIndicatorPadding() {
        return this.f25833d.getPadding();
    }

    public int getIndicatorRadius() {
        return this.f25833d.getRadius();
    }

    public int getIndicatorSelectedColor() {
        return this.f25833d.getSelectedColor();
    }

    public int getIndicatorUnselectedColor() {
        return this.f25833d.getUnselectedColor();
    }

    public int getResource() {
        return this.f25827L;
    }

    public boolean getScaleOnScroll() {
        return this.f25826I;
    }

    public int getSize() {
        return this.f25828M;
    }

    public int getSpacing() {
        return this.f25829P;
    }

    /* renamed from: h */
    public final OffsetType mo38304h(int i) {
        if (i != 1) {
            return OffsetType.START;
        }
        return OffsetType.CENTER;
    }

    /* renamed from: i */
    public void mo38305i(boolean z) {
        if (z) {
            this.f25833d.setVisibility(8);
        } else {
            this.f25833d.setVisibility(0);
        }
    }

    /* renamed from: j */
    public final void mo38306j(AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(this.f25832a).inflate(d45.view_carousel, this);
        this.f25834e = (RecyclerView) inflate.findViewById(h35.carouselRecyclerView);
        this.f25833d = (PageIndicatorView) inflate.findViewById(h35.pageIndicatorView);
        this.f25825H = new Handler();
        this.f25834e.setHasFixedSize(true);
        mo38307k(attributeSet);
    }

    /* renamed from: k */
    public final void mo38307k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = this.f25832a.getTheme().obtainStyledAttributes(attributeSet, v55.CarouselView, 0, 0);
            mo38287f(obtainStyledAttributes.getBoolean(v55.CarouselView_enableSnapping, true));
            setScaleOnScroll(obtainStyledAttributes.getBoolean(v55.CarouselView_scaleOnScroll, false));
            setAutoPlay(obtainStyledAttributes.getBoolean(v55.CarouselView_setAutoPlay, false));
            setAutoPlayDelay(obtainStyledAttributes.getInteger(v55.CarouselView_setAutoPlayDelay, 2500));
            setCarouselOffset(mo38304h(obtainStyledAttributes.getInteger(v55.CarouselView_carouselOffset, 0)));
            int resourceId = obtainStyledAttributes.getResourceId(v55.CarouselView_resource, 0);
            if (resourceId != 0) {
                setResource(resourceId);
            }
            int color = obtainStyledAttributes.getColor(v55.CarouselView_indicatorSelectedColor, 0);
            int color2 = obtainStyledAttributes.getColor(v55.CarouselView_indicatorUnselectedColor, 0);
            if (color != 0) {
                setIndicatorSelectedColor(color);
            }
            if (color2 != 0) {
                setIndicatorUnselectedColor(color2);
            }
            setIndicatorAnimationType(mo38288g(obtainStyledAttributes.getInteger(v55.CarouselView_indicatorAnimationType, 0)));
            setIndicatorRadius(obtainStyledAttributes.getInteger(v55.CarouselView_indicatorRadius, 5));
            setIndicatorPadding(obtainStyledAttributes.getInteger(v55.CarouselView_indicatorPadding, 5));
            setSize(obtainStyledAttributes.getInteger(v55.CarouselView_size, 0));
            setSpacing(obtainStyledAttributes.getInteger(v55.CarouselView_spacing, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public void mo38308m() throws NullPointerException {
        RecyclerView recyclerView = this.f25834e;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            throw new NullPointerException("Recycler view is not initialized");
        }
        this.f25834e.getAdapter().notifyDataSetChanged();
    }

    /* renamed from: n */
    public final void mo38309n() {
        mo38285d();
    }

    /* renamed from: o */
    public final void mo38310o() {
        boolean z;
        boolean z2;
        CarouselLinearLayoutManager carouselLinearLayoutManager = new CarouselLinearLayoutManager(this.f25832a, 0, false, this.f25840y);
        this.f25835g = carouselLinearLayoutManager;
        if (getCarouselOffset() == OffsetType.START) {
            z = true;
        } else {
            z = false;
        }
        carouselLinearLayoutManager.mo38283U2(z);
        if (getScaleOnScroll()) {
            this.f25835g.mo38284V2(true);
        }
        this.f25834e.setLayoutManager(this.f25835g);
        RecyclerView recyclerView = this.f25834e;
        zb0 carouselViewListener = getCarouselViewListener();
        int resource = getResource();
        int size = getSize();
        RecyclerView recyclerView2 = this.f25834e;
        int spacing = getSpacing();
        if (getCarouselOffset() == OffsetType.CENTER) {
            z2 = true;
        } else {
            z2 = false;
        }
        recyclerView.setAdapter(new yb0(carouselViewListener, resource, size, recyclerView2, spacing, z2));
        if (this.f25822A) {
            this.f25834e.setOnFlingListener((RecyclerView.C1249p) null);
            this.f25840y.mo9980b(this.f25834e);
        }
        mo38286e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAutoPlay(false);
    }

    /* renamed from: p */
    public void mo38312p() {
        mo38313q();
        mo38310o();
        mo38309n();
    }

    /* renamed from: q */
    public final void mo38313q() {
    }

    public void setAutoPlay(boolean z) {
        this.f25823B = z;
    }

    public void setAutoPlayDelay(int i) {
        this.f25824C = i;
    }

    public void setCarouselOffset(OffsetType offsetType) {
        this.f25839x = offsetType;
        int i = C5059b.f25842a[offsetType.ordinal()];
        if (i == 1) {
            this.f25840y = new C1329n();
        } else if (i == 2) {
            this.f25840y = new wb0();
        }
    }

    public void setCarouselScrollListener(vb0 vb0) {
        this.f25837r = vb0;
    }

    public void setCarouselViewListener(zb0 zb0) {
        this.f25836k = zb0;
    }

    public void setCurrentItem(int i) {
        if (i < 0) {
            this.f25830Q = 0;
        } else if (i >= getSize()) {
            this.f25830Q = getSize() - 1;
        } else {
            this.f25830Q = i;
        }
    }

    public void setIndicatorAnimationType(IndicatorAnimationType indicatorAnimationType) {
        this.f25838s = indicatorAnimationType;
        switch (C5059b.f25843b[indicatorAnimationType.ordinal()]) {
            case 1:
                this.f25833d.setAnimationType(AnimationType.DROP);
                return;
            case 2:
                this.f25833d.setAnimationType(AnimationType.FILL);
                return;
            case 3:
                this.f25833d.setAnimationType(AnimationType.NONE);
                return;
            case 4:
                this.f25833d.setAnimationType(AnimationType.SWAP);
                return;
            case 5:
                this.f25833d.setAnimationType(AnimationType.WORM);
                return;
            case 6:
                this.f25833d.setAnimationType(AnimationType.COLOR);
                return;
            case 7:
                this.f25833d.setAnimationType(AnimationType.SCALE);
                return;
            case 8:
                this.f25833d.setAnimationType(AnimationType.SLIDE);
                return;
            case 9:
                this.f25833d.setAnimationType(AnimationType.THIN_WORM);
                return;
            case 10:
                this.f25833d.setAnimationType(AnimationType.SCALE_DOWN);
                return;
            default:
                return;
        }
    }

    public void setIndicatorPadding(int i) {
        this.f25833d.setPadding(i);
    }

    public void setIndicatorRadius(int i) {
        this.f25833d.setRadius(i);
    }

    public void setIndicatorSelectedColor(int i) {
        this.f25833d.setSelectedColor(i);
    }

    public void setIndicatorUnselectedColor(int i) {
        this.f25833d.setUnselectedColor(i);
    }

    public void setResource(int i) {
        this.f25827L = i;
        this.f25831U = true;
    }

    public void setScaleOnScroll(boolean z) {
        this.f25826I = z;
    }

    public void setSize(int i) {
        this.f25828M = i;
        this.f25833d.setCount(i);
    }

    public void setSpacing(int i) {
        this.f25829P = i;
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25832a = context;
        mo38306j(attributeSet);
    }
}
