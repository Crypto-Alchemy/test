package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: j90 */
/* compiled from: CalendarStyle */
public final class j90 {

    /* renamed from: a */
    public final i90 f30249a;

    /* renamed from: b */
    public final i90 f30250b;

    /* renamed from: c */
    public final i90 f30251c;

    /* renamed from: d */
    public final i90 f30252d;

    /* renamed from: e */
    public final i90 f30253e;

    /* renamed from: f */
    public final i90 f30254f;

    /* renamed from: g */
    public final i90 f30255g;

    /* renamed from: h */
    public final Paint f30256h;

    public j90(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(oo3.m49372c(context, j15.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), u55.MaterialCalendar);
        this.f30249a = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_dayStyle, 0));
        this.f30255g = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_dayInvalidStyle, 0));
        this.f30250b = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_daySelectedStyle, 0));
        this.f30251c = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList b = to3.m52391b(context, obtainStyledAttributes, u55.MaterialCalendar_rangeFillColor);
        this.f30252d = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_yearStyle, 0));
        this.f30253e = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_yearSelectedStyle, 0));
        this.f30254f = i90.m45584a(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f30256h = paint;
        paint.setColor(b.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
