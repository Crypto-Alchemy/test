package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.C1735a;
import com.bumptech.glide.load.engine.C1759e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.i */
/* compiled from: LoadPath */
public class C1776i<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<Data> f8893a;

    /* renamed from: b */
    public final ys4<List<Throwable>> f8894b;

    /* renamed from: c */
    public final List<? extends C1759e<Data, ResourceType, Transcode>> f8895c;

    /* renamed from: d */
    public final String f8896d;

    public C1776i(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1759e<Data, ResourceType, Transcode>> list, ys4<List<Throwable>> ys4) {
        this.f8893a = cls;
        this.f8894b = ys4;
        this.f8895c = (List) zt4.m31499c(list);
        this.f8896d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public bf5<Transcode> mo12567a(C1735a<Data> aVar, xi4 xi4, int i, int i2, C1759e.C1760a<ResourceType> aVar2) throws GlideException {
        List list = (List) zt4.m31500d(this.f8894b.mo11139b());
        try {
            return mo12568b(aVar, xi4, i, i2, aVar2, list);
        } finally {
            this.f8894b.mo11138a(list);
        }
    }

    /* renamed from: b */
    public final bf5<Transcode> mo12568b(C1735a<Data> aVar, xi4 xi4, int i, int i2, C1759e.C1760a<ResourceType> aVar2, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f8895c.size();
        bf5<Transcode> bf5 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                bf5 = ((C1759e) this.f8895c.get(i3)).mo12513a(aVar, i, i2, xi4, aVar2);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (bf5 != null) {
                break;
            }
        }
        if (bf5 != null) {
            return bf5;
        }
        throw new GlideException(this.f8896d, (List<Throwable>) new ArrayList(list2));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f8895c.toArray()) + '}';
    }
}
