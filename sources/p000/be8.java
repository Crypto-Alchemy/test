package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: be8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class be8 {

    /* renamed from: a */
    public final no8 f21267a;

    /* renamed from: b */
    public ps8 f21268b;

    /* renamed from: c */
    public final n58 f21269c = new n58();

    /* renamed from: d */
    public final pk9 f21270d = new pk9();

    public be8() {
        no8 no8 = new no8();
        this.f21267a = no8;
        this.f21268b = no8.f32164b.mo46867c();
        no8.f32166d.mo29847a("internal.registerCallback", new j48(this));
        no8.f32166d.mo29847a("internal.eventLogger", new ea8(this));
    }

    /* renamed from: a */
    public final void mo29561a(String str, Callable<? extends j78> callable) {
        this.f21267a.f32166d.mo29847a(str, callable);
    }

    /* renamed from: b */
    public final boolean mo29562b(h58 h58) throws zzd {
        try {
            this.f21269c.mo45971b(h58);
            this.f21267a.f32165c.mo46869e("runtime.counter", new e78(Double.valueOf(Utils.DOUBLE_EPSILON)));
            this.f21270d.mo46770b(this.f21268b.mo46867c(), this.f21269c);
            if (mo29563c() || mo29564d()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: c */
    public final boolean mo29563c() {
        if (!this.f21269c.mo45972c().equals(this.f21269c.mo45970a())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo29564d() {
        if (!this.f21269c.mo45976f().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final n58 mo29565e() {
        return this.f21269c;
    }

    /* renamed from: f */
    public final void mo29566f(wt8 wt8) throws zzd {
        j78 j78;
        String str;
        String str2;
        try {
            this.f21268b = this.f21267a.f32164b.mo46867c();
            if (!(this.f21267a.mo46120a(this.f21268b, (gu8[]) wt8.mo49270x().toArray(new gu8[0])) instanceof y68)) {
                for (st8 next : wt8.mo49271y().mo46537x()) {
                    List<gu8> y = next.mo47868y();
                    String x = next.mo47867x();
                    Iterator<gu8> it = y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r88 a = this.f21267a.mo46120a(this.f21268b, it.next());
                            if (a instanceof d88) {
                                ps8 ps8 = this.f21268b;
                                if (!ps8.mo46868d(x)) {
                                    j78 = null;
                                } else {
                                    r88 h = ps8.mo46872h(x);
                                    if (!(h instanceof j78)) {
                                        String valueOf = String.valueOf(x);
                                        if (valueOf.length() != 0) {
                                            str2 = "Invalid function name: ".concat(valueOf);
                                        } else {
                                            str2 = new String("Invalid function name: ");
                                        }
                                        throw new IllegalStateException(str2);
                                    }
                                    j78 = (j78) h;
                                }
                                if (j78 == null) {
                                    String valueOf2 = String.valueOf(x);
                                    if (valueOf2.length() != 0) {
                                        str = "Rule function is undefined: ".concat(valueOf2);
                                    } else {
                                        str = new String("Rule function is undefined: ");
                                    }
                                    throw new IllegalStateException(str);
                                }
                                j78.mo29623a(this.f21268b, Collections.singletonList(a));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ j78 mo29567g() throws Exception {
        return new bj9(this.f21270d);
    }
}
