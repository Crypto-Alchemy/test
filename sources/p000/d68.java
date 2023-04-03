package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d68 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class d68 implements Iterator<r88> {

    /* renamed from: a */
    public int f28040a = 0;

    /* renamed from: d */
    public final /* synthetic */ k68 f28041d;

    public d68(k68 k68) {
        this.f28041d = k68;
    }

    public final boolean hasNext() {
        if (this.f28040a < this.f28041d.mo44682t()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f28040a < this.f28041d.mo44682t()) {
            k68 k68 = this.f28041d;
            int i = this.f28040a;
            this.f28040a = i + 1;
            return k68.mo44685w(i);
        }
        int i2 = this.f28040a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
