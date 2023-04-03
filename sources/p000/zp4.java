package p000;

import androidx.media3.common.C0820n;
import androidx.media3.common.C0831s;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: zp4 */
/* compiled from: PlaybackInfo */
public final class zp4 {

    /* renamed from: s */
    public static final C0973i.C0975b f20627s = new C0973i.C0975b(new Object());

    /* renamed from: a */
    public final C0831s f20628a;

    /* renamed from: b */
    public final C0973i.C0975b f20629b;

    /* renamed from: c */
    public final long f20630c;

    /* renamed from: d */
    public final long f20631d;

    /* renamed from: e */
    public final int f20632e;

    /* renamed from: f */
    public final ExoPlaybackException f20633f;

    /* renamed from: g */
    public final boolean f20634g;

    /* renamed from: h */
    public final ws6 f20635h;

    /* renamed from: i */
    public final gt6 f20636i;

    /* renamed from: j */
    public final List<Metadata> f20637j;

    /* renamed from: k */
    public final C0973i.C0975b f20638k;

    /* renamed from: l */
    public final boolean f20639l;

    /* renamed from: m */
    public final int f20640m;

    /* renamed from: n */
    public final C0820n f20641n;

    /* renamed from: o */
    public final boolean f20642o;

    /* renamed from: p */
    public volatile long f20643p;

    /* renamed from: q */
    public volatile long f20644q;

    /* renamed from: r */
    public volatile long f20645r;

    public zp4(C0831s sVar, C0973i.C0975b bVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, ws6 ws6, gt6 gt6, List<Metadata> list, C0973i.C0975b bVar2, boolean z2, int i2, C0820n nVar, long j3, long j4, long j5, boolean z3) {
        this.f20628a = sVar;
        this.f20629b = bVar;
        this.f20630c = j;
        this.f20631d = j2;
        this.f20632e = i;
        this.f20633f = exoPlaybackException;
        this.f20634g = z;
        this.f20635h = ws6;
        this.f20636i = gt6;
        this.f20637j = list;
        this.f20638k = bVar2;
        this.f20639l = z2;
        this.f20640m = i2;
        this.f20641n = nVar;
        this.f20643p = j3;
        this.f20644q = j4;
        this.f20645r = j5;
        this.f20642o = z3;
    }

    /* renamed from: j */
    public static zp4 m31419j(gt6 gt6) {
        C0831s sVar = C0831s.f4433a;
        C0973i.C0975b bVar = f20627s;
        return new zp4(sVar, bVar, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, 0, 1, (ExoPlaybackException) null, false, ws6.f19232g, gt6, ImmutableList.m36627of(), bVar, false, 0, C0820n.f4404g, 0, 0, 0, false);
    }

    /* renamed from: k */
    public static C0973i.C0975b m31420k() {
        return f20627s;
    }

    /* renamed from: a */
    public zp4 mo28547a(boolean z) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, z, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: b */
    public zp4 mo28548b(C0973i.C0975b bVar) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, bVar, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: c */
    public zp4 mo28549c(C0973i.C0975b bVar, long j, long j2, long j3, long j4, ws6 ws6, gt6 gt6, List<Metadata> list) {
        long j5 = j;
        ws6 ws62 = ws6;
        gt6 gt62 = gt6;
        List<Metadata> list2 = list;
        C0831s sVar = this.f20628a;
        return new zp4(sVar, bVar, j2, j3, this.f20632e, this.f20633f, this.f20634g, ws62, gt62, list2, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, j4, j5, this.f20642o);
    }

    /* renamed from: d */
    public zp4 mo28550d(boolean z, int i) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, z, i, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: e */
    public zp4 mo28551e(ExoPlaybackException exoPlaybackException) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, exoPlaybackException, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: f */
    public zp4 mo28552f(C0820n nVar) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, nVar, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: g */
    public zp4 mo28553g(int i) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, i, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }

    /* renamed from: h */
    public zp4 mo28554h(boolean z) {
        C0831s sVar = this.f20628a;
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, z);
    }

    /* renamed from: i */
    public zp4 mo28555i(C0831s sVar) {
        return new zp4(sVar, this.f20629b, this.f20630c, this.f20631d, this.f20632e, this.f20633f, this.f20634g, this.f20635h, this.f20636i, this.f20637j, this.f20638k, this.f20639l, this.f20640m, this.f20641n, this.f20643p, this.f20644q, this.f20645r, this.f20642o);
    }
}
