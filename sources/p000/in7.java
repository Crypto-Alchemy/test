package p000;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: in7 */
/* compiled from: WorkerFactory */
public abstract class in7 {

    /* renamed from: a */
    public static final String f13336a = qk3.m25728f("WorkerFactory");

    /* renamed from: in7$a */
    /* compiled from: WorkerFactory */
    public class C2561a extends in7 {
        /* renamed from: a */
        public ListenableWorker mo21579a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static in7 m19728c() {
        return new C2561a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo21579a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo21580b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo21579a(context, str, workerParameters);
        if (a == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                qk3 c = qk3.m25726c();
                String str2 = f13336a;
                c.mo25136b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    qk3 c2 = qk3.m25726c();
                    String str3 = f13336a;
                    c2.mo25136b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.mo10877l()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
