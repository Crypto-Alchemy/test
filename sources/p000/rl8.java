package p000;

import android.content.Context;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: rl8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class rl8 {

    /* renamed from: A */
    public static final uk8<Long> f33450A = m51155b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, gc8.f29170a);

    /* renamed from: A0 */
    public static final uk8<Boolean> f33451A0;

    /* renamed from: B */
    public static final uk8<Long> f33452B;

    /* renamed from: B0 */
    public static final uk8<Boolean> f33453B0;

    /* renamed from: C */
    public static final uk8<Long> f33454C = m51155b("measurement.upload.retry_time", 1800000L, 1800000L, lc8.f31285a);

    /* renamed from: C0 */
    public static final uk8<Boolean> f33455C0;

    /* renamed from: D */
    public static final uk8<Integer> f33456D = m51155b("measurement.upload.retry_count", 6, 6, nc8.f32089a);

    /* renamed from: D0 */
    public static final uk8<Boolean> f33457D0;

    /* renamed from: E */
    public static final uk8<Long> f33458E = m51155b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, qc8.f33056a);

    /* renamed from: E0 */
    public static final uk8<Boolean> f33459E0;

    /* renamed from: F */
    public static final uk8<Integer> f33460F = m51155b("measurement.lifetimevalue.max_currency_tracked", 4, 4, tc8.f34230a);

    /* renamed from: F0 */
    public static final uk8<Boolean> f33461F0;

    /* renamed from: G */
    public static final uk8<Integer> f33462G;

    /* renamed from: G0 */
    public static final uk8<Boolean> f33463G0;

    /* renamed from: H */
    public static final uk8<Integer> f33464H = m51155b("measurement.upload.max_public_user_properties", 25, 25, (ok8) null);

    /* renamed from: H0 */
    public static final uk8<Boolean> f33465H0;

    /* renamed from: I */
    public static final uk8<Integer> f33466I = m51155b("measurement.upload.max_event_name_cardinality", 500, 500, (ok8) null);

    /* renamed from: J */
    public static final uk8<Integer> f33467J = m51155b("measurement.upload.max_public_event_params", 25, 25, (ok8) null);

    /* renamed from: K */
    public static final uk8<Long> f33468K = m51155b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, bd8.f21257a);

    /* renamed from: L */
    public static final uk8<Boolean> f33469L;

    /* renamed from: M */
    public static final uk8<String> f33470M = m51155b("measurement.test.string_flag", "---", "---", hd8.f29553a);

    /* renamed from: N */
    public static final uk8<Long> f33471N = m51155b("measurement.test.long_flag", -1L, -1L, jd8.f30475a);

    /* renamed from: O */
    public static final uk8<Integer> f33472O = m51155b("measurement.test.int_flag", -2, -2, md8.f31671a);

    /* renamed from: P */
    public static final uk8<Double> f33473P;

    /* renamed from: Q */
    public static final uk8<Integer> f33474Q = m51155b("measurement.experiment.max_ids", 50, 50, sd8.f33828a);

    /* renamed from: R */
    public static final uk8<Integer> f33475R = m51155b("measurement.max_bundles_per_iteration", 100, 100, vd8.f34926a);

    /* renamed from: S */
    public static final uk8<Long> f33476S = m51155b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, ze8.f36136a);

    /* renamed from: T */
    public static final uk8<Boolean> f33477T;

    /* renamed from: U */
    public static final uk8<Boolean> f33478U;

    /* renamed from: V */
    public static final uk8<Boolean> f33479V;

    /* renamed from: W */
    public static final uk8<Boolean> f33480W;

    /* renamed from: X */
    public static final uk8<Boolean> f33481X;

    /* renamed from: Y */
    public static final uk8<Boolean> f33482Y;

    /* renamed from: Z */
    public static final uk8<Boolean> f33483Z;

    /* renamed from: a */
    public static final List<uk8<?>> f33484a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final uk8<Boolean> f33485a0;

    /* renamed from: b */
    public static final Set<uk8<?>> f33486b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final uk8<Boolean> f33487b0;

    /* renamed from: c */
    public static final uk8<Long> f33488c = m51155b("measurement.ad_id_cache_time", 10000L, 10000L, g98.f29131a);

    /* renamed from: c0 */
    public static final uk8<Boolean> f33489c0;

    /* renamed from: d */
    public static final uk8<Long> f33490d = m51155b("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, tb8.f34228a);

    /* renamed from: d0 */
    public static final uk8<Boolean> f33491d0;

    /* renamed from: e */
    public static final uk8<Long> f33492e = m51155b("measurement.config.cache_time", 86400000L, 3600000L, wc8.f35301a);

    /* renamed from: e0 */
    public static final uk8<Boolean> f33493e0;

    /* renamed from: f */
    public static final uk8<String> f33494f = m51155b("measurement.config.url_scheme", "https", "https", bf8.f21285a);

    /* renamed from: f0 */
    public static final uk8<Boolean> f33495f0;

    /* renamed from: g */
    public static final uk8<String> f33496g = m51155b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", dg8.f28189a);

    /* renamed from: g0 */
    public static final uk8<Boolean> f33497g0;

    /* renamed from: h */
    public static final uk8<Integer> f33498h = m51155b("measurement.upload.max_bundles", 100, 100, bh8.f21318a);

    /* renamed from: h0 */
    public static final uk8<Boolean> f33499h0;

    /* renamed from: i */
    public static final uk8<Integer> f33500i = m51155b("measurement.upload.max_batch_size", 65536, 65536, ej8.f28625a);

    /* renamed from: i0 */
    public static final uk8<Boolean> f33501i0;

    /* renamed from: j */
    public static final uk8<Integer> f33502j = m51155b("measurement.upload.max_bundle_size", 65536, 65536, ek8.f28627a);

    /* renamed from: j0 */
    public static final uk8<Boolean> f33503j0;

    /* renamed from: k */
    public static final uk8<Integer> f33504k = m51155b("measurement.upload.max_events_per_bundle", 1000, 1000, gk8.f29247a);

    /* renamed from: k0 */
    public static final uk8<Boolean> f33505k0;

    /* renamed from: l */
    public static final uk8<Integer> f33506l;

    /* renamed from: l0 */
    public static final uk8<Boolean> f33507l0;

    /* renamed from: m */
    public static final uk8<Integer> f33508m = m51155b("measurement.upload.max_error_events_per_day", 1000, 1000, j98.f30271a);

    /* renamed from: m0 */
    public static final uk8<Boolean> f33509m0;

    /* renamed from: n */
    public static final uk8<Integer> f33510n;

    /* renamed from: n0 */
    public static final uk8<Boolean> f33511n0;

    /* renamed from: o */
    public static final uk8<Integer> f33512o = m51155b("measurement.upload.max_conversions_per_day", 10000, 10000, p98.f32613a);

    /* renamed from: o0 */
    public static final uk8<Boolean> f33513o0;

    /* renamed from: p */
    public static final uk8<Integer> f33514p = m51155b("measurement.upload.max_realtime_events_per_day", 10, 10, s98.f33803a);

    /* renamed from: p0 */
    public static final uk8<Boolean> f33515p0;

    /* renamed from: q */
    public static final uk8<Integer> f33516q;

    /* renamed from: q0 */
    public static final uk8<Boolean> f33517q0;

    /* renamed from: r */
    public static final uk8<String> f33518r = m51155b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", db8.f28141a);

    /* renamed from: r0 */
    public static final uk8<Boolean> f33519r0;

    /* renamed from: s */
    public static final uk8<Long> f33520s = m51155b("measurement.upload.backoff_period", 43200000L, 43200000L, gb8.f29166a);

    /* renamed from: s0 */
    public static final uk8<Boolean> f33521s0;

    /* renamed from: t */
    public static final uk8<Long> f33522t = m51155b("measurement.upload.window_interval", 3600000L, 3600000L, kb8.f30799a);

    /* renamed from: t0 */
    public static final uk8<Boolean> f33523t0;

    /* renamed from: u */
    public static final uk8<Long> f33524u = m51155b("measurement.upload.interval", 3600000L, 3600000L, nb8.f32087a);

    /* renamed from: u0 */
    public static final uk8<Boolean> f33525u0;

    /* renamed from: v */
    public static final uk8<Long> f33526v = m51155b("measurement.upload.realtime_upload_interval", 10000L, 10000L, qb8.f33043a);

    /* renamed from: v0 */
    public static final uk8<Boolean> f33527v0;

    /* renamed from: w */
    public static final uk8<Long> f33528w = m51155b("measurement.upload.debug_upload_interval", 1000L, 1000L, vb8.f34899a);

    /* renamed from: w0 */
    public static final uk8<Integer> f33529w0 = m51155b("measurement.service.storage_consent_support_version", 203600, 203600, aj8.f20962a);

    /* renamed from: x */
    public static final uk8<Long> f33530x = m51155b("measurement.upload.minimum_delay", 500L, 500L, xb8.f35592a);

    /* renamed from: x0 */
    public static final uk8<Boolean> f33531x0;

    /* renamed from: y */
    public static final uk8<Long> f33532y = m51155b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zb8.f36109a);

    /* renamed from: y0 */
    public static final uk8<Boolean> f33533y0;

    /* renamed from: z */
    public static final uk8<Long> f33534z = m51155b("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, dc8.f28151a);

    /* renamed from: z0 */
    public static final uk8<Boolean> f33535z0;

    static {
        Integer valueOf = Integer.valueOf(NodeSerialization.LONGEST_EAGER_ALLOC);
        f33506l = m51155b("measurement.upload.max_events_per_day", valueOf, valueOf, jk8.f30521a);
        Integer valueOf2 = Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        f33510n = m51155b("measurement.upload.max_public_events_per_day", valueOf2, valueOf2, m98.f31602a);
        f33516q = m51155b("measurement.store.max_stored_events_per_app", valueOf, valueOf, v98.f34895a);
        Long valueOf3 = Long.valueOf(yt6.DEFAULT_POLLING_FREQUENCY);
        f33452B = m51155b("measurement.upload.initial_upload_delay_time", valueOf3, valueOf3, ic8.f29887a);
        Integer valueOf4 = Integer.valueOf(MlKitException.CODE_SCANNER_UNAVAILABLE);
        f33462G = m51155b("measurement.audience.filter_result_max_count", valueOf4, valueOf4, yc8.f35849a);
        Boolean bool = Boolean.FALSE;
        f33469L = m51155b("measurement.test.boolean_flag", bool, bool, ed8.f28580a);
        Double valueOf5 = Double.valueOf(-3.0d);
        f33473P = m51155b("measurement.test.double_flag", valueOf5, valueOf5, pd8.f32662a);
        f33477T = m51155b("measurement.validation.internal_limits_internal_event_params", bool, bool, df8.f28182a);
        Boolean bool2 = Boolean.TRUE;
        f33478U = m51155b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, gf8.f29235a);
        f33479V = m51155b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, jf8.f30489a);
        f33480W = m51155b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, mf8.f31691a);
        f33481X = m51155b("measurement.quality.checksum", bool, bool, (ok8) null);
        f33482Y = m51155b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, of8.f32371a);
        f33483Z = m51155b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, rf8.f33430a);
        f33485a0 = m51155b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, uf8.f34592a);
        f33487b0 = m51155b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, xf8.f35626a);
        f33489c0 = m51155b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, ag8.f20944a);
        f33491d0 = m51155b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, cg8.f21749a);
        f33493e0 = m51155b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, gg8.f29236a);
        f33495f0 = m51155b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, ig8.f29939a);
        f33497g0 = m51155b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, kg8.f30874a);
        f33499h0 = m51155b("measurement.upload.file_lock_state_check", bool2, bool2, mg8.f31695a);
        f33501i0 = m51155b("measurement.ga.ga_app_id", bool, bool, og8.f32374a);
        f33503j0 = m51155b("measurement.lifecycle.app_in_background_parameter", bool, bool, qg8.f33096a);
        f33505k0 = m51155b("measurement.integration.disable_firebase_instance_id", bool, bool, sg8.f33890a);
        f33507l0 = m51155b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, ug8.f34598a);
        f33509m0 = m51155b("measurement.collection.service.update_with_analytics_fix", bool, bool, wg8.f35324a);
        f33511n0 = m51155b("measurement.service.use_appinfo_modified", bool2, bool2, yg8.f35883a);
        f33513o0 = m51155b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, fh8.f28881a);
        f33515p0 = m51155b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, ih8.f29940a);
        f33517q0 = m51155b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, hi8.f29648a);
        f33519r0 = m51155b("measurement.upload.file_truncate_fix", bool, bool, li8.f31326a);
        f33521s0 = m51155b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, oi8.f32392a);
        f33523t0 = m51155b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, ri8.f33440a);
        f33525u0 = m51155b("measurement.collection.synthetic_data_mitigation", bool, bool, ui8.f34607a);
        f33527v0 = m51155b("measurement.androidId.delete_feature", bool2, bool2, xi8.f35639a);
        f33531x0 = m51155b("measurement.upload.directly_maybe_log_error_events", bool2, bool2, cj8.f21794a);
        f33533y0 = m51155b("measurement.frontend.directly_maybe_log_error_events", bool, bool, hj8.f29652a);
        f33535z0 = m51155b("measurement.client.properties.non_null_origin", bool2, bool2, jj8.f30506a);
        f33451A0 = m51155b("measurement.client.click_identifier_control.dev", bool, bool, lj8.f31328a);
        f33453B0 = m51155b("measurement.service.click_identifier_control", bool, bool, oj8.f32393a);
        f33455C0 = m51155b("measurement.client.reject_blank_user_id", bool2, bool2, qj8.f33145a);
        f33457D0 = m51155b("measurement.config.persist_last_modified", bool2, bool2, sj8.f33919a);
        f33459E0 = m51155b("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, vj8.f34963a);
        f33461F0 = m51155b("measurement.module.pixie.ees", bool, bool, xj8.f35644a);
        f33463G0 = m51155b("measurement.euid.client.dev", bool, bool, zj8.f36176a);
        f33465H0 = m51155b("measurement.euid.service", bool, bool, ck8.f21804a);
    }

    /* renamed from: a */
    public static Map<String, String> m51154a(Context context) {
        kv8 b = kv8.m47557b(context.getContentResolver(), pw8.m50175a("com.google.android.gms.measurement"));
        if (b == null) {
            return Collections.emptyMap();
        }
        return b.mo45303c();
    }

    /* renamed from: b */
    public static <V> uk8<V> m51155b(String str, V v, V v2, ok8<V> ok8) {
        uk8 uk8 = new uk8(str, v, v2, ok8, (mk8) null);
        f33484a.add(uk8);
        return uk8;
    }
}
