package p000;

import java.io.File;
import p000.tg1;

/* renamed from: l11 */
/* compiled from: DataCacheWriter */
public class l11<DataType> implements tg1.C3363b {

    /* renamed from: a */
    public final np1<DataType> f14399a;

    /* renamed from: b */
    public final DataType f14400b;

    /* renamed from: c */
    public final xi4 f14401c;

    public l11(np1<DataType> np1, DataType datatype, xi4 xi4) {
        this.f14399a = np1;
        this.f14400b = datatype;
        this.f14401c = xi4;
    }

    /* renamed from: a */
    public boolean mo22622a(File file) {
        return this.f14399a.mo11955a(this.f14400b, file, this.f14401c);
    }
}
