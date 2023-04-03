package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: zr7 */
public abstract class zr7<StateT> {

    /* renamed from: a */
    public final pq7 f36220a;

    /* renamed from: b */
    public final IntentFilter f36221b;

    /* renamed from: c */
    public final Context f36222c;

    /* renamed from: d */
    public final Set<c96<StateT>> f36223d = new HashSet();

    /* renamed from: e */
    public eq7 f36224e = null;

    /* renamed from: f */
    public volatile boolean f36225f = false;

    public zr7(pq7 pq7, IntentFilter intentFilter, Context context) {
        this.f36220a = pq7;
        this.f36221b = intentFilter;
        this.f36222c = lw7.m47962c(context);
    }

    /* renamed from: a */
    public abstract void mo43369a(Context context, Intent intent);

    /* renamed from: b */
    public final void mo49910b() {
        eq7 eq7;
        if ((this.f36225f || !this.f36223d.isEmpty()) && this.f36224e == null) {
            eq7 eq72 = new eq7(this);
            this.f36224e = eq72;
            this.f36222c.registerReceiver(eq72, this.f36221b);
        }
        if (!this.f36225f && this.f36223d.isEmpty() && (eq7 = this.f36224e) != null) {
            this.f36222c.unregisterReceiver(eq7);
            this.f36224e = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo49911c(boolean z) {
        this.f36225f = z;
        mo49910b();
    }

    /* renamed from: d */
    public final synchronized void mo49912d(StateT statet) {
        Iterator it = new HashSet(this.f36223d).iterator();
        while (it.hasNext()) {
            ((c96) it.next()).mo29896a(statet);
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo49913e() {
        return this.f36224e != null;
    }
}
