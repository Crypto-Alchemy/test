package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {

    /* renamed from: s */
    public static final String f7679s = qk3.m25728f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: s */
    public static String m10669s(an7 an7, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{an7.f204a, an7.f206c, num, an7.f205b.name(), str, str2});
    }

    /* renamed from: t */
    public static String m10670t(qm7 qm7, en7 en7, nk6 nk6, List<an7> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        for (an7 next : list) {
            Integer num = null;
            mk6 a = nk6.mo23713a(next.f204a);
            if (a != null) {
                num = Integer.valueOf(a.f14998b);
            }
            sb.append(m10669s(next, TextUtils.join(",", qm7.mo25155b(next.f204a)), num, TextUtils.join(",", en7.mo19428a(next.f204a))));
        }
        return sb.toString();
    }

    /* renamed from: r */
    public ListenableWorker.C1509a mo10897r() {
        WorkDatabase q = nm7.m23322m(mo10869a()).mo23743q();
        bn7 N = q.mo10955N();
        qm7 L = q.mo10953L();
        en7 O = q.mo10956O();
        nk6 K = q.mo10952K();
        List<an7> b = N.mo11710b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<an7> p = N.mo11725p();
        List<an7> j = N.mo11719j(MlKitException.CODE_SCANNER_UNAVAILABLE);
        if (b != null && !b.isEmpty()) {
            qk3 c = qk3.m25726c();
            String str = f7679s;
            c.mo25137d(str, "Recently completed work:\n\n", new Throwable[0]);
            qk3.m25726c().mo25137d(str, m10670t(L, O, K, b), new Throwable[0]);
        }
        if (p != null && !p.isEmpty()) {
            qk3 c2 = qk3.m25726c();
            String str2 = f7679s;
            c2.mo25137d(str2, "Running work:\n\n", new Throwable[0]);
            qk3.m25726c().mo25137d(str2, m10670t(L, O, K, p), new Throwable[0]);
        }
        if (j != null && !j.isEmpty()) {
            qk3 c3 = qk3.m25726c();
            String str3 = f7679s;
            c3.mo25137d(str3, "Enqueued work:\n\n", new Throwable[0]);
            qk3.m25726c().mo25137d(str3, m10670t(L, O, K, j), new Throwable[0]);
        }
        return ListenableWorker.C1509a.m10434c();
    }
}
