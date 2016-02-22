package com.grsisfee.Tools.FileOperator;

import com.sun.istack.internal.NotNull;

import java.io.*;

/**
 * Author: Grsis Fee
 * Date:   2016/1/18.
 */
@SuppressWarnings("unused")
public class WriteFile {

    /**
     * 根据传入的文件路径，以utf-8编码和非追加的方式，创建或写入文件
     * @param outFileName 创建或写入文件路径名
     * @return            返回BufferedWriter
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static BufferedWriter writer(@NotNull String outFileName)
            throws FileNotFoundException, UnsupportedEncodingException {
        return writer(outFileName, "utf-8", false);
    }

    /**
     * 根据传入的文件路径和编码方式，以非追加的方式，创建或写入文件
     * @param outFileName 创建或写入文件路径名
     * @param encoding    写入文件的编码方式
     * @return            返回BufferedWriter
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static BufferedWriter writer(@NotNull String outFileName, @NotNull String encoding)
            throws FileNotFoundException, UnsupportedEncodingException {
        return writer(outFileName, encoding, false);
    }

    /**
     * 根据传入文件路径、编码方式和是否以追加的方式，创建或写入文件
     * @param outFileName 创建或写入文件路径名
     * @param encoding    写入文件的编码方式
     * @param append      是否以追加内容的方式
     * @return            返回BufferedWriter
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static BufferedWriter writer(@NotNull String outFileName, @NotNull String encoding, boolean append)
            throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fileOutputStream = new FileOutputStream(outFileName, append);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, encoding);
        return new BufferedWriter(outputStreamWriter);
    }
}
