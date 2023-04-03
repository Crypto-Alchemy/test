package p000;

import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: b */
/* compiled from: AKTAES */
public class C1599b {

    /* renamed from: a */
    public long f7902a;

    /* renamed from: b */
    public boolean f7903b;

    /* renamed from: c */
    public int[] f7904c = new int[64];

    /* renamed from: d */
    public int f7905d = 0;

    /* renamed from: e */
    public long f7906e = -1;

    /* renamed from: f */
    public String f7907f = "0x12345";

    /* renamed from: g */
    public long f7908g = 1329865020;

    /* renamed from: h */
    public long f7909h = 1348031555;

    /* renamed from: i */
    public short[] f7910i;

    /* renamed from: j */
    public short[] f7911j;

    /* renamed from: k */
    public int[] f7912k;

    public C1599b() {
        short[] sArr = new short[256];
        sArr[0] = 99;
        sArr[1] = 124;
        sArr[2] = 119;
        sArr[3] = 123;
        sArr[4] = 242;
        sArr[5] = 107;
        sArr[6] = 111;
        sArr[7] = 197;
        sArr[8] = 48;
        sArr[9] = 1;
        sArr[10] = 103;
        sArr[11] = 43;
        sArr[12] = 254;
        sArr[13] = 215;
        sArr[14] = 171;
        sArr[15] = 118;
        sArr[16] = 202;
        sArr[17] = 130;
        sArr[18] = 201;
        sArr[19] = 125;
        sArr[20] = 250;
        sArr[21] = 89;
        sArr[22] = 71;
        sArr[23] = 240;
        sArr[24] = 173;
        sArr[25] = 212;
        sArr[26] = 162;
        sArr[27] = 175;
        sArr[28] = 156;
        sArr[29] = 164;
        sArr[30] = 114;
        sArr[31] = 192;
        sArr[32] = 183;
        sArr[33] = 253;
        sArr[34] = 147;
        sArr[35] = 38;
        sArr[36] = 54;
        sArr[37] = 63;
        sArr[38] = 247;
        sArr[39] = 204;
        sArr[40] = 52;
        sArr[41] = 165;
        sArr[42] = 229;
        sArr[43] = 241;
        sArr[44] = 113;
        sArr[45] = 216;
        sArr[46] = 49;
        sArr[47] = 21;
        sArr[48] = 4;
        sArr[49] = 199;
        sArr[50] = 35;
        sArr[51] = 195;
        sArr[52] = 24;
        sArr[53] = 150;
        sArr[54] = 5;
        sArr[55] = 154;
        sArr[56] = 7;
        sArr[57] = 18;
        sArr[58] = 128;
        sArr[59] = 226;
        sArr[60] = 235;
        sArr[61] = 39;
        sArr[62] = 178;
        sArr[63] = 117;
        sArr[64] = 9;
        sArr[65] = 131;
        sArr[66] = 44;
        sArr[67] = 26;
        sArr[68] = 27;
        sArr[69] = 110;
        sArr[70] = 90;
        sArr[71] = 160;
        sArr[72] = 82;
        sArr[73] = 59;
        sArr[74] = 214;
        sArr[75] = 179;
        sArr[76] = 41;
        sArr[77] = 227;
        sArr[78] = 47;
        sArr[79] = 132;
        sArr[80] = 83;
        sArr[81] = 209;
        sArr[83] = 237;
        sArr[84] = 32;
        sArr[85] = 252;
        sArr[86] = 177;
        sArr[87] = 91;
        sArr[88] = 106;
        sArr[89] = 203;
        sArr[90] = 190;
        sArr[91] = 57;
        sArr[92] = 74;
        sArr[93] = 76;
        sArr[94] = 88;
        sArr[95] = 207;
        sArr[96] = 208;
        sArr[97] = 239;
        sArr[98] = 170;
        sArr[99] = 251;
        sArr[100] = 67;
        sArr[101] = 77;
        sArr[102] = 51;
        sArr[103] = 133;
        sArr[104] = 69;
        sArr[105] = 249;
        sArr[106] = 2;
        sArr[107] = 127;
        sArr[108] = 80;
        sArr[109] = 60;
        sArr[110] = 159;
        sArr[111] = 168;
        sArr[112] = 81;
        sArr[113] = 163;
        sArr[114] = 64;
        sArr[115] = 143;
        sArr[116] = 146;
        sArr[117] = 157;
        sArr[118] = 56;
        sArr[119] = 245;
        sArr[120] = 188;
        sArr[121] = 182;
        sArr[122] = 218;
        sArr[123] = 33;
        sArr[124] = 16;
        sArr[125] = 255;
        sArr[126] = 243;
        sArr[127] = 210;
        sArr[128] = 205;
        sArr[129] = 12;
        sArr[130] = 19;
        sArr[131] = 236;
        sArr[132] = 95;
        sArr[133] = 151;
        sArr[134] = 68;
        sArr[135] = 23;
        sArr[136] = 196;
        sArr[137] = 167;
        sArr[138] = 126;
        sArr[139] = 61;
        sArr[140] = 100;
        sArr[141] = 93;
        sArr[142] = 25;
        sArr[143] = 115;
        sArr[144] = 96;
        sArr[145] = 129;
        sArr[146] = 79;
        sArr[147] = 220;
        sArr[148] = 34;
        sArr[149] = 42;
        sArr[150] = 144;
        sArr[151] = 136;
        sArr[152] = 70;
        sArr[153] = 238;
        sArr[154] = 184;
        sArr[155] = 20;
        sArr[156] = 222;
        sArr[157] = 94;
        sArr[158] = 11;
        sArr[159] = 219;
        sArr[160] = 224;
        sArr[161] = 50;
        sArr[162] = 58;
        sArr[163] = 10;
        sArr[164] = 73;
        sArr[165] = 6;
        sArr[166] = 36;
        sArr[167] = 92;
        sArr[168] = 194;
        sArr[169] = 211;
        sArr[170] = 172;
        sArr[171] = 98;
        sArr[172] = 145;
        sArr[173] = 149;
        sArr[174] = 228;
        sArr[175] = 121;
        sArr[176] = 231;
        sArr[177] = 200;
        sArr[178] = 55;
        sArr[179] = 109;
        sArr[180] = 141;
        sArr[181] = 213;
        sArr[182] = 78;
        sArr[183] = 169;
        sArr[184] = 108;
        sArr[185] = 86;
        sArr[186] = 244;
        sArr[187] = 234;
        sArr[188] = 101;
        sArr[189] = 122;
        sArr[190] = 174;
        sArr[191] = 8;
        sArr[192] = 186;
        sArr[193] = 120;
        sArr[194] = 37;
        sArr[195] = 46;
        sArr[196] = 28;
        sArr[197] = 166;
        sArr[198] = 180;
        sArr[199] = 198;
        sArr[200] = 232;
        sArr[201] = 221;
        sArr[202] = 116;
        sArr[203] = 31;
        sArr[204] = 75;
        sArr[205] = 189;
        sArr[206] = 139;
        sArr[207] = 138;
        sArr[208] = 112;
        sArr[209] = 62;
        sArr[210] = 181;
        sArr[211] = 102;
        sArr[212] = 72;
        sArr[213] = 3;
        sArr[214] = 246;
        sArr[215] = 14;
        sArr[216] = 97;
        sArr[217] = 53;
        sArr[218] = 87;
        sArr[219] = 185;
        sArr[220] = 134;
        sArr[221] = 193;
        sArr[222] = 29;
        sArr[223] = 158;
        sArr[224] = 225;
        sArr[225] = 248;
        sArr[226] = 152;
        sArr[227] = 17;
        sArr[228] = 105;
        sArr[229] = 217;
        sArr[230] = 142;
        sArr[231] = 148;
        sArr[232] = 155;
        sArr[233] = 30;
        sArr[234] = 135;
        sArr[235] = 233;
        sArr[236] = 206;
        sArr[237] = 85;
        sArr[238] = 40;
        sArr[239] = 223;
        sArr[240] = 140;
        sArr[241] = 161;
        sArr[242] = 137;
        sArr[243] = 13;
        sArr[244] = 191;
        sArr[245] = 230;
        sArr[246] = 66;
        sArr[247] = 104;
        sArr[248] = 65;
        sArr[249] = 153;
        sArr[250] = 45;
        sArr[251] = 15;
        sArr[252] = 176;
        sArr[253] = 84;
        sArr[254] = 187;
        sArr[255] = 22;
        this.f7910i = sArr;
        short[] sArr2 = new short[256];
        sArr2[0] = 82;
        sArr2[1] = 9;
        sArr2[2] = 106;
        sArr2[3] = 213;
        sArr2[4] = 48;
        sArr2[5] = 54;
        sArr2[6] = 165;
        sArr2[7] = 56;
        sArr2[8] = 191;
        sArr2[9] = 64;
        sArr2[10] = 163;
        sArr2[11] = 158;
        sArr2[12] = 129;
        sArr2[13] = 243;
        sArr2[14] = 215;
        sArr2[15] = 251;
        sArr2[16] = 124;
        sArr2[17] = 227;
        sArr2[18] = 57;
        sArr2[19] = 130;
        sArr2[20] = 155;
        sArr2[21] = 47;
        sArr2[22] = 255;
        sArr2[23] = 135;
        sArr2[24] = 52;
        sArr2[25] = 142;
        sArr2[26] = 67;
        sArr2[27] = 68;
        sArr2[28] = 196;
        sArr2[29] = 222;
        sArr2[30] = 233;
        sArr2[31] = 203;
        sArr2[32] = 84;
        sArr2[33] = 123;
        sArr2[34] = 148;
        sArr2[35] = 50;
        sArr2[36] = 166;
        sArr2[37] = 194;
        sArr2[38] = 35;
        sArr2[39] = 61;
        sArr2[40] = 238;
        sArr2[41] = 76;
        sArr2[42] = 149;
        sArr2[43] = 11;
        sArr2[44] = 66;
        sArr2[45] = 250;
        sArr2[46] = 195;
        sArr2[47] = 78;
        sArr2[48] = 8;
        sArr2[49] = 46;
        sArr2[50] = 161;
        sArr2[51] = 102;
        sArr2[52] = 40;
        sArr2[53] = 217;
        sArr2[54] = 36;
        sArr2[55] = 178;
        sArr2[56] = 118;
        sArr2[57] = 91;
        sArr2[58] = 162;
        sArr2[59] = 73;
        sArr2[60] = 109;
        sArr2[61] = 139;
        sArr2[62] = 209;
        sArr2[63] = 37;
        sArr2[64] = 114;
        sArr2[65] = 248;
        sArr2[66] = 246;
        sArr2[67] = 100;
        sArr2[68] = 134;
        sArr2[69] = 104;
        sArr2[70] = 152;
        sArr2[71] = 22;
        sArr2[72] = 212;
        sArr2[73] = 164;
        sArr2[74] = 92;
        sArr2[75] = 204;
        sArr2[76] = 93;
        sArr2[77] = 101;
        sArr2[78] = 182;
        sArr2[79] = 146;
        sArr2[80] = 108;
        sArr2[81] = 112;
        sArr2[82] = 72;
        sArr2[83] = 80;
        sArr2[84] = 253;
        sArr2[85] = 237;
        sArr2[86] = 185;
        sArr2[87] = 218;
        sArr2[88] = 94;
        sArr2[89] = 21;
        sArr2[90] = 70;
        sArr2[91] = 87;
        sArr2[92] = 167;
        sArr2[93] = 141;
        sArr2[94] = 157;
        sArr2[95] = 132;
        sArr2[96] = 144;
        sArr2[97] = 216;
        sArr2[98] = 171;
        sArr2[100] = 140;
        sArr2[101] = 188;
        sArr2[102] = 211;
        sArr2[103] = 10;
        sArr2[104] = 247;
        sArr2[105] = 228;
        sArr2[106] = 88;
        sArr2[107] = 5;
        sArr2[108] = 184;
        sArr2[109] = 179;
        sArr2[110] = 69;
        sArr2[111] = 6;
        sArr2[112] = 208;
        sArr2[113] = 44;
        sArr2[114] = 30;
        sArr2[115] = 143;
        sArr2[116] = 202;
        sArr2[117] = 63;
        sArr2[118] = 15;
        sArr2[119] = 2;
        sArr2[120] = 193;
        sArr2[121] = 175;
        sArr2[122] = 189;
        sArr2[123] = 3;
        sArr2[124] = 1;
        sArr2[125] = 19;
        sArr2[126] = 138;
        sArr2[127] = 107;
        sArr2[128] = 58;
        sArr2[129] = 145;
        sArr2[130] = 17;
        sArr2[131] = 65;
        sArr2[132] = 79;
        sArr2[133] = 103;
        sArr2[134] = 220;
        sArr2[135] = 234;
        sArr2[136] = 151;
        sArr2[137] = 242;
        sArr2[138] = 207;
        sArr2[139] = 206;
        sArr2[140] = 240;
        sArr2[141] = 180;
        sArr2[142] = 230;
        sArr2[143] = 115;
        sArr2[144] = 150;
        sArr2[145] = 172;
        sArr2[146] = 116;
        sArr2[147] = 34;
        sArr2[148] = 231;
        sArr2[149] = 173;
        sArr2[150] = 53;
        sArr2[151] = 133;
        sArr2[152] = 226;
        sArr2[153] = 249;
        sArr2[154] = 55;
        sArr2[155] = 232;
        sArr2[156] = 28;
        sArr2[157] = 117;
        sArr2[158] = 223;
        sArr2[159] = 110;
        sArr2[160] = 71;
        sArr2[161] = 241;
        sArr2[162] = 26;
        sArr2[163] = 113;
        sArr2[164] = 29;
        sArr2[165] = 41;
        sArr2[166] = 197;
        sArr2[167] = 137;
        sArr2[168] = 111;
        sArr2[169] = 183;
        sArr2[170] = 98;
        sArr2[171] = 14;
        sArr2[172] = 170;
        sArr2[173] = 24;
        sArr2[174] = 190;
        sArr2[175] = 27;
        sArr2[176] = 252;
        sArr2[177] = 86;
        sArr2[178] = 62;
        sArr2[179] = 75;
        sArr2[180] = 198;
        sArr2[181] = 210;
        sArr2[182] = 121;
        sArr2[183] = 32;
        sArr2[184] = 154;
        sArr2[185] = 219;
        sArr2[186] = 192;
        sArr2[187] = 254;
        sArr2[188] = 120;
        sArr2[189] = 205;
        sArr2[190] = 90;
        sArr2[191] = 244;
        sArr2[192] = 31;
        sArr2[193] = 221;
        sArr2[194] = 168;
        sArr2[195] = 51;
        sArr2[196] = 136;
        sArr2[197] = 7;
        sArr2[198] = 199;
        sArr2[199] = 49;
        sArr2[200] = 177;
        sArr2[201] = 18;
        sArr2[202] = 16;
        sArr2[203] = 89;
        sArr2[204] = 39;
        sArr2[205] = 128;
        sArr2[206] = 236;
        sArr2[207] = 95;
        sArr2[208] = 96;
        sArr2[209] = 81;
        sArr2[210] = 127;
        sArr2[211] = 169;
        sArr2[212] = 25;
        sArr2[213] = 181;
        sArr2[214] = 74;
        sArr2[215] = 13;
        sArr2[216] = 45;
        sArr2[217] = 229;
        sArr2[218] = 122;
        sArr2[219] = 159;
        sArr2[220] = 147;
        sArr2[221] = 201;
        sArr2[222] = 156;
        sArr2[223] = 239;
        sArr2[224] = 160;
        sArr2[225] = 224;
        sArr2[226] = 59;
        sArr2[227] = 77;
        sArr2[228] = 174;
        sArr2[229] = 42;
        sArr2[230] = 245;
        sArr2[231] = 176;
        sArr2[232] = 200;
        sArr2[233] = 235;
        sArr2[234] = 187;
        sArr2[235] = 60;
        sArr2[236] = 131;
        sArr2[237] = 83;
        sArr2[238] = 153;
        sArr2[239] = 97;
        sArr2[240] = 23;
        sArr2[241] = 43;
        sArr2[242] = 4;
        sArr2[243] = 126;
        sArr2[244] = 186;
        sArr2[245] = 119;
        sArr2[246] = 214;
        sArr2[247] = 38;
        sArr2[248] = 225;
        sArr2[249] = 105;
        sArr2[250] = 20;
        sArr2[251] = 99;
        sArr2[252] = 85;
        sArr2[253] = 33;
        sArr2[254] = 12;
        sArr2[255] = 125;
        this.f7911j = sArr2;
        this.f7912k = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 239};
    }

    /* renamed from: a */
    public final int mo11314a(int i) {
        int i2 = -2139062144 & i;
        return ((i & 2139062143) << 1) ^ ((i2 - ((i2 >> 7) & 33554431)) & 454761243);
    }

    /* renamed from: b */
    public boolean mo11315b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return mo11316c(cArr);
    }

    /* renamed from: c */
    public boolean mo11316c(char[] cArr) {
        int i;
        int i2;
        int i3;
        char[] cArr2 = new char[33];
        int length = cArr.length;
        mo11317d();
        int i4 = 0;
        int i5 = 0;
        while (i4 < 32) {
            if (i5 >= length) {
                i5 = 0;
            }
            int i6 = i5 + 1;
            cArr2[i4] = cArr[i5];
            if (i6 >= length) {
                if (i4 < 32) {
                    i4++;
                    cArr2[i4] = 202;
                }
                i5 = 0;
            } else {
                i5 = i6;
            }
            i4++;
        }
        System.out.println(" ");
        byte[] bArr = new byte[32];
        for (int i7 = 0; i7 < 32; i7++) {
            bArr[i7] = (byte) cArr2[i7];
        }
        C2540id3.m19562d(bArr);
        for (int i8 = 0; i8 < 8; i8++) {
            this.f7904c[i8] = C2540id3.m19574p(cArr2, i8 * 4);
        }
        byte[] bArr2 = new byte[4];
        int i9 = 0;
        int i10 = 0;
        while (i10 < 56) {
            int i11 = i10 + 8;
            int q = C2540id3.m19575q(3, this.f7904c[i11 - 1]);
            int i12 = 0;
            while (i12 < 8) {
                if (i12 == 0) {
                    i2 = i9 + 1;
                    i = this.f7912k[i9] ^ mo11322i(q);
                } else {
                    if (i12 == 4) {
                        i3 = mo11322i(this.f7904c[i10 + 11]);
                    } else {
                        i3 = this.f7904c[((i10 + i12) + 8) - 1];
                    }
                    i2 = i9;
                    i = i3;
                }
                int[] iArr = this.f7904c;
                int i13 = i10 + i12;
                int i14 = i ^ iArr[i13];
                iArr[i13 + 8] = i14;
                C2540id3.m19569k(bArr2, 0, i14);
                i12++;
                i9 = i2;
            }
            i10 = i11;
        }
        this.f7903b = true;
        this.f7902a = 0;
        return true;
    }

    /* renamed from: d */
    public void mo11317d() {
        this.f7903b = false;
        for (int i = 0; i < 64; i++) {
            this.f7904c[i] = 0;
        }
    }

    /* renamed from: e */
    public void mo11318e(byte[] bArr, byte[] bArr2, int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i2 = (i + 7) * 4;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2--;
            iArr[i3] = C2540id3.m19573o(bArr, i3 * 4) ^ this.f7904c[i2];
        }
        for (int i4 = 0; i4 < i + 5; i4++) {
            for (int i5 = 3; i5 >= 0; i5--) {
                i2--;
                iArr2[i5] = mo11321h(i5, iArr) ^ this.f7904c[i2];
            }
            for (int i6 = 3; i6 >= 0; i6--) {
                iArr[i6] = mo11320g(iArr2[i6]);
            }
        }
        for (int i7 = 3; i7 >= 0; i7--) {
            i2--;
            C2540id3.m19569k(bArr2, i7 * 4, mo11321h(i7, iArr) ^ this.f7904c[i2]);
        }
    }

    /* renamed from: f */
    public void mo11319f(byte[] bArr, byte[] bArr2, int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 4) {
            iArr[i3] = this.f7904c[i4] ^ C2540id3.m19573o(bArr, i3 * 4);
            i3++;
            i4++;
        }
        int i5 = i4;
        for (int i6 = 0; i6 < i + 5; i6++) {
            for (int i7 = 0; i7 < 4; i7++) {
                iArr2[i7] = mo11324k(i7, iArr);
            }
            int i8 = 0;
            while (i8 < 4) {
                iArr[i8] = mo11323j(iArr2[i8]) ^ this.f7904c[i5];
                i8++;
                i5++;
            }
        }
        while (i2 < 4) {
            C2540id3.m19569k(bArr2, i2 * 4, mo11324k(i2, iArr) ^ this.f7904c[i5]);
            i2++;
            i5++;
        }
    }

    /* renamed from: g */
    public final int mo11320g(int i) {
        int a = mo11314a(i);
        int a2 = mo11314a(a);
        int a3 = mo11314a(a2);
        int i2 = i ^ a3;
        int q = C2540id3.m19575q(3, a ^ i2);
        return C2540id3.m19575q(1, i2) ^ ((q ^ (a3 ^ (a ^ a2))) ^ C2540id3.m19575q(2, a2 ^ i2));
    }

    /* renamed from: h */
    public final int mo11321h(int i, int[] iArr) {
        return C2540id3.m19567i(this.f7911j[C2540id3.m19570l(0, iArr[i])], this.f7911j[C2540id3.m19570l(1, iArr[(i + 3) % 4])], this.f7911j[C2540id3.m19570l(2, iArr[(i + 2) % 4])], this.f7911j[C2540id3.m19570l(3, iArr[(i + 1) % 4])]);
    }

    /* renamed from: i */
    public final int mo11322i(int i) {
        return C2540id3.m19567i(this.f7910i[C2540id3.m19570l(0, i)], this.f7910i[C2540id3.m19570l(1, i)], this.f7910i[C2540id3.m19570l(2, i)], this.f7910i[C2540id3.m19570l(3, i)]);
    }

    /* renamed from: j */
    public final int mo11323j(int i) {
        int a = mo11314a(i);
        return C2540id3.m19575q(1, i) ^ ((a ^ C2540id3.m19575q(3, i ^ a)) ^ C2540id3.m19575q(2, i));
    }

    /* renamed from: k */
    public final int mo11324k(int i, int[] iArr) {
        return C2540id3.m19567i(this.f7910i[C2540id3.m19570l(0, iArr[i])], this.f7910i[C2540id3.m19570l(1, iArr[(i + 1) % 4])], this.f7910i[C2540id3.m19570l(2, iArr[(i + 2) % 4])], this.f7910i[C2540id3.m19570l(3, iArr[(i + 3) % 4])]);
    }
}
