package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: kq6 */
/* compiled from: TimeSource */
public class kq6 {

    /* renamed from: c */
    public static final kq6 f31001c = new kq6((Long) null, (TimeZone) null);

    /* renamed from: a */
    public final Long f31002a;

    /* renamed from: b */
    public final TimeZone f31003b;

    public kq6(Long l, TimeZone timeZone) {
        this.f31002a = l;
        this.f31003b = timeZone;
    }

    /* renamed from: c */
    public static kq6 m47464c() {
        return f31001c;
    }

    /* renamed from: a */
    public Calendar mo45234a() {
        return mo45235b(this.f31003b);
    }

    /* renamed from: b */
    public Calendar mo45235b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f31002a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
