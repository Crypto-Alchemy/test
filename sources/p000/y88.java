package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y88 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class y88 implements Iterator<r88> {

    /* renamed from: a */
    public int f35798a = 0;

    /* renamed from: d */
    public final /* synthetic */ b98 f35799d;

    public y88(b98 b98) {
        this.f35799d = b98;
    }

    public final boolean hasNext() {
        if (this.f35798a < this.f35799d.f21193a.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f35798a < this.f35799d.f21193a.length()) {
            int i = this.f35798a;
            this.f35798a = i + 1;
            return new b98(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
