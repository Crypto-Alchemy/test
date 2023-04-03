package p000;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: o21 */
/* compiled from: DaysOfWeekAdapter */
public class o21 extends BaseAdapter {

    /* renamed from: g */
    public static final int f32264g;

    /* renamed from: a */
    public final Calendar f32265a;

    /* renamed from: d */
    public final int f32266d;

    /* renamed from: e */
    public final int f32267e;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f32264g = i;
    }

    public o21() {
        Calendar q = d67.m43375q();
        this.f32265a = q;
        this.f32266d = q.getMaximum(7);
        this.f32267e = q.getFirstDayOfWeek();
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f32266d) {
            return null;
        }
        return Integer.valueOf(mo46296b(i));
    }

    /* renamed from: b */
    public final int mo46296b(int i) {
        int i2 = i + this.f32267e;
        int i3 = this.f32266d;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    public int getCount() {
        return this.f32266d;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p000.c45.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f32265a
            int r6 = r5.mo46296b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f32265a
            int r3 = f32264g
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p000.y45.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f32265a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o21.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
