package com.avrutti.sarvajnanavachanagalu.util;

import android.content.Context;

public class LoadJson {
  public static String loadJSONFromAsset(Context paramContext, String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc ''
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: astore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: aconst_null
    //   13: astore #4
    //   15: aconst_null
    //   16: astore #5
    //   18: aload_0
    //   19: ifnonnull -> 56
    //   22: aload_3
    //   23: astore #6
    //   25: aload #4
    //   27: astore #7
    //   29: ldc 'context is null'
    //   31: ldc 'yes'
    //   33: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   36: pop
    //   37: aload_1
    //   38: ifnonnull -> 56
    //   41: aload_3
    //   42: astore #6
    //   44: aload #4
    //   46: astore #7
    //   48: ldc 'path is null'
    //   50: ldc 'yes'
    //   52: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   55: pop
    //   56: aload_0
    //   57: ifnull -> 118
    //   60: aload_3
    //   61: astore #6
    //   63: aload #4
    //   65: astore #7
    //   67: new java/io/BufferedReader
    //   70: astore #5
    //   72: aload_3
    //   73: astore #6
    //   75: aload #4
    //   77: astore #7
    //   79: new java/io/InputStreamReader
    //   82: astore #8
    //   84: aload_3
    //   85: astore #6
    //   87: aload #4
    //   89: astore #7
    //   91: aload #8
    //   93: aload_0
    //   94: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   97: aload_1
    //   98: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   101: invokespecial <init> : (Ljava/io/InputStream;)V
    //   104: aload_3
    //   105: astore #6
    //   107: aload #4
    //   109: astore #7
    //   111: aload #5
    //   113: aload #8
    //   115: invokespecial <init> : (Ljava/io/Reader;)V
    //   118: aload #5
    //   120: ifnull -> 179
    //   123: aload #5
    //   125: astore #6
    //   127: aload #5
    //   129: astore #7
    //   131: aload #5
    //   133: invokevirtual readLine : ()Ljava/lang/String;
    //   136: astore_0
    //   137: aload_0
    //   138: ifnull -> 179
    //   141: aload #5
    //   143: astore #6
    //   145: aload #5
    //   147: astore #7
    //   149: aload_2
    //   150: aload_0
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: ldc '\\n'
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: goto -> 123
    //   163: astore_0
    //   164: aload #6
    //   166: ifnull -> 174
    //   169: aload #6
    //   171: invokevirtual close : ()V
    //   174: aload_2
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: areturn
    //   179: aload #5
    //   181: ifnull -> 174
    //   184: aload #5
    //   186: invokevirtual close : ()V
    //   189: goto -> 174
    //   192: astore_0
    //   193: goto -> 174
    //   196: astore_0
    //   197: aload #7
    //   199: ifnull -> 207
    //   202: aload #7
    //   204: invokevirtual close : ()V
    //   207: aload_0
    //   208: athrow
    //   209: astore_0
    //   210: goto -> 174
    //   213: astore_1
    //   214: goto -> 207
    // Exception table:
    //   from	to	target	type
    //   29	37	163	java/io/IOException
    //   29	37	196	finally
    //   48	56	163	java/io/IOException
    //   48	56	196	finally
    //   67	72	163	java/io/IOException
    //   67	72	196	finally
    //   79	84	163	java/io/IOException
    //   79	84	196	finally
    //   91	104	163	java/io/IOException
    //   91	104	196	finally
    //   111	118	163	java/io/IOException
    //   111	118	196	finally
    //   131	137	163	java/io/IOException
    //   131	137	196	finally
    //   149	160	163	java/io/IOException
    //   149	160	196	finally
    //   169	174	209	java/io/IOException
    //   184	189	192	java/io/IOException
    //   202	207	213	java/io/IOException
    return "";
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagal\\util\LoadJson.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */