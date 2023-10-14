package com.example.javase.io.filterInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 17:01
 */
public class CountingInputStream extends FilterInputStream {
    private long count = 0;

    public CountingInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int b = super.read();
        if (b != -1) {
            this.count++;
        }
        return b;
    }

    public int read(byte[] b, int off, int len) throws IOException {
        int n = super.read(b, off, len);
        if (n != -1) {
            this.count += n;
        }
        return n;
    }

    public long skip(long n) throws IOException {
        long skip = super.skip(n);
        this.count += skip;
        return skip;
    }

    public long getCount() {
        return count;
    }
}
