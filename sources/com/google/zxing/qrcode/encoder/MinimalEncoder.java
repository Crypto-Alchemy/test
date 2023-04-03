package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class MinimalEncoder {
    /* access modifiers changed from: private */
    public final ErrorCorrectionLevel ecLevel;
    /* access modifiers changed from: private */
    public final ECIEncoderSet encoders;
    /* access modifiers changed from: private */
    public final boolean isGS1;
    /* access modifiers changed from: private */
    public final String stringToEncode;

    /* renamed from: com.google.zxing.qrcode.encoder.MinimalEncoder$1 */
    public static /* synthetic */ class C50571 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        /* renamed from: $SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize */
        public static final /* synthetic */ int[] f25818x9d14eba6;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode = r0
                r1 = 1
                com.google.zxing.qrcode.decoder.Mode r2 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r3 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.google.zxing.qrcode.encoder.MinimalEncoder$VersionSize[] r3 = com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f25818x9d14eba6 = r3
                com.google.zxing.qrcode.encoder.MinimalEncoder$VersionSize r4 = com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.SMALL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f25818x9d14eba6     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.google.zxing.qrcode.encoder.MinimalEncoder$VersionSize r3 = com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f25818x9d14eba6     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.google.zxing.qrcode.encoder.MinimalEncoder$VersionSize r1 = com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.LARGE     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.MinimalEncoder.C50571.<clinit>():void");
        }
    }

    public final class Edge {
        /* access modifiers changed from: private */
        public final int cachedTotalSize;
        /* access modifiers changed from: private */
        public final int characterLength;
        /* access modifiers changed from: private */
        public final int charsetEncoderIndex;
        /* access modifiers changed from: private */
        public final int fromPosition;
        /* access modifiers changed from: private */
        public final Mode mode;
        /* access modifiers changed from: private */
        public final Edge previous;

        public /* synthetic */ Edge(MinimalEncoder minimalEncoder, Mode mode2, int i, int i2, int i3, Edge edge, Version version, C50571 r8) {
            this(mode2, i, i2, i3, edge, version);
        }

        private Edge(Mode mode2, int i, int i2, int i3, Edge edge, Version version) {
            this.mode = mode2;
            this.fromPosition = i;
            Mode mode3 = Mode.BYTE;
            int i4 = (mode2 == mode3 || edge == null) ? i2 : edge.charsetEncoderIndex;
            this.charsetEncoderIndex = i4;
            this.characterLength = i3;
            this.previous = edge;
            boolean z = false;
            int i5 = edge != null ? edge.cachedTotalSize : 0;
            if ((mode2 == mode3 && edge == null && i4 != 0) || !(edge == null || i4 == edge.charsetEncoderIndex)) {
                z = true;
            }
            int i6 = 4;
            i5 = (edge == null || mode2 != edge.mode || z) ? i5 + mode2.getCharacterCountBits(version) + 4 : i5;
            int i7 = C50571.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode2.ordinal()];
            if (i7 == 1) {
                i5 += 13;
            } else if (i7 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i7 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : i6;
            } else if (i7 == 4) {
                i5 += MinimalEncoder.this.encoders.encode(MinimalEncoder.this.stringToEncode.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.cachedTotalSize = i5;
        }
    }

    public final class ResultList {
        private final List<ResultNode> list = new ArrayList();
        /* access modifiers changed from: private */
        public final Version version;

        public final class ResultNode {
            private final int characterLength;
            private final int charsetEncoderIndex;
            private final int fromPosition;
            /* access modifiers changed from: private */
            public final Mode mode;

            public ResultNode(Mode mode2, int i, int i2, int i3) {
                this.mode = mode2;
                this.fromPosition = i;
                this.charsetEncoderIndex = i2;
                this.characterLength = i3;
            }

            /* access modifiers changed from: private */
            public void getBits(BitArray bitArray) throws WriterException {
                bitArray.appendBits(this.mode.getBits(), 4);
                if (this.characterLength > 0) {
                    bitArray.appendBits(getCharacterCountIndicator(), this.mode.getCharacterCountBits(ResultList.this.version));
                }
                if (this.mode == Mode.ECI) {
                    bitArray.appendBits(MinimalEncoder.this.encoders.getECIValue(this.charsetEncoderIndex), 8);
                } else if (this.characterLength > 0) {
                    String access$500 = MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    Encoder.appendBytes(access$500.substring(i, this.characterLength + i), this.mode, bitArray, MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex));
                }
            }

            private int getCharacterCountIndicator() {
                if (this.mode != Mode.BYTE) {
                    return this.characterLength;
                }
                ECIEncoderSet access$600 = MinimalEncoder.this.encoders;
                String access$500 = MinimalEncoder.this.stringToEncode;
                int i = this.fromPosition;
                return access$600.encode(access$500.substring(i, this.characterLength + i), this.charsetEncoderIndex).length;
            }

            /* access modifiers changed from: private */
            public int getSize(Version version) {
                int i = 4;
                int characterCountBits = this.mode.getCharacterCountBits(version) + 4;
                int i2 = C50571.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[this.mode.ordinal()];
                if (i2 != 1) {
                    int i3 = 0;
                    if (i2 == 2) {
                        int i4 = this.characterLength;
                        int i5 = characterCountBits + ((i4 / 2) * 11);
                        if (i4 % 2 == 1) {
                            i3 = 6;
                        }
                        return i5 + i3;
                    } else if (i2 == 3) {
                        int i6 = this.characterLength;
                        characterCountBits += (i6 / 3) * 10;
                        int i7 = i6 % 3;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                i = 7;
                            } else {
                                i = 0;
                            }
                        }
                    } else if (i2 == 4) {
                        i = getCharacterCountIndicator() * 8;
                    } else if (i2 != 5) {
                        return characterCountBits;
                    } else {
                        return characterCountBits + 8;
                    }
                } else {
                    i = this.characterLength * 13;
                }
                return characterCountBits + i;
            }

            private String makePrintable(String str) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < ' ' || str.charAt(i) > '~') {
                        sb.append('.');
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
                return sb.toString();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mode);
                sb.append('(');
                if (this.mode == Mode.ECI) {
                    sb.append(MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex).displayName());
                } else {
                    String access$500 = MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    sb.append(makePrintable(access$500.substring(i, this.characterLength + i)));
                }
                sb.append(')');
                return sb.toString();
            }
        }

        public ResultList(Version version2, Edge edge) {
            int i;
            int i2;
            Mode mode;
            boolean z;
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                i = 1;
                if (edge == null) {
                    break;
                }
                int access$000 = i4 + edge.characterLength;
                Edge access$700 = edge.previous;
                if (!(edge.mode == Mode.BYTE && access$700 == null && edge.charsetEncoderIndex != 0) && (access$700 == null || edge.charsetEncoderIndex == access$700.charsetEncoderIndex)) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = z ? true : z2;
                if (access$700 == null || access$700.mode != edge.mode || z) {
                    this.list.add(0, new ResultNode(edge.mode, edge.fromPosition, edge.charsetEncoderIndex, access$000));
                    access$000 = 0;
                }
                if (z) {
                    this.list.add(0, new ResultNode(Mode.ECI, edge.fromPosition, edge.charsetEncoderIndex, 0));
                }
                edge = access$700;
                i4 = access$000;
            }
            if (MinimalEncoder.this.isGS1) {
                ResultNode resultNode = this.list.get(0);
                if (!(resultNode == null || resultNode.mode == (mode = Mode.ECI) || !z2)) {
                    this.list.add(0, new ResultNode(mode, 0, 0, 0));
                }
                this.list.add(this.list.get(0).mode == Mode.ECI ? 1 : i3, new ResultNode(Mode.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int versionNumber = version2.getVersionNumber();
            int i5 = C50571.f25818x9d14eba6[MinimalEncoder.getVersionSize(version2).ordinal()];
            if (i5 == 1) {
                i2 = 9;
            } else if (i5 != 2) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int size = getSize(version2);
            while (versionNumber < i2 && !Encoder.willFit(size, Version.getVersionForNumber(versionNumber), MinimalEncoder.this.ecLevel)) {
                versionNumber++;
            }
            while (versionNumber > i && Encoder.willFit(size, Version.getVersionForNumber(versionNumber - 1), MinimalEncoder.this.ecLevel)) {
                versionNumber--;
            }
            this.version = Version.getVersionForNumber(versionNumber);
        }

        public void getBits(BitArray bitArray) throws WriterException {
            for (ResultNode access$1300 : this.list) {
                access$1300.getBits(bitArray);
            }
        }

        public int getSize() {
            return getSize(this.version);
        }

        public Version getVersion() {
            return this.version;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ResultNode resultNode = null;
            for (ResultNode next : this.list) {
                if (resultNode != null) {
                    sb.append(",");
                }
                sb.append(next.toString());
                resultNode = next;
            }
            return sb.toString();
        }

        private int getSize(Version version2) {
            int i = 0;
            for (ResultNode access$1200 : this.list) {
                i += access$1200.getSize(version2);
            }
            return i;
        }
    }

    public enum VersionSize {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");
        
        private final String description;

        private VersionSize(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public MinimalEncoder(String str, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) {
        this.stringToEncode = str;
        this.isGS1 = z;
        this.encoders = new ECIEncoderSet(str, charset, -1);
        this.ecLevel = errorCorrectionLevel;
    }

    public static ResultList encode(String str, Version version, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return new MinimalEncoder(str, charset, z, errorCorrectionLevel).encode(version);
    }

    public static int getCompactedOrdinal(Mode mode) {
        int i;
        if (mode == null || (i = C50571.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + mode);
    }

    public static Version getVersion(VersionSize versionSize) {
        int i = C50571.f25818x9d14eba6[versionSize.ordinal()];
        if (i == 1) {
            return Version.getVersionForNumber(9);
        }
        if (i != 2) {
            return Version.getVersionForNumber(40);
        }
        return Version.getVersionForNumber(26);
    }

    public static VersionSize getVersionSize(Version version) {
        if (version.getVersionNumber() <= 9) {
            return VersionSize.SMALL;
        }
        if (version.getVersionNumber() <= 26) {
            return VersionSize.MEDIUM;
        }
        return VersionSize.LARGE;
    }

    public static boolean isAlphanumeric(char c) {
        if (Encoder.getAlphanumericCode(c) != -1) {
            return true;
        }
        return false;
    }

    public static boolean isDoubleByteKanji(char c) {
        return Encoder.isOnlyDoubleByteKanji(String.valueOf(c));
    }

    public static boolean isNumeric(char c) {
        return c >= '0' && c <= '9';
    }

    public void addEdge(Edge[][][] edgeArr, int i, Edge edge) {
        Edge[] edgeArr2 = edgeArr[i + edge.characterLength][edge.charsetEncoderIndex];
        int compactedOrdinal = getCompactedOrdinal(edge.mode);
        Edge edge2 = edgeArr2[compactedOrdinal];
        if (edge2 == null || edge2.cachedTotalSize > edge.cachedTotalSize) {
            edgeArr2[compactedOrdinal] = edge;
        }
    }

    public void addEdges(Version version, Edge[][][] edgeArr, int i, Edge edge) {
        int i2;
        int i3;
        Edge[][][] edgeArr2 = edgeArr;
        int i4 = i;
        int length = this.encoders.length();
        int priorityEncoderIndex = this.encoders.getPriorityEncoderIndex();
        if (priorityEncoderIndex < 0 || !this.encoders.canEncode(this.stringToEncode.charAt(i4), priorityEncoderIndex)) {
            priorityEncoderIndex = 0;
        } else {
            length = priorityEncoderIndex + 1;
        }
        int i5 = length;
        for (int i6 = priorityEncoderIndex; i6 < i5; i6++) {
            if (this.encoders.canEncode(this.stringToEncode.charAt(i4), i6)) {
                addEdge(edgeArr2, i4, new Edge(this, Mode.BYTE, i, i6, 1, edge, version, (C50571) null));
            }
        }
        Mode mode = Mode.KANJI;
        if (canEncode(mode, this.stringToEncode.charAt(i4))) {
            addEdge(edgeArr2, i4, new Edge(this, mode, i, 0, 1, edge, version, (C50571) null));
        }
        int length2 = this.stringToEncode.length();
        Mode mode2 = Mode.ALPHANUMERIC;
        if (canEncode(mode2, this.stringToEncode.charAt(i4))) {
            int i7 = i4 + 1;
            if (i7 >= length2 || !canEncode(mode2, this.stringToEncode.charAt(i7))) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            addEdge(edgeArr2, i4, new Edge(this, mode2, i, 0, i3, edge, version, (C50571) null));
        }
        Mode mode3 = Mode.NUMERIC;
        if (canEncode(mode3, this.stringToEncode.charAt(i4))) {
            int i8 = i4 + 1;
            if (i8 >= length2 || !canEncode(mode3, this.stringToEncode.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i4 + 2;
                if (i9 >= length2 || !canEncode(mode3, this.stringToEncode.charAt(i9))) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
            }
            addEdge(edgeArr2, i4, new Edge(this, mode3, i, 0, i2, edge, version, (C50571) null));
        }
    }

    public boolean canEncode(Mode mode, char c) {
        int i = C50571.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i == 1) {
            return isDoubleByteKanji(c);
        }
        if (i == 2) {
            return isAlphanumeric(c);
        }
        if (i == 3) {
            return isNumeric(c);
        }
        if (i != 4) {
            return false;
        }
        return true;
    }

    public ResultList encodeSpecificVersion(Version version) throws WriterException {
        int length = this.stringToEncode.length();
        int length2 = this.encoders.length();
        int[] iArr = new int[3];
        iArr[2] = 4;
        iArr[1] = length2;
        iArr[0] = length + 1;
        Edge[][][] edgeArr = (Edge[][][]) Array.newInstance(Edge.class, iArr);
        addEdges(version, edgeArr, 0, (Edge) null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.encoders.length(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    Edge edge = edgeArr[i][i2][i3];
                    if (edge != null && i < length) {
                        addEdges(version, edgeArr, i, edge);
                    }
                }
            }
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < this.encoders.length(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                Edge edge2 = edgeArr[length][i7][i8];
                if (edge2 != null && edge2.cachedTotalSize < i4) {
                    i4 = edge2.cachedTotalSize;
                    i5 = i7;
                    i6 = i8;
                }
            }
        }
        if (i5 >= 0) {
            return new ResultList(version, edgeArr[length][i5][i6]);
        }
        throw new WriterException("Internal error: failed to encode \"" + this.stringToEncode + "\"");
    }

    public ResultList encode(Version version) throws WriterException {
        if (version == null) {
            Version[] versionArr = {getVersion(VersionSize.SMALL), getVersion(VersionSize.MEDIUM), getVersion(VersionSize.LARGE)};
            ResultList[] resultListArr = {encodeSpecificVersion(versionArr[0]), encodeSpecificVersion(versionArr[1]), encodeSpecificVersion(versionArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int size = resultListArr[i3].getSize();
                if (Encoder.willFit(size, versionArr[i3], this.ecLevel) && size < i) {
                    i2 = i3;
                    i = size;
                }
            }
            if (i2 >= 0) {
                return resultListArr[i2];
            }
            throw new WriterException("Data too big for any version");
        }
        ResultList encodeSpecificVersion = encodeSpecificVersion(version);
        if (Encoder.willFit(encodeSpecificVersion.getSize(), getVersion(getVersionSize(encodeSpecificVersion.getVersion())), this.ecLevel)) {
            return encodeSpecificVersion;
        }
        throw new WriterException("Data too big for version" + version);
    }
}
