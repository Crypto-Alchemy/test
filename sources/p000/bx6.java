package p000;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bx6 */
/* compiled from: TransitionValues */
public class bx6 {

    /* renamed from: a */
    public final Map<String, Object> f8291a = new HashMap();

    /* renamed from: b */
    public View f8292b;

    /* renamed from: c */
    public final ArrayList<Transition> f8293c = new ArrayList<>();

    @Deprecated
    public bx6() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bx6)) {
            return false;
        }
        bx6 bx6 = (bx6) obj;
        if (this.f8292b != bx6.f8292b || !this.f8291a.equals(bx6.f8291a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f8292b.hashCode() * 31) + this.f8291a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f8292b + "\n") + "    values:";
        for (String next : this.f8291a.keySet()) {
            str = str + "    " + next + ": " + this.f8291a.get(next) + "\n";
        }
        return str;
    }

    public bx6(View view) {
        this.f8292b = view;
    }
}
