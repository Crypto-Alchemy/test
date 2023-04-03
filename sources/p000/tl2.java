package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: tl2 */
/* compiled from: HeartBeatInfoStorage */
public class tl2 {

    /* renamed from: c */
    public static tl2 f34300c;

    /* renamed from: d */
    public static final SimpleDateFormat f34301d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    public final SharedPreferences f34302a;

    /* renamed from: b */
    public final SharedPreferences f34303b;

    public tl2(Context context) {
        this.f34302a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f34303b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* renamed from: a */
    public static synchronized tl2 m52354a(Context context) {
        tl2 tl2;
        synchronized (tl2.class) {
            if (f34300c == null) {
                f34300c = new tl2(context);
            }
            tl2 = f34300c;
        }
        return tl2;
    }

    /* renamed from: b */
    public static boolean m52355b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f34301d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* renamed from: c */
    public synchronized boolean mo48128c(long j) {
        return mo48129d("fire-global", j);
    }

    /* renamed from: d */
    public synchronized boolean mo48129d(String str, long j) {
        if (!this.f34302a.contains(str)) {
            this.f34302a.edit().putLong(str, j).apply();
            return true;
        } else if (!m52355b(this.f34302a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f34302a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
