package p000;

import android.content.ContentValues;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00104\u001a\u000202¢\u0006\u0004\b<\u0010=J\u0018\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0007J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0007J*\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J4\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002J(\u0010)\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0002J \u0010+\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0002R\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0019\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, mo44877d2 = {"Ltd4;", "", "", "", "unattributedUniqueOutcomeEvents", "Lr37;", "l", "Lrd4;", "event", "d", "eventParams", "k", "", "e", "m", "name", "Lid4;", "influences", "g", "notificationTableName", "notificationIdColumnName", "c", "Lcom/onesignal/influence/domain/OSInfluenceType;", "notificationInfluenceType", "Lee4;", "directSourceBody", "indirectSourceBody", "notificationIds", "Lde4;", "h", "iamInfluenceType", "iamIds", "source", "f", "", "Lvc4;", "cachedUniqueOutcomes", "Lorg/json/JSONArray;", "channelIds", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "channel", "a", "sourceBody", "b", "Lld4;", "Lld4;", "logger", "Ldi4;", "Ldi4;", "dbHelper", "Lje4;", "Lje4;", "preferences", "", "j", "()Z", "isOutcomesV2ServiceEnabled", "i", "()Ljava/util/Set;", "unattributedUniqueOutcomeEventsSentByChannel", "<init>", "(Lld4;Ldi4;Lje4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: td4 */
/* compiled from: OSOutcomeEventsCache.kt */
public final class td4 {

    /* renamed from: a */
    public final ld4 f34235a;

    /* renamed from: b */
    public final di4 f34236b;

    /* renamed from: c */
    public final je4 f34237c;

    public td4(ld4 ld4, di4 di4, je4 je4) {
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(di4, "dbHelper");
        vx2.m53591g(je4, "preferences");
        this.f34235a = ld4;
        this.f34236b = di4;
        this.f34237c = je4;
    }

    /* renamed from: a */
    public final void mo48066a(List<vc4> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    vx2.m53590f(string, "influenceId");
                    list.add(new vc4(string, oSInfluenceChannel));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo48067b(List<vc4> list, ee4 ee4) {
        if (ee4 != null) {
            JSONArray a = ee4.mo42303a();
            JSONArray b = ee4.mo42304b();
            mo48066a(list, a, OSInfluenceChannel.IAM);
            mo48066a(list, b, OSInfluenceChannel.NOTIFICATION);
        }
    }

    /* renamed from: c */
    public final synchronized void mo48068c(String str, String str2) {
        vx2.m53591g(str, "notificationTableName");
        vx2.m53591g(str2, "notificationIdColumnName");
        StringBuilder sb = new StringBuilder();
        sb.append("NOT EXISTS(SELECT NULL FROM ");
        sb.append(str);
        sb.append(" n ");
        sb.append("WHERE");
        sb.append(" n.");
        sb.append(str2);
        sb.append(" = ");
        sb.append("channel_influence_id");
        sb.append(" AND ");
        sb.append("channel_type");
        sb.append(" = \"");
        String oSInfluenceChannel = OSInfluenceChannel.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        vx2.m53590f(locale, "Locale.ROOT");
        if (oSInfluenceChannel != null) {
            String lowerCase = oSInfluenceChannel.toLowerCase(locale);
            vx2.m53590f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.f34236b.mo39147d("cached_unique_outcome", sb.toString(), (String[]) null);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: d */
    public final synchronized void mo48069d(rd4 rd4) {
        vx2.m53591g(rd4, "event");
        this.f34236b.mo39147d("outcome", "timestamp = ?", new String[]{String.valueOf(rd4.mo47384c())});
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8 A[SYNTHETIC, Splitter:B:40:0x00c8] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<p000.rd4> mo48070e() {
        /*
            r18 = this;
            r7 = r18
            monitor-enter(r18)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r9 = 0
            di4 r10 = r7.f34236b     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = "outcome"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.mo39146c(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00b7
        L_0x001f:
            java.lang.String r0 = "notification_influence_type"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x00c2 }
            com.onesignal.influence.domain.OSInfluenceType$a r1 = com.onesignal.influence.domain.OSInfluenceType.Companion     // Catch:{ all -> 0x00c2 }
            com.onesignal.influence.domain.OSInfluenceType r0 = r1.mo38919a(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "iam_influence_type"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x00c2 }
            com.onesignal.influence.domain.OSInfluenceType r2 = r1.mo38919a(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "notification_ids"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            java.lang.String r1 = "[]"
        L_0x004c:
            java.lang.String r3 = "iam_ids"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            java.lang.String r3 = "[]"
        L_0x005b:
            r5 = r3
            java.lang.String r3 = "name"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r12 = r10.getString(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "weight"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            float r14 = r10.getFloat(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "timestamp"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            long r15 = r10.getLong(r3)     // Catch:{ all -> 0x00c2 }
            ee4 r3 = new ee4     // Catch:{ JSONException -> 0x00a9 }
            r4 = 3
            r3.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a9 }
            ee4 r6 = new ee4     // Catch:{ JSONException -> 0x00a9 }
            r6.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a9 }
            de4 r0 = r7.mo48073h(r0, r3, r6, r1)     // Catch:{ JSONException -> 0x00a9 }
            r1 = r18
            r4 = r6
            r6 = r0
            r1.mo48071f(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x00a9 }
            if (r0 == 0) goto L_0x0094
        L_0x0092:
            r13 = r0
            goto L_0x009a
        L_0x0094:
            de4 r0 = new de4     // Catch:{ JSONException -> 0x00a9 }
            r0.<init>(r9, r9)     // Catch:{ JSONException -> 0x00a9 }
            goto L_0x0092
        L_0x009a:
            rd4 r0 = new rd4     // Catch:{ JSONException -> 0x00a9 }
            java.lang.String r1 = "name"
            p000.vx2.m53590f(r12, r1)     // Catch:{ JSONException -> 0x00a9 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ JSONException -> 0x00a9 }
            r8.add(r0)     // Catch:{ JSONException -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r0 = move-exception
            ld4 r1 = r7.f34235a     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "Generating JSONArray from notifications ids outcome:JSON Failed."
            r1.error(r2, r0)     // Catch:{ all -> 0x00c2 }
        L_0x00b1:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x001f
        L_0x00b7:
            boolean r0 = r10.isClosed()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00c0
            r10.close()     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            monitor-exit(r18)
            return r8
        L_0x00c2:
            r0 = move-exception
            r9 = r10
            goto L_0x00c6
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            if (r9 == 0) goto L_0x00d1
            boolean r1 = r9.isClosed()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00d1
            r9.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.td4.mo48070e():java.util.List");
    }

    /* renamed from: f */
    public final de4 mo48071f(OSInfluenceType oSInfluenceType, ee4 ee4, ee4 ee42, String str, de4 de4) {
        de4 c;
        de4 d;
        int i = sd4.f33827b[oSInfluenceType.ordinal()];
        if (i == 1) {
            ee4.mo42305c(new JSONArray(str));
            if (de4 == null || (c = de4.mo41914c(ee4)) == null) {
                return new de4(ee4, (ee4) null);
            }
            return c;
        } else if (i != 2) {
            return de4;
        } else {
            ee42.mo42305c(new JSONArray(str));
            if (de4 == null || (d = de4.mo41915d(ee42)) == null) {
                return new de4((ee4) null, ee42);
            }
            return d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r4.isClosed() == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r4.isClosed() == false) goto L_0x0092;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<p000.id4> mo48072g(java.lang.String r23, java.util.List<p000.id4> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            monitor-enter(r22)
            java.lang.String r2 = "name"
            p000.vx2.m53591g(r0, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "influences"
            r3 = r24
            p000.vx2.m53591g(r3, r2)     // Catch:{ all -> 0x00b3 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b3 }
            r2.<init>()     // Catch:{ all -> 0x00b3 }
            r4 = 0
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x0098 }
        L_0x001b:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x0098 }
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x0098 }
            id4 r5 = (p000.id4) r5     // Catch:{ JSONException -> 0x0098 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0098 }
            r6.<init>()     // Catch:{ JSONException -> 0x0098 }
            org.json.JSONArray r7 = r5.mo43564b()     // Catch:{ JSONException -> 0x0098 }
            if (r7 == 0) goto L_0x001b
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0098 }
            r9 = 0
            r10 = r9
        L_0x0038:
            if (r10 >= r8) goto L_0x0079
            java.lang.String r11 = r7.getString(r10)     // Catch:{ JSONException -> 0x0098 }
            com.onesignal.influence.domain.OSInfluenceChannel r12 = r5.mo43565c()     // Catch:{ JSONException -> 0x0098 }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r16 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x0098 }
            r14[r9] = r11     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0098 }
            r13 = 1
            r14[r13] = r12     // Catch:{ JSONException -> 0x0098 }
            r12 = 2
            r14[r12] = r0     // Catch:{ JSONException -> 0x0098 }
            di4 r13 = r1.f34236b     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = "cached_unique_outcome"
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r21 = "1"
            r17 = r14
            r14 = r12
            android.database.Cursor r4 = r13.mo39145b(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = "cursor"
            p000.vx2.m53590f(r4, r12)     // Catch:{ JSONException -> 0x0098 }
            int r12 = r4.getCount()     // Catch:{ JSONException -> 0x0098 }
            if (r12 != 0) goto L_0x0076
            r6.put(r11)     // Catch:{ JSONException -> 0x0098 }
        L_0x0076:
            int r10 = r10 + 1
            goto L_0x0038
        L_0x0079:
            int r7 = r6.length()     // Catch:{ JSONException -> 0x0098 }
            if (r7 <= 0) goto L_0x001b
            id4 r5 = r5.mo43563a()     // Catch:{ JSONException -> 0x0098 }
            r5.mo43567e(r6)     // Catch:{ JSONException -> 0x0098 }
            r2.add(r5)     // Catch:{ JSONException -> 0x0098 }
            goto L_0x001b
        L_0x008a:
            if (r4 == 0) goto L_0x00a5
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00a5
        L_0x0092:
            r4.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00a5
        L_0x0096:
            r0 = move-exception
            goto L_0x00a7
        L_0x0098:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x00a5
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            monitor-exit(r22)
            return r2
        L_0x00a7:
            if (r4 == 0) goto L_0x00b2
            boolean r2 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r2 != 0) goto L_0x00b2
            r4.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.td4.mo48072g(java.lang.String, java.util.List):java.util.List");
    }

    /* renamed from: h */
    public final de4 mo48073h(OSInfluenceType oSInfluenceType, ee4 ee4, ee4 ee42, String str) {
        de4 de4;
        int i = sd4.f33826a[oSInfluenceType.ordinal()];
        if (i == 1) {
            ee4.mo42306d(new JSONArray(str));
            de4 = new de4(ee4, (ee4) null);
        } else if (i != 2) {
            return null;
        } else {
            ee42.mo42306d(new JSONArray(str));
            de4 = new de4((ee4) null, ee42);
        }
        return de4;
    }

    /* renamed from: i */
    public final Set<String> mo48074i() {
        je4 je4 = this.f34237c;
        return je4.mo44438c(je4.mo44444i(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
    }

    /* renamed from: j */
    public final boolean mo48075j() {
        je4 je4 = this.f34237c;
        return je4.mo44442g(je4.mo44444i(), this.f34237c.mo44445j(), false);
    }

    /* renamed from: k */
    public final synchronized void mo48076k(rd4 rd4) {
        OSInfluenceType oSInfluenceType;
        ee4 b;
        ee4 a;
        OSInfluenceType oSInfluenceType2;
        vx2.m53591g(rd4, "eventParams");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        OSInfluenceType oSInfluenceType3 = OSInfluenceType.UNATTRIBUTED;
        de4 b2 = rd4.mo47383b();
        if (b2 == null || (a = b2.mo41912a()) == null) {
            oSInfluenceType = oSInfluenceType3;
        } else {
            JSONArray b3 = a.mo42304b();
            if (b3 == null || b3.length() <= 0) {
                oSInfluenceType2 = oSInfluenceType3;
            } else {
                JSONArray jSONArray3 = b3;
                oSInfluenceType2 = OSInfluenceType.DIRECT;
                jSONArray = jSONArray3;
            }
            JSONArray a2 = a.mo42303a();
            if (a2 != null && a2.length() > 0) {
                oSInfluenceType3 = OSInfluenceType.DIRECT;
                jSONArray2 = a2;
            }
            oSInfluenceType = oSInfluenceType3;
            oSInfluenceType3 = oSInfluenceType2;
        }
        de4 b4 = rd4.mo47383b();
        if (!(b4 == null || (b = b4.mo41913b()) == null)) {
            JSONArray b5 = b.mo42304b();
            if (b5 != null && b5.length() > 0) {
                oSInfluenceType3 = OSInfluenceType.INDIRECT;
                jSONArray = b5;
            }
            JSONArray a3 = b.mo42303a();
            if (a3 != null && a3.length() > 0) {
                oSInfluenceType = OSInfluenceType.INDIRECT;
                jSONArray2 = a3;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put("iam_ids", jSONArray2.toString());
        String obj = oSInfluenceType3.toString();
        if (obj != null) {
            String lowerCase = obj.toLowerCase();
            vx2.m53590f(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", lowerCase);
            String obj2 = oSInfluenceType.toString();
            if (obj2 != null) {
                String lowerCase2 = obj2.toLowerCase();
                vx2.m53590f(lowerCase2, "(this as java.lang.String).toLowerCase()");
                contentValues.put("iam_influence_type", lowerCase2);
                contentValues.put(PublicResolver.FUNC_NAME, rd4.mo47382a());
                contentValues.put("weight", Float.valueOf(rd4.mo47385d()));
                contentValues.put("timestamp", Long.valueOf(rd4.mo47384c()));
                this.f34236b.mo39148e("outcome", (String) null, contentValues);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: l */
    public final void mo48077l(Set<String> set) {
        je4 je4 = this.f34237c;
        String i = je4.mo44444i();
        vx2.m53588d(set);
        je4.mo44440e(i, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /* renamed from: m */
    public final synchronized void mo48078m(rd4 rd4) {
        ee4 ee4;
        ee4 ee42;
        vx2.m53591g(rd4, "eventParams");
        this.f34235a.debug("OneSignal saveUniqueOutcomeEventParams: " + rd4);
        String a = rd4.mo47382a();
        ArrayList<vc4> arrayList = new ArrayList<>();
        de4 b = rd4.mo47383b();
        if (b != null) {
            ee4 = b.mo41912a();
        } else {
            ee4 = null;
        }
        de4 b2 = rd4.mo47383b();
        if (b2 != null) {
            ee42 = b2.mo41913b();
        } else {
            ee42 = null;
        }
        mo48067b(arrayList, ee4);
        mo48067b(arrayList, ee42);
        for (vc4 vc4 : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", vc4.mo48714b());
            contentValues.put("channel_type", vc4.mo48713a().toString());
            contentValues.put(PublicResolver.FUNC_NAME, a);
            this.f34236b.mo39148e("cached_unique_outcome", (String) null, contentValues);
        }
    }
}
