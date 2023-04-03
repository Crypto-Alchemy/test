package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: m78 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class m78 extends t49 {

    /* renamed from: f */
    public static final String[] f31527f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f31528g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f31529h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i */
    public static final String[] f31530i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f31531j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f31532k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f31533l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f31534m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final g78 f31535d;

    /* renamed from: e */
    public final j49 f31536e = new j49(this.f34342a.mo45256a());

    public m78(s59 s59) {
        super(s59);
        this.f34342a.mo45274y();
        this.f31535d = new g78(this, this.f34342a.mo45271q(), "google_app_measurement.db");
    }

    /* renamed from: J */
    public static final void m48121J(ContentValues contentValues, String str, Object obj) {
        cu4.m43217g("value");
        cu4.m43221k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x003e=Splitter:B:12:0x003e, B:29:0x008e=Splitter:B:29:0x008e} */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45654I(java.lang.String r21, long r22, long r24, p000.q59 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            p000.cu4.m43221k(r26)
            r20.mo29006e()
            r20.mo47982g()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo45660P()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0077
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x0068
            r4.close()
            return
        L_0x0068:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x00bf
        L_0x0074:
            r0 = move-exception
            goto L_0x0219
        L_0x0077:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0086
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            goto L_0x008a
        L_0x0086:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            java.lang.String r5 = " and rowid <= ?"
        L_0x008e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0215 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x00b8
            r4.close()
            return
        L_0x00b8:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
        L_0x00bf:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r11
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0211, all -> 0x020d }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r4 != 0) goto L_0x0100
            kr8 r0 = r1.f34342a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            vm8 r0 = r0.mo29670l()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r0.mo48770b(r2, r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r12.close()
            return
        L_0x0100:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            nr8 r5 = p000.or8.m49408K0()     // Catch:{ IOException -> 0x01e3 }
            p79 r4 = p000.w59.m53712J(r5, r4)     // Catch:{ IOException -> 0x01e3 }
            nr8 r4 = (p000.nr8) r4     // Catch:{ IOException -> 0x01e3 }
            s49 r4 = r4.mo48885o()     // Catch:{ IOException -> 0x01e3 }
            or8 r4 = (p000.or8) r4     // Catch:{ IOException -> 0x01e3 }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            if (r5 == 0) goto L_0x012d
            kr8 r5 = r1.f34342a     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            bn8 r5 = r5.mo45237A()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            vm8 r5 = r5.mo29673o()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5.mo48770b(r6, r7)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
        L_0x012d:
            r12.close()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            p000.cu4.m43221k(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r2.f32943a = r4     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x014d
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r5
            goto L_0x0159
        L_0x014d:
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            r7 = r4
            r8 = r6
        L_0x0159:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x0207, all -> 0x0201 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r16 = 0
            r4 = r0
            r17 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 == 0) goto L_0x01cc
        L_0x017c:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0074 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0074 }
            uq8 r7 = p000.wq8.m54013I()     // Catch:{ IOException -> 0x01ad }
            p79 r0 = p000.w59.m53712J(r7, r0)     // Catch:{ IOException -> 0x01ad }
            uq8 r0 = (p000.uq8) r0     // Catch:{ IOException -> 0x01ad }
            java.lang.String r7 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo48493I(r7)     // Catch:{ SQLiteException -> 0x0074 }
            r7 = 2
            long r8 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo48496L(r8)     // Catch:{ SQLiteException -> 0x0074 }
            s49 r0 = r0.mo48885o()     // Catch:{ SQLiteException -> 0x0074 }
            wq8 r0 = (p000.wq8) r0     // Catch:{ SQLiteException -> 0x0074 }
            boolean r0 = r2.mo46973a(r5, r0)     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x01c2
            r4.close()
            return
        L_0x01ad:
            r0 = move-exception
            r7 = 2
            kr8 r5 = r1.f34342a     // Catch:{ SQLiteException -> 0x0074 }
            bn8 r5 = r5.mo45237A()     // Catch:{ SQLiteException -> 0x0074 }
            vm8 r5 = r5.mo29670l()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r5.mo48771c(r6, r8, r0)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x01c2:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x017c
            r4.close()
            return
        L_0x01cc:
            kr8 r0 = r1.f34342a     // Catch:{ SQLiteException -> 0x0074 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x0074 }
            vm8 r0 = r0.mo29673o()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r0.mo48770b(r2, r5)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()
            return
        L_0x01e3:
            r0 = move-exception
            r17 = r12
            kr8 r2 = r1.f34342a     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = p000.bn8.m32664w(r3)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r2.mo48771c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fd }
            r17.close()
            return
        L_0x01fd:
            r0 = move-exception
            goto L_0x0204
        L_0x01ff:
            r0 = move-exception
            goto L_0x020a
        L_0x0201:
            r0 = move-exception
            r17 = r12
        L_0x0204:
            r3 = r17
            goto L_0x0234
        L_0x0207:
            r0 = move-exception
            r17 = r12
        L_0x020a:
            r4 = r17
            goto L_0x0219
        L_0x020d:
            r0 = move-exception
            r3 = r16
            goto L_0x0234
        L_0x0211:
            r0 = move-exception
            r4 = r16
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            goto L_0x0234
        L_0x0217:
            r0 = move-exception
            r4 = r3
        L_0x0219:
            kr8 r2 = r1.f34342a     // Catch:{ all -> 0x0232 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0232 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x0232 }
            r2.mo48771c(r5, r3, r0)     // Catch:{ all -> 0x0232 }
            if (r4 == 0) goto L_0x0231
            r4.close()
        L_0x0231:
            return
        L_0x0232:
            r0 = move-exception
            r3 = r4
        L_0x0234:
            if (r3 == 0) goto L_0x0239
            r3.close()
        L_0x0239:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45654I(java.lang.String, long, long, q59):void");
    }

    /* renamed from: K */
    public final long mo45655K(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo45660P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: L */
    public final long mo45656L(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo45660P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    public final void mo45657M() {
        mo47982g();
        mo45660P().beginTransaction();
    }

    /* renamed from: N */
    public final void mo45658N() {
        mo47982g();
        mo45660P().setTransactionSuccessful();
    }

    /* renamed from: O */
    public final void mo45659O() {
        mo47982g();
        mo45660P().endTransaction();
    }

    /* renamed from: P */
    public final SQLiteDatabase mo45660P() {
        mo29006e();
        try {
            return this.f31535d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29673o().mo48770b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.m88 mo45661Q(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p000.cu4.m43217g(r28)
            p000.cu4.m43217g(r29)
            r27.mo29006e()
            r27.mo47982g()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo45660P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            m88 r24 = new m88     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            kr8 r0 = r1.f34342a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            vm8 r0 = r0.mo29670l()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo48770b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            kr8 r2 = r1.f34342a     // Catch:{ all -> 0x014b }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x014b }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r28)     // Catch:{ all -> 0x014b }
            kr8 r5 = r1.f34342a     // Catch:{ all -> 0x014b }
            mm8 r5 = r5.mo45244H()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo45821m(r6)     // Catch:{ all -> 0x014b }
            r2.mo48772d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45661Q(java.lang.String, java.lang.String):m88");
    }

    /* renamed from: R */
    public final void mo45662R(m88 m88) {
        long j;
        cu4.m43221k(m88);
        mo29006e();
        mo47982g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m88.f31538a);
        contentValues.put(PublicResolver.FUNC_NAME, m88.f31539b);
        contentValues.put("lifetime_count", Long.valueOf(m88.f31540c));
        contentValues.put("current_bundle_count", Long.valueOf(m88.f31541d));
        contentValues.put("last_fire_timestamp", Long.valueOf(m88.f31543f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(m88.f31544g));
        contentValues.put("last_bundled_day", m88.f31545h);
        contentValues.put("last_sampled_complex_event_id", m88.f31546i);
        contentValues.put("last_sampling_rate", m88.f31547j);
        contentValues.put("current_session_count", Long.valueOf(m88.f31542e));
        Boolean bool = m88.f31548k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (mo45660P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert/update event aggregates (got -1). appId", bn8.m32664w(m88.f31538a));
            }
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing event aggregates. appId", bn8.m32664w(m88.f31538a), e);
        }
    }

    /* renamed from: S */
    public final void mo45663S(String str, String str2) {
        cu4.m43217g(str);
        cu4.m43217g(str2);
        mo29006e();
        mo47982g();
        try {
            mo45660P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48772d("Error deleting user property. appId", bn8.m32664w(str), this.f34342a.mo45244H().mo45823o(str2), e);
        }
    }

    /* renamed from: T */
    public final boolean mo45664T(a69 a69) {
        cu4.m43221k(a69);
        mo29006e();
        mo47982g();
        if (mo45665U(a69.f20821a, a69.f20823c) == null) {
            if (g69.m44586j0(a69.f20823c)) {
                if (mo45655K("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{a69.f20821a}) >= ((long) this.f34342a.mo45274y().mo45995t(a69.f20821a, rl8.f33464H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(a69.f20823c)) {
                long K = mo45655K("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{a69.f20821a, a69.f20822b});
                this.f34342a.mo45274y();
                if (K >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a69.f20821a);
        contentValues.put("origin", a69.f20822b);
        contentValues.put(PublicResolver.FUNC_NAME, a69.f20823c);
        contentValues.put("set_timestamp", Long.valueOf(a69.f20824d));
        m48121J(contentValues, "value", a69.f20825e);
        try {
            if (mo45660P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert/update user property (got -1). appId", bn8.m32664w(a69.f20821a));
            }
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing user property. appId", bn8.m32664w(a69.f20821a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.a69 mo45665U(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p000.cu4.m43217g(r20)
            p000.cu4.m43217g(r21)
            r19.mo29006e()
            r19.mo47982g()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo45660P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo45683l(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            a69 r0 = new a69     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            kr8 r2 = r1.f34342a     // Catch:{ SQLiteException -> 0x0079 }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x0079 }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo48770b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            kr8 r2 = r1.f34342a     // Catch:{ all -> 0x00a2 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x00a2 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r20)     // Catch:{ all -> 0x00a2 }
            kr8 r5 = r1.f34342a     // Catch:{ all -> 0x00a2 }
            mm8 r5 = r5.mo45244H()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo45823o(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo48772d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45665U(java.lang.String, java.lang.String):a69");
    }

    /* renamed from: V */
    public final List<a69> mo45666V(String str) {
        cu4.m43217g(str);
        mo29006e();
        mo47982g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f34342a.mo45274y();
            Cursor query = mo45660P().query("user_attributes", new String[]{PublicResolver.FUNC_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object l = mo45683l(query, 3);
                    if (l == null) {
                        this.f34342a.mo45237A().mo29670l().mo48770b("Read invalid user property value, ignoring it. appId", bn8.m32664w(str));
                    } else {
                        arrayList.add(new a69(str, str2, string, j, l));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error querying user properties. appId", bn8.m32664w(str), e);
            List<a69> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d A[DONT_GENERATE] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p000.a69> mo45667W(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            p000.cu4.m43217g(r17)
            r16.mo29006e()
            r16.mo47982g()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00ff }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00fd }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00f9 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r2 = r16.mo45660P()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r9 = "rowid"
            kr8 r3 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo45274y()     // Catch:{ SQLiteException -> 0x00f9 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 != 0) goto L_0x008f
            r11.close()
            return r0
        L_0x008f:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00f9 }
            kr8 r3 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f9 }
            r3.mo45274y()     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x00b5
            kr8 r2 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f9 }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x00f9 }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            kr8 r5 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f9 }
            r5.mo45274y()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo48770b(r4, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00f5
        L_0x00b5:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 2
            java.lang.Object r9 = r1.mo45683l(r11, r2)     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r9 != 0) goto L_0x00e0
            kr8 r2 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f9 }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x00f9 }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = p000.bn8.m32664w(r17)     // Catch:{ SQLiteException -> 0x00f9 }
            r10 = r19
            r2.mo48772d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00f9 }
            goto L_0x00ee
        L_0x00e0:
            r10 = r19
            a69 r2 = new a69     // Catch:{ SQLiteException -> 0x00f9 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00f9 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00ee:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            goto L_0x008f
        L_0x00f5:
            r11.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0121
        L_0x00fd:
            r0 = move-exception
            goto L_0x0102
        L_0x00ff:
            r0 = move-exception
            r13 = r17
        L_0x0102:
            r14 = r18
        L_0x0104:
            kr8 r2 = r1.f34342a     // Catch:{ all -> 0x00fb }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x00fb }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = p000.bn8.m32664w(r17)     // Catch:{ all -> 0x00fb }
            r2.mo48772d(r3, r4, r14, r0)     // Catch:{ all -> 0x00fb }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0120
            r11.close()
        L_0x0120:
            return r0
        L_0x0121:
            if (r11 == 0) goto L_0x0126
            r11.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45667W(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: X */
    public final boolean mo45668X(zzaa zzaa) {
        cu4.m43221k(zzaa);
        mo29006e();
        mo47982g();
        String str = zzaa.f23064a;
        cu4.m43221k(str);
        if (mo45665U(str, zzaa.f23066e.f23079d) == null) {
            long K = mo45655K("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f34342a.mo45274y();
            if (K >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaa.f23065d);
        contentValues.put(PublicResolver.FUNC_NAME, zzaa.f23066e.f23079d);
        m48121J(contentValues, "value", cu4.m43221k(zzaa.f23066e.mo31423r1()));
        contentValues.put("active", Boolean.valueOf(zzaa.f23068k));
        contentValues.put("trigger_event_name", zzaa.f23069r);
        contentValues.put("trigger_timeout", Long.valueOf(zzaa.f23071x));
        contentValues.put("timed_out_event", this.f34342a.mo45243G().mo42796L(zzaa.f23070s));
        contentValues.put("creation_timestamp", Long.valueOf(zzaa.f23067g));
        contentValues.put("triggered_event", this.f34342a.mo45243G().mo42796L(zzaa.f23072y));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaa.f23066e.f23080e));
        contentValues.put("time_to_live", Long.valueOf(zzaa.f23062A));
        contentValues.put("expired_event", this.f34342a.mo45243G().mo42796L(zzaa.f23063B));
        try {
            if (mo45660P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert/update conditional user property (got -1)", bn8.m32664w(str));
            }
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing conditional user property", bn8.m32664w(str), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaa mo45669Y(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p000.cu4.m43217g(r31)
            p000.cu4.m43217g(r32)
            r30.mo29006e()
            r30.mo47982g()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo45660P()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f5 }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f3 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r17 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f3 }
            java.lang.Object r6 = r1.mo45683l(r10, r3)     // Catch:{ SQLiteException -> 0x00f3 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            if (r0 == 0) goto L_0x0060
            r21 = r3
            goto L_0x0062
        L_0x0060:
            r21 = r2
        L_0x0062:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            s59 r0 = r1.f33321b     // Catch:{ SQLiteException -> 0x00f3 }
            w59 r0 = r0.mo47655Z()     // Catch:{ SQLiteException -> 0x00f3 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f3 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzas> r3 = com.google.android.gms.measurement.internal.zzas.CREATOR     // Catch:{ SQLiteException -> 0x00f3 }
            android.os.Parcelable r0 = r0.mo48897B(r2, r3)     // Catch:{ SQLiteException -> 0x00f3 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzas r23 = (com.google.android.gms.measurement.internal.zzas) r23     // Catch:{ SQLiteException -> 0x00f3 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            s59 r0 = r1.f33321b     // Catch:{ SQLiteException -> 0x00f3 }
            w59 r0 = r0.mo47655Z()     // Catch:{ SQLiteException -> 0x00f3 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f3 }
            android.os.Parcelable r0 = r0.mo48897B(r2, r3)     // Catch:{ SQLiteException -> 0x00f3 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzas r26 = (com.google.android.gms.measurement.internal.zzas) r26     // Catch:{ SQLiteException -> 0x00f3 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f3 }
            s59 r0 = r1.f33321b     // Catch:{ SQLiteException -> 0x00f3 }
            w59 r0 = r0.mo47655Z()     // Catch:{ SQLiteException -> 0x00f3 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f3 }
            android.os.Parcelable r0 = r0.mo48897B(r2, r3)     // Catch:{ SQLiteException -> 0x00f3 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzas r29 = (com.google.android.gms.measurement.internal.zzas) r29     // Catch:{ SQLiteException -> 0x00f3 }
            com.google.android.gms.measurement.internal.zzkq r18 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ SQLiteException -> 0x00f3 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f3 }
            com.google.android.gms.measurement.internal.zzaa r0 = new com.google.android.gms.measurement.internal.zzaa     // Catch:{ SQLiteException -> 0x00f3 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f3 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f3 }
            if (r2 == 0) goto L_0x00ef
            kr8 r2 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f3 }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x00f3 }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x00f3 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = p000.bn8.m32664w(r31)     // Catch:{ SQLiteException -> 0x00f3 }
            kr8 r5 = r1.f34342a     // Catch:{ SQLiteException -> 0x00f3 }
            mm8 r5 = r5.mo45244H()     // Catch:{ SQLiteException -> 0x00f3 }
            java.lang.String r5 = r5.mo45823o(r8)     // Catch:{ SQLiteException -> 0x00f3 }
            r2.mo48771c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f3 }
        L_0x00ef:
            r10.close()
            return r0
        L_0x00f3:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            goto L_0x011e
        L_0x00f7:
            r0 = move-exception
            r10 = r9
        L_0x00f9:
            kr8 r2 = r1.f34342a     // Catch:{ all -> 0x011c }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x011c }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = p000.bn8.m32664w(r31)     // Catch:{ all -> 0x011c }
            kr8 r5 = r1.f34342a     // Catch:{ all -> 0x011c }
            mm8 r5 = r5.mo45244H()     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r5.mo45823o(r8)     // Catch:{ all -> 0x011c }
            r2.mo48772d(r3, r4, r5, r0)     // Catch:{ all -> 0x011c }
            if (r10 == 0) goto L_0x011b
            r10.close()
        L_0x011b:
            return r9
        L_0x011c:
            r0 = move-exception
            r9 = r10
        L_0x011e:
            if (r9 == 0) goto L_0x0123
            r9.close()
        L_0x0123:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45669Y(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaa");
    }

    /* renamed from: Z */
    public final int mo45670Z(String str, String str2) {
        cu4.m43217g(str);
        cu4.m43217g(str2);
        mo29006e();
        mo47982g();
        try {
            return mo45660P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48772d("Error deleting conditional property", bn8.m32664w(str), this.f34342a.mo45244H().mo45823o(str2), e);
            return 0;
        }
    }

    /* renamed from: a0 */
    public final List<zzaa> mo45671a0(String str, String str2, String str3) {
        cu4.m43217g(str);
        mo29006e();
        mo47982g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return mo45672b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List<zzaa> mo45672b0(String str, String[] strArr) {
        boolean z;
        mo29006e();
        mo47982g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo45660P();
            String[] strArr2 = {"app_id", "origin", PublicResolver.FUNC_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f34342a.mo45274y();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f34342a.mo45274y();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object l = mo45683l(query, 3);
                        if (query.getInt(4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        w59 Z = this.f33321b.mo47655Z();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator creator = zzas.CREATOR;
                        arrayList.add(new zzaa(string, string2, new zzkq(string3, query.getLong(10), l, string2), query.getLong(8), z, string4, (zzas) Z.mo48897B(blob, creator), j, (zzas) this.f33321b.mo47655Z().mo48897B(query.getBlob(9), creator), query.getLong(11), (zzas) this.f33321b.mo47655Z().mo48897B(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        vm8 l2 = this.f34342a.mo45237A().mo29670l();
                        this.f34342a.mo45274y();
                        l2.mo48770b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Error querying conditional user property value", e);
            List<zzaa> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0117 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011b A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018c A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018d A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019c A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bf A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d1 A[Catch:{ SQLiteException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020b  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.cs8 mo45673c0(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            p000.cu4.m43217g(r34)
            r33.mo29006e()
            r33.mo47982g()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.mo45660P()     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01ec, all -> 0x01ea }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01e8 }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            cs8 r5 = new cs8     // Catch:{ SQLiteException -> 0x01e8 }
            s59 r6 = r1.f33321b     // Catch:{ SQLiteException -> 0x01e8 }
            kr8 r6 = r6.mo47680p()     // Catch:{ SQLiteException -> 0x01e8 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41665P(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41667R(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41673X(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41690h(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41679b0(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41683d0(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41687f0(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41695j0(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41676a(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41680c(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r7 != 0) goto L_0x00d5
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r6 = r12
            goto L_0x00d6
        L_0x00d5:
            r6 = r0
        L_0x00d6:
            r5.mo41688g(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41702p(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41704r(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41706t(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41708v(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41696k(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41699m(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r7 == 0) goto L_0x011b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0120
        L_0x011b:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0120:
            r5.mo41691h0(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41675Z(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41712z(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41710x(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41653D(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            kr8 r6 = r1.f34342a     // Catch:{ SQLiteException -> 0x01e8 }
            n68 r6 = r6.mo45274y()     // Catch:{ SQLiteException -> 0x01e8 }
            uk8<java.lang.Boolean> r7 = p000.rl8.f33527v0     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r6 = r6.mo45997v(r3, r7)     // Catch:{ SQLiteException -> 0x01e8 }
            r7 = 0
            if (r6 != 0) goto L_0x0168
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r9 == 0) goto L_0x0161
            r9 = r7
            goto L_0x0165
        L_0x0161:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0165:
            r5.mo41655F(r9)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0168:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r9 != 0) goto L_0x0178
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r0 = r12
        L_0x0178:
            r5.mo41657H(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41669T(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 == 0) goto L_0x018d
            goto L_0x0191
        L_0x018d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x0191:
            r5.mo41684e(r7)     // Catch:{ SQLiteException -> 0x01e8 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r6 != 0) goto L_0x01ae
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01e8 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41661L(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01ae:
            p000.le9.m47797a()     // Catch:{ SQLiteException -> 0x01e8 }
            kr8 r0 = r1.f34342a     // Catch:{ SQLiteException -> 0x01e8 }
            n68 r0 = r0.mo45274y()     // Catch:{ SQLiteException -> 0x01e8 }
            uk8<java.lang.Boolean> r6 = p000.rl8.f33501i0     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r0 = r0.mo45997v(r2, r6)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r0 == 0) goto L_0x01c8
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01e8 }
            r5.mo41671V(r0)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01c8:
            r5.mo41662M()     // Catch:{ SQLiteException -> 0x01e8 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01e8 }
            if (r0 == 0) goto L_0x01e4
            kr8 r0 = r1.f34342a     // Catch:{ SQLiteException -> 0x01e8 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x01e8 }
            vm8 r0 = r0.mo29670l()     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r34)     // Catch:{ SQLiteException -> 0x01e8 }
            r0.mo48770b(r6, r7)     // Catch:{ SQLiteException -> 0x01e8 }
        L_0x01e4:
            r4.close()
            return r5
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ea:
            r0 = move-exception
            goto L_0x0209
        L_0x01ec:
            r0 = move-exception
            r4 = r3
        L_0x01ee:
            kr8 r5 = r1.f34342a     // Catch:{ all -> 0x0207 }
            bn8 r5 = r5.mo45237A()     // Catch:{ all -> 0x0207 }
            vm8 r5 = r5.mo29670l()     // Catch:{ all -> 0x0207 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = p000.bn8.m32664w(r34)     // Catch:{ all -> 0x0207 }
            r5.mo48771c(r6, r2, r0)     // Catch:{ all -> 0x0207 }
            if (r4 == 0) goto L_0x0206
            r4.close()
        L_0x0206:
            return r3
        L_0x0207:
            r0 = move-exception
            r3 = r4
        L_0x0209:
            if (r3 == 0) goto L_0x020e
            r3.close()
        L_0x020e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45673c0(java.lang.String):cs8");
    }

    /* renamed from: d0 */
    public final void mo45674d0(cs8 cs8) {
        cu4.m43221k(cs8);
        mo29006e();
        mo47982g();
        String N = cs8.mo41663N();
        cu4.m43221k(N);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", N);
        contentValues.put("app_instance_id", cs8.mo41664O());
        contentValues.put("gmp_app_id", cs8.mo41666Q());
        contentValues.put("resettable_device_id_hash", cs8.mo41672W());
        contentValues.put("last_bundle_index", Long.valueOf(cs8.mo41692i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(cs8.mo41677a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(cs8.mo41681c0()));
        contentValues.put("app_version", cs8.mo41685e0());
        contentValues.put("app_store", cs8.mo41693i0());
        contentValues.put("gmp_version", Long.valueOf(cs8.mo41697k0()));
        contentValues.put("dev_cert_hash", Long.valueOf(cs8.mo41678b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(cs8.mo41686f()));
        contentValues.put("day", Long.valueOf(cs8.mo41701o()));
        contentValues.put("daily_public_events_count", Long.valueOf(cs8.mo41703q()));
        contentValues.put("daily_events_count", Long.valueOf(cs8.mo41705s()));
        contentValues.put("daily_conversions_count", Long.valueOf(cs8.mo41707u()));
        contentValues.put("config_fetched_time", Long.valueOf(cs8.mo41694j()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(cs8.mo41698l()));
        contentValues.put("app_version_int", Long.valueOf(cs8.mo41689g0()));
        contentValues.put("firebase_instance_id", cs8.mo41674Y());
        contentValues.put("daily_error_events_count", Long.valueOf(cs8.mo41711y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(cs8.mo41709w()));
        contentValues.put("health_monitor_sample", cs8.mo41651B());
        contentValues.put("android_id", Long.valueOf(cs8.mo41654E()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(cs8.mo41656G()));
        contentValues.put("admob_app_id", cs8.mo41668S());
        contentValues.put("dynamite_version", Long.valueOf(cs8.mo41682d()));
        List<String> K = cs8.mo41660K();
        if (K != null) {
            if (K.size() == 0) {
                this.f34342a.mo45237A().mo29673o().mo48770b("Safelisted events should not be an empty list. appId", N);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", K));
            }
        }
        le9.m47797a();
        if (this.f34342a.mo45274y().mo45997v(N, rl8.f33501i0)) {
            contentValues.put("ga_app_id", cs8.mo41670U());
        }
        try {
            SQLiteDatabase P = mo45660P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{N})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert/update app (got -1). appId", bn8.m32664w(N));
            }
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing app. appId", bn8.m32664w(N), e);
        }
    }

    /* renamed from: e0 */
    public final b78 mo45675e0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo45676f0(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: f0 */
    public final b78 mo45676f0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        cu4.m43217g(str);
        mo29006e();
        mo47982g();
        String[] strArr = {str};
        b78 b78 = new b78();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo45660P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f34342a.mo45237A().mo29673o().mo48770b("Not updating daily counts, app is not known. appId", bn8.m32664w(str));
                cursor.close();
                return b78;
            }
            if (cursor.getLong(0) == j) {
                b78.f21164b = cursor.getLong(1);
                b78.f21163a = cursor.getLong(2);
                b78.f21165c = cursor.getLong(3);
                b78.f21166d = cursor.getLong(4);
                b78.f21167e = cursor.getLong(5);
            }
            if (z) {
                b78.f21164b += j2;
            }
            if (z2) {
                b78.f21163a += j2;
            }
            if (z3) {
                b78.f21165c += j2;
            }
            if (z4) {
                b78.f21166d += j2;
            }
            if (z5) {
                b78.f21167e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(b78.f21163a));
            contentValues.put("daily_events_count", Long.valueOf(b78.f21164b));
            contentValues.put("daily_conversions_count", Long.valueOf(b78.f21165c));
            contentValues.put("daily_error_events_count", Long.valueOf(b78.f21166d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(b78.f21167e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return b78;
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error updating daily counts. appId", bn8.m32664w(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return b78;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: g0 */
    public final void mo45677g0(String str, byte[] bArr, String str2) {
        cu4.m43217g(str);
        mo29006e();
        mo47982g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) mo45660P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Failed to update remote config (got 0). appId", bn8.m32664w(str));
            }
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing remote config. appId", bn8.m32664w(str), e);
        }
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0047, code lost:
        if (r2 > (p000.n68.m48617f() + r0)) goto L_0x0049;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45678h0(p000.or8 r7, boolean r8) {
        /*
            r6 = this;
            r6.mo29006e()
            r6.mo47982g()
            p000.cu4.m43221k(r7)
            java.lang.String r0 = r7.mo46511x()
            p000.cu4.m43217g(r0)
            boolean r0 = r7.mo46462C1()
            p000.cu4.m43225o(r0)
            r6.mo45680j()
            kr8 r0 = r6.f34342a
            bh0 r0 = r0.mo45256a()
            long r0 = r0.mo29580a()
            long r2 = r7.mo46465D1()
            kr8 r4 = r6.f34342a
            r4.mo45274y()
            long r4 = p000.n68.m48617f()
            long r4 = r0 - r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0049
            long r2 = r7.mo46465D1()
            kr8 r4 = r6.f34342a
            r4.mo45274y()
            long r4 = p000.n68.m48617f()
            long r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
        L_0x0049:
            kr8 r2 = r6.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29673o()
            java.lang.String r3 = r7.mo46511x()
            java.lang.Object r3 = p000.bn8.m32664w(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r4 = r7.mo46465D1()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r2.mo48772d(r4, r3, r0, r1)
        L_0x006c:
            byte[] r0 = r7.mo30879c()
            r1 = 0
            s59 r2 = r6.f33321b     // Catch:{ IOException -> 0x010f }
            w59 r2 = r2.mo47655Z()     // Catch:{ IOException -> 0x010f }
            byte[] r0 = r2.mo48901I(r0)     // Catch:{ IOException -> 0x010f }
            kr8 r2 = r6.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29678v()
            int r3 = r0.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Saving bundle, size"
            r2.mo48770b(r4, r3)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = r7.mo46511x()
            java.lang.String r4 = "app_id"
            r2.put(r4, r3)
            long r3 = r7.mo46465D1()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "bundle_end_timestamp"
            r2.put(r4, r3)
            java.lang.String r3 = "data"
            r2.put(r3, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "has_realtime"
            r2.put(r0, r8)
            boolean r8 = r7.mo46458B0()
            if (r8 == 0) goto L_0x00cb
            int r8 = r7.mo46461C0()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "retry_count"
            r2.put(r0, r8)
        L_0x00cb:
            android.database.sqlite.SQLiteDatabase r8 = r6.mo45660P()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.String r0 = "queue"
            r3 = 0
            long r2 = r8.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x00f6 }
            r4 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x00f4
            kr8 r8 = r6.f34342a     // Catch:{ SQLiteException -> 0x00f6 }
            bn8 r8 = r8.mo45237A()     // Catch:{ SQLiteException -> 0x00f6 }
            vm8 r8 = r8.mo29670l()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r7.mo46511x()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.Object r2 = p000.bn8.m32664w(r2)     // Catch:{ SQLiteException -> 0x00f6 }
            r8.mo48770b(r0, r2)     // Catch:{ SQLiteException -> 0x00f6 }
            return r1
        L_0x00f4:
            r7 = 1
            return r7
        L_0x00f6:
            r8 = move-exception
            kr8 r0 = r6.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29670l()
            java.lang.String r7 = r7.mo46511x()
            java.lang.Object r7 = p000.bn8.m32664w(r7)
            java.lang.String r2 = "Error storing bundle. appId"
            r0.mo48771c(r2, r7, r8)
            return r1
        L_0x010f:
            r8 = move-exception
            kr8 r0 = r6.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29670l()
            java.lang.String r7 = r7.mo46511x()
            java.lang.Object r7 = p000.bn8.m32664w(r7)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            r0.mo48771c(r2, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45678h0(or8, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo45679i0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo45660P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            kr8 r3 = r6.f34342a     // Catch:{ all -> 0x003a }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x003a }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo48770b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45679i0():java.lang.String");
    }

    /* renamed from: j */
    public final void mo45680j() {
        mo29006e();
        mo47982g();
        if (mo45693x()) {
            long a = this.f33321b.mo47656a0().f29792g.mo43882a();
            long b = this.f34342a.mo45256a().mo29581b();
            long abs = Math.abs(b - a);
            this.f34342a.mo45274y();
            if (abs > rl8.f33534z.mo48412b(null).longValue()) {
                this.f33321b.mo47656a0().f29792g.mo43883b(b);
                mo29006e();
                mo47982g();
                if (mo45693x()) {
                    SQLiteDatabase P = mo45660P();
                    this.f34342a.mo45274y();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f34342a.mo45256a().mo29580a()), String.valueOf(n68.m48617f())});
                    if (delete > 0) {
                        this.f34342a.mo45237A().mo29678v().mo48770b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: j0 */
    public final boolean mo45681j0() {
        if (mo45655K("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo45682k(List<Long> list) {
        mo29006e();
        mo47982g();
        cu4.m43221k(list);
        cu4.m43223m(list.size());
        if (mo45693x()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (mo45655K(sb3.toString(), (String[]) null) > 0) {
                this.f34342a.mo45237A().mo29673o().mo48769a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase P = mo45660P();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < ");
                sb4.append(Integer.MAX_VALUE);
                sb4.append(")");
                P.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: l */
    public final Object mo45683l(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f34342a.mo45237A().mo29670l().mo48769a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: m */
    public final long mo45684m() {
        return mo45656L("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: n */
    public final long mo45685n(String str, String str2) {
        long j;
        SQLiteException e;
        cu4.m43217g(str);
        cu4.m43217g("first_open_count");
        mo29006e();
        mo47982g();
        SQLiteDatabase P = mo45660P();
        P.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(48);
            sb.append("select ");
            sb.append("first_open_count");
            sb.append(" from app2 where app_id=?");
            j = mo45656L(sb.toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f34342a.mo45237A().mo29670l().mo48771c("Failed to insert column (got -1). appId", bn8.m32664w(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f34342a.mo45237A().mo29670l().mo48771c("Failed to update column (got 0). appId", bn8.m32664w(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.f34342a.mo45237A().mo29670l().mo48772d("Error inserting column. appId", bn8.m32664w(str), "first_open_count", e);
                P.endTransaction();
                return j;
            } catch (Throwable th) {
                P.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final long mo45686o() {
        return mo45656L("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: p */
    public final boolean mo45687p() {
        if (mo45655K("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo45688r() {
        if (mo45655K("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final long mo45689t(String str) {
        cu4.m43217g(str);
        return mo45656L("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* renamed from: u */
    public final boolean mo45690u(String str, Long l, long j, wq8 wq8) {
        mo29006e();
        mo47982g();
        cu4.m43221k(wq8);
        cu4.m43217g(str);
        cu4.m43221k(l);
        byte[] c = wq8.mo30879c();
        this.f34342a.mo45237A().mo29678v().mo48771c("Saving complex main event, appId, data size", this.f34342a.mo45244H().mo45821m(str), Integer.valueOf(c.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", c);
        try {
            if (mo45660P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert complex main event (got -1). appId", bn8.m32664w(str));
            return false;
        } catch (SQLiteException e) {
            this.f34342a.mo45237A().mo29670l().mo48771c("Error storing complex main event. appId", bn8.m32664w(str), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo45691v(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo29006e()
            r7.mo47982g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo45660P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            kr8 r8 = r7.f34342a     // Catch:{ SQLiteException -> 0x00ba }
            bn8 r8 = r8.mo45237A()     // Catch:{ SQLiteException -> 0x00ba }
            vm8 r8 = r8.mo29678v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo48769a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            uq8 r3 = p000.wq8.m54013I()     // Catch:{ IOException -> 0x00a2 }
            p79 r2 = p000.w59.m53712J(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            uq8 r2 = (p000.uq8) r2     // Catch:{ IOException -> 0x00a2 }
            s49 r2 = r2.mo48885o()     // Catch:{ IOException -> 0x00a2 }
            wq8 r2 = (p000.wq8) r2     // Catch:{ IOException -> 0x00a2 }
            s59 r8 = r7.f33321b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo47655Z()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo49255x()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            er8 r3 = (p000.er8) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo42393y()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo42387G()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo42388H()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo42385E()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo42386F()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo42394z()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo42382B()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo42383C()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo42384D()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            kr8 r3 = r7.f34342a     // Catch:{ SQLiteException -> 0x00ba }
            bn8 r3 = r3.mo45237A()     // Catch:{ SQLiteException -> 0x00ba }
            vm8 r3 = r3.mo29670l()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = p000.bn8.m32664w(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo48771c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            kr8 r2 = r7.f34342a     // Catch:{ all -> 0x00d5 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x00d5 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo48770b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45691v(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo47454z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0338, code lost:
        if (r3.mo47450E() == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo47451F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0358, code lost:
        if (mo45660P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035a, code lost:
        r9.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert property filter (got -1). appId", p000.bn8.m32664w(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r9.f34342a.mo45237A().mo29670l().mo48771c("Error storing property filter. appId", p000.bn8.m32664w(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.mo45459z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r11.next().mo47452x() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r9.f34342a.mo45237A().mo29673o().mo48771c("Property filter with no ID. Audience definition ignored. appId, audienceId", p000.bn8.m32664w(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.mo45454D().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12 = r11.next();
        mo47982g();
        mo29006e();
        p000.cu4.m43217g(r24);
        p000.cu4.m43221k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.mo47446z()) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f2, code lost:
        r0 = r9.f34342a.mo45237A().mo29673o();
        r8 = p000.bn8.m32664w(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020a, code lost:
        if (r12.mo47444x() == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo47445y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0219, code lost:
        r0.mo48772d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0224, code lost:
        r3 = r12.mo30879c();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023d, code lost:
        if (r12.mo47444x() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.mo47445y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.mo47446z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0259, code lost:
        if (r12.mo47442I() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.mo47443J());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
        if (mo45660P().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027b, code lost:
        r9.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert event filter (got -1). appId", p000.bn8.m32664w(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028e, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02aa, code lost:
        r21 = r4;
        r0 = r0.mo45459z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b8, code lost:
        if (r0.hasNext() == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ba, code lost:
        r3 = r0.next();
        mo47982g();
        mo29006e();
        p000.cu4.m43217g(r24);
        p000.cu4.m43221k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.mo47454z()) == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d6, code lost:
        r0 = r9.f34342a.mo45237A().mo29673o();
        r7 = p000.bn8.m32664w(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ee, code lost:
        if (r3.mo47452x() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo47453y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        r0.mo48772d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0303, code lost:
        r4 = r3.mo30879c();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031a, code lost:
        if (r3.mo47452x() == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo47453y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0325, code lost:
        r12 = null;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45692w(java.lang.String r24, java.util.List<p000.lm8> r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            p000.cu4.m43221k(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            lm8 r9 = (p000.lm8) r9
            w39 r9 = r9.mo47634s()
            im8 r9 = (p000.im8) r9
            int r11 = r9.mo43660z()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.mo43660z()
            if (r11 >= r13) goto L_0x00a3
            rm8 r13 = r12.mo43655B(r11)
            w39 r13 = r13.mo47634s()
            om8 r13 = (p000.om8) r13
            w39 r14 = r13.clone()
            om8 r14 = (p000.om8) r14
            java.lang.String r15 = r13.mo46428w()
            java.lang.String r15 = p000.cu8.m43238b(r15)
            if (r15 == 0) goto L_0x0051
            r14.mo46429x(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.mo46430y()
            if (r7 >= r10) goto L_0x008b
            xm8 r10 = r13.mo46431z(r7)
            r16 = r13
            java.lang.String r13 = r10.mo49517F()
            r17 = r4
            java.lang.String[] r4 = p000.eu8.f28682a
            java.lang.String[] r1 = p000.eu8.f28683b
            java.lang.String r1 = p000.ry8.m51437b(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            w39 r4 = r10.mo47634s()
            um8 r4 = (p000.um8) r4
            r4.mo48413w(r1)
            s49 r1 = r4.mo48885o()
            xm8 r1 = (p000.xm8) r1
            r14.mo46427B(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.mo43656C(r11, r14)
            s49 r1 = r9.mo48885o()
            lm8 r1 = (p000.lm8) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.mo43657w()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.mo43657w()
            if (r1 >= r4) goto L_0x00e1
            rn8 r4 = r12.mo43658x(r1)
            java.lang.String r7 = r4.mo47454z()
            java.lang.String[] r10 = p000.fu8.f28992a
            java.lang.String[] r11 = p000.fu8.f28993b
            java.lang.String r7 = p000.ry8.m51437b(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            w39 r4 = r4.mo47634s()
            on8 r4 = (p000.on8) r4
            r4.mo46443w(r7)
            r12.mo43659y(r1, r4)
            s49 r4 = r9.mo48885o()
            lm8 r4 = (p000.lm8) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.mo47982g()
            r23.mo29006e()
            p000.cu4.m43217g(r24)
            p000.cu4.m43221k(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.mo45660P()
            r1.beginTransaction()
            r23.mo47982g()     // Catch:{ all -> 0x04be }
            r23.mo29006e()     // Catch:{ all -> 0x04be }
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04be }
            android.database.sqlite.SQLiteDatabase r4 = r23.mo45660P()     // Catch:{ all -> 0x04be }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04be }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04be }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04be }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04be }
            r8[r9] = r2     // Catch:{ all -> 0x04be }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04be }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04be }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04be }
            lm8 r0 = (p000.lm8) r0     // Catch:{ all -> 0x04be }
            r23.mo47982g()     // Catch:{ all -> 0x04be }
            r23.mo29006e()     // Catch:{ all -> 0x04be }
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04be }
            p000.cu4.m43221k(r0)     // Catch:{ all -> 0x04be }
            boolean r9 = r0.mo45457x()     // Catch:{ all -> 0x04be }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            kr8 r0 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            r0.mo48770b(r7, r8)     // Catch:{ all -> 0x04bc }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.mo45458y()     // Catch:{ all -> 0x04bc }
            java.util.List r11 = r0.mo45454D()     // Catch:{ all -> 0x04bc }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04bc }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04bc }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04bc }
            rm8 r12 = (p000.rm8) r12     // Catch:{ all -> 0x04bc }
            boolean r12 = r12.mo47444x()     // Catch:{ all -> 0x04bc }
            if (r12 != 0) goto L_0x0161
            kr8 r0 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r0.mo48771c(r7, r8, r10)     // Catch:{ all -> 0x04bc }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.mo45459z()     // Catch:{ all -> 0x04bc }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04bc }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04bc }
            if (r12 == 0) goto L_0x01be
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04bc }
            rn8 r12 = (p000.rn8) r12     // Catch:{ all -> 0x04bc }
            boolean r12 = r12.mo47452x()     // Catch:{ all -> 0x04bc }
            if (r12 != 0) goto L_0x0193
            kr8 r0 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r0.mo48771c(r7, r8, r10)     // Catch:{ all -> 0x04bc }
            goto L_0x011f
        L_0x01be:
            java.util.List r11 = r0.mo45454D()     // Catch:{ all -> 0x04bc }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04bc }
        L_0x01c6:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02aa
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04bc }
            rm8 r12 = (p000.rm8) r12     // Catch:{ all -> 0x04bc }
            r23.mo47982g()     // Catch:{ all -> 0x04bc }
            r23.mo29006e()     // Catch:{ all -> 0x04bc }
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04bc }
            p000.cu4.m43221k(r12)     // Catch:{ all -> 0x04bc }
            java.lang.String r21 = r12.mo47446z()     // Catch:{ all -> 0x04bc }
            boolean r21 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x04bc }
            if (r21 == 0) goto L_0x0224
            kr8 r0 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            boolean r13 = r12.mo47444x()     // Catch:{ all -> 0x04bc }
            if (r13 == 0) goto L_0x0217
            int r12 = r12.mo47445y()     // Catch:{ all -> 0x04bc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04bc }
            r20 = r12
            goto L_0x0219
        L_0x0217:
            r20 = 0
        L_0x0219:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04bc }
            r0.mo48772d(r7, r8, r11, r12)     // Catch:{ all -> 0x04bc }
            r21 = r4
            goto L_0x0386
        L_0x0224:
            byte[] r3 = r12.mo30879c()     // Catch:{ all -> 0x04bc }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04bc }
            r4.<init>()     // Catch:{ all -> 0x04bc }
            r4.put(r15, r2)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r4.put(r8, r15)     // Catch:{ all -> 0x04bc }
            boolean r8 = r12.mo47444x()     // Catch:{ all -> 0x04bc }
            if (r8 == 0) goto L_0x0248
            int r8 = r12.mo47445y()     // Catch:{ all -> 0x04bc }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04bc }
            goto L_0x0249
        L_0x0248:
            r8 = 0
        L_0x0249:
            r4.put(r14, r8)     // Catch:{ all -> 0x04bc }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.mo47446z()     // Catch:{ all -> 0x04bc }
            r4.put(r8, r14)     // Catch:{ all -> 0x04bc }
            boolean r8 = r12.mo47442I()     // Catch:{ all -> 0x04bc }
            if (r8 == 0) goto L_0x0264
            boolean r8 = r12.mo47443J()     // Catch:{ all -> 0x04bc }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04bc }
            goto L_0x0265
        L_0x0264:
            r8 = 0
        L_0x0265:
            r4.put(r13, r8)     // Catch:{ all -> 0x04bc }
            r4.put(r7, r3)     // Catch:{ all -> 0x04bc }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo45660P()     // Catch:{ SQLiteException -> 0x0294 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x028e
            kr8 r3 = r9.f34342a     // Catch:{ SQLiteException -> 0x0294 }
            bn8 r3 = r3.mo45237A()     // Catch:{ SQLiteException -> 0x0294 }
            vm8 r3 = r3.mo29670l()     // Catch:{ SQLiteException -> 0x0294 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = p000.bn8.m32664w(r24)     // Catch:{ SQLiteException -> 0x0294 }
            r3.mo48770b(r4, r7)     // Catch:{ SQLiteException -> 0x0294 }
        L_0x028e:
            r3 = r25
            r4 = r21
            goto L_0x01c6
        L_0x0294:
            r0 = move-exception
            kr8 r3 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            r3.mo48771c(r4, r7, r0)     // Catch:{ all -> 0x04bc }
            goto L_0x0386
        L_0x02aa:
            r21 = r4
            java.util.List r0 = r0.mo45459z()     // Catch:{ all -> 0x04bc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04bc }
        L_0x02b4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04bc }
            if (r3 == 0) goto L_0x03bd
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04bc }
            rn8 r3 = (p000.rn8) r3     // Catch:{ all -> 0x04bc }
            r23.mo47982g()     // Catch:{ all -> 0x04bc }
            r23.mo29006e()     // Catch:{ all -> 0x04bc }
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04bc }
            p000.cu4.m43221k(r3)     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = r3.mo47454z()     // Catch:{ all -> 0x04bc }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x04bc }
            if (r4 == 0) goto L_0x0303
            kr8 r0 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            boolean r11 = r3.mo47452x()     // Catch:{ all -> 0x04bc }
            if (r11 == 0) goto L_0x02f9
            int r3 = r3.mo47453y()     // Catch:{ all -> 0x04bc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04bc }
            goto L_0x02fa
        L_0x02f9:
            r3 = 0
        L_0x02fa:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04bc }
            r0.mo48772d(r4, r7, r8, r3)     // Catch:{ all -> 0x04bc }
            goto L_0x0386
        L_0x0303:
            byte[] r4 = r3.mo30879c()     // Catch:{ all -> 0x04bc }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04bc }
            r11.<init>()     // Catch:{ all -> 0x04bc }
            r11.put(r15, r2)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r11.put(r8, r12)     // Catch:{ all -> 0x04bc }
            boolean r12 = r3.mo47452x()     // Catch:{ all -> 0x04bc }
            if (r12 == 0) goto L_0x0325
            int r12 = r3.mo47453y()     // Catch:{ all -> 0x04bc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04bc }
            goto L_0x0326
        L_0x0325:
            r12 = 0
        L_0x0326:
            r11.put(r14, r12)     // Catch:{ all -> 0x04bc }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo47454z()     // Catch:{ all -> 0x04bc }
            r11.put(r12, r0)     // Catch:{ all -> 0x04bc }
            boolean r0 = r3.mo47450E()     // Catch:{ all -> 0x04bc }
            if (r0 == 0) goto L_0x0343
            boolean r0 = r3.mo47451F()     // Catch:{ all -> 0x04bc }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04bc }
            goto L_0x0344
        L_0x0343:
            r0 = 0
        L_0x0344:
            r11.put(r13, r0)     // Catch:{ all -> 0x04bc }
            r11.put(r7, r4)     // Catch:{ all -> 0x04bc }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo45660P()     // Catch:{ SQLiteException -> 0x0372 }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x0372 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036e
            kr8 r0 = r9.f34342a     // Catch:{ SQLiteException -> 0x0372 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x0372 }
            vm8 r0 = r0.mo29670l()     // Catch:{ SQLiteException -> 0x0372 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = p000.bn8.m32664w(r24)     // Catch:{ SQLiteException -> 0x0372 }
            r0.mo48770b(r3, r4)     // Catch:{ SQLiteException -> 0x0372 }
            goto L_0x0386
        L_0x036e:
            r0 = r22
            goto L_0x02b4
        L_0x0372:
            r0 = move-exception
            kr8 r3 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            r3.mo48771c(r4, r7, r0)     // Catch:{ all -> 0x04bc }
        L_0x0386:
            r23.mo47982g()     // Catch:{ all -> 0x04bc }
            r23.mo29006e()     // Catch:{ all -> 0x04bc }
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04bc }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo45660P()     // Catch:{ all -> 0x04bc }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04bc }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04bc }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04bc }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04bc }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04bc }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04bc }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04bc }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04bc }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03bd:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03c3:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04bc }
            r0.<init>()     // Catch:{ all -> 0x04bc }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04bc }
        L_0x03cf:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04bc }
            if (r5 == 0) goto L_0x03ef
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04bc }
            lm8 r5 = (p000.lm8) r5     // Catch:{ all -> 0x04bc }
            boolean r6 = r5.mo45457x()     // Catch:{ all -> 0x04bc }
            if (r6 == 0) goto L_0x03ea
            int r5 = r5.mo45458y()     // Catch:{ all -> 0x04bc }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04bc }
            goto L_0x03eb
        L_0x03ea:
            r8 = r3
        L_0x03eb:
            r0.add(r8)     // Catch:{ all -> 0x04bc }
            goto L_0x03cf
        L_0x03ef:
            p000.cu4.m43217g(r24)     // Catch:{ all -> 0x04bc }
            r23.mo47982g()     // Catch:{ all -> 0x04bc }
            r23.mo29006e()     // Catch:{ all -> 0x04bc }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo45660P()     // Catch:{ all -> 0x04bc }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x04a1 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x04a1 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.mo45655K(r4, r5)     // Catch:{ SQLiteException -> 0x04a1 }
            kr8 r6 = r9.f34342a     // Catch:{ all -> 0x04bc }
            n68 r6 = r6.mo45274y()     // Catch:{ all -> 0x04bc }
            r7 = 2000(0x7d0, float:2.803E-42)
            uk8<java.lang.Integer> r8 = p000.rl8.f33462G     // Catch:{ all -> 0x04bc }
            int r6 = r6.mo45994r(r2, r8)     // Catch:{ all -> 0x04bc }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04bc }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04bc }
            long r7 = (long) r6     // Catch:{ all -> 0x04bc }
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0426
            goto L_0x04b5
        L_0x0426:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04bc }
            r4.<init>()     // Catch:{ all -> 0x04bc }
            r5 = 0
        L_0x042c:
            int r7 = r0.size()     // Catch:{ all -> 0x04bc }
            if (r5 >= r7) goto L_0x0448
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04bc }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04bc }
            if (r7 == 0) goto L_0x04b5
            int r7 = r7.intValue()     // Catch:{ all -> 0x04bc }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04bc }
            r4.add(r7)     // Catch:{ all -> 0x04bc }
            int r5 = r5 + 1
            goto L_0x042c
        L_0x0448:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04bc }
            int r4 = r4.length()     // Catch:{ all -> 0x04bc }
            r5 = 2
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bc }
            r5.<init>(r4)     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "("
            r5.append(r4)     // Catch:{ all -> 0x04bc }
            r5.append(r0)     // Catch:{ all -> 0x04bc }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x04bc }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "audience_filter_values"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04bc }
            int r5 = r5.length()     // Catch:{ all -> 0x04bc }
            int r5 = r5 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bc }
            r7.<init>(r5)     // Catch:{ all -> 0x04bc }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r7.append(r5)     // Catch:{ all -> 0x04bc }
            r7.append(r0)     // Catch:{ all -> 0x04bc }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r7.append(r0)     // Catch:{ all -> 0x04bc }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x04bc }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x04bc }
            r7 = 0
            r5[r7] = r2     // Catch:{ all -> 0x04bc }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04bc }
            r6 = 1
            r5[r6] = r2     // Catch:{ all -> 0x04bc }
            r3.delete(r4, r0, r5)     // Catch:{ all -> 0x04bc }
            goto L_0x04b5
        L_0x04a1:
            r0 = move-exception
            kr8 r3 = r9.f34342a     // Catch:{ all -> 0x04bc }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x04bc }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x04bc }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = p000.bn8.m32664w(r24)     // Catch:{ all -> 0x04bc }
            r3.mo48771c(r4, r2, r0)     // Catch:{ all -> 0x04bc }
        L_0x04b5:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04bc }
            r1.endTransaction()
            return
        L_0x04bc:
            r0 = move-exception
            goto L_0x04c1
        L_0x04be:
            r0 = move-exception
            r9 = r23
        L_0x04c1:
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m78.mo45692w(java.lang.String, java.util.List):void");
    }

    /* renamed from: x */
    public final boolean mo45693x() {
        Context q = this.f34342a.mo45271q();
        this.f34342a.mo45274y();
        return q.getDatabasePath("google_app_measurement.db").exists();
    }
}
