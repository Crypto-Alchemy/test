package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;

/* renamed from: lv3 */
/* compiled from: MetadataUtil */
public final class lv3 {

    /* renamed from: a */
    public static final String[] f14737a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static CommentFrame m21874a(int i, gm4 gm4) {
        int n = gm4.mo20689n();
        if (gm4.mo20689n() == 1684108385) {
            gm4.mo20675Q(8);
            String y = gm4.mo20700y(n - 16);
            return new CommentFrame("und", y, y);
        }
        gk3.m18132i("MetadataUtil", "Failed to parse comment attribute: " + C2420gs.m18382a(i));
        return null;
    }

    /* renamed from: b */
    public static ApicFrame m21875b(gm4 gm4) {
        String str;
        int n = gm4.mo20689n();
        if (gm4.mo20689n() == 1684108385) {
            int b = C2420gs.m18383b(gm4.mo20689n());
            if (b == 13) {
                str = "image/jpeg";
            } else if (b == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                gk3.m18132i("MetadataUtil", "Unrecognized cover art flags: " + b);
                return null;
            }
            gm4.mo20675Q(4);
            int i = n - 16;
            byte[] bArr = new byte[i];
            gm4.mo20685j(bArr, 0, i);
            return new ApicFrame(str, (String) null, 3, bArr);
        }
        gk3.m18132i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static Metadata.Entry m21876c(gm4 gm4) {
        int e = gm4.mo20680e() + gm4.mo20689n();
        int n = gm4.mo20689n();
        int i = (n >> 24) & 255;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & n;
            if (i2 == 6516084) {
                CommentFrame a = m21874a(n, gm4);
                gm4.mo20674P(e);
                return a;
            } else if (i2 == 7233901 || i2 == 7631467) {
                TextInformationFrame h = m21881h(n, "TIT2", gm4);
                gm4.mo20674P(e);
                return h;
            } else if (i2 == 6516589 || i2 == 7828084) {
                TextInformationFrame h2 = m21881h(n, "TCOM", gm4);
                gm4.mo20674P(e);
                return h2;
            } else if (i2 == 6578553) {
                TextInformationFrame h3 = m21881h(n, "TDRC", gm4);
                gm4.mo20674P(e);
                return h3;
            } else if (i2 == 4280916) {
                TextInformationFrame h4 = m21881h(n, "TPE1", gm4);
                gm4.mo20674P(e);
                return h4;
            } else if (i2 == 7630703) {
                TextInformationFrame h5 = m21881h(n, "TSSE", gm4);
                gm4.mo20674P(e);
                return h5;
            } else if (i2 == 6384738) {
                TextInformationFrame h6 = m21881h(n, "TALB", gm4);
                gm4.mo20674P(e);
                return h6;
            } else if (i2 == 7108978) {
                TextInformationFrame h7 = m21881h(n, "USLT", gm4);
                gm4.mo20674P(e);
                return h7;
            } else if (i2 == 6776174) {
                TextInformationFrame h8 = m21881h(n, "TCON", gm4);
                gm4.mo20674P(e);
                return h8;
            } else if (i2 == 6779504) {
                TextInformationFrame h9 = m21881h(n, "TIT1", gm4);
                gm4.mo20674P(e);
                return h9;
            }
        } else if (n == 1735291493) {
            try {
                return m21880g(gm4);
            } finally {
                gm4.mo20674P(e);
            }
        } else if (n == 1684632427) {
            TextInformationFrame d = m21877d(n, "TPOS", gm4);
            gm4.mo20674P(e);
            return d;
        } else if (n == 1953655662) {
            TextInformationFrame d2 = m21877d(n, "TRCK", gm4);
            gm4.mo20674P(e);
            return d2;
        } else if (n == 1953329263) {
            Id3Frame i3 = m21882i(n, "TBPM", gm4, true, false);
            gm4.mo20674P(e);
            return i3;
        } else if (n == 1668311404) {
            Id3Frame i4 = m21882i(n, "TCMP", gm4, true, true);
            gm4.mo20674P(e);
            return i4;
        } else if (n == 1668249202) {
            ApicFrame b = m21875b(gm4);
            gm4.mo20674P(e);
            return b;
        } else if (n == 1631670868) {
            TextInformationFrame h10 = m21881h(n, "TPE2", gm4);
            gm4.mo20674P(e);
            return h10;
        } else if (n == 1936682605) {
            TextInformationFrame h11 = m21881h(n, "TSOT", gm4);
            gm4.mo20674P(e);
            return h11;
        } else if (n == 1936679276) {
            TextInformationFrame h12 = m21881h(n, "TSO2", gm4);
            gm4.mo20674P(e);
            return h12;
        } else if (n == 1936679282) {
            TextInformationFrame h13 = m21881h(n, "TSOA", gm4);
            gm4.mo20674P(e);
            return h13;
        } else if (n == 1936679265) {
            TextInformationFrame h14 = m21881h(n, "TSOP", gm4);
            gm4.mo20674P(e);
            return h14;
        } else if (n == 1936679791) {
            TextInformationFrame h15 = m21881h(n, "TSOC", gm4);
            gm4.mo20674P(e);
            return h15;
        } else if (n == 1920233063) {
            Id3Frame i5 = m21882i(n, "ITUNESADVISORY", gm4, false, false);
            gm4.mo20674P(e);
            return i5;
        } else if (n == 1885823344) {
            Id3Frame i6 = m21882i(n, "ITUNESGAPLESS", gm4, false, true);
            gm4.mo20674P(e);
            return i6;
        } else if (n == 1936683886) {
            TextInformationFrame h16 = m21881h(n, "TVSHOWSORT", gm4);
            gm4.mo20674P(e);
            return h16;
        } else if (n == 1953919848) {
            TextInformationFrame h17 = m21881h(n, "TVSHOW", gm4);
            gm4.mo20674P(e);
            return h17;
        } else if (n == 757935405) {
            Id3Frame e2 = m21878e(gm4, e);
            gm4.mo20674P(e);
            return e2;
        }
        gk3.m18125b("MetadataUtil", "Skipped unknown metadata entry: " + C2420gs.m18382a(n));
        gm4.mo20674P(e);
        return null;
    }

