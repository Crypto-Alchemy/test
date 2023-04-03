package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1268a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: OpReorderer */
public class C1332p {

    /* renamed from: a */
    public final C1333a f6826a;

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* compiled from: OpReorderer */
    public interface C1333a {
        /* renamed from: a */
        C1268a.C1270b mo9656a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo9657b(C1268a.C1270b bVar);
    }

    public C1332p(C1333a aVar) {
        this.f6826a = aVar;
    }

    /* renamed from: a */
    public final int mo9925a(List<C1268a.C1270b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f6600a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo9926b(List<C1268a.C1270b> list) {
        while (true) {
            int a = mo9925a(list);
            if (a != -1) {
                mo9928d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo9927c(List<C1268a.C1270b> list, int i, C1268a.C1270b bVar, int i2, C1268a.C1270b bVar2) {
        int i3;
        int i4 = bVar.f6603d;
        int i5 = bVar2.f6601b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = bVar.f6601b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            bVar.f6601b = i6 + bVar2.f6603d;
        }
        int i7 = bVar2.f6601b;
        if (i7 <= i4) {
            bVar.f6603d = i4 + bVar2.f6603d;
        }
        bVar2.f6601b = i7 + i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    public final void mo9928d(List<C1268a.C1270b> list, int i, int i2) {
        C1268a.C1270b bVar = list.get(i);
        C1268a.C1270b bVar2 = list.get(i2);
        int i3 = bVar2.f6600a;
        if (i3 == 1) {
            mo9927c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo9929e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo9930f(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: e */
    public void mo9929e(List<C1268a.C1270b> list, int i, C1268a.C1270b bVar, int i2, C1268a.C1270b bVar2) {
        boolean z;
        int i3 = bVar.f6601b;
        int i4 = bVar.f6603d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f6601b == i3 && bVar2.f6603d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f6601b == i4 + 1 && bVar2.f6603d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f6601b;
        if (i4 < i5) {
            bVar2.f6601b = i5 - 1;
        } else {
            int i6 = bVar2.f6603d;
            if (i4 < i5 + i6) {
                bVar2.f6603d = i6 - 1;
                bVar.f6600a = 2;
                bVar.f6603d = 1;
                if (bVar2.f6603d == 0) {
                    list.remove(i2);
                    this.f6826a.mo9657b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f6601b;
        int i8 = bVar2.f6601b;
        C1268a.C1270b bVar3 = null;
        if (i7 <= i8) {
            bVar2.f6601b = i8 + 1;
        } else {
            int i9 = bVar2.f6603d;
            if (i7 < i8 + i9) {
                bVar3 = this.f6826a.mo9656a(2, i7 + 1, (i8 + i9) - i7, (Object) null);
                bVar2.f6603d = bVar.f6601b - bVar2.f6601b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f6826a.mo9657b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.f6601b;
                if (i10 > bVar3.f6601b) {
                    bVar.f6601b = i10 - bVar3.f6603d;
                }
                int i11 = bVar.f6603d;
                if (i11 > bVar3.f6601b) {
                    bVar.f6603d = i11 - bVar3.f6603d;
                }
            }
            int i12 = bVar.f6601b;
            if (i12 > bVar2.f6601b) {
                bVar.f6601b = i12 - bVar2.f6603d;
            }
            int i13 = bVar.f6603d;
            if (i13 > bVar2.f6601b) {
                bVar.f6603d = i13 - bVar2.f6603d;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.f6601b;
                if (i14 >= bVar3.f6601b) {
                    bVar.f6601b = i14 - bVar3.f6603d;
                }
                int i15 = bVar.f6603d;
                if (i15 >= bVar3.f6601b) {
                    bVar.f6603d = i15 - bVar3.f6603d;
                }
            }
            int i16 = bVar.f6601b;
            if (i16 >= bVar2.f6601b) {
                bVar.f6601b = i16 - bVar2.f6603d;
            }
            int i17 = bVar.f6603d;
            if (i17 >= bVar2.f6601b) {
                bVar.f6603d = i17 - bVar2.f6603d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f6601b != bVar.f6603d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9930f(java.util.List<androidx.recyclerview.widget.C1268a.C1270b> r9, int r10, androidx.recyclerview.widget.C1268a.C1270b r11, int r12, androidx.recyclerview.widget.C1268a.C1270b r13) {
        /*
            r8 = this;
            int r0 = r11.f6603d
            int r1 = r13.f6601b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f6601b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f6603d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f6603d = r5
            androidx.recyclerview.widget.p$a r0 = r8.f6826a
            int r1 = r11.f6601b
            java.lang.Object r5 = r13.f6602c
            androidx.recyclerview.widget.a$b r0 = r0.mo9656a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f6601b
            int r5 = r13.f6601b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f6601b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f6603d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.p$a r3 = r8.f6826a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f6602c
            androidx.recyclerview.widget.a$b r3 = r3.mo9656a(r2, r1, r5, r4)
            int r1 = r13.f6603d
            int r1 = r1 - r5
            r13.f6603d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f6603d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.p$a r11 = r8.f6826a
            r11.mo9657b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1332p.mo9930f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
