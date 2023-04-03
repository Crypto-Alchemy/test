package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0004R\u001c\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Ln21;", "", "", "timeStamp", "", "a", "b", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "Ljava/util/Locale;", "LOCALE", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "FORMAT_DATE_TIME", "d", "TIMESTAMP_FORMAT_SIMPLE_DATE", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n21 */
/* compiled from: DateTimeUtils.kt */
public final class n21 {

    /* renamed from: a */
    public static final n21 f41027a = new n21();

    /* renamed from: b */
    public static final Locale f41028b;

    /* renamed from: c */
    public static final SimpleDateFormat f41029c;

    /* renamed from: d */
    public static final SimpleDateFormat f41030d;

    static {
        Locale locale = Locale.US;
        f41028b = locale;
        f41029c = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss aa", locale);
        f41030d = new SimpleDateFormat(BlipsFormatHelper.BLIPS_DATE_FORMAT, locale);
    }

    /* renamed from: a */
    public final String mo56349a(long j) {
        String format = f41029c.format(new Date(j));
        vx2.m53590f(format, "FORMAT_DATE_TIME.format(Date(timeStamp))");
        return format;
    }

    /* renamed from: b */
    public final long mo56350b(String str) {
        vx2.m53591g(str, "<this>");
        Date parse = f41030d.parse(str);
        if (parse == null) {
            parse = new Date();
        }
        return parse.getTime();
    }
}
