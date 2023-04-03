package p000;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import p000.tb2;

/* renamed from: ee1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class ee1<T> {

    /* renamed from: a */
    public final Object f28588a = new Object();

    /* renamed from: b */
    public C5790b<T> f28589b;

    /* renamed from: ee1$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C5789a<T> {

        /* renamed from: a */
        public final SparseArray<T> f28590a;

        /* renamed from: b */
        public final tb2.C6521b f28591b;

        /* renamed from: c */
        public final boolean f28592c;

        public C5789a(@RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull tb2.C6521b bVar, boolean z) {
            this.f28590a = sparseArray;
            this.f28591b = bVar;
            this.f28592c = z;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public SparseArray<T> mo42284a() {
            return this.f28590a;
        }
    }

    /* renamed from: ee1$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public interface C5790b<T> {
        /* renamed from: a */
        void mo42285a();

        /* renamed from: b */
        void mo42286b(@RecentlyNonNull C5789a<T> aVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public abstract SparseArray<T> mo42279a(@RecentlyNonNull tb2 tb2);

    /* renamed from: b */
    public boolean mo42280b() {
        return true;
    }

    /* renamed from: c */
    public void mo42281c(@RecentlyNonNull tb2 tb2) {
        tb2.C6521b bVar = new tb2.C6521b(tb2.mo48046c());
        bVar.mo48060i();
        C5789a aVar = new C5789a(mo42279a(tb2), bVar, mo42280b());
        synchronized (this.f28588a) {
            C5790b<T> bVar2 = this.f28589b;
            if (bVar2 != null) {
                bVar2.mo42286b(aVar);
            } else {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
        }
    }

    /* renamed from: d */
    public void mo42282d() {
        synchronized (this.f28588a) {
            C5790b<T> bVar = this.f28589b;
            if (bVar != null) {
                bVar.mo42285a();
                this.f28589b = null;
            }
        }
    }

    /* renamed from: e */
    public void mo42283e(@RecentlyNonNull C5790b<T> bVar) {
        synchronized (this.f28588a) {
            C5790b<T> bVar2 = this.f28589b;
            if (bVar2 != null) {
                bVar2.mo42285a();
            }
            this.f28589b = bVar;
        }
    }
}
