package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.NoSuchElementException;

/* renamed from: m09 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class m09 extends r09 {

    /* renamed from: a */
    public int f31470a = 0;

    /* renamed from: d */
    public final int f31471d;

    /* renamed from: e */
    public final /* synthetic */ zzjd f31472e;

    public m09(zzjd zzjd) {
        this.f31472e = zzjd;
        this.f31471d = zzjd.zzc();
    }

    public final boolean hasNext() {
        return this.f31470a < this.f31471d;
    }

    public final byte zza() {
        int i = this.f31470a;
        if (i < this.f31471d) {
            this.f31470a = i + 1;
            return this.f31472e.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
