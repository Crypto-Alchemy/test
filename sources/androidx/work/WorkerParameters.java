package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f7488a;

    /* renamed from: b */
    public C1519b f7489b;

    /* renamed from: c */
    public Set<String> f7490c;

    /* renamed from: d */
    public C1514a f7491d;

    /* renamed from: e */
    public int f7492e;

    /* renamed from: f */
    public Executor f7493f;

    /* renamed from: g */
    public bm6 f7494g;

    /* renamed from: h */
    public in7 f7495h;

    /* renamed from: i */
    public ow4 f7496i;

    /* renamed from: j */
    public y72 f7497j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1514a {

        /* renamed from: a */
        public List<String> f7498a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f7499b = Collections.emptyList();

        /* renamed from: c */
        public Network f7500c;
    }

    public WorkerParameters(UUID uuid, C1519b bVar, Collection<String> collection, C1514a aVar, int i, Executor executor, bm6 bm6, in7 in7, ow4 ow4, y72 y72) {
        this.f7488a = uuid;
        this.f7489b = bVar;
        this.f7490c = new HashSet(collection);
        this.f7491d = aVar;
        this.f7492e = i;
        this.f7493f = executor;
        this.f7494g = bm6;
        this.f7495h = in7;
        this.f7496i = ow4;
        this.f7497j = y72;
    }

    /* renamed from: a */
    public Executor mo10899a() {
        return this.f7493f;
    }

    /* renamed from: b */
    public y72 mo10900b() {
        return this.f7497j;
    }

    /* renamed from: c */
    public UUID mo10901c() {
        return this.f7488a;
    }

    /* renamed from: d */
    public C1519b mo10902d() {
        return this.f7489b;
    }

    /* renamed from: e */
    public bm6 mo10903e() {
        return this.f7494g;
    }

    /* renamed from: f */
    public in7 mo10904f() {
        return this.f7495h;
    }
}
