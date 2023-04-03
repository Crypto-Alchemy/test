package p000;

import android.content.Context;
import androidx.work.C1515a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.mlkit.common.MlKitException;
import java.util.List;

/* renamed from: tm5 */
/* compiled from: Schedulers */
public class tm5 {

    /* renamed from: a */
    public static final String f18196a = qk3.m25728f("Schedulers");

    /* renamed from: a */
    public static om5 m27832a(Context context, nm7 nm7) {
        yk6 yk6 = new yk6(context, nm7);
        kk4.m20801a(context, SystemJobService.class, true);
        qk3.m25726c().mo25135a(f18196a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return yk6;
    }

    /* renamed from: b */
    public static void m27833b(C1515a aVar, WorkDatabase workDatabase, List<om5> list) {
        if (list != null && list.size() != 0) {
            bn7 N = workDatabase.mo10955N();
            workDatabase.mo10119e();
            try {
                List<an7> n = N.mo11723n(aVar.mo10912h());
                List<an7> j = N.mo11719j(MlKitException.CODE_SCANNER_UNAVAILABLE);
                if (n != null && n.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (an7 an7 : n) {
                        N.mo11721l(an7.f204a, currentTimeMillis);
                    }
                }
                workDatabase.mo10115C();
                if (n != null && n.size() > 0) {
                    an7[] an7Arr = (an7[]) n.toArray(new an7[n.size()]);
                    for (om5 next : list) {
                        if (next.mo24005d()) {
                            next.mo24004c(an7Arr);
                        }
                    }
                }
                if (j != null && j.size() > 0) {
                    an7[] an7Arr2 = (an7[]) j.toArray(new an7[j.size()]);
                    for (om5 next2 : list) {
                        if (!next2.mo24005d()) {
                            next2.mo24004c(an7Arr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo10124j();
            }
        }
    }
}
