package com.lvw.designpattern.headfirst.c03decorator.inputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {

        int read = in.read(b, off, len);
        for (int i = 0; i < b.length; i++) {
            byte b1 = b[i];
            if (b1>=97 && b1<=122) {
                //b1 = Byte.parseByte(Byte.toUnsignedInt(b1) - 32 + "");

                b1 = (byte)(b1 - 32);

                b[i] = b1;
            }
        }

        return read;
    }
}
