package p000;

import android.content.Context;

/* renamed from: h21 */
/* compiled from: DataTransportCrashlyticsReportSender */
public class h21 {

    /* renamed from: c */
    public static final iv0 f29417c = new iv0();

    /* renamed from: d */
    public static final String f29418d = m45014f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    public static final String f29419e = m45014f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    public static final tw6<av0, byte[]> f29420f = new f21();

    /* renamed from: a */
    public final fx6<av0> f29421a;

    /* renamed from: b */
    public final tw6<av0, byte[]> f29422b;

    public h21(fx6<av0> fx6, tw6<av0, byte[]> tw6) {
        this.f29421a = fx6;
        this.f29422b = tw6;
    }

    /* renamed from: c */
    public static h21 m45011c(Context context) {
        ox6.m49601f(context);
        qp1 b = qp1.m50725b("json");
        tw6<av0, byte[]> tw6 = f29420f;
        return new h21(ox6.m49599c().mo46563g(new n70(f29418d, f29419e)).mo43972a("FIREBASE_CRASHLYTICS_REPORT", av0.class, b, tw6), tw6);
    }

    /* renamed from: d */
    public static /* synthetic */ void m45012d(xl6 xl6, qv0 qv0, Exception exc) {
        if (exc != null) {
            xl6.mo49506d(exc);
        } else {
            xl6.mo49507e(qv0);
        }
    }

    /* renamed from: f */
    public static String m45014f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public tl6<qv0> mo43065g(qv0 qv0) {
        av0 b = qv0.mo42418b();
        xl6 xl6 = new xl6();
        this.f29421a.mo42687b(gt1.m44894e(b), new g21(xl6, qv0));
        return xl6.mo49503a();
    }
}