    /* renamed from: d */
    public static TextInformationFrame m21877d(int i, String str, gm4 gm4) {
        int n = gm4.mo20689n();
        if (gm4.mo20689n() == 1684108385 && n >= 22) {
            gm4.mo20675Q(10);
            int J = gm4.mo20668J();
            if (J > 0) {
                String str2 = "" + J;
                int J2 = gm4.mo20668J();
                if (J2 > 0) {
                    str2 = str2 + "/" + J2;
                }
                return new TextInformationFrame(str, (String) null, str2);
            }
        }
        gk3.m18132i("MetadataUtil", "Failed to parse index/count attribute: " + C2420gs.m18382a(i));
        return null;
    }

    /* renamed from: e */
    public static Id3Frame m21878e(gm4 gm4, int i) {
        int i2 = -1;
        int i3 = -1;
        String str = null;
        String str2 = null;
        while (gm4.mo20680e() < i) {
            int e = gm4.mo20680e();
            int n = gm4.mo20689n();
            int n2 = gm4.mo20689n();
            gm4.mo20675Q(4);
            if (n2 == 1835360622) {
                str = gm4.mo20700y(n - 12);
            } else if (n2 == 1851878757) {
                str2 = gm4.mo20700y(n - 12);
            } else {
                if (n2 == 1684108385) {
                    i2 = e;
                    i3 = n;
                }
                gm4.mo20675Q(n - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        gm4.mo20674P(i2);
        gm4.mo20675Q(16);
        return new InternalFrame(str, str2, gm4.mo20700y(i3 - 16));
    }

    /* renamed from: f */
    public static MdtaMetadataEntry m21879f(gm4 gm4, int i, String str) {
        while (true) {
            int e = gm4.mo20680e();
            if (e >= i) {
                return null;
            }
            int n = gm4.mo20689n();
            if (gm4.mo20689n() == 1684108385) {
                int n2 = gm4.mo20689n();
                int n3 = gm4.mo20689n();
                int i2 = n - 16;
                byte[] bArr = new byte[i2];
                gm4.mo20685j(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, n3, n2);
            }
            gm4.mo20674P(e + n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.metadata.id3.TextInformationFrame m21880g(p000.gm4 r3) {
        /*
            int r3 = m21883j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f14737a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            androidx.media3.extractor.metadata.id3.TextInformationFrame r1 = new androidx.media3.extractor.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p000.gk3.m18132i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lv3.m21880g(gm4):androidx.media3.extractor.metadata.id3.TextInformationFrame");
    }

    /* renamed from: h */
    public static TextInformationFrame m21881h(int i, String str, gm4 gm4) {
        int n = gm4.mo20689n();
        if (gm4.mo20689n() == 1684108385) {
            gm4.mo20675Q(8);
            return new TextInformationFrame(str, (String) null, gm4.mo20700y(n - 16));
        }
        gk3.m18132i("MetadataUtil", "Failed to parse text attribute: " + C2420gs.m18382a(i));
        return null;
    }

    /* renamed from: i */
    public static Id3Frame m21882i(int i, String str, gm4 gm4, boolean z, boolean z2) {
        int j = m21883j(gm4);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j < 0) {
            gk3.m18132i("MetadataUtil", "Failed to parse uint8 attribute: " + C2420gs.m18382a(i));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, Integer.toString(j));
        } else {
            return new CommentFrame("und", str, Integer.toString(j));
        }
    }

    /* renamed from: j */
    public static int m21883j(gm4 gm4) {
        gm4.mo20675Q(4);
        if (gm4.mo20689n() == 1684108385) {
            gm4.mo20675Q(8);
            return gm4.mo20662D();
        }
        gk3.m18132i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m21884k(int i, we2 we2, C0792h.C0794b bVar) {
        if (i == 1 && we2.mo27485a()) {
            bVar.mo6653N(we2.f19072a).mo6654O(we2.f19073b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21885l(int r5, androidx.media3.common.Metadata r6, androidx.media3.common.Metadata r7, androidx.media3.common.C0792h.C0794b r8, androidx.media3.common.Metadata... r9) {
        /*
            androidx.media3.common.Metadata r0 = new androidx.media3.common.Metadata
            r1 = 0
            androidx.media3.common.Metadata$Entry[] r2 = new androidx.media3.common.Metadata.Entry[r1]
            r0.<init>((androidx.media3.common.Metadata.Entry[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = r1
        L_0x0014:
            int r6 = r7.mo6545d()
            if (r5 >= r6) goto L_0x003c
            androidx.media3.common.Metadata$Entry r6 = r7.mo6544c(r5)
            boolean r3 = r6 instanceof androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L_0x0039
            androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry r6 = (androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.f5624a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            androidx.media3.common.Metadata r5 = new androidx.media3.common.Metadata
            androidx.media3.common.Metadata$Entry[] r7 = new androidx.media3.common.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>((androidx.media3.common.Metadata.Entry[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            androidx.media3.common.Metadata r6 = r6.mo6543b(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.mo6545d()
            if (r5 <= 0) goto L_0x0052
            r8.mo6663X(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lv3.m21885l(int, androidx.media3.common.Metadata, androidx.media3.common.Metadata, androidx.media3.common.h$b, androidx.media3.common.Metadata[]):void");
    }
}
