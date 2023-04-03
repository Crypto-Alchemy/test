package p000;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bt5 */
/* compiled from: SefReader */
public final class bt5 {

    /* renamed from: d */
    public static final f76 f8242d = f76.m44217d(':');

    /* renamed from: e */
    public static final f76 f8243e = f76.m44217d('*');

    /* renamed from: a */
    public final List<C1649a> f8244a = new ArrayList();

    /* renamed from: b */
    public int f8245b = 0;

    /* renamed from: c */
    public int f8246c;

    /* renamed from: bt5$a */
    /* compiled from: SefReader */
    public static final class C1649a {

        /* renamed from: a */
        public final int f8247a;

        /* renamed from: b */
        public final long f8248b;

        /* renamed from: c */
        public final int f8249c;

        public C1649a(int i, long j, int i2) {
            this.f8247a = i;
            this.f8248b = j;
            this.f8249c = i2;
        }
    }

    /* renamed from: b */
    public static int m11561b(String str) throws ParserException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", (Throwable) null);
        }
    }

    /* renamed from: f */
    public static SlowMotionData m11562f(gm4 gm4, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> f = f8243e.mo42533f(gm4.mo20659A(i));
        int i2 = 0;
        while (i2 < f.size()) {
            List<String> f2 = f8242d.mo42533f(f.get(i2));
            if (f2.size() == 3) {
                try {
                    arrayList.add(new SlowMotionData.Segment(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
                    i2++;
                } catch (NumberFormatException e) {
                    throw ParserException.createForMalformedContainer((String) null, e);
                }
            } else {
                throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* renamed from: a */
    public final void mo11811a(iy1 iy1, mt4 mt4) throws IOException {
        gm4 gm4 = new gm4(8);
        iy1.readFully(gm4.mo20679d(), 0, 8);
        this.f8246c = gm4.mo20692q() + 8;
        if (gm4.mo20689n() != 1397048916) {
            mt4.f15249a = 0;
            return;
        }
        mt4.f15249a = iy1.getPosition() - ((long) (this.f8246c - 12));
        this.f8245b = 2;
    }

    /* renamed from: c */
    public int mo11812c(iy1 iy1, mt4 mt4, List<Metadata.Entry> list) throws IOException {
        int i = this.f8245b;
        long j = 0;
        if (i == 0) {
            long length = iy1.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            mt4.f15249a = j;
            this.f8245b = 1;
        } else if (i == 1) {
            mo11811a(iy1, mt4);
        } else if (i == 2) {
            mo11813d(iy1, mt4);
        } else if (i == 3) {
            mo11814e(iy1, list);
            mt4.f15249a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: d */
    public final void mo11813d(iy1 iy1, mt4 mt4) throws IOException {
        long length = iy1.getLength();
        int i = (this.f8246c - 12) - 8;
        gm4 gm4 = new gm4(i);
        iy1.readFully(gm4.mo20679d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            gm4.mo20675Q(2);
            short s = gm4.mo20694s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f8244a.add(new C1649a(s, (length - ((long) this.f8246c)) - ((long) gm4.mo20692q()), gm4.mo20692q()));
            } else {
                gm4.mo20675Q(8);
            }
        }
        if (this.f8244a.isEmpty()) {
            mt4.f15249a = 0;
            return;
        }
        this.f8245b = 3;
        mt4.f15249a = this.f8244a.get(0).f8248b;
    }

    /* renamed from: e */
    public final void mo11814e(iy1 iy1, List<Metadata.Entry> list) throws IOException {
        long position = iy1.getPosition();
        int length = (int) ((iy1.getLength() - iy1.getPosition()) - ((long) this.f8246c));
        gm4 gm4 = new gm4(length);
        iy1.readFully(gm4.mo20679d(), 0, length);
        for (int i = 0; i < this.f8244a.size(); i++) {
            C1649a aVar = this.f8244a.get(i);
            gm4.mo20674P((int) (aVar.f8248b - position));
            gm4.mo20675Q(4);
            int q = gm4.mo20692q();
            int b = m11561b(gm4.mo20659A(q));
            int i2 = aVar.f8249c - (q + 8);
            if (b == 2192) {
                list.add(m11562f(gm4, i2));
            } else if (!(b == 2816 || b == 2817 || b == 2819 || b == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public void mo11815g() {
        this.f8244a.clear();
        this.f8245b = 0;
    }
}
