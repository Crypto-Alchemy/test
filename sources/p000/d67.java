package p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d67 */
/* compiled from: UtcDates */
public class d67 {

    /* renamed from: a */
    public static AtomicReference<kq6> f28039a = new AtomicReference<>();

    /* renamed from: a */
    public static long m43359a(long j) {
        Calendar q = m43375q();
        q.setTimeInMillis(j);
        return m43364f(q).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m43360b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m43361c(Locale locale) {
        return m43363e("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    public static DateFormat m43362d(Locale locale) {
        return m43363e("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: e */
    public static DateFormat m43363e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m43374p());
        return instanceForSkeleton;
    }

    /* renamed from: f */
    public static Calendar m43364f(Calendar calendar) {
        Calendar r = m43376r(calendar);
        Calendar q = m43375q();
        q.set(r.get(1), r.get(2), r.get(5));
        return q;
    }

    /* renamed from: g */
    public static java.text.DateFormat m43365g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m43372n());
        return dateInstance;
    }

    /* renamed from: h */
    public static java.text.DateFormat m43366h(Locale locale) {
        return m43365g(0, locale);
    }

    /* renamed from: i */
    public static java.text.DateFormat m43367i(Locale locale) {
        return m43365g(2, locale);
    }

    /* renamed from: j */
    public static java.text.DateFormat m43368j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m43367i(locale);
        simpleDateFormat.applyPattern(m43379u(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: k */
    public static SimpleDateFormat m43369k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m43372n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: l */
    public static String m43370l(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(y45.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(y45.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(y45.mtrl_picker_text_input_year_abbr));
    }

    /* renamed from: m */
    public static kq6 m43371m() {
        kq6 kq6 = f28039a.get();
        if (kq6 == null) {
            return kq6.m47464c();
        }
        return kq6;
    }

    /* renamed from: n */
    public static TimeZone m43372n() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: o */
    public static Calendar m43373o() {
        Calendar a = m43371m().mo45234a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m43372n());
        return a;
    }

    @TargetApi(24)
    /* renamed from: p */
    public static android.icu.util.TimeZone m43374p() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: q */
    public static Calendar m43375q() {
        return m43376r((Calendar) null);
    }

    /* renamed from: r */
    public static Calendar m43376r(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m43372n());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: s */
    public static DateFormat m43377s(Locale locale) {
        return m43363e("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: t */
    public static DateFormat m43378t(Locale locale) {
        return m43363e("yMMMEd", locale);
    }

    /* renamed from: u */
    public static String m43379u(String str) {
        int b = m43360b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m43360b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m43360b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
