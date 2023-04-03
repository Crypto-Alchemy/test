package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.NoSuchElementException;

/* renamed from: hx8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class hx8 extends mx8 {

    /* renamed from: a */
    public int f29753a = 0;

    /* renamed from: d */
    public final int f29754d;

    /* renamed from: e */
    public final /* synthetic */ zzht f29755e;

    public hx8(zzht zzht) {
        this.f29755e = zzht;
        this.f29754d = zzht.zza();
    }

    public final boolean hasNext() {
        if (this.f29753a < this.f29754d) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i = this.f29753a;
        if (i < this.f29754d) {
            this.f29753a = i + 1;
            return this.f29755e.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
