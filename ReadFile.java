package com.grsisfee.Tools.FileOperator;

import com.sun.istack.internal.NotNull;

import java.io.*;

/**
 * Author: Grsis Fee
 * Date:   2016/1/18.
 */
@SuppressWarnings("unused")
public class ReadFile {

    /**
     * 根据传入文件路径，使用utf-8编码，读取文件
     * @param inFileName 传入文件路径
     * @return           返回文件的BufferedReader
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static BufferedReader read(@NotNull String inFileName)
            throws FileNotFoundException, UnsupportedEncodingException {
        return read(inFileName, "utf-8");
    }

    /**
     * 根据传入的文件路径和编码方式，读取文件
     * @param inFileName 传入文件路径
     * @param encoding   文件编码方式
     * @return           返回文件的BufferedReader
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static BufferedReader read(@NotNull String inFileName, @NotNull String encoding)
            throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fileInputStream = new FileInputStream(inFileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, encoding);
        return new BufferedReader(inputStreamReader);
    }
}