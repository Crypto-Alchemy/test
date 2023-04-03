package com.jama.carouselview;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C1343v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

public class CarouselLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v1 */
    public boolean f25819v1;

    /* renamed from: w1 */
    public boolean f25820w1 = false;

    /* renamed from: x1 */
    public final C1343v f25821x1;

    public CarouselLinearLayoutManager(Context context, int i, boolean z, C1343v vVar) {
        super(context, i, z);
        this.f25821x1 = vVar;
    }

    /* renamed from: F1 */
    public int mo8822F1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        View T;
        int F1 = super.mo8822F1(i, tVar, xVar);
        if (this.f25820w1) {
            View h = this.f25821x1.mo9912h(this);
            int i2 = 0;
            while (i2 < mo9234U() && (T = mo9231T(i2)) != null && h != null) {
                float right = (float) (T.getRight() - T.getLeft());
                float left = ((float) T.getLeft()) + (right / 2.0f);
                if (!this.f25819v1) {
                    right = (float) mo9288v0();
                }
                float f = right / 2.0f;
                float f2 = 0.75f * f;
                float min = ((-0.39999998f * (Math.min(f2, Math.abs(f - left)) - Utils.FLOAT_EPSILON)) / (f2 - Utils.FLOAT_EPSILON)) + 1.0f;
                T.setScaleX(min);
                T.setScaleY(min);
                if (T.getX() == h.getX()) {
                    T.setAlpha(1.0f);
                } else {
                    T.setAlpha(min / 2.0f);
                }
                i2++;
            }
        }
        return F1;
    }

    /* renamed from: U2 */
    public void mo38283U2(boolean z) {
        this.f25819v1 = z;
    }

    /* renamed from: V2 */
    public void mo38284V2(boolean z) {
        this.f25820w1 = z;
    }

    /* renamed from: f1 */
    public void mo8850f1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        super.mo8850f1(tVar, xVar);
        mo8822F1(0, tVar, xVar);
    }
}
