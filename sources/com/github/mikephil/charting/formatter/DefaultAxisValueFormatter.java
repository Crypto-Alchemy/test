package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

public class DefaultAxisValueFormatter extends ValueFormatter {
    public int digits;
    public DecimalFormat mFormat;

    public DefaultAxisValueFormatter(int i) {
        this.digits = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public int getDecimalDigits() {
        return this.digits;
    }

    public String getFormattedValue(float f) {
        return this.mFormat.format((double) f);
    }
}
