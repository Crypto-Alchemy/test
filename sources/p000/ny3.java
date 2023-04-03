package p000;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\"J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010#\u001a\u00020\u001d8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, mo44877d2 = {"Lny3;", "", "Landroid/view/MotionEvent;", "motionEvent", "Llt4;", "positionCalculator", "Lpr4;", "c", "(Landroid/view/MotionEvent;Llt4;)Lpr4;", "", "pointerId", "Lr37;", "e", "a", "h", "", "g", "motionEventPointerId", "Lmr4;", "f", "(I)J", "b", "index", "pressed", "Lqr4;", "d", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ny3 */
/* compiled from: MotionEventAdapter.android.kt */
public final class ny3 {

    /* renamed from: a */
    public long f15721a;

    /* renamed from: b */
    public final SparseLongArray f15722b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f15723c = new SparseBooleanArray();

    /* renamed from: d */
    public final List<qr4> f15724d = new ArrayList();

    /* renamed from: e */
    public int f15725e = -1;

    /* renamed from: f */
    public int f15726f = -1;

    /* renamed from: a */
    public final void mo23832a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f15722b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f15722b;
                long j = this.f15721a;
                this.f15721a = 1 + j;
                sparseLongArray.put(pointerId, j);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f15723c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f15722b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f15722b;
                long j2 = this.f15721a;
                this.f15721a = 1 + j2;
                sparseLongArray2.put(pointerId2, j2);
            }
        }
    }

    /* renamed from: b */
    public final void mo23833b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f15725e || source != this.f15726f) {
                this.f15725e = toolType;
                this.f15726f = source;
                this.f15723c.clear();
                this.f15722b.clear();
            }
        }
    }

    /* renamed from: c */
    public final pr4 mo23834c(MotionEvent motionEvent, lt4 lt4) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        vx2.m53591g(motionEvent, "motionEvent");
        vx2.m53591g(lt4, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f15722b.clear();
            this.f15723c.clear();
            return null;
        }
        mo23833b(motionEvent);
        mo23832a(motionEvent);
        if (actionMasked == 10 || actionMasked == 7 || actionMasked == 9) {
            z = true;
        } else {
            z = false;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f15723c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked == 1) {
            i = 0;
        } else if (actionMasked != 6) {
            i = -1;
        } else {
            i = motionEvent.getActionIndex();
        }
        this.f15724d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List<qr4> list = this.f15724d;
            if (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            list.add(mo23835d(lt4, motionEvent, i2, z3));
        }
        mo23839h(motionEvent);
        return new pr4(motionEvent.getEventTime(), this.f15724d, motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.qr4 mo23835d(p000.lt4 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            int r4 = r26.getPointerId(r27)
            long r6 = r0.mo23837f(r4)
            float r15 = r26.getPressure(r27)
            float r4 = r26.getX(r27)
            float r5 = r26.getY(r27)
            long r4 = p000.wf4.m29550a(r4, r5)
            if (r3 != 0) goto L_0x0035
            float r4 = r26.getRawX()
            float r5 = r26.getRawY()
            long r4 = p000.wf4.m29550a(r4, r5)
            long r8 = r1.mo3770j(r4)
        L_0x0032:
            r10 = r4
            r12 = r8
            goto L_0x004c
        L_0x0035:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x0046
            ry3 r4 = p000.ry3.f17390a
            long r4 = r4.mo25562a(r2, r3)
            long r8 = r1.mo3770j(r4)
            goto L_0x0032
        L_0x0046:
            long r8 = r1.mo3793r(r4)
            r12 = r4
            r10 = r8
        L_0x004c:
            int r1 = r26.getToolType(r27)
            r4 = 1
            if (r1 == 0) goto L_0x0081
            if (r1 == r4) goto L_0x007a
            r5 = 2
            if (r1 == r5) goto L_0x0073
            r5 = 3
            if (r1 == r5) goto L_0x006c
            r5 = 4
            if (r1 == r5) goto L_0x0065
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28200e()
            goto L_0x0087
        L_0x0065:
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28196a()
            goto L_0x0087
        L_0x006c:
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28197b()
            goto L_0x0087
        L_0x0073:
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28198c()
            goto L_0x0087
        L_0x007a:
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28199d()
            goto L_0x0087
        L_0x0081:
            yr4$a r1 = p000.yr4.f20321a
            int r1 = r1.mo28200e()
        L_0x0087:
            r16 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r26.getHistorySize()
            r9 = 0
        L_0x0093:
            if (r9 >= r5) goto L_0x00db
            float r14 = r2.getHistoricalX(r3, r9)
            float r4 = r2.getHistoricalY(r3, r9)
            boolean r17 = java.lang.Float.isInfinite(r14)
            if (r17 != 0) goto L_0x00ac
            boolean r17 = java.lang.Float.isNaN(r14)
            if (r17 != 0) goto L_0x00ac
            r17 = 1
            goto L_0x00ae
        L_0x00ac:
            r17 = 0
        L_0x00ae:
            if (r17 == 0) goto L_0x00d7
            boolean r17 = java.lang.Float.isInfinite(r4)
            if (r17 != 0) goto L_0x00bf
            boolean r17 = java.lang.Float.isNaN(r4)
            if (r17 != 0) goto L_0x00bf
            r17 = 1
            goto L_0x00c1
        L_0x00bf:
            r17 = 0
        L_0x00c1:
            if (r17 == 0) goto L_0x00d7
            cm2 r8 = new cm2
            long r19 = r2.getHistoricalEventTime(r9)
            long r21 = p000.wf4.m29550a(r14, r4)
            r23 = 0
            r18 = r8
            r18.<init>(r19, r21, r23)
            r1.add(r8)
        L_0x00d7:
            int r9 = r9 + 1
            r4 = 1
            goto L_0x0093
        L_0x00db:
            int r4 = r26.getActionMasked()
            r5 = 8
            if (r4 != r5) goto L_0x00f7
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r5 = 9
            float r5 = r2.getAxisValue(r5)
            float r5 = -r5
            r8 = 0
            float r5 = r5 + r8
            long r4 = p000.wf4.m29550a(r4, r5)
            goto L_0x00fd
        L_0x00f7:
            tf4$a r4 = p000.tf4.f18145b
            long r4 = r4.mo26446c()
        L_0x00fd:
            r19 = r4
            android.util.SparseBooleanArray r4 = r0.f15723c
            int r3 = r26.getPointerId(r27)
            r5 = 0
            boolean r17 = r4.get(r3, r5)
            qr4 r3 = new qr4
            r5 = r3
            long r8 = r26.getEventTime()
            r21 = 0
            r14 = r28
            r18 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ny3.mo23835d(lt4, android.view.MotionEvent, int, boolean):qr4");
    }

    /* renamed from: e */
    public final void mo23836e(int i) {
        this.f15723c.delete(i);
        this.f15722b.delete(i);
    }

    /* renamed from: f */
    public final long mo23837f(int i) {
        long j;
        int indexOfKey = this.f15722b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.f15722b.valueAt(indexOfKey);
        } else {
            j = this.f15721a;
            this.f15721a = 1 + j;
            this.f15722b.put(i, j);
        }
        return mr4.m22621b(j);
    }

    /* renamed from: g */
    public final boolean mo23838g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo23839h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f15723c.get(pointerId, false)) {
                this.f15722b.delete(pointerId);
                this.f15723c.delete(pointerId);
            }
        }
        if (this.f15722b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f15722b.size() - 1; -1 < size; size--) {
                int keyAt = this.f15722b.keyAt(size);
                if (!mo23838g(motionEvent, keyAt)) {
                    this.f15722b.removeAt(size);
                    this.f15723c.delete(keyAt);
                }
            }
        }
    }
}
