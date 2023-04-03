package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;
import p000.gf7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, mo44877d2 = {"Lcf2;", "previous", "Landroidx/paging/LoadType;", "loadType", "", "a", "paging-common"}, mo44878k = 2, mo44879mv = {1, 4, 2})
/* renamed from: xk4 */
/* compiled from: PageFetcherSnapshot.kt */
public final class xk4 {
    /* renamed from: a */
    public static final boolean m30154a(cf2 cf2, cf2 cf22, LoadType loadType) {
        vx2.m53591g(cf2, "$this$shouldPrioritizeOver");
        vx2.m53591g(cf22, "previous");
        vx2.m53591g(loadType, "loadType");
        if (cf2.mo12043a() <= cf22.mo12043a() && (!(cf22.mo12044b() instanceof gf7.C2384b) || !(cf2.mo12044b() instanceof gf7.C2383a))) {
            if ((cf2.mo12044b() instanceof gf7.C2384b) && (cf22.mo12044b() instanceof gf7.C2383a)) {
                return false;
            }
            if (cf2.mo12044b().mo20564a() == cf22.mo12044b().mo20564a() && cf2.mo12044b().mo20565b() == cf22.mo12044b().mo20565b()) {
                if (loadType == LoadType.PREPEND && cf22.mo12044b().mo20567d() < cf2.mo12044b().mo20567d()) {
                    return false;
                }
                if (loadType == LoadType.APPEND && cf22.mo12044b().mo20566c() < cf2.mo12044b().mo20566c()) {
                    return false;
                }
            }
        }
        return true;
    }
}
