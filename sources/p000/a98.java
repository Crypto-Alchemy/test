package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class a98 implements Iterator<r88> {

    /* renamed from: a */
    public int f20847a = 0;

    /* renamed from: d */
    public final /* synthetic */ b98 f20848d;

    public a98(b98 b98) {
        this.f20848d = b98;
    }

    public final boolean hasNext() {
        if (this.f20847a < this.f20848d.f21193a.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f20847a < this.f20848d.f21193a.length()) {
            String j = this.f20848d.f21193a;
            int i = this.f20847a;
            this.f20847a = i + 1;
            return new b98(String.valueOf(j.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
