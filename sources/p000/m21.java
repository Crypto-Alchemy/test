package p000;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: m21 */
/* compiled from: DateStrings */
public class m21 {
    /* renamed from: a */
    public static jl4<String, String> m48033a(Long l, Long l2) {
        return m48034b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    public static jl4<String, String> m48034b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return jl4.m20216a(null, null);
        }
        if (l == null) {
            return jl4.m20216a(null, m48036d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return jl4.m20216a(m48036d(l.longValue(), simpleDateFormat), null);
        }
        Calendar o = d67.m43373o();
        Calendar q = d67.m43375q();
        q.setTimeInMillis(l.longValue());
        Calendar q2 = d67.m43375q();
        q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return jl4.m20216a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (q.get(1) != q2.get(1)) {
            return jl4.m20216a(m48043k(l.longValue(), Locale.getDefault()), m48043k(l2.longValue(), Locale.getDefault()));
        } else {
            if (q.get(1) == o.get(1)) {
                return jl4.m20216a(m48038f(l.longValue(), Locale.getDefault()), m48038f(l2.longValue(), Locale.getDefault()));
            }
            return jl4.m20216a(m48038f(l.longValue(), Locale.getDefault()), m48043k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    public static String m48035c(long j) {
        return m48036d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    public static String m48036d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar o = d67.m43373o();
        Calendar q = d67.m43375q();
        q.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (o.get(1) == q.get(1)) {
            return m48037e(j);
        }
        return m48042j(j);
    }

    /* renamed from: e */
    public static String m48037e(long j) {
        return m48038f(j, Locale.getDefault());
    }

    /* renamed from: f */
    public static String m48038f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d67.m43361c(locale).format(new Date(j));
        }
        return d67.m43368j(locale).format(new Date(j));
    }

    /* renamed from: g */
    public static String m48039g(long j) {
        return m48040h(j, Locale.getDefault());
    }

    /* renamed from: h */
    public static String m48040h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d67.m43362d(locale).format(new Date(j));
        }
        return d67.m43366h(locale).format(new Date(j));
    }

    /* renamed from: i */
    public static String m48041i(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }

    /* renamed from: j */
    public static String m48042j(long j) {
        return m48043k(j, Locale.getDefault());
    }

    /* renamed from: k */
    public static String m48043k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d67.m43377s(locale).format(new Date(j));
        }
        return d67.m43367i(locale).format(new Date(j));
    }

    /* renamed from: l */
    public static String m48044l(long j) {
        return m48045m(j, Locale.getDefault());
    }

    /* renamed from: m */
    public static String m48045m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d67.m43378t(locale).format(new Date(j));
        }
        return d67.m43366h(locale).format(new Date(j));
    }
}
