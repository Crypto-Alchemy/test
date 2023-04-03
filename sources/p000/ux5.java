package p000;

import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.av0;

/* renamed from: ux5 */
/* compiled from: SessionReportingCoordinator */
public class ux5 {

    /* renamed from: a */
    public final bv0 f34749a;

    /* renamed from: b */
    public final pv0 f34750b;

    /* renamed from: c */
    public final h21 f34751c;

    /* renamed from: d */
    public final jk3 f34752d;

    /* renamed from: e */
    public final u57 f34753e;

    public ux5(bv0 bv0, pv0 pv0, h21 h21, jk3 jk3, u57 u57) {
        this.f34749a = bv0;
        this.f34750b = pv0;
        this.f34751c = h21;
        this.f34752d = jk3;
        this.f34753e = u57;
    }

    /* renamed from: e */
    public static av0.C3825a m53038e(ApplicationExitInfo applicationExitInfo) {
        String str;
        try {
            str = m53039f(applicationExitInfo.getTraceInputStream());
        } catch (IOException | NullPointerException e) {
            rk3 f = rk3.m51112f();
            f.mo47431k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
            str = null;
        }
        return av0.C3825a.m32033a().mo29162b(applicationExitInfo.getImportance()).mo29164d(applicationExitInfo.getProcessName()).mo29166f(applicationExitInfo.getReason()).mo29168h(applicationExitInfo.getTimestamp()).mo29163c(applicationExitInfo.getPid()).mo29165e(applicationExitInfo.getPss()).mo29167g(applicationExitInfo.getRss()).mo29169i(str).mo29161a();
    }

    /* renamed from: f */
    public static String m53039f(InputStream inputStream) throws IOException, NullPointerException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
        while (true) {
            try {
                int read = bufferedReader.read();
                if (read != -1) {
                    sb.append((char) read);
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: g */
    public static ux5 m53040g(Context context, zp2 zp2, y02 y02, C6670wn wnVar, jk3 jk3, u57 u57, w76 w76, az5 az5) {
        return new ux5(new bv0(context, zp2, wnVar, w76), new pv0(new File(y02.mo49577b()), az5), h21.m45011c(context), jk3, u57);
    }

    /* renamed from: j */
    public static List<av0.C3828c> m53041j(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(av0.C3828c.m32060a().mo29182b((String) next.getKey()).mo29183c((String) next.getValue()).mo29181a());
        }
        Collections.sort(arrayList, new sx5());
        return arrayList;
    }

    /* renamed from: c */
    public final av0.C3834e.C3841d mo48537c(av0.C3834e.C3841d dVar) {
        return mo48538d(dVar, this.f34752d, this.f34753e);
    }

    /* renamed from: d */
    public final av0.C3834e.C3841d mo48538d(av0.C3834e.C3841d dVar, jk3 jk3, u57 u57) {
        av0.C3834e.C3841d.C3856b g = dVar.mo29261g();
        String c = jk3.mo44477c();
        if (c != null) {
            g.mo29335d(av0.C3834e.C3841d.C3859d.m32247a().mo29353b(c).mo29352a());
        } else {
            rk3.m51112f().mo47429i("No log data to include with this event.");
        }
        List<av0.C3828c> j = m53041j(u57.mo48321a());
        List<av0.C3828c> j2 = m53041j(u57.mo48322b());
        if (!j.isEmpty()) {
            g.mo29333b(dVar.mo29256b().mo29267g().mo29270c(ms2.m48439e(j)).mo29272e(ms2.m48439e(j2)).mo29268a());
        }
        return g.mo29332a();
    }

    /* renamed from: h */
    public void mo48539h(String str, List<y34> list) {
        ArrayList arrayList = new ArrayList();
        for (y34 i : list) {
            av0.C3830d.C3832b i2 = i.mo43104i();
            if (i2 != null) {
                arrayList.add(i2);
            }
        }
        this.f34750b.mo46896o(str, av0.C3830d.m32066a().mo29187b(ms2.m48439e(arrayList)).mo29186a());
    }

    /* renamed from: i */
    public void mo48540i(long j, String str) {
        this.f34750b.mo46895n(str, j);
    }

    /* renamed from: k */
    public boolean mo48541k() {
        return this.f34750b.mo46900x();
    }

    /* renamed from: m */
    public List<String> mo48542m() {
        return this.f34750b.mo46886E();
    }

    /* renamed from: n */
    public void mo48543n(String str, long j) {
        this.f34750b.mo46889J(this.f34749a.mo29772d(str, j));
    }

    /* renamed from: o */
    public final boolean mo48544o(tl6<qv0> tl6) {
        if (tl6.mo48145p()) {
            qv0 l = tl6.mo48141l();
            rk3 f = rk3.m51112f();
            f.mo47423b("Crashlytics report successfully enqueued to DataTransport: " + l.mo42419c());
            this.f34750b.mo46894m(l.mo42419c());
            return true;
        }
        rk3.m51112f().mo47432l("Crashlytics report could not be enqueued to DataTransport", tl6.mo48140k());
        return false;
    }

    /* renamed from: p */
    public void mo48545p(String str, ApplicationExitInfo applicationExitInfo, jk3 jk3, u57 u57) {
        if (applicationExitInfo.getTimestamp() >= this.f34750b.mo46899w(str) && applicationExitInfo.getReason() == 6) {
            av0.C3834e.C3841d b = this.f34749a.mo29770b(m53038e(applicationExitInfo));
            rk3 f = rk3.m51112f();
            f.mo47423b("Persisting anr for session " + str);
            this.f34750b.mo46888I(mo48538d(b, jk3, u57), str, true);
        }
    }

    /* renamed from: q */
    public final void mo48546q(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        av0.C3834e.C3841d c = this.f34749a.mo29771c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f34750b.mo46888I(mo48537c(c), str, equals);
    }

    /* renamed from: r */
    public void mo48547r(Throwable th, Thread thread, String str, long j) {
        rk3 f = rk3.m51112f();
        f.mo47429i("Persisting fatal event for session " + str);
        mo48546q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void mo48548s() {
        this.f34750b.mo46893l();
    }

    /* renamed from: t */
    public tl6<Void> mo48549t(Executor executor) {
        List<qv0> F = this.f34750b.mo46887F();
        ArrayList arrayList = new ArrayList();
        for (qv0 g : F) {
            arrayList.add(this.f34751c.mo43065g(g).mo48138i(executor, new tx5(this)));
        }
        return jm6.m46620f(arrayList);
    }
}
