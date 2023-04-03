package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lb8 */
public final class lb8 implements Iterator {

    /* renamed from: a */
    public int f31282a = 0;

    /* renamed from: d */
    public final int f31283d;

    /* renamed from: e */
    public final /* synthetic */ zzbb f31284e;

    public lb8(zzbb zzbb) {
        this.f31284e = zzbb;
        this.f31283d = zzbb.size();
    }

    /* renamed from: e */
    public final byte mo45407e() {
        try {
            zzbb zzbb = this.f31284e;
            int i = this.f31282a;
            this.f31282a = i + 1;
            return zzbb.zzj(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f31282a < this.f31283d;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(mo45407e());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
