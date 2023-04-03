package p000;

import android.view.View;
import android.view.WindowId;

/* renamed from: dl7 */
/* compiled from: WindowIdApi18 */
public class dl7 implements el7 {

    /* renamed from: a */
    public final WindowId f10783a;

    public dl7(View view) {
        this.f10783a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dl7) || !((dl7) obj).f10783a.equals(this.f10783a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f10783a.hashCode();
    }
}
