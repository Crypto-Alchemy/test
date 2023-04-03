package p000;

import com.google.android.gms.internal.measurement.C4085b;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzmg;
import java.io.IOException;
import p000.s49;
import p000.w39;

/* renamed from: w39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public class w39<MessageType extends s49<MessageType, BuilderType>, BuilderType extends w39<MessageType, BuilderType>> extends sz8<MessageType, BuilderType> {

    /* renamed from: a */
    public final MessageType f35232a;

    /* renamed from: d */
    public MessageType f35233d;

    /* renamed from: e */
    public boolean f35234e = false;

    public w39(MessageType messagetype) {
        this.f35232a = messagetype;
        this.f35233d = (s49) messagetype.mo29044w(4, (Object) null, (Object) null);
    }

    /* renamed from: m */
    public static final void m53683m(MessageType messagetype, MessageType messagetype2) {
        h89.m45067a().mo43106b(messagetype.getClass()).mo46040g(messagetype, messagetype2);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ r79 mo47631f() {
        return this.f35232a;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ sz8 mo47952i(byte[] bArr, int i, int i2) throws zzkn {
        mo48887r(bArr, 0, i2, t29.m52054a());
        return this;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ sz8 mo47953j(byte[] bArr, int i, int i2, t29 t29) throws zzkn {
        mo48887r(bArr, 0, i2, t29);
        return this;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ sz8 mo47954l(C4085b bVar) {
        mo48886p((s49) bVar);
        return this;
    }

    /* renamed from: o */
    public final MessageType mo48885o() {
        MessageType messagetype;
        MessageType v = mo46665q();
        boolean z = true;
        byte byteValue = ((Byte) v.mo29044w(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean e = h89.m45067a().mo43106b(v.getClass()).mo46038e(v);
                if (true != e) {
                    messagetype = null;
                } else {
                    messagetype = v;
                }
                v.mo29044w(2, messagetype, (Object) null);
                z = e;
            }
        }
        if (z) {
            return v;
        }
        throw new zzmg(v);
    }

    /* renamed from: p */
    public final BuilderType mo48886p(MessageType messagetype) {
        if (this.f35234e) {
            mo48888t();
            this.f35234e = false;
        }
        m53683m(this.f35233d, messagetype);
        return this;
    }

    /* renamed from: r */
    public final BuilderType mo48887r(byte[] bArr, int i, int i2, t29 t29) throws zzkn {
        if (this.f35234e) {
            mo48888t();
            this.f35234e = false;
        }
        try {
            h89.m45067a().mo43106b(this.f35233d.getClass()).mo46041h(this.f35233d, bArr, 0, i2, new b09(t29));
            return this;
        } catch (zzkn e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkn.zza();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: t */
    public void mo48888t() {
        MessageType messagetype = (s49) this.f35233d.mo29044w(4, (Object) null, (Object) null);
        m53683m(messagetype, this.f35233d);
        this.f35233d = messagetype;
    }

    /* renamed from: u */
    public final BuilderType clone() {
        BuilderType buildertype = (w39) this.f35232a.mo29044w(5, (Object) null, (Object) null);
        buildertype.mo48886p(mo46665q());
        return buildertype;
    }

    /* renamed from: v */
    public MessageType mo46665q() {
        if (this.f35234e) {
            return this.f35233d;
        }
        MessageType messagetype = this.f35233d;
        h89.m45067a().mo43106b(messagetype.getClass()).mo46039f(messagetype);
        this.f35234e = true;
        return this.f35233d;
    }
}
