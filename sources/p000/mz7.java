package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.internal.C4028a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: mz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class mz7 implements l08, t38 {

    /* renamed from: a */
    public final Lock f31911a;

    /* renamed from: b */
    public final Condition f31912b;

    /* renamed from: c */
    public final Context f31913c;

    /* renamed from: d */
    public final zh2 f31914d;

    /* renamed from: e */
    public final lz7 f31915e;

    /* renamed from: f */
    public final Map f31916f;

    /* renamed from: g */
    public final Map f31917g = new HashMap();

    /* renamed from: h */
    public final sg0 f31918h;

    /* renamed from: i */
    public final Map f31919i;

    /* renamed from: j */
    public final C4013a.C4014a f31920j;
    @NotOnlyInitialized

    /* renamed from: k */
    public volatile jz7 f31921k;

    /* renamed from: l */
    public ConnectionResult f31922l = null;

    /* renamed from: m */
    public int f31923m;

    /* renamed from: n */
    public final iz7 f31924n;

    /* renamed from: o */
    public final b08 f31925o;

    public mz7(Context context, iz7 iz7, Lock lock, Looper looper, zh2 zh2, Map map, sg0 sg0, Map map2, C4013a.C4014a aVar, ArrayList arrayList, b08 b08) {
        this.f31913c = context;
        this.f31911a = lock;
        this.f31914d = zh2;
        this.f31916f = map;
        this.f31918h = sg0;
        this.f31919i = map2;
        this.f31920j = aVar;
        this.f31924n = iz7;
        this.f31925o = b08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((q38) arrayList.get(i)).mo46943a(this);
        }
        this.f31915e = new lz7(this, looper);
        this.f31912b = lock.newCondition();
        this.f31921k = new wy7(this);
    }

    /* renamed from: E0 */
    public final void mo45935E0(ConnectionResult connectionResult, C4013a aVar, boolean z) {
        this.f31911a.lock();
        try {
            this.f31921k.mo43977d(connectionResult, aVar, z);
        } finally {
            this.f31911a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo45319a() {
        this.f31921k.mo43976c();
    }

    /* renamed from: b */
    public final void mo45320b() {
        if (this.f31921k instanceof iy7) {
            ((iy7) this.f31921k).mo43981i();
        }
    }

    /* renamed from: c */
    public final void mo45321c() {
        if (this.f31921k.mo43979f()) {
            this.f31917g.clear();
        }
    }

    /* renamed from: d */
    public final void mo45322d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f31921k);
        for (C4013a aVar : this.f31919i.keySet()) {
            printWriter.append(str).append(aVar.mo30536d()).println(":");
            ((C4013a.C4021f) cu4.m43221k((C4013a.C4021f) this.f31916f.get(aVar.mo30534b()))).mo30555o(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final boolean mo45323e() {
        return this.f31921k instanceof iy7;
    }

    /* renamed from: f */
    public final C4028a mo45324f(C4028a aVar) {
        aVar.mo30583k();
        return this.f31921k.mo43980g(aVar);
    }

    /* renamed from: i */
    public final void mo45936i() {
        this.f31911a.lock();
        try {
            this.f31924n.mo43986q();
            this.f31921k = new iy7(this);
            this.f31921k.mo43975b();
            this.f31912b.signalAll();
        } finally {
            this.f31911a.unlock();
        }
    }

    /* renamed from: j */
    public final void mo45937j() {
        this.f31911a.lock();
        try {
            this.f31921k = new vy7(this, this.f31918h, this.f31919i, this.f31914d, this.f31920j, this.f31911a, this.f31913c);
            this.f31921k.mo43975b();
            this.f31912b.signalAll();
        } finally {
            this.f31911a.unlock();
        }
    }

    /* renamed from: k */
    public final void mo45938k(ConnectionResult connectionResult) {
        this.f31911a.lock();
        try {
            this.f31922l = connectionResult;
            this.f31921k = new wy7(this);
            this.f31921k.mo43975b();
            this.f31912b.signalAll();
        } finally {
            this.f31911a.unlock();
        }
    }

    /* renamed from: l */
    public final void mo45939l(kz7 kz7) {
        this.f31915e.sendMessage(this.f31915e.obtainMessage(1, kz7));
    }

    /* renamed from: m */
    public final void mo45940m(RuntimeException runtimeException) {
        this.f31915e.sendMessage(this.f31915e.obtainMessage(2, runtimeException));
    }

    public final void onConnected(Bundle bundle) {
        this.f31911a.lock();
        try {
            this.f31921k.mo43974a(bundle);
        } finally {
            this.f31911a.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.f31911a.lock();
        try {
            this.f31921k.mo43978e(i);
        } finally {
            this.f31911a.unlock();
        }
    }
}
