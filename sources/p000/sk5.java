package p000;

import com.zendesk.logger.Logger;

/* renamed from: sk5 */
/* compiled from: SafeZendeskCallback */
public class sk5<T> extends op7<T> {

    /* renamed from: a */
    public boolean f33924a = false;

    /* renamed from: b */
    public final op7<T> f33925b;

    public sk5(op7<T> op7) {
        this.f33925b = op7;
    }

    /* renamed from: a */
    public static <T> sk5<T> m51823a(op7<T> op7) {
        return new sk5<>(op7);
    }

    public void cancel() {
        this.f33924a = true;
    }

    public void onError(hr1 hr1) {
        op7<T> op7;
        if (this.f33924a || (op7 = this.f33925b) == null) {
            Logger.m43079c("SafeZendeskCallback", hr1);
        } else {
            op7.onError(hr1);
        }
    }

    public void onSuccess(T t) {
        op7<T> op7;
        if (this.f33924a || (op7 = this.f33925b) == null) {
            Logger.m43087k("SafeZendeskCallback", "Operation was a success but callback is null or was cancelled", new Object[0]);
        } else {
            op7.onSuccess(t);
        }
    }
}
