package p000;

import android.util.Pair;
import android.view.View;
import com.p011rd.animation.type.AnimationType;
import com.p011rd.draw.data.Orientation;

/* renamed from: kq3 */
/* compiled from: MeasureController */
public class kq3 {
    /* renamed from: a */
    public Pair<Integer, Integer> mo45233a(zt2 zt2, int i, int i2) {
        int i3;
        int i4;
        zt2 zt22 = zt2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int c = zt2.mo49947c();
        int m = zt2.mo49957m();
        int s = zt2.mo49963s();
        int h = zt2.mo49952h();
        int j = zt2.mo49954j();
        int l = zt2.mo49956l();
        int k = zt2.mo49955k();
        int i5 = zt2.mo49953i();
        int i6 = m * 2;
        Orientation g = zt2.mo49951g();
        int i7 = 0;
        if (c != 0) {
            i3 = (i6 * c) + (s * 2 * c) + (h * (c - 1));
            i4 = i6 + s;
            if (g != Orientation.HORIZONTAL) {
                int i8 = i3;
                i3 = i4;
                i4 = i8;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (zt2.mo49946b() == AnimationType.DROP) {
            if (g == Orientation.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        Orientation orientation = Orientation.HORIZONTAL;
        int i9 = i3 + j + k;
        int i10 = i4 + l + i5;
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i9, size);
            } else {
                size = i9;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i10, size2);
            } else {
                size2 = i10;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i7 = size2;
        }
        zt22.mo49945a0(size);
        zt22.mo49924G(i7);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i7));
    }
}
