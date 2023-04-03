package p000;

import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* renamed from: uo8 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class uo8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f34677a;

    /* renamed from: d */
    public final /* synthetic */ xl6 f34678d;

    public /* synthetic */ uo8(Callable callable, xl6 xl6) {
        this.f34677a = callable;
        this.f34678d = xl6;
    }

    public final void run() {
        Callable callable = this.f34677a;
        xl6 xl6 = this.f34678d;
        try {
            xl6.mo49505c(callable.call());
        } catch (MlKitException e) {
            xl6.mo49504b(e);
        } catch (Exception e2) {
            xl6.mo49504b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
        }
    }
}
