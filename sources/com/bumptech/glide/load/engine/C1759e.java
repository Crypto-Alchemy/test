package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.data.C1735a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.e */
/* compiled from: DecodePath */
public class C1759e<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f8822a;

    /* renamed from: b */
    public final List<? extends gf5<DataType, ResourceType>> f8823b;

    /* renamed from: c */
    public final sf5<ResourceType, Transcode> f8824c;

    /* renamed from: d */
    public final ys4<List<Throwable>> f8825d;

    /* renamed from: e */
    public final String f8826e;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    /* compiled from: DecodePath */
    public interface C1760a<ResourceType> {
        /* renamed from: a */
        bf5<ResourceType> mo12443a(bf5<ResourceType> bf5);
    }

    public C1759e(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends gf5<DataType, ResourceType>> list, sf5<ResourceType, Transcode> sf5, ys4<List<Throwable>> ys4) {
        this.f8822a = cls;
        this.f8823b = list;
        this.f8824c = sf5;
        this.f8825d = ys4;
        this.f8826e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public bf5<Transcode> mo12513a(C1735a<DataType> aVar, int i, int i2, xi4 xi4, C1760a<ResourceType> aVar2) throws GlideException {
        return this.f8824c.mo18396a(aVar2.mo12443a(mo12514b(aVar, i, i2, xi4)), xi4);
    }

    /* renamed from: b */
    public final bf5<ResourceType> mo12514b(C1735a<DataType> aVar, int i, int i2, xi4 xi4) throws GlideException {
        List list = (List) zt4.m31500d(this.f8825d.mo11139b());
        try {
            return mo12515c(aVar, i, i2, xi4, list);
        } finally {
            this.f8825d.mo11138a(list);
        }
    }

    /* renamed from: c */
    public final bf5<ResourceType> mo12515c(C1735a<DataType> aVar, int i, int i2, xi4 xi4, List<Throwable> list) throws GlideException {
        int size = this.f8823b.size();
        bf5<ResourceType> bf5 = null;
        for (int i3 = 0; i3 < size; i3++) {
            gf5 gf5 = (gf5) this.f8823b.get(i3);
            try {
                if (gf5.mo414a(aVar.mo12397a(), xi4)) {
                    bf5 = gf5.mo415b(aVar.mo12397a(), i, i2, xi4);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(gf5);
                }
                list.add(e);
            }
            if (bf5 != null) {
                break;
            }
        }
        if (bf5 != null) {
            return bf5;
        }
        throw new GlideException(this.f8826e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f8822a + ", decoders=" + this.f8823b + ", transcoder=" + this.f8824c + '}';
    }
}
