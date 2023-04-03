package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, mo44877d2 = {"Ljh5;", "", "", "hash", "a", "<init>", "()V", "room-common"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jh5 */
/* compiled from: RoomMasterTable.kt */
public final class jh5 {

    /* renamed from: a */
    public static final jh5 f13615a = new jh5();

    /* renamed from: a */
    public static final String m20135a(String str) {
        vx2.m53591g(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
