package p000;

import p018io.reactivex.internal.util.NotificationLite;

/* renamed from: ho */
/* compiled from: AppendOnlyLinkedArrayList */
public class C5927ho<T> {

    /* renamed from: a */
    public final int f29678a;

    /* renamed from: b */
    public final Object[] f29679b;

    /* renamed from: c */
    public Object[] f29680c;

    /* renamed from: d */
    public int f29681d;

    /* renamed from: ho$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C5928a<T> extends iu4<T> {
        boolean test(T t);
    }

    public C5927ho(int i) {
        this.f29678a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f29679b = objArr;
        this.f29680c = objArr;
    }

    /* renamed from: a */
    public <U> boolean mo43335a(nc6<? super U> nc6) {
        Object[] objArr = this.f29679b;
        int i = this.f29678a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, nc6)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43336b(T r4) {
        /*
            r3 = this;
            int r0 = r3.f29678a
            int r1 = r3.f29681d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f29680c
            r2[r0] = r1
            r3.f29680c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f29680c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f29681d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5927ho.mo43336b(java.lang.Object):void");
    }

    /* renamed from: c */
    public void mo43337c(C5928a<? super T> aVar) {
        int i = this.f29678a;
        for (Object[] objArr = this.f29679b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo43338d(T t) {
        this.f29679b[0] = t;
    }
}
