package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

public final class DataMatrixWriter implements Writer {
    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int i, int i2) {
        BitMatrix bitMatrix;
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int max = Math.max(i, width);
        int max2 = Math.max(i2, height);
        int min = Math.min(max / width, max2 / height);
        int i3 = (max - (width * min)) / 2;
        int i4 = (max2 - (height * min)) / 2;
        if (i2 < height || i < width) {
            bitMatrix = new BitMatrix(width, height);
            i3 = 0;
            i4 = 0;
        } else {
            bitMatrix = new BitMatrix(i, i2);
        }
        bitMatrix.clear();
        int i5 = 0;
        while (i5 < height) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < width) {
                if (byteMatrix.get(i7, i5) == 1) {
                    bitMatrix.setRegion(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bitMatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i, int i2) {
        boolean z;
        boolean z2;
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i3 = 0;
        for (int i4 = 0; i4 < symbolDataHeight; i4++) {
            if (i4 % symbolInfo.matrixHeight == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < symbolInfo.getSymbolWidth(); i6++) {
                    if (i6 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    byteMatrix.set(i5, i3, z2);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < symbolDataWidth; i8++) {
                if (i8 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i7, i3, true);
                    i7++;
                }
                byteMatrix.set(i7, i3, defaultPlacement.getBit(i8, i4));
                i7++;
                int i9 = symbolInfo.matrixWidth;
                if (i8 % i9 == i9 - 1) {
                    if (i4 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    byteMatrix.set(i7, i3, z);
                    i7++;
                }
            }
            i3++;
            int i10 = symbolInfo.matrixHeight;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < symbolInfo.getSymbolWidth(); i12++) {
                    byteMatrix.set(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return convertByteMatrixToBitMatrix(byteMatrix, i, i2);
    }

    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.BitMatrix encode(java.lang.String r8, com.google.zxing.BarcodeFormat r9, int r10, int r11, java.util.Map<com.google.zxing.EncodeHintType, ?> r12) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0102
            com.google.zxing.BarcodeFormat r0 = com.google.zxing.BarcodeFormat.DATA_MATRIX
            if (r9 != r0) goto L_0x00eb
            if (r10 < 0) goto L_0x00cc
            if (r11 < 0) goto L_0x00cc
            com.google.zxing.datamatrix.encoder.SymbolShapeHint r9 = com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_NONE
            r0 = 0
            if (r12 == 0) goto L_0x0037
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.DATA_MATRIX_SHAPE
            java.lang.Object r1 = r12.get(r1)
            com.google.zxing.datamatrix.encoder.SymbolShapeHint r1 = (com.google.zxing.datamatrix.encoder.SymbolShapeHint) r1
            if (r1 == 0) goto L_0x001e
            r9 = r1
        L_0x001e:
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.MIN_SIZE
            java.lang.Object r1 = r12.get(r1)
            com.google.zxing.Dimension r1 = (com.google.zxing.Dimension) r1
            if (r1 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.MAX_SIZE
            java.lang.Object r2 = r12.get(r2)
            com.google.zxing.Dimension r2 = (com.google.zxing.Dimension) r2
            if (r2 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r2 = r0
            goto L_0x0039
        L_0x0037:
            r1 = r0
            r2 = r1
        L_0x0039:
            r3 = 0
            r4 = 1
            if (r12 == 0) goto L_0x0055
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.DATA_MATRIX_COMPACT
            boolean r6 = r12.containsKey(r5)
            if (r6 == 0) goto L_0x0055
            java.lang.Object r5 = r12.get(r5)
            java.lang.String r5 = r5.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L_0x0055
            r5 = r4
            goto L_0x0056
        L_0x0055:
            r5 = r3
        L_0x0056:
            if (r5 == 0) goto L_0x008e
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r6 = r12.containsKey(r5)
            if (r6 == 0) goto L_0x006f
            java.lang.Object r5 = r12.get(r5)
            java.lang.String r5 = r5.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L_0x006f
            r3 = r4
        L_0x006f:
            com.google.zxing.EncodeHintType r5 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r6 = r12.containsKey(r5)
            if (r6 == 0) goto L_0x0083
            java.lang.Object r12 = r12.get(r5)
            java.lang.String r12 = r12.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r12)
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r12 = 29
            goto L_0x0089
        L_0x0088:
            r12 = -1
        L_0x0089:
            java.lang.String r8 = com.google.zxing.datamatrix.encoder.MinimalEncoder.encodeHighLevel(r8, r0, r12, r9)
            goto L_0x00ab
        L_0x008e:
            if (r12 == 0) goto L_0x00a7
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.FORCE_C40
            boolean r5 = r12.containsKey(r0)
            if (r5 == 0) goto L_0x00a7
            java.lang.Object r12 = r12.get(r0)
            java.lang.String r12 = r12.toString()
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            if (r12 == 0) goto L_0x00a7
            r3 = r4
        L_0x00a7:
            java.lang.String r8 = com.google.zxing.datamatrix.encoder.HighLevelEncoder.encodeHighLevel(r8, r9, r1, r2, r3)
        L_0x00ab:
            int r12 = r8.length()
            com.google.zxing.datamatrix.encoder.SymbolInfo r9 = com.google.zxing.datamatrix.encoder.SymbolInfo.lookup(r12, r9, r1, r2, r4)
            java.lang.String r8 = com.google.zxing.datamatrix.encoder.ErrorCorrection.encodeECC200(r8, r9)
            com.google.zxing.datamatrix.encoder.DefaultPlacement r12 = new com.google.zxing.datamatrix.encoder.DefaultPlacement
            int r0 = r9.getSymbolDataWidth()
            int r1 = r9.getSymbolDataHeight()
            r12.<init>(r8, r0, r1)
            r12.place()
            com.google.zxing.common.BitMatrix r8 = encodeLowLevel(r12, r9, r10, r11)
            return r8
        L_0x00cc:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Requested dimensions can't be negative: "
            r9.append(r12)
            r9.append(r10)
            r10 = 120(0x78, float:1.68E-43)
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00eb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Can only encode DATA_MATRIX, but got "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0102:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Found empty contents"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.DataMatrixWriter.encode(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):com.google.zxing.common.BitMatrix");
    }
}
