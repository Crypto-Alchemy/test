package p000;

import android.text.TextUtils;
import com.google.firebase.installations.local.C4788b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: p77 */
/* compiled from: Utils */
public final class p77 {

    /* renamed from: b */
    public static final long f32589b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f32590c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static p77 f32591d;

    /* renamed from: a */
    public final ch0 f32592a;

    public p77(ch0 ch0) {
        this.f32592a = ch0;
    }

    /* renamed from: c */
    public static p77 m49814c() {
        return m49815d(gk6.m44739b());
    }

    /* renamed from: d */
    public static p77 m49815d(ch0 ch0) {
        if (f32591d == null) {
            f32591d = new p77(ch0);
        }
        return f32591d;
    }

    /* renamed from: g */
    public static boolean m49816g(String str) {
        return f32590c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m49817h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo46658a() {
        return this.f32592a.mo29974a();
    }

    /* renamed from: b */
    public long mo46659b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo46658a());
    }

    /* renamed from: e */
    public long mo46660e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo46661f(C4788b bVar) {
        if (!TextUtils.isEmpty(bVar.mo36133b()) && bVar.mo36140h() + bVar.mo36134c() >= mo46659b() + f32589b) {
            return false;
        }
        return true;
    }
}
