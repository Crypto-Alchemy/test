package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.av0;

/* renamed from: bv0 */
/* compiled from: CrashlyticsReportDataCapture */
public class bv0 {

    /* renamed from: e */
    public static final Map<String, Integer> f21495e;

    /* renamed from: f */
    public static final String f21496f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.0"});

    /* renamed from: a */
    public final Context f21497a;

    /* renamed from: b */
    public final zp2 f21498b;

    /* renamed from: c */
    public final C6670wn f21499c;

    /* renamed from: d */
    public final w76 f21500d;

    static {
        HashMap hashMap = new HashMap();
        f21495e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public bv0(Context context, zp2 zp2, C6670wn wnVar, w76 w76) {
        this.f21497a = context;
        this.f21498b = zp2;
        this.f21499c = wnVar;
        this.f21500d = w76;
    }

    /* renamed from: e */
    public static int m32756e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f21495e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: a */
    public final av0.C3827b mo29769a() {
        return av0.m32020b().mo29177h("18.2.0").mo29173d(this.f21499c.f35391a).mo29174e(this.f21498b.mo48534a()).mo29171b(this.f21499c.f35395e).mo29172c(this.f21499c.f35396f).mo29176g(4);
    }

    /* renamed from: b */
    public av0.C3834e.C3841d mo29770b(av0.C3825a aVar) {
        int i = this.f21497a.getResources().getConfiguration().orientation;
        return av0.C3834e.C3841d.m32143a().mo29337f("anr").mo29336e(aVar.mo29159h()).mo29333b(mo29775h(i, aVar)).mo29334c(mo29777j(i)).mo29332a();
    }

    /* renamed from: c */
    public av0.C3834e.C3841d mo29771c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f21497a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return av0.C3834e.C3841d.m32143a().mo29337f(str).mo29336e(j).mo29333b(mo29776i(i3, new by6(th, this.f21500d), thread, i, i2, z)).mo29334c(mo29777j(i3)).mo29332a();
    }

    /* renamed from: d */
    public av0 mo29772d(String str, long j) {
        return mo29769a().mo29178i(mo29785r(str, j)).mo29170a();
    }

    /* renamed from: f */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3845a mo29773f() {
        return av0.C3834e.C3841d.C3842a.C3844b.C3845a.m32169a().mo29285b(0).mo29287d(0).mo29286c(this.f21499c.f35394d).mo29288e(this.f21499c.f35392b).mo29284a();
    }

    /* renamed from: g */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> mo29774g() {
        return ms2.m48440j(mo29773f());
    }

    /* renamed from: h */
    public final av0.C3834e.C3841d.C3842a mo29775h(int i, av0.C3825a aVar) {
        boolean z;
        if (aVar.mo29153b() != 100) {
            z = true;
        } else {
            z = false;
        }
        return av0.C3834e.C3841d.C3842a.m32150a().mo29269b(Boolean.valueOf(z)).mo29273f(i).mo29271d(mo29780m(aVar)).mo29268a();
    }

