package p000;

/* renamed from: kc9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class kc9 implements jc9 {

    /* renamed from: A */
    public static final lx8<Long> f30809A;

    /* renamed from: B */
    public static final lx8<Long> f30810B;

    /* renamed from: C */
    public static final lx8<Long> f30811C;

    /* renamed from: D */
    public static final lx8<Long> f30812D;

    /* renamed from: E */
    public static final lx8<Long> f30813E;

    /* renamed from: F */
    public static final lx8<Long> f30814F;

    /* renamed from: G */
    public static final lx8<Long> f30815G;

    /* renamed from: H */
    public static final lx8<Long> f30816H;

    /* renamed from: I */
    public static final lx8<Long> f30817I;

    /* renamed from: J */
    public static final lx8<Long> f30818J;

    /* renamed from: K */
    public static final lx8<String> f30819K;

    /* renamed from: L */
    public static final lx8<Long> f30820L;

    /* renamed from: a */
    public static final lx8<Long> f30821a;

    /* renamed from: b */
    public static final lx8<Long> f30822b;

    /* renamed from: c */
    public static final lx8<Long> f30823c;

    /* renamed from: d */
    public static final lx8<String> f30824d;

    /* renamed from: e */
    public static final lx8<String> f30825e;

    /* renamed from: f */
    public static final lx8<String> f30826f;

    /* renamed from: g */
    public static final lx8<Long> f30827g;

    /* renamed from: h */
    public static final lx8<Long> f30828h;

    /* renamed from: i */
    public static final lx8<Long> f30829i;

    /* renamed from: j */
    public static final lx8<Long> f30830j;

    /* renamed from: k */
    public static final lx8<Long> f30831k;

    /* renamed from: l */
    public static final lx8<Long> f30832l;

    /* renamed from: m */
    public static final lx8<Long> f30833m;

    /* renamed from: n */
    public static final lx8<Long> f30834n;

    /* renamed from: o */
    public static final lx8<Long> f30835o;

    /* renamed from: p */
    public static final lx8<Long> f30836p;

    /* renamed from: q */
    public static final lx8<Long> f30837q;

    /* renamed from: r */
    public static final lx8<Long> f30838r;

    /* renamed from: s */
    public static final lx8<String> f30839s;

    /* renamed from: t */
    public static final lx8<Long> f30840t;

    /* renamed from: u */
    public static final lx8<Long> f30841u;

    /* renamed from: v */
    public static final lx8<Long> f30842v;

    /* renamed from: w */
    public static final lx8<Long> f30843w;

    /* renamed from: x */
    public static final lx8<Long> f30844x;

    /* renamed from: y */
    public static final lx8<Long> f30845y;

    /* renamed from: z */
    public static final lx8<Long> f30846z;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f30821a = gx8.mo43038a("measurement.ad_id_cache_time", 10000);
        f30822b = gx8.mo43038a("measurement.max_bundles_per_iteration", 100);
        f30823c = gx8.mo43038a("measurement.config.cache_time", 86400000);
        f30824d = gx8.mo43041d("measurement.log_tag", "FA");
        f30825e = gx8.mo43041d("measurement.config.url_authority", "app-measurement.com");
        f30826f = gx8.mo43041d("measurement.config.url_scheme", "https");
        f30827g = gx8.mo43038a("measurement.upload.debug_upload_interval", 1000);
        f30828h = gx8.mo43038a("measurement.lifetimevalue.max_currency_tracked", 4);
        f30829i = gx8.mo43038a("measurement.store.max_stored_events_per_app", 100000);
        f30830j = gx8.mo43038a("measurement.experiment.max_ids", 50);
        f30831k = gx8.mo43038a("measurement.audience.filter_result_max_count", 200);
        f30832l = gx8.mo43038a("measurement.alarm_manager.minimum_interval", 60000);
        f30833m = gx8.mo43038a("measurement.upload.minimum_delay", 500);
        f30834n = gx8.mo43038a("measurement.monitoring.sample_period_millis", 86400000);
        f30835o = gx8.mo43038a("measurement.upload.realtime_upload_interval", 10000);
        f30836p = gx8.mo43038a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f30837q = gx8.mo43038a("measurement.config.cache_time.service", 3600000);
        f30838r = gx8.mo43038a("measurement.service_client.idle_disconnect_millis", 5000);
        f30839s = gx8.mo43041d("measurement.log_tag.service", "FA-SVC");
        f30840t = gx8.mo43038a("measurement.upload.stale_data_deletion_interval", 86400000);
        f30841u = gx8.mo43038a("measurement.sdk.attribution.cache.ttl", 604800000);
        f30842v = gx8.mo43038a("measurement.upload.backoff_period", 43200000);
        f30843w = gx8.mo43038a("measurement.upload.initial_upload_delay_time", yt6.DEFAULT_POLLING_FREQUENCY);
        f30844x = gx8.mo43038a("measurement.upload.interval", 3600000);
        f30845y = gx8.mo43038a("measurement.upload.max_bundle_size", 65536);
        f30846z = gx8.mo43038a("measurement.upload.max_bundles", 100);
        f30809A = gx8.mo43038a("measurement.upload.max_conversions_per_day", 500);
        f30810B = gx8.mo43038a("measurement.upload.max_error_events_per_day", 1000);
        f30811C = gx8.mo43038a("measurement.upload.max_events_per_bundle", 1000);
        f30812D = gx8.mo43038a("measurement.upload.max_events_per_day", 100000);
        f30813E = gx8.mo43038a("measurement.upload.max_public_events_per_day", 50000);
        f30814F = gx8.mo43038a("measurement.upload.max_queue_time", 2419200000L);
        f30815G = gx8.mo43038a("measurement.upload.max_realtime_events_per_day", 10);
        f30816H = gx8.mo43038a("measurement.upload.max_batch_size", 65536);
        f30817I = gx8.mo43038a("measurement.upload.retry_count", 6);
        f30818J = gx8.mo43038a("measurement.upload.retry_time", 1800000);
        f30819K = gx8.mo43041d("measurement.upload.url", "https://app-measurement.com/a");
        f30820L = gx8.mo43038a("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final long mo44382A() {
        return f30835o.mo45550e().longValue();
    }

    /* renamed from: B */
    public final long mo44383B() {
        return f30836p.mo45550e().longValue();
    }

    /* renamed from: C */
    public final long mo44384C() {
        return f30813E.mo45550e().longValue();
    }

    /* renamed from: D */
    public final long mo44385D() {
        return f30814F.mo45550e().longValue();
    }

    /* renamed from: E */
    public final long mo44386E() {
        return f30842v.mo45550e().longValue();
    }

    /* renamed from: F */
    public final long mo44387F() {
        return f30812D.mo45550e().longValue();
    }

    /* renamed from: a */
    public final long mo44388a() {
        return f30832l.mo45550e().longValue();
    }

    /* renamed from: b */
    public final String mo44389b() {
        return f30825e.mo45550e();
    }

    /* renamed from: c */
    public final String mo44390c() {
        return f30826f.mo45550e();
    }

    /* renamed from: d */
    public final long mo44391d() {
        return f30838r.mo45550e().longValue();
    }

    /* renamed from: e */
    public final long mo44392e() {
        return f30827g.mo45550e().longValue();
    }

    /* renamed from: f */
    public final long mo44393f() {
        return f30830j.mo45550e().longValue();
    }

    /* renamed from: g */
    public final long mo44394g() {
        return f30829i.mo45550e().longValue();
    }

    /* renamed from: h */
    public final long mo44395h() {
        return f30828h.mo45550e().longValue();
    }

    /* renamed from: i */
    public final long mo44396i() {
        return f30841u.mo45550e().longValue();
    }

    /* renamed from: j */
    public final long mo44397j() {
        return f30834n.mo45550e().longValue();
    }

    /* renamed from: k */
    public final long mo44398k() {
        return f30831k.mo45550e().longValue();
    }

    /* renamed from: l */
    public final long mo44399l() {
        return f30840t.mo45550e().longValue();
    }

    /* renamed from: m */
    public final long mo44400m() {
        return f30817I.mo45550e().longValue();
    }

    /* renamed from: n */
    public final long mo44401n() {
        return f30843w.mo45550e().longValue();
    }

    /* renamed from: o */
    public final long mo44402o() {
        return f30810B.mo45550e().longValue();
    }

    /* renamed from: p */
    public final long mo44403p() {
        return f30811C.mo45550e().longValue();
    }

    /* renamed from: q */
    public final long mo44404q() {
        return f30818J.mo45550e().longValue();
    }

    /* renamed from: r */
    public final long mo44405r() {
        return f30846z.mo45550e().longValue();
    }

    /* renamed from: s */
    public final long mo44406s() {
        return f30815G.mo45550e().longValue();
    }

    /* renamed from: t */
    public final long mo44407t() {
        return f30816H.mo45550e().longValue();
    }

    /* renamed from: u */
    public final long mo44408u() {
        return f30809A.mo45550e().longValue();
    }

    /* renamed from: v */
    public final long mo44409v() {
        return f30833m.mo45550e().longValue();
    }

    /* renamed from: w */
    public final String mo44410w() {
        return f30819K.mo45550e();
    }

    /* renamed from: x */
    public final long mo44411x() {
        return f30820L.mo45550e().longValue();
    }

    /* renamed from: y */
    public final long mo44412y() {
        return f30844x.mo45550e().longValue();
    }

    /* renamed from: z */
    public final long mo44413z() {
        return f30845y.mo45550e().longValue();
    }

    public final long zza() {
        return f30821a.mo45550e().longValue();
    }

    public final long zzb() {
        return f30822b.mo45550e().longValue();
    }

    public final long zzc() {
        return f30823c.mo45550e().longValue();
    }
}
