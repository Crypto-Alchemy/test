package p000;

import com.google.android.gms.internal.vision.C4127k;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;

/* renamed from: s48 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class s48 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33712a;

    /* renamed from: d */
    public final /* synthetic */ C4127k f33713d;

    /* renamed from: e */
    public final /* synthetic */ DynamiteClearcutLogger f33714e;

    public s48(DynamiteClearcutLogger dynamiteClearcutLogger, int i, C4127k kVar) {
        this.f33714e = dynamiteClearcutLogger;
        this.f33712a = i;
        this.f33713d = kVar;
    }

    public final void run() {
        this.f33714e.zzc.zza(this.f33712a, this.f33713d);
    }
}
