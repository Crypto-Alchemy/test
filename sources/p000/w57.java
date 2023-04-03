package p000;

import com.onesignal.C5261i1;
import org.json.JSONException;

/* renamed from: w57 */
/* compiled from: UserStatePush */
public class w57 extends C5261i1 {
    public w57(String str, boolean z) {
        super(str, z);
    }

    /* renamed from: A */
    public final int mo48894A() {
        int d = mo38892i().mo45508d("subscribableStatus", 1);
        if (d < -2) {
            return d;
        }
        if (!mo38892i().mo45507c("androidPermission", true)) {
            return 0;
        }
        if (!mo38892i().mo45507c("userSubscribePref", true)) {
            return -2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo38885a() {
        try {
            mo38903t("notification_types", Integer.valueOf(mo48894A()));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: p */
    public C5261i1 mo38899p(String str) {
        return new w57(str, false);
    }
}
