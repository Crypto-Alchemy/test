package p000;

/* renamed from: l65 */
public class l65 extends xe2 {

    /* renamed from: d */
    public int f40579d;

    /* renamed from: e */
    public int f40580e;

    /* renamed from: f */
    public int f40581f;

    /* renamed from: g */
    public int f40582g;

    /* renamed from: h */
    public int f40583h;

    /* renamed from: i */
    public int[] f40584i = new int[16];

    /* renamed from: j */
    public int f40585j;

    public l65() {
        reset();
    }

    public l65(l65 l65) {
        super(l65);
        mo55828n(l65);
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo66860i();
        mo55834t(this.f40579d, bArr, i);
        mo55834t(this.f40580e, bArr, i + 4);
        mo55834t(this.f40581f, bArr, i + 8);
        mo55834t(this.f40582g, bArr, i + 12);
        mo55834t(this.f40583h, bArr, i + 16);
        reset();
        return 20;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        mo55828n((l65) us3);
    }

    public us3 copy() {
        return new l65(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "RIPEMD160";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 20;
    }

    /* renamed from: j */
    public void mo50203j() {
        int i = this.f40579d;
        int i2 = this.f40580e;
        int i3 = this.f40581f;
        int i4 = this.f40582g;
        int i5 = this.f40583h;
        int m = mo55827m(mo55829o(i2, i3, i4) + i + this.f40584i[0], 11) + i5;
        int m2 = mo55827m(i3, 10);
        int m3 = mo55827m(mo55829o(m, i2, m2) + i5 + this.f40584i[1], 14) + i4;
        int m4 = mo55827m(i2, 10);
        int m5 = mo55827m(mo55829o(m3, m, m4) + i4 + this.f40584i[2], 15) + m2;
        int m6 = mo55827m(m, 10);
        int m7 = mo55827m(m2 + mo55829o(m5, m3, m6) + this.f40584i[3], 12) + m4;
        int m8 = mo55827m(m3, 10);
        int m9 = mo55827m(m4 + mo55829o(m7, m5, m8) + this.f40584i[4], 5) + m6;
        int m10 = mo55827m(m5, 10);
        int m11 = mo55827m(m6 + mo55829o(m9, m7, m10) + this.f40584i[5], 8) + m8;
        int m12 = mo55827m(m7, 10);
        int m13 = mo55827m(m8 + mo55829o(m11, m9, m12) + this.f40584i[6], 7) + m10;
        int m14 = mo55827m(m9, 10);
        int m15 = mo55827m(m10 + mo55829o(m13, m11, m14) + this.f40584i[7], 9) + m12;
        int m16 = mo55827m(m11, 10);
        int m17 = mo55827m(m12 + mo55829o(m15, m13, m16) + this.f40584i[8], 11) + m14;
        int m18 = mo55827m(m13, 10);
        int m19 = mo55827m(m14 + mo55829o(m17, m15, m18) + this.f40584i[9], 13) + m16;
        int m20 = mo55827m(m15, 10);
        int m21 = mo55827m(m16 + mo55829o(m19, m17, m20) + this.f40584i[10], 14) + m18;
        int m22 = mo55827m(m17, 10);
        int m23 = mo55827m(m18 + mo55829o(m21, m19, m22) + this.f40584i[11], 15) + m20;
        int m24 = mo55827m(m19, 10);
        int m25 = mo55827m(m20 + mo55829o(m23, m21, m24) + this.f40584i[12], 6) + m22;
        int m26 = mo55827m(m21, 10);
        int m27 = mo55827m(m22 + mo55829o(m25, m23, m26) + this.f40584i[13], 7) + m24;
        int m28 = mo55827m(m23, 10);
        int m29 = mo55827m(m24 + mo55829o(m27, m25, m28) + this.f40584i[14], 9) + m26;
        int m30 = mo55827m(m25, 10);
        int m31 = mo55827m(m26 + mo55829o(m29, m27, m30) + this.f40584i[15], 8) + m28;
        int m32 = mo55827m(m27, 10);
        int m33 = mo55827m(i + mo55833s(i2, i3, i4) + this.f40584i[5] + 1352829926, 8) + i5;
        int m34 = mo55827m(i3, 10);
        int m35 = mo55827m(i5 + mo55833s(m33, i2, m34) + this.f40584i[14] + 1352829926, 9) + i4;
        int m36 = mo55827m(i2, 10);
        int m37 = mo55827m(i4 + mo55833s(m35, m33, m36) + this.f40584i[7] + 1352829926, 9) + m34;
        int m38 = mo55827m(m33, 10);
        int m39 = mo55827m(m34 + mo55833s(m37, m35, m38) + this.f40584i[0] + 1352829926, 11) + m36;
        int m40 = mo55827m(m35, 10);
        int m41 = mo55827m(m36 + mo55833s(m39, m37, m40) + this.f40584i[9] + 1352829926, 13) + m38;
        int m42 = mo55827m(m37, 10);
        int m43 = mo55827m(m38 + mo55833s(m41, m39, m42) + this.f40584i[2] + 1352829926, 15) + m40;
        int m44 = mo55827m(m39, 10);
        int m45 = mo55827m(m40 + mo55833s(m43, m41, m44) + this.f40584i[11] + 1352829926, 15) + m42;
        int m46 = mo55827m(m41, 10);
        int m47 = mo55827m(m42 + mo55833s(m45, m43, m46) + this.f40584i[4] + 1352829926, 5) + m44;
        int m48 = mo55827m(m43, 10);
        int m49 = mo55827m(m44 + mo55833s(m47, m45, m48) + this.f40584i[13] + 1352829926, 7) + m46;
        int m50 = mo55827m(m45, 10);
        int m51 = mo55827m(m46 + mo55833s(m49, m47, m50) + this.f40584i[6] + 1352829926, 7) + m48;
        int m52 = mo55827m(m47, 10);
        int m53 = mo55827m(m48 + mo55833s(m51, m49, m52) + this.f40584i[15] + 1352829926, 8) + m50;
        int m54 = mo55827m(m49, 10);
        int m55 = mo55827m(m50 + mo55833s(m53, m51, m54) + this.f40584i[8] + 1352829926, 11) + m52;
        int m56 = mo55827m(m51, 10);
        int m57 = mo55827m(m52 + mo55833s(m55, m53, m56) + this.f40584i[1] + 1352829926, 14) + m54;
        int m58 = mo55827m(m53, 10);
        int m59 = mo55827m(m54 + mo55833s(m57, m55, m58) + this.f40584i[10] + 1352829926, 14) + m56;
        int m60 = mo55827m(m55, 10);
        int m61 = mo55827m(m56 + mo55833s(m59, m57, m60) + this.f40584i[3] + 1352829926, 12) + m58;
        int m62 = mo55827m(m57, 10);
        int m63 = mo55827m(m58 + mo55833s(m61, m59, m62) + this.f40584i[12] + 1352829926, 6) + m60;
        int m64 = mo55827m(m59, 10);
        int m65 = mo55827m(m28 + mo55830p(m31, m29, m32) + this.f40584i[7] + 1518500249, 7) + m30;
        int m66 = mo55827m(m29, 10);
        int m67 = mo55827m(m30 + mo55830p(m65, m31, m66) + this.f40584i[4] + 1518500249, 6) + m32;
        int m68 = mo55827m(m31, 10);
        int m69 = mo55827m(m32 + mo55830p(m67, m65, m68) + this.f40584i[13] + 1518500249, 8) + m66;
        int m70 = mo55827m(m65, 10);
        int m71 = mo55827m(m66 + mo55830p(m69, m67, m70) + this.f40584i[1] + 1518500249, 13) + m68;
        int m72 = mo55827m(m67, 10);
        int m73 = mo55827m(m68 + mo55830p(m71, m69, m72) + this.f40584i[10] + 1518500249, 11) + m70;
        int m74 = mo55827m(m69, 10);
        int m75 = mo55827m(m70 + mo55830p(m73, m71, m74) + this.f40584i[6] + 1518500249, 9) + m72;
        int m76 = mo55827m(m71, 10);
        int m77 = mo55827m(m72 + mo55830p(m75, m73, m76) + this.f40584i[15] + 1518500249, 7) + m74;
        int m78 = mo55827m(m73, 10);
        int m79 = mo55827m(m74 + mo55830p(m77, m75, m78) + this.f40584i[3] + 1518500249, 15) + m76;
        int m80 = mo55827m(m75, 10);
        int m81 = mo55827m(m76 + mo55830p(m79, m77, m80) + this.f40584i[12] + 1518500249, 7) + m78;
        int m82 = mo55827m(m77, 10);
        int m83 = mo55827m(m78 + mo55830p(m81, m79, m82) + this.f40584i[0] + 1518500249, 12) + m80;
        int m84 = mo55827m(m79, 10);
        int m85 = mo55827m(m80 + mo55830p(m83, m81, m84) + this.f40584i[9] + 1518500249, 15) + m82;
        int m86 = mo55827m(m81, 10);
        int m87 = mo55827m(m82 + mo55830p(m85, m83, m86) + this.f40584i[5] + 1518500249, 9) + m84;
        int m88 = mo55827m(m83, 10);
        int m89 = mo55827m(m84 + mo55830p(m87, m85, m88) + this.f40584i[2] + 1518500249, 11) + m86;
        int m90 = mo55827m(m85, 10);
        int m91 = mo55827m(m86 + mo55830p(m89, m87, m90) + this.f40584i[14] + 1518500249, 7) + m88;
        int m92 = mo55827m(m87, 10);
        int m93 = mo55827m(m88 + mo55830p(m91, m89, m92) + this.f40584i[11] + 1518500249, 13) + m90;
        int m94 = mo55827m(m89, 10);
        int m95 = mo55827m(m90 + mo55830p(m93, m91, m94) + this.f40584i[8] + 1518500249, 12) + m92;
        int m96 = mo55827m(m91, 10);
        int m97 = mo55827m(m60 + mo55832r(m63, m61, m64) + this.f40584i[6] + 1548603684, 9) + m62;
        int m98 = mo55827m(m61, 10);
        int m99 = mo55827m(m62 + mo55832r(m97, m63, m98) + this.f40584i[11] + 1548603684, 13) + m64;
        int m100 = mo55827m(m63, 10);
        int m101 = mo55827m(m64 + mo55832r(m99, m97, m100) + this.f40584i[3] + 1548603684, 15) + m98;
        int m102 = mo55827m(m97, 10);
        int m103 = mo55827m(m98 + mo55832r(m101, m99, m102) + this.f40584i[7] + 1548603684, 7) + m100;
        int m104 = mo55827m(m99, 10);
        int m105 = mo55827m(m100 + mo55832r(m103, m101, m104) + this.f40584i[0] + 1548603684, 12) + m102;
        int m106 = mo55827m(m101, 10);
        int m107 = mo55827m(m102 + mo55832r(m105, m103, m106) + this.f40584i[13] + 1548603684, 8) + m104;
        int m108 = mo55827m(m103, 10);
        int m109 = mo55827m(m104 + mo55832r(m107, m105, m108) + this.f40584i[5] + 1548603684, 9) + m106;
        int m110 = mo55827m(m105, 10);
        int m111 = mo55827m(m106 + mo55832r(m109, m107, m110) + this.f40584i[10] + 1548603684, 11) + m108;
        int m112 = mo55827m(m107, 10);
        int m113 = mo55827m(m108 + mo55832r(m111, m109, m112) + this.f40584i[14] + 1548603684, 7) + m110;
        int m114 = mo55827m(m109, 10);
        int m115 = mo55827m(m110 + mo55832r(m113, m111, m114) + this.f40584i[15] + 1548603684, 7) + m112;
        int m116 = mo55827m(m111, 10);
        int m117 = mo55827m(m112 + mo55832r(m115, m113, m116) + this.f40584i[8] + 1548603684, 12) + m114;
        int m118 = mo55827m(m113, 10);
        int m119 = mo55827m(m114 + mo55832r(m117, m115, m118) + this.f40584i[12] + 1548603684, 7) + m116;
        int m120 = mo55827m(m115, 10);
        int m121 = mo55827m(m116 + mo55832r(m119, m117, m120) + this.f40584i[4] + 1548603684, 6) + m118;
        int m122 = mo55827m(m117, 10);
        int m123 = mo55827m(m118 + mo55832r(m121, m119, m122) + this.f40584i[9] + 1548603684, 15) + m120;
        int m124 = mo55827m(m119, 10);
        int m125 = mo55827m(m120 + mo55832r(m123, m121, m124) + this.f40584i[1] + 1548603684, 13) + m122;
        int m126 = mo55827m(m121, 10);
        int m127 = mo55827m(m122 + mo55832r(m125, m123, m126) + this.f40584i[2] + 1548603684, 11) + m124;
        int m128 = mo55827m(m123, 10);
        int m129 = mo55827m(m92 + mo55831q(m95, m93, m96) + this.f40584i[3] + 1859775393, 11) + m94;
        int m130 = mo55827m(m93, 10);
        int m131 = mo55827m(m94 + mo55831q(m129, m95, m130) + this.f40584i[10] + 1859775393, 13) + m96;
        int m132 = mo55827m(m95, 10);
        int m133 = mo55827m(m96 + mo55831q(m131, m129, m132) + this.f40584i[14] + 1859775393, 6) + m130;
        int m134 = mo55827m(m129, 10);
        int m135 = mo55827m(m130 + mo55831q(m133, m131, m134) + this.f40584i[4] + 1859775393, 7) + m132;
        int m136 = mo55827m(m131, 10);
        int m137 = mo55827m(m132 + mo55831q(m135, m133, m136) + this.f40584i[9] + 1859775393, 14) + m134;
        int m138 = mo55827m(m133, 10);
        int m139 = mo55827m(m134 + mo55831q(m137, m135, m138) + this.f40584i[15] + 1859775393, 9) + m136;
        int m140 = mo55827m(m135, 10);
        int m141 = mo55827m(m136 + mo55831q(m139, m137, m140) + this.f40584i[8] + 1859775393, 13) + m138;
        int m142 = mo55827m(m137, 10);
        int m143 = mo55827m(m138 + mo55831q(m141, m139, m142) + this.f40584i[1] + 1859775393, 15) + m140;
        int m144 = mo55827m(m139, 10);
        int m145 = mo55827m(m140 + mo55831q(m143, m141, m144) + this.f40584i[2] + 1859775393, 14) + m142;
        int m146 = mo55827m(m141, 10);
        int m147 = mo55827m(m142 + mo55831q(m145, m143, m146) + this.f40584i[7] + 1859775393, 8) + m144;
        int m148 = mo55827m(m143, 10);
        int m149 = mo55827m(m144 + mo55831q(m147, m145, m148) + this.f40584i[0] + 1859775393, 13) + m146;
        int m150 = mo55827m(m145, 10);
        int m151 = mo55827m(m146 + mo55831q(m149, m147, m150) + this.f40584i[6] + 1859775393, 6) + m148;
        int m152 = mo55827m(m147, 10);
        int m153 = mo55827m(m148 + mo55831q(m151, m149, m152) + this.f40584i[13] + 1859775393, 5) + m150;
        int m154 = mo55827m(m149, 10);
        int m155 = mo55827m(m150 + mo55831q(m153, m151, m154) + this.f40584i[11] + 1859775393, 12) + m152;
        int m156 = mo55827m(m151, 10);
        int m157 = mo55827m(m152 + mo55831q(m155, m153, m156) + this.f40584i[5] + 1859775393, 7) + m154;
        int m158 = mo55827m(m153, 10);
        int m159 = mo55827m(m154 + mo55831q(m157, m155, m158) + this.f40584i[12] + 1859775393, 5) + m156;
        int m160 = mo55827m(m155, 10);
        int m161 = mo55827m(m124 + mo55831q(m127, m125, m128) + this.f40584i[15] + 1836072691, 9) + m126;
        int m162 = mo55827m(m125, 10);
        int m163 = mo55827m(m126 + mo55831q(m161, m127, m162) + this.f40584i[5] + 1836072691, 7) + m128;
        int m164 = mo55827m(m127, 10);
        int m165 = mo55827m(m128 + mo55831q(m163, m161, m164) + this.f40584i[1] + 1836072691, 15) + m162;
        int m166 = mo55827m(m161, 10);
        int m167 = mo55827m(m162 + mo55831q(m165, m163, m166) + this.f40584i[3] + 1836072691, 11) + m164;
        int m168 = mo55827m(m163, 10);
        int m169 = mo55827m(m164 + mo55831q(m167, m165, m168) + this.f40584i[7] + 1836072691, 8) + m166;
        int m170 = mo55827m(m165, 10);
        int m171 = mo55827m(m166 + mo55831q(m169, m167, m170) + this.f40584i[14] + 1836072691, 6) + m168;
        int m172 = mo55827m(m167, 10);
        int m173 = mo55827m(m168 + mo55831q(m171, m169, m172) + this.f40584i[6] + 1836072691, 6) + m170;
        int m174 = mo55827m(m169, 10);
        int m175 = mo55827m(m170 + mo55831q(m173, m171, m174) + this.f40584i[9] + 1836072691, 14) + m172;
        int m176 = mo55827m(m171, 10);
        int m177 = mo55827m(m172 + mo55831q(m175, m173, m176) + this.f40584i[11] + 1836072691, 12) + m174;
        int m178 = mo55827m(m173, 10);
        int m179 = mo55827m(m174 + mo55831q(m177, m175, m178) + this.f40584i[8] + 1836072691, 13) + m176;
        int m180 = mo55827m(m175, 10);
        int m181 = mo55827m(m176 + mo55831q(m179, m177, m180) + this.f40584i[12] + 1836072691, 5) + m178;
        int m182 = mo55827m(m177, 10);
        int m183 = mo55827m(m178 + mo55831q(m181, m179, m182) + this.f40584i[2] + 1836072691, 14) + m180;
        int m184 = mo55827m(m179, 10);
        int m185 = mo55827m(m180 + mo55831q(m183, m181, m184) + this.f40584i[10] + 1836072691, 13) + m182;
        int m186 = mo55827m(m181, 10);
        int m187 = mo55827m(m182 + mo55831q(m185, m183, m186) + this.f40584i[0] + 1836072691, 13) + m184;
        int m188 = mo55827m(m183, 10);
        int m189 = mo55827m(m184 + mo55831q(m187, m185, m188) + this.f40584i[4] + 1836072691, 7) + m186;
        int m190 = mo55827m(m185, 10);
        int m191 = mo55827m(m186 + mo55831q(m189, m187, m190) + this.f40584i[13] + 1836072691, 5) + m188;
        int m192 = mo55827m(m187, 10);
        int m193 = mo55827m(((m156 + mo55832r(m159, m157, m160)) + this.f40584i[1]) - 1894007588, 11) + m158;
        int m194 = mo55827m(m157, 10);
        int m195 = mo55827m(((m158 + mo55832r(m193, m159, m194)) + this.f40584i[9]) - 1894007588, 12) + m160;
        int m196 = mo55827m(m159, 10);
        int m197 = mo55827m(((m160 + mo55832r(m195, m193, m196)) + this.f40584i[11]) - 1894007588, 14) + m194;
        int m198 = mo55827m(m193, 10);
        int m199 = mo55827m(((m194 + mo55832r(m197, m195, m198)) + this.f40584i[10]) - 1894007588, 15) + m196;
        int m200 = mo55827m(m195, 10);
        int m201 = mo55827m(((m196 + mo55832r(m199, m197, m200)) + this.f40584i[0]) - 1894007588, 14) + m198;
        int m202 = mo55827m(m197, 10);
        int m203 = mo55827m(((m198 + mo55832r(m201, m199, m202)) + this.f40584i[8]) - 1894007588, 15) + m200;
        int m204 = mo55827m(m199, 10);
        int m205 = mo55827m(((m200 + mo55832r(m203, m201, m204)) + this.f40584i[12]) - 1894007588, 9) + m202;
        int m206 = mo55827m(m201, 10);
        int m207 = mo55827m(((m202 + mo55832r(m205, m203, m206)) + this.f40584i[4]) - 1894007588, 8) + m204;
        int m208 = mo55827m(m203, 10);
        int m209 = mo55827m(((m204 + mo55832r(m207, m205, m208)) + this.f40584i[13]) - 1894007588, 9) + m206;
        int m210 = mo55827m(m205, 10);
        int m211 = mo55827m(((m206 + mo55832r(m209, m207, m210)) + this.f40584i[3]) - 1894007588, 14) + m208;
        int m212 = mo55827m(m207, 10);
        int m213 = mo55827m(((m208 + mo55832r(m211, m209, m212)) + this.f40584i[7]) - 1894007588, 5) + m210;
        int m214 = mo55827m(m209, 10);
        int m215 = mo55827m(((m210 + mo55832r(m213, m211, m214)) + this.f40584i[15]) - 1894007588, 6) + m212;
        int m216 = mo55827m(m211, 10);
        int m217 = mo55827m(((m212 + mo55832r(m215, m213, m216)) + this.f40584i[14]) - 1894007588, 8) + m214;
        int m218 = mo55827m(m213, 10);
        int m219 = mo55827m(((m214 + mo55832r(m217, m215, m218)) + this.f40584i[5]) - 1894007588, 6) + m216;
        int m220 = mo55827m(m215, 10);
        int m221 = mo55827m(((m216 + mo55832r(m219, m217, m220)) + this.f40584i[6]) - 1894007588, 5) + m218;
        int m222 = mo55827m(m217, 10);
        int m223 = mo55827m(((m218 + mo55832r(m221, m219, m222)) + this.f40584i[2]) - 1894007588, 12) + m220;
        int m224 = mo55827m(m219, 10);
        int m225 = mo55827m(m188 + mo55830p(m191, m189, m192) + this.f40584i[8] + 2053994217, 15) + m190;
        int m226 = mo55827m(m189, 10);
        int m227 = mo55827m(m190 + mo55830p(m225, m191, m226) + this.f40584i[6] + 2053994217, 5) + m192;
        int m228 = mo55827m(m191, 10);
        int m229 = mo55827m(m192 + mo55830p(m227, m225, m228) + this.f40584i[4] + 2053994217, 8) + m226;
        int m230 = mo55827m(m225, 10);
        int m231 = mo55827m(m226 + mo55830p(m229, m227, m230) + this.f40584i[1] + 2053994217, 11) + m228;
        int m232 = mo55827m(m227, 10);
        int m233 = mo55827m(m228 + mo55830p(m231, m229, m232) + this.f40584i[3] + 2053994217, 14) + m230;
        int m234 = mo55827m(m229, 10);
        int m235 = mo55827m(m230 + mo55830p(m233, m231, m234) + this.f40584i[11] + 2053994217, 14) + m232;
        int m236 = mo55827m(m231, 10);
        int m237 = mo55827m(m232 + mo55830p(m235, m233, m236) + this.f40584i[15] + 2053994217, 6) + m234;
        int m238 = mo55827m(m233, 10);
        int m239 = mo55827m(m234 + mo55830p(m237, m235, m238) + this.f40584i[0] + 2053994217, 14) + m236;
        int m240 = mo55827m(m235, 10);
        int m241 = mo55827m(m236 + mo55830p(m239, m237, m240) + this.f40584i[5] + 2053994217, 6) + m238;
        int m242 = mo55827m(m237, 10);
        int m243 = mo55827m(m238 + mo55830p(m241, m239, m242) + this.f40584i[12] + 2053994217, 9) + m240;
        int m244 = mo55827m(m239, 10);
        int m245 = mo55827m(m240 + mo55830p(m243, m241, m244) + this.f40584i[2] + 2053994217, 12) + m242;
        int m246 = mo55827m(m241, 10);
        int m247 = mo55827m(m242 + mo55830p(m245, m243, m246) + this.f40584i[13] + 2053994217, 9) + m244;
        int m248 = mo55827m(m243, 10);
        int m249 = mo55827m(m244 + mo55830p(m247, m245, m248) + this.f40584i[9] + 2053994217, 12) + m246;
        int m250 = mo55827m(m245, 10);
        int m251 = mo55827m(m246 + mo55830p(m249, m247, m250) + this.f40584i[7] + 2053994217, 5) + m248;
        int m252 = mo55827m(m247, 10);
        int m253 = mo55827m(m248 + mo55830p(m251, m249, m252) + this.f40584i[10] + 2053994217, 15) + m250;
        int m254 = mo55827m(m249, 10);
        int m255 = mo55827m(m250 + mo55830p(m253, m251, m254) + this.f40584i[14] + 2053994217, 8) + m252;
        int m256 = mo55827m(m251, 10);
        int m257 = mo55827m(((m220 + mo55833s(m223, m221, m224)) + this.f40584i[4]) - 1454113458, 9) + m222;
        int m258 = mo55827m(m221, 10);
        int m259 = mo55827m(((m222 + mo55833s(m257, m223, m258)) + this.f40584i[0]) - 1454113458, 15) + m224;
        int m260 = mo55827m(m223, 10);
        int m261 = mo55827m(((m224 + mo55833s(m259, m257, m260)) + this.f40584i[5]) - 1454113458, 5) + m258;
        int m262 = mo55827m(m257, 10);
        int m263 = mo55827m(((m258 + mo55833s(m261, m259, m262)) + this.f40584i[9]) - 1454113458, 11) + m260;
        int m264 = mo55827m(m259, 10);
        int m265 = mo55827m(((m260 + mo55833s(m263, m261, m264)) + this.f40584i[7]) - 1454113458, 6) + m262;
        int m266 = mo55827m(m261, 10);
        int m267 = mo55827m(((m262 + mo55833s(m265, m263, m266)) + this.f40584i[12]) - 1454113458, 8) + m264;
        int m268 = mo55827m(m263, 10);
        int m269 = mo55827m(((m264 + mo55833s(m267, m265, m268)) + this.f40584i[2]) - 1454113458, 13) + m266;
        int m270 = mo55827m(m265, 10);
        int m271 = mo55827m(((m266 + mo55833s(m269, m267, m270)) + this.f40584i[10]) - 1454113458, 12) + m268;
        int m272 = mo55827m(m267, 10);
        int m273 = mo55827m(((m268 + mo55833s(m271, m269, m272)) + this.f40584i[14]) - 1454113458, 5) + m270;
        int m274 = mo55827m(m269, 10);
        int m275 = mo55827m(((m270 + mo55833s(m273, m271, m274)) + this.f40584i[1]) - 1454113458, 12) + m272;
        int m276 = mo55827m(m271, 10);
        int m277 = mo55827m(((m272 + mo55833s(m275, m273, m276)) + this.f40584i[3]) - 1454113458, 13) + m274;
        int m278 = mo55827m(m273, 10);
        int m279 = mo55827m(((m274 + mo55833s(m277, m275, m278)) + this.f40584i[8]) - 1454113458, 14) + m276;
        int m280 = mo55827m(m275, 10);
        int m281 = mo55827m(((m276 + mo55833s(m279, m277, m280)) + this.f40584i[11]) - 1454113458, 11) + m278;
        int m282 = mo55827m(m277, 10);
        int m283 = mo55827m(((m278 + mo55833s(m281, m279, m282)) + this.f40584i[6]) - 1454113458, 8) + m280;
        int m284 = mo55827m(m279, 10);
        int m285 = mo55827m(((m280 + mo55833s(m283, m281, m284)) + this.f40584i[15]) - 1454113458, 5) + m282;
        int m286 = mo55827m(m281, 10);
        int m287 = mo55827m(m283, 10);
        int m288 = mo55827m(m252 + mo55829o(m255, m253, m256) + this.f40584i[12], 8) + m254;
        int m289 = mo55827m(m253, 10);
        int m290 = mo55827m(m254 + mo55829o(m288, m255, m289) + this.f40584i[15], 5) + m256;
        int m291 = mo55827m(m255, 10);
        int m292 = mo55827m(m256 + mo55829o(m290, m288, m291) + this.f40584i[10], 12) + m289;
        int m293 = mo55827m(m288, 10);
        int m294 = mo55827m(m289 + mo55829o(m292, m290, m293) + this.f40584i[4], 9) + m291;
        int m295 = mo55827m(m290, 10);
        int m296 = mo55827m(m291 + mo55829o(m294, m292, m295) + this.f40584i[1], 12) + m293;
        int m297 = mo55827m(m292, 10);
        int m298 = mo55827m(m293 + mo55829o(m296, m294, m297) + this.f40584i[5], 5) + m295;
        int m299 = mo55827m(m294, 10);
        int m300 = mo55827m(m295 + mo55829o(m298, m296, m299) + this.f40584i[8], 14) + m297;
        int m301 = mo55827m(m296, 10);
        int m302 = mo55827m(m297 + mo55829o(m300, m298, m301) + this.f40584i[7], 6) + m299;
        int m303 = mo55827m(m298, 10);
        int m304 = mo55827m(m299 + mo55829o(m302, m300, m303) + this.f40584i[6], 8) + m301;
        int m305 = mo55827m(m300, 10);
        int m306 = mo55827m(m301 + mo55829o(m304, m302, m305) + this.f40584i[2], 13) + m303;
        int m307 = mo55827m(m302, 10);
        int m308 = mo55827m(m303 + mo55829o(m306, m304, m307) + this.f40584i[13], 6) + m305;
        int m309 = mo55827m(m304, 10);
        int m310 = mo55827m(m305 + mo55829o(m308, m306, m309) + this.f40584i[14], 5) + m307;
        int m311 = mo55827m(m306, 10);
        int m312 = mo55827m(m307 + mo55829o(m310, m308, m311) + this.f40584i[0], 15) + m309;
        int m313 = mo55827m(m308, 10);
        int m314 = mo55827m(m309 + mo55829o(m312, m310, m313) + this.f40584i[3], 13) + m311;
        int m315 = mo55827m(m310, 10);
        int m316 = mo55827m(m311 + mo55829o(m314, m312, m315) + this.f40584i[9], 11) + m313;
        int m317 = mo55827m(m312, 10);
        int m318 = mo55827m(m313 + mo55829o(m316, m314, m317) + this.f40584i[11], 11) + m315;
        this.f40580e = this.f40581f + m287 + m317;
        this.f40581f = this.f40582g + m286 + m315;
        this.f40582g = this.f40583h + m284 + m318;
        this.f40583h = this.f40579d + mo55827m(((m282 + mo55833s(m285, m283, m286)) + this.f40584i[13]) - 1454113458, 6) + m284 + m316;
        this.f40579d = mo55827m(m314, 10) + m285 + this.f40580e;
        this.f40585j = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f40584i;
            if (i6 != iArr.length) {
                iArr[i6] = 0;
                i6++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo50204k(long j) {
        if (this.f40585j > 14) {
            mo50203j();
        }
        int[] iArr = this.f40584i;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    /* renamed from: l */
    public void mo50205l(byte[] bArr, int i) {
        int[] iArr = this.f40584i;
        int i2 = this.f40585j;
        int i3 = i2 + 1;
        this.f40585j = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            mo50203j();
        }
    }

    /* renamed from: m */
    public final int mo55827m(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: n */
    public final void mo55828n(l65 l65) {
        super.mo66859h(l65);
        this.f40579d = l65.f40579d;
        this.f40580e = l65.f40580e;
        this.f40581f = l65.f40581f;
        this.f40582g = l65.f40582g;
        this.f40583h = l65.f40583h;
        int[] iArr = l65.f40584i;
        System.arraycopy(iArr, 0, this.f40584i, 0, iArr.length);
        this.f40585j = l65.f40585j;
    }

    /* renamed from: o */
    public final int mo55829o(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: p */
    public final int mo55830p(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: q */
    public final int mo55831q(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: r */
    public final int mo55832r(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    public void reset() {
        super.reset();
        this.f40579d = 1732584193;
        this.f40580e = -271733879;
        this.f40581f = -1732584194;
        this.f40582g = 271733878;
        this.f40583h = -1009589776;
        this.f40585j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f40584i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final int mo55833s(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    /* renamed from: t */
    public final void mo55834t(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }
}
