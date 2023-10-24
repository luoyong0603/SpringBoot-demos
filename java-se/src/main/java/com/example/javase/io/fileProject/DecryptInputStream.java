package com.example.javase.io.fileProject;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author ms
 * @Date 2023-10-19 23:59
 */
public class DecryptInputStream extends FilterInputStream {
    private final int key;

    public DecryptInputStream(InputStream inputStream, int key) {
        super(inputStream);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        if (b != -1) {
            b = b ^ key; // 解密
        }
        return b;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int n = super.read(b, off, len);
        if (n > 0) {
            for (int i = off; i < off + n; i++) {
                b[i] = (byte) (b[i] ^ key); // 解密
            }
        }
        return n;
    }

}