    /* renamed from: i */
    public final av0.C3834e.C3841d.C3842a mo29776i(int i, by6 by6, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        ActivityManager.RunningAppProcessInfo j = CommonUtils.m38407j(this.f21499c.f35394d, this.f21497a);
        if (j != null) {
            if (j.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return av0.C3834e.C3841d.C3842a.m32150a().mo29269b(bool).mo29273f(i).mo29271d(mo29781n(by6, thread, i2, i3, z)).mo29268a();
    }

    /* renamed from: j */
    public final av0.C3834e.C3841d.C3857c mo29777j(int i) {
        Double d;
        l00 a = l00.m47582a(this.f21497a);
        Float b = a.mo45317b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.mo45318c();
        boolean o = CommonUtils.m38412o(this.f21497a);
        long s = CommonUtils.m38416s() - CommonUtils.m38398a(this.f21497a);
        return av0.C3834e.C3841d.C3857c.m32233a().mo29345b(d).mo29346c(c).mo29349f(o).mo29348e(i).mo29350g(s).mo29347d(CommonUtils.m38399b(Environment.getDataDirectory().getPath())).mo29344a();
    }

    /* renamed from: k */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3848c mo29778k(by6 by6, int i, int i2) {
        return mo29779l(by6, i, i2, 0);
    }

    /* renamed from: l */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3848c mo29779l(by6 by6, int i, int i2, int i3) {
        String str = by6.f21514b;
        String str2 = by6.f21513a;
        StackTraceElement[] stackTraceElementArr = by6.f21515c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        by6 by62 = by6.f21516d;
        if (i3 >= i2) {
            by6 by63 = by62;
            while (by63 != null) {
                by63 = by63.f21516d;
                i4++;
            }
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a d = av0.C3834e.C3841d.C3842a.C3844b.C3848c.m32187a().mo29306f(str).mo29305e(str2).mo29303c(ms2.m48439e(mo29783p(stackTraceElementArr, i))).mo29304d(i4);
        if (by62 != null && i4 == 0) {
            d.mo29302b(mo29779l(by62, i, i2, i3 + 1));
        }
        return d.mo29301a();
    }

    /* renamed from: m */
    public final av0.C3834e.C3841d.C3842a.C3844b mo29780m(av0.C3825a aVar) {
        return av0.C3834e.C3841d.C3842a.C3844b.m32163a().mo29291b(aVar).mo29294e(mo29788u()).mo29292c(mo29774g()).mo29290a();
    }

    /* renamed from: n */
    public final av0.C3834e.C3841d.C3842a.C3844b mo29781n(by6 by6, Thread thread, int i, int i2, boolean z) {
        return av0.C3834e.C3841d.C3842a.C3844b.m32163a().mo29295f(mo29791x(by6, thread, i, z)).mo29293d(mo29778k(by6, i, i2)).mo29294e(mo29788u()).mo29292c(mo29774g()).mo29290a();
    }

    /* renamed from: o */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b mo29782o(StackTraceElement stackTraceElement, av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a aVar) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max((long) stackTraceElement.getLineNumber(), 0);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo29330e(j).mo29331f(str).mo29327b(fileName).mo29329d(j2).mo29326a();
    }

    /* renamed from: p */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> mo29783p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            arrayList.add(mo29782o(o, av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.m32215a().mo29328c(i)));
        }
        return ms2.m48439e(arrayList);
    }

    /* renamed from: q */
    public final av0.C3834e.C3835a mo29784q() {
        av0.C3834e.C3835a.C3836a f = av0.C3834e.C3835a.m32094a().mo29220e(this.f21498b.mo49897f()).mo29222g(this.f21499c.f35395e).mo29219d(this.f21499c.f35396f).mo29221f(this.f21498b.mo48534a());
        String a = this.f21499c.f35397g.mo48103a();
        if (a != null) {
            f.mo29217b("Unity").mo29218c(a);
        }
        return f.mo29216a();
    }

    /* renamed from: r */
    public final av0.C3834e mo29785r(String str, long j) {
        return av0.C3834e.m32078a().mo29235l(j).mo29232i(str).mo29230g(f21496f).mo29225b(mo29784q()).mo29234k(mo29787t()).mo29227d(mo29786s()).mo29231h(3).mo29224a();
    }

    /* renamed from: s */
    public final av0.C3834e.C3839c mo29786s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m32756e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = CommonUtils.m38416s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean x = CommonUtils.m38421x(this.f21497a);
        int m = CommonUtils.m38410m(this.f21497a);
        String str = Build.MANUFACTURER;
        return av0.C3834e.C3839c.m32123a().mo29247b(e).mo29251f(Build.MODEL).mo29248c(availableProcessors).mo29253h(s).mo29249d(blockCount).mo29254i(x).mo29255j(m).mo29250e(str).mo29252g(Build.PRODUCT).mo29246a();
    }

    /* renamed from: t */
    public final av0.C3834e.C3861e mo29787t() {
        return av0.C3834e.C3861e.m32251a().mo29361d(3).mo29362e(Build.VERSION.RELEASE).mo29359b(Build.VERSION.CODENAME).mo29360c(CommonUtils.m38422y(this.f21497a)).mo29358a();
    }

    /* renamed from: u */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3850d mo29788u() {
        return av0.C3834e.C3841d.C3842a.C3844b.C3850d.m32199a().mo29313d("0").mo29312c("0").mo29311b(0).mo29310a();
    }

    /* renamed from: v */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3852e mo29789v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return mo29790w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3852e mo29790w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return av0.C3834e.C3841d.C3842a.C3844b.C3852e.m32207a().mo29320d(thread.getName()).mo29319c(i).mo29318b(ms2.m48439e(mo29783p(stackTraceElementArr, i))).mo29317a();
    }

    /* renamed from: x */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> mo29791x(by6 by6, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo29790w(thread, by6.f21515c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(mo29789v(thread2, this.f21500d.mo47281a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return ms2.m48439e(arrayList);
    }
}
