package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zn */
/* compiled from: AppInfoTableDecoder */
public final class C3746zn extends q26 {
    /* renamed from: c */
    public static Metadata m31404c(fm4 fm4) {
        fm4.mo20014r(12);
        int d = (fm4.mo20000d() + fm4.mo20004h(12)) - 4;
        fm4.mo20014r(44);
        fm4.mo20015s(fm4.mo20004h(12));
        fm4.mo20014r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (fm4.mo20000d() >= d) {
                break;
            }
            fm4.mo20014r(48);
            int h = fm4.mo20004h(8);
            fm4.mo20014r(4);
            int d2 = fm4.mo20000d() + fm4.mo20004h(12);
            String str2 = null;
            while (fm4.mo20000d() < d2) {
                int h2 = fm4.mo20004h(8);
                int h3 = fm4.mo20004h(8);
                int d3 = fm4.mo20000d() + h3;
                if (h2 == 2) {
                    int h4 = fm4.mo20004h(16);
                    fm4.mo20014r(8);
                    if (h4 != 3) {
                    }
                    while (fm4.mo20000d() < d3) {
                        str = fm4.mo20008l(fm4.mo20004h(8), be0.f21261a);
                        int h5 = fm4.mo20004h(8);
                        for (int i = 0; i < h5; i++) {
                            fm4.mo20015s(fm4.mo20004h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = fm4.mo20008l(h3, be0.f21261a);
                }
                fm4.mo20012p(d3 * 8);
            }
            fm4.mo20012p(d2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new AppInfoTable(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: b */
    public Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m31404c(new fm4(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
