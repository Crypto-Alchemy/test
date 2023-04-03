package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.C0792h;
import androidx.media3.exoplayer.source.C0973i;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.source.j */
/* compiled from: MediaSourceEventListener */
public interface C0977j {

    /* renamed from: androidx.media3.exoplayer.source.j$a */
    /* compiled from: MediaSourceEventListener */
    public static class C0978a {

        /* renamed from: a */
        public final int f5260a;

        /* renamed from: b */
        public final C0973i.C0975b f5261b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C0979a> f5262c;

        /* renamed from: d */
        public final long f5263d;

        /* renamed from: androidx.media3.exoplayer.source.j$a$a */
        /* compiled from: MediaSourceEventListener */
        public static final class C0979a {

            /* renamed from: a */
            public Handler f5264a;

            /* renamed from: b */
            public C0977j f5265b;

            public C0979a(Handler handler, C0977j jVar) {
                this.f5264a = handler;
                this.f5265b = jVar;
            }
        }

        public C0978a() {
            this(new CopyOnWriteArrayList(), 0, (C0973i.C0975b) null, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m7213k(C0977j jVar, jr3 jr3) {
            jVar.mo7601K(this.f5260a, this.f5261b, jr3);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m7214l(C0977j jVar, vi3 vi3, jr3 jr3) {
            jVar.mo7600I(this.f5260a, this.f5261b, vi3, jr3);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m7215m(C0977j jVar, vi3 vi3, jr3 jr3) {
            jVar.mo7607n0(this.f5260a, this.f5261b, vi3, jr3);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m7216n(C0977j jVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
            jVar.mo7606j0(this.f5260a, this.f5261b, vi3, jr3, iOException, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m7217o(C0977j jVar, vi3 vi3, jr3 jr3) {
            jVar.mo7603R(this.f5260a, this.f5261b, vi3, jr3);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m7218p(C0977j jVar, C0973i.C0975b bVar, jr3 jr3) {
            jVar.mo7602O(this.f5260a, bVar, jr3);
        }

        /* renamed from: A */
        public void mo7640A(vi3 vi3, int i, int i2, C0792h hVar, int i3, Object obj, long j, long j2) {
            vi3 vi32 = vi3;
            mo7641B(vi3, new jr3(i, i2, hVar, i3, obj, mo7647h(j), mo7647h(j2)));
        }

        /* renamed from: B */
        public void mo7641B(vi3 vi3, jr3 jr3) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new bs3(this, next.f5265b, vi3, jr3));
            }
        }

        /* renamed from: C */
        public void mo7642C(C0977j jVar) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                if (next.f5265b == jVar) {
                    this.f5262c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void mo7643D(int i, long j, long j2) {
            long j3 = j;
            mo7644E(new jr3(1, i, (C0792h) null, 3, (Object) null, mo7647h(j), mo7647h(j2)));
        }

        /* renamed from: E */
        public void mo7644E(jr3 jr3) {
            C0973i.C0975b bVar = (C0973i.C0975b) C2725kr.m20985e(this.f5261b);
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new as3(this, next.f5265b, bVar, jr3));
            }
        }

        /* renamed from: F */
        public C0978a mo7645F(int i, C0973i.C0975b bVar, long j) {
            return new C0978a(this.f5262c, i, bVar, j);
        }

        /* renamed from: g */
        public void mo7646g(Handler handler, C0977j jVar) {
            C2725kr.m20985e(handler);
            C2725kr.m20985e(jVar);
            this.f5262c.add(new C0979a(handler, jVar));
        }

        /* renamed from: h */
        public final long mo7647h(long j) {
            long U0 = w67.m29335U0(j);
            if (U0 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
            return this.f5263d + U0;
        }

        /* renamed from: i */
        public void mo7648i(int i, C0792h hVar, int i2, Object obj, long j) {
            mo7649j(new jr3(1, i, hVar, i2, obj, mo7647h(j), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
        }

        /* renamed from: j */
        public void mo7649j(jr3 jr3) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new xr3(this, next.f5265b, jr3));
            }
        }

        /* renamed from: q */
        public void mo7650q(vi3 vi3, int i) {
            mo7651r(vi3, i, -1, (C0792h) null, 0, (Object) null, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }

        /* renamed from: r */
        public void mo7651r(vi3 vi3, int i, int i2, C0792h hVar, int i3, Object obj, long j, long j2) {
            vi3 vi32 = vi3;
            mo7652s(vi3, new jr3(i, i2, hVar, i3, obj, mo7647h(j), mo7647h(j2)));
        }

        /* renamed from: s */
        public void mo7652s(vi3 vi3, jr3 jr3) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new yr3(this, next.f5265b, vi3, jr3));
            }
        }

        /* renamed from: t */
        public void mo7653t(vi3 vi3, int i) {
            mo7654u(vi3, i, -1, (C0792h) null, 0, (Object) null, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }

        /* renamed from: u */
        public void mo7654u(vi3 vi3, int i, int i2, C0792h hVar, int i3, Object obj, long j, long j2) {
            vi3 vi32 = vi3;
            mo7655v(vi3, new jr3(i, i2, hVar, i3, obj, mo7647h(j), mo7647h(j2)));
        }

        /* renamed from: v */
        public void mo7655v(vi3 vi3, jr3 jr3) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new cs3(this, next.f5265b, vi3, jr3));
            }
        }

        /* renamed from: w */
        public void mo7656w(vi3 vi3, int i, int i2, C0792h hVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            vi3 vi32 = vi3;
            mo7658y(vi3, new jr3(i, i2, hVar, i3, obj, mo7647h(j), mo7647h(j2)), iOException, z);
        }

        /* renamed from: x */
        public void mo7657x(vi3 vi3, int i, IOException iOException, boolean z) {
            mo7656w(vi3, i, -1, (C0792h) null, 0, (Object) null, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, iOException, z);
        }

        /* renamed from: y */
        public void mo7658y(vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
            Iterator<C0979a> it = this.f5262c.iterator();
            while (it.hasNext()) {
                C0979a next = it.next();
                w67.m29307G0(next.f5264a, new zr3(this, next.f5265b, vi3, jr3, iOException, z));
            }
        }

        /* renamed from: z */
        public void mo7659z(vi3 vi3, int i) {
            mo7640A(vi3, i, -1, (C0792h) null, 0, (Object) null, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }

        public C0978a(CopyOnWriteArrayList<C0979a> copyOnWriteArrayList, int i, C0973i.C0975b bVar, long j) {
            this.f5262c = copyOnWriteArrayList;
            this.f5260a = i;
            this.f5261b = bVar;
            this.f5263d = j;
        }
    }

    /* renamed from: I */
    void mo7600I(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3);

    /* renamed from: K */
    void mo7601K(int i, C0973i.C0975b bVar, jr3 jr3);

    /* renamed from: O */
    void mo7602O(int i, C0973i.C0975b bVar, jr3 jr3);

    /* renamed from: R */
    void mo7603R(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3);

    /* renamed from: j0 */
    void mo7606j0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z);

    /* renamed from: n0 */
    void mo7607n0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3);
}
