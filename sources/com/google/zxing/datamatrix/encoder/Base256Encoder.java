package com.google.zxing.datamatrix.encoder;

import net.sqlcipher.database.SQLiteDatabase;

final class Base256Encoder implements Encoder {
    private static char randomize255State(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        if (i2 <= 255) {
            return (char) i2;
        }
        return (char) (i2 - 256);
    }

    public void encode(EncoderContext encoderContext) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            sb.append(encoderContext.getCurrentChar());
            encoderContext.pos++;
            if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        if (encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (encoderContext.hasMoreCharacters() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / SQLiteDatabase.MAX_SQL_CACHE_SIZE) + 249));
                sb.insert(1, (char) (length % SQLiteDatabase.MAX_SQL_CACHE_SIZE));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: " + length);
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            encoderContext.writeCodeword(randomize255State(sb.charAt(i), encoderContext.getCodewordCount() + 1));
        }
    }

    public int getEncodingMode() {
        return 5;
    }
}
