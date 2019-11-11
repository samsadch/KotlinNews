package com.example.kotlinnews.network;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0003\b\u00de\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010\'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\b\u00103\u001a\u0004\u0018\u00010\b\u0012\b\u00104\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u00010\b\u0012\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\b\u0012\b\u00108\u001a\u0004\u0018\u00010\b\u0012\b\u00109\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010:\u001a\u00020\u0006\u0012\b\u0010;\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020\u0006\u0012\b\u0010?\u001a\u0004\u0018\u00010\b\u0012\b\u0010@\u001a\u0004\u0018\u00010\b\u0012\b\u0010A\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010D\u001a\u00020\u0006\u0012\b\u0010E\u001a\u0004\u0018\u00010%\u0012\b\u0010F\u001a\u0004\u0018\u00010%\u0012\b\u0010G\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\b\u0010I\u001a\u0004\u0018\u00010\b\u0012\b\u0010J\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010K\u001a\u00020\u0006\u0012\b\u0010L\u001a\u0004\u0018\u00010%\u0012\u0006\u0010M\u001a\u00020\u0006\u0012\b\u0010N\u001a\u0004\u0018\u00010\b\u0012\b\u0010O\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010P\u001a\u00020\u0006\u0012\b\u0010Q\u001a\u0004\u0018\u00010%\u0012\b\u0010R\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010S\u001a\u00020T\u0012\b\u0010U\u001a\u0004\u0018\u00010\b\u0012\b\u0010V\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010W\u001a\u00020\u0006\u0012\u0006\u0010X\u001a\u00020\u0006\u0012\u000e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\u0006\u0010Z\u001a\u00020\u0006\u0012\b\u0010[\u001a\u0004\u0018\u00010\b\u0012\b\u0010\\\u001a\u0004\u0018\u00010\b\u0012\b\u0010]\u001a\u0004\u0018\u00010\b\u0012\b\u0010^\u001a\u0004\u0018\u00010%\u0012\b\u0010_\u001a\u0004\u0018\u00010\b\u0012\b\u0010`\u001a\u0004\u0018\u00010\b\u0012\b\u0010a\u001a\u0004\u0018\u00010\b\u0012\b\u0010b\u001a\u0004\u0018\u00010\b\u0012\b\u0010c\u001a\u0004\u0018\u00010%\u0012\b\u0010d\u001a\u0004\u0018\u00010%\u0012\b\u0010e\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\b\u0010g\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010h\u001a\u00020\u0006\u0012\b\u0010i\u001a\u0004\u0018\u00010\b\u0012\b\u0010j\u001a\u0004\u0018\u00010%\u00a2\u0006\u0002\u0010kJ\u0010\u0010\u00ce\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u00d5\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\f\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00dc\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00de\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u001fH\u00c6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u001fH\u00c6\u0003J\f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00e5\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\u0012\u0010\u00e6\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\f\u0010\u00e7\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00e9\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00eb\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ed\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ee\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00f0\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00f1\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00f2\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00f6\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\f\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00fa\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00fd\u0001\u001a\u00020=H\u00c6\u0003J\n\u0010\u00fe\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00ff\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u0082\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u0086\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\u0012\u0010\u0087\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u008d\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\n\u0010\u008e\u0002\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u0093\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0095\u0002\u001a\u00020TH\u00c6\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u009a\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00a0\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\f\u0010\u00a1\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a2\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a3\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a4\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00a5\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\u0012\u0010\u00a6\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\u0012\u0010\u00a7\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\f\u0010\u00a8\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00a9\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u00c6\u0003J\f\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00ab\u0002\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00ac\u0002\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00ad\u0002\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008e\u0001J\u00fa\b\u0010\u00ae\u0002\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010:\u001a\u00020\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010D\u001a\u00020\u00062\n\b\u0002\u0010E\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010H\u001a\u00020\u00062\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010K\u001a\u00020\u00062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010M\u001a\u00020\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010P\u001a\u00020\u00062\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010S\u001a\u00020T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u00062\u0010\b\u0002\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\b\b\u0002\u0010Z\u001a\u00020\u00062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010h\u001a\u00020\u00062\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010%H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00af\u0002J\n\u0010\u00b0\u0002\u001a\u00020%H\u00d6\u0001J\u0016\u0010\u00b1\u0002\u001a\u00020\u00062\n\u0010\u00b2\u0002\u001a\u0005\u0018\u00010\u00b3\u0002H\u00d6\u0003J\n\u0010\u00b4\u0002\u001a\u00020%H\u00d6\u0001J\n\u0010\u00b5\u0002\u001a\u00020\bH\u00d6\u0001J\u001e\u0010\u00b6\u0002\u001a\u00030\u00b7\u00022\b\u0010\u00b8\u0002\u001a\u00030\u00b9\u00022\u0007\u0010\u00ba\u0002\u001a\u00020%H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010qR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010oR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010qR\u0013\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010qR\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010qR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010mR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010qR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010qR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010qR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010qR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010qR\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010oR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010mR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010qR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010qR\u0012\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010oR\u0012\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010oR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010qR\u0012\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010oR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010qR\u0012\u0010\u001d\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010oR\u0013\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010 \u001a\u00020\u001f\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0014\u0010!\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010qR\u0014\u0010\"\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010qR\u0014\u0010#\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010qR\u0018\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0015\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0012\u0010)\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010oR\u0012\u0010*\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010oR\u0014\u0010+\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010qR\u0011\u0010,\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010oR\u0011\u0010-\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010oR\u0011\u0010.\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010oR\u0011\u0010/\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010oR\u0011\u00100\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010oR\u0011\u00101\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010oR\u0011\u00102\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010oR\u0014\u00103\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010qR\u0014\u00104\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010qR\u0014\u00105\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010qR\u001a\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010mR\u0014\u00107\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010qR\u0014\u00108\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010qR\u0014\u00109\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010qR\u0012\u0010:\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010oR\u0014\u0010;\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010qR\u0013\u0010<\u001a\u00020=\u00a2\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u00a0\u0001R\u0012\u0010>\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010oR\u0014\u0010?\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0001\u0010qR\u0014\u0010@\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010qR\u0014\u0010A\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010qR\u001a\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010mR\u0014\u0010C\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010qR\u0012\u0010D\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010oR\u0018\u0010E\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00a8\u0001\u0010\u008e\u0001R\u0018\u0010F\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00a9\u0001\u0010\u008e\u0001R\u0014\u0010G\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010qR\u0012\u0010H\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010oR\u0014\u0010I\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010qR\u0014\u0010J\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010qR\u0012\u0010K\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010oR\u0018\u0010L\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00af\u0001\u0010\u008e\u0001R\u0012\u0010M\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b0\u0001\u0010oR\u0014\u0010N\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010qR\u0014\u0010O\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010qR\u0012\u0010P\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010oR\u0018\u0010Q\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00b4\u0001\u0010\u008e\u0001R\u0014\u0010R\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010qR\u0013\u0010S\u001a\u00020T\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b6\u0001\u0010\u00b7\u0001R\u0014\u0010U\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b8\u0001\u0010qR\u0014\u0010V\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b9\u0001\u0010qR\u0012\u0010W\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ba\u0001\u0010oR\u0012\u0010X\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bb\u0001\u0010oR\u001a\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bc\u0001\u0010mR\u0012\u0010Z\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bd\u0001\u0010oR\u0014\u0010[\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00be\u0001\u0010qR\u0014\u0010\\\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bf\u0001\u0010qR\u0014\u0010]\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c0\u0001\u0010qR\u0018\u0010^\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00c1\u0001\u0010\u008e\u0001R\u0014\u0010_\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c2\u0001\u0010qR\u0014\u0010`\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c3\u0001\u0010qR\u0014\u0010a\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c4\u0001\u0010qR\u0014\u0010b\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c5\u0001\u0010qR\u0018\u0010c\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00c6\u0001\u0010\u008e\u0001R\u0018\u0010d\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00c7\u0001\u0010\u008e\u0001R\u0014\u0010e\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c8\u0001\u0010qR\u001a\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c9\u0001\u0010mR\u0014\u0010g\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ca\u0001\u0010qR\u0012\u0010h\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cb\u0001\u0010oR\u0014\u0010i\u001a\u0004\u0018\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cc\u0001\u0010qR\u0018\u0010j\u001a\u0004\u0018\u00010%\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u00cd\u0001\u0010\u008e\u0001\u00a8\u0006\u00bb\u0002"}, d2 = {"Lcom/example/kotlinnews/network/DataX;", "Landroid/os/Parcelable;", "all_awardings", "", "Lcom/example/kotlinnews/network/AllAwarding;", "allow_live_comments", "", "approved_at_utc", "", "approved_by", "archived", "author", "author_flair_background_color", "author_flair_css_class", "author_flair_richtext", "author_flair_template_id", "author_flair_text", "author_flair_text_color", "author_flair_type", "author_fullname", "author_patreon_flair", "awarders", "banned_at_utc", "banned_by", "can_gild", "can_mod_post", "category", "clicked", "content_categories", "contest_mode", "created", "", "created_utc", "discussion_type", "distinguished", "domain", "downs", "", "gilded", "gildings", "Lcom/example/kotlinnews/network/Gildings;", "hidden", "hide_score", "id", "is_crosspostable", "is_meta", "is_original_content", "is_reddit_media_domain", "is_robot_indexable", "is_self", "is_video", "likes", "link_flair_background_color", "link_flair_css_class", "link_flair_richtext", "link_flair_text", "link_flair_text_color", "link_flair_type", "locked", "media", "media_embed", "Lcom/example/kotlinnews/network/MediaEmbed;", "media_only", "mod_note", "mod_reason_by", "mod_reason_title", "mod_reports", "name", "no_follow", "num_comments", "num_crossposts", "num_reports", "over_18", "parent_whitelist_status", "permalink", "pinned", "pwls", "quarantine", "removal_reason", "report_reasons", "saved", "score", "secure_media", "secure_media_embed", "Lcom/example/kotlinnews/network/SecureMediaEmbed;", "selftext", "selftext_html", "send_replies", "spoiler", "steward_reports", "stickied", "subreddit", "subreddit_id", "subreddit_name_prefixed", "subreddit_subscribers", "subreddit_type", "suggested_sort", "thumbnail", "title", "total_awards_received", "ups", "url", "user_reports", "view_count", "visited", "whitelist_status", "wls", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/kotlinnews/network/Gildings;ZZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/example/kotlinnews/network/MediaEmbed;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Lcom/example/kotlinnews/network/SecureMediaEmbed;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getAll_awardings", "()Ljava/util/List;", "getAllow_live_comments", "()Z", "getApproved_at_utc", "()Ljava/lang/String;", "getApproved_by", "getArchived", "getAuthor", "getAuthor_flair_background_color", "getAuthor_flair_css_class", "getAuthor_flair_richtext", "getAuthor_flair_template_id", "getAuthor_flair_text", "getAuthor_flair_text_color", "getAuthor_flair_type", "getAuthor_fullname", "getAuthor_patreon_flair", "getAwarders", "getBanned_at_utc", "getBanned_by", "getCan_gild", "getCan_mod_post", "getCategory", "getClicked", "getContent_categories", "getContest_mode", "getCreated", "()D", "getCreated_utc", "getDiscussion_type", "getDistinguished", "getDomain", "getDowns", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGilded", "getGildings", "()Lcom/example/kotlinnews/network/Gildings;", "getHidden", "getHide_score", "getId", "getLikes", "getLink_flair_background_color", "getLink_flair_css_class", "getLink_flair_richtext", "getLink_flair_text", "getLink_flair_text_color", "getLink_flair_type", "getLocked", "getMedia", "getMedia_embed", "()Lcom/example/kotlinnews/network/MediaEmbed;", "getMedia_only", "getMod_note", "getMod_reason_by", "getMod_reason_title", "getMod_reports", "getName", "getNo_follow", "getNum_comments", "getNum_crossposts", "getNum_reports", "getOver_18", "getParent_whitelist_status", "getPermalink", "getPinned", "getPwls", "getQuarantine", "getRemoval_reason", "getReport_reasons", "getSaved", "getScore", "getSecure_media", "getSecure_media_embed", "()Lcom/example/kotlinnews/network/SecureMediaEmbed;", "getSelftext", "getSelftext_html", "getSend_replies", "getSpoiler", "getSteward_reports", "getStickied", "getSubreddit", "getSubreddit_id", "getSubreddit_name_prefixed", "getSubreddit_subscribers", "getSubreddit_type", "getSuggested_sort", "getThumbnail", "getTitle", "getTotal_awards_received", "getUps", "getUrl", "getUser_reports", "getView_count", "getVisited", "getWhitelist_status", "getWls", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ZDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/kotlinnews/network/Gildings;ZZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/example/kotlinnews/network/MediaEmbed;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Lcom/example/kotlinnews/network/SecureMediaEmbed;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/example/kotlinnews/network/DataX;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class DataX implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kotlinnews.network.AllAwarding> all_awardings = null;
    private final boolean allow_live_comments = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String approved_at_utc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String approved_by = null;
    private final boolean archived = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_background_color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_css_class = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> author_flair_richtext = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_template_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_text_color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_flair_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String author_fullname = null;
    private final boolean author_patreon_flair = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> awarders = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String banned_at_utc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String banned_by = null;
    private final boolean can_gild = false;
    private final boolean can_mod_post = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category = null;
    private final boolean clicked = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String content_categories = null;
    private final boolean contest_mode = false;
    private final double created = 0.0;
    private final double created_utc = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String discussion_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String distinguished = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String domain = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer downs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer gilded = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.kotlinnews.network.Gildings gildings = null;
    private final boolean hidden = false;
    private final boolean hide_score = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    private final boolean is_crosspostable = false;
    private final boolean is_meta = false;
    private final boolean is_original_content = false;
    private final boolean is_reddit_media_domain = false;
    private final boolean is_robot_indexable = false;
    private final boolean is_self = false;
    private final boolean is_video = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String likes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link_flair_background_color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link_flair_css_class = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> link_flair_richtext = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link_flair_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link_flair_text_color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link_flair_type = null;
    private final boolean locked = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String media = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kotlinnews.network.MediaEmbed media_embed = null;
    private final boolean media_only = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mod_note = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mod_reason_by = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mod_reason_title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> mod_reports = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    private final boolean no_follow = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer num_comments = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer num_crossposts = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String num_reports = null;
    private final boolean over_18 = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String parent_whitelist_status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String permalink = null;
    private final boolean pinned = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer pwls = null;
    private final boolean quarantine = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String removal_reason = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String report_reasons = null;
    private final boolean saved = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String secure_media = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kotlinnews.network.SecureMediaEmbed secure_media_embed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String selftext = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String selftext_html = null;
    private final boolean send_replies = false;
    private final boolean spoiler = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> steward_reports = null;
    private final boolean stickied = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subreddit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subreddit_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subreddit_name_prefixed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer subreddit_subscribers = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subreddit_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String suggested_sort = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String thumbnail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total_awards_received = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer ups = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> user_reports = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String view_count = null;
    private final boolean visited = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String whitelist_status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer wls = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kotlinnews.network.AllAwarding> getAll_awardings() {
        return null;
    }
    
    public final boolean getAllow_live_comments() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApproved_at_utc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApproved_by() {
        return null;
    }
    
    public final boolean getArchived() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_background_color() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_css_class() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAuthor_flair_richtext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_template_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_text_color() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_flair_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor_fullname() {
        return null;
    }
    
    public final boolean getAuthor_patreon_flair() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAwarders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBanned_at_utc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBanned_by() {
        return null;
    }
    
    public final boolean getCan_gild() {
        return false;
    }
    
    public final boolean getCan_mod_post() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final boolean getClicked() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContent_categories() {
        return null;
    }
    
    public final boolean getContest_mode() {
        return false;
    }
    
    public final double getCreated() {
        return 0.0;
    }
    
    public final double getCreated_utc() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscussion_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistinguished() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDowns() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGilded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlinnews.network.Gildings getGildings() {
        return null;
    }
    
    public final boolean getHidden() {
        return false;
    }
    
    public final boolean getHide_score() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean is_crosspostable() {
        return false;
    }
    
    public final boolean is_meta() {
        return false;
    }
    
    public final boolean is_original_content() {
        return false;
    }
    
    public final boolean is_reddit_media_domain() {
        return false;
    }
    
    public final boolean is_robot_indexable() {
        return false;
    }
    
    public final boolean is_self() {
        return false;
    }
    
    public final boolean is_video() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLikes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink_flair_background_color() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink_flair_css_class() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLink_flair_richtext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink_flair_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink_flair_text_color() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink_flair_type() {
        return null;
    }
    
    public final boolean getLocked() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.network.MediaEmbed getMedia_embed() {
        return null;
    }
    
    public final boolean getMedia_only() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMod_note() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMod_reason_by() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMod_reason_title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMod_reports() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getNo_follow() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNum_comments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNum_crossposts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNum_reports() {
        return null;
    }
    
    public final boolean getOver_18() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParent_whitelist_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    public final boolean getPinned() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPwls() {
        return null;
    }
    
    public final boolean getQuarantine() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemoval_reason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReport_reasons() {
        return null;
    }
    
    public final boolean getSaved() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecure_media() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.network.SecureMediaEmbed getSecure_media_embed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelftext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelftext_html() {
        return null;
    }
    
    public final boolean getSend_replies() {
        return false;
    }
    
    public final boolean getSpoiler() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSteward_reports() {
        return null;
    }
    
    public final boolean getStickied() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubreddit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubreddit_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubreddit_name_prefixed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubreddit_subscribers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubreddit_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggested_sort() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal_awards_received() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getUser_reports() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getView_count() {
        return null;
    }
    
    public final boolean getVisited() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhitelist_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWls() {
        return null;
    }
    
    public DataX(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlinnews.network.AllAwarding> all_awardings, boolean allow_live_comments, @org.jetbrains.annotations.Nullable()
    java.lang.String approved_at_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String approved_by, boolean archived, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_background_color, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_css_class, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> author_flair_richtext, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_template_id, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_text, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_text_color, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_type, @org.jetbrains.annotations.Nullable()
    java.lang.String author_fullname, boolean author_patreon_flair, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> awarders, @org.jetbrains.annotations.Nullable()
    java.lang.String banned_at_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String banned_by, boolean can_gild, boolean can_mod_post, @org.jetbrains.annotations.Nullable()
    java.lang.String category, boolean clicked, @org.jetbrains.annotations.Nullable()
    java.lang.String content_categories, boolean contest_mode, double created, double created_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String discussion_type, @org.jetbrains.annotations.Nullable()
    java.lang.String distinguished, @org.jetbrains.annotations.Nullable()
    java.lang.String domain, @org.jetbrains.annotations.Nullable()
    java.lang.Integer downs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gilded, @org.jetbrains.annotations.Nullable()
    com.example.kotlinnews.network.Gildings gildings, boolean hidden, boolean hide_score, @org.jetbrains.annotations.Nullable()
    java.lang.String id, boolean is_crosspostable, boolean is_meta, boolean is_original_content, boolean is_reddit_media_domain, boolean is_robot_indexable, boolean is_self, boolean is_video, @org.jetbrains.annotations.Nullable()
    java.lang.String likes, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_background_color, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_css_class, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> link_flair_richtext, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_text, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_text_color, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_type, boolean locked, @org.jetbrains.annotations.Nullable()
    java.lang.String media, @org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.MediaEmbed media_embed, boolean media_only, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_note, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_reason_by, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_reason_title, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mod_reports, @org.jetbrains.annotations.Nullable()
    java.lang.String name, boolean no_follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_comments, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_crossposts, @org.jetbrains.annotations.Nullable()
    java.lang.String num_reports, boolean over_18, @org.jetbrains.annotations.Nullable()
    java.lang.String parent_whitelist_status, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, boolean pinned, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pwls, boolean quarantine, @org.jetbrains.annotations.Nullable()
    java.lang.String removal_reason, @org.jetbrains.annotations.Nullable()
    java.lang.String report_reasons, boolean saved, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score, @org.jetbrains.annotations.Nullable()
    java.lang.String secure_media, @org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.SecureMediaEmbed secure_media_embed, @org.jetbrains.annotations.Nullable()
    java.lang.String selftext, @org.jetbrains.annotations.Nullable()
    java.lang.String selftext_html, boolean send_replies, boolean spoiler, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> steward_reports, boolean stickied, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_id, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_name_prefixed, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subreddit_subscribers, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_type, @org.jetbrains.annotations.Nullable()
    java.lang.String suggested_sort, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total_awards_received, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ups, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> user_reports, @org.jetbrains.annotations.Nullable()
    java.lang.String view_count, boolean visited, @org.jetbrains.annotations.Nullable()
    java.lang.String whitelist_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wls) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kotlinnews.network.AllAwarding> component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    public final boolean component24() {
        return false;
    }
    
    public final double component25() {
        return 0.0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlinnews.network.Gildings component32() {
        return null;
    }
    
    public final boolean component33() {
        return false;
    }
    
    public final boolean component34() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    public final boolean component36() {
        return false;
    }
    
    public final boolean component37() {
        return false;
    }
    
    public final boolean component38() {
        return false;
    }
    
    public final boolean component39() {
        return false;
    }
    
    public final boolean component40() {
        return false;
    }
    
    public final boolean component41() {
        return false;
    }
    
    public final boolean component42() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    public final boolean component50() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.network.MediaEmbed component52() {
        return null;
    }
    
    public final boolean component53() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component57() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component58() {
        return null;
    }
    
    public final boolean component59() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component60() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component61() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component62() {
        return null;
    }
    
    public final boolean component63() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component64() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component65() {
        return null;
    }
    
    public final boolean component66() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component67() {
        return null;
    }
    
    public final boolean component68() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component69() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component70() {
        return null;
    }
    
    public final boolean component71() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component72() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component73() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.network.SecureMediaEmbed component74() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component75() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component76() {
        return null;
    }
    
    public final boolean component77() {
        return false;
    }
    
    public final boolean component78() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component79() {
        return null;
    }
    
    public final boolean component80() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component81() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component82() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component83() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component84() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component85() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component86() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component87() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component88() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component89() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component90() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component91() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component92() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component93() {
        return null;
    }
    
    public final boolean component94() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component95() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component96() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlinnews.network.DataX copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlinnews.network.AllAwarding> all_awardings, boolean allow_live_comments, @org.jetbrains.annotations.Nullable()
    java.lang.String approved_at_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String approved_by, boolean archived, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_background_color, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_css_class, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> author_flair_richtext, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_template_id, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_text, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_text_color, @org.jetbrains.annotations.Nullable()
    java.lang.String author_flair_type, @org.jetbrains.annotations.Nullable()
    java.lang.String author_fullname, boolean author_patreon_flair, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> awarders, @org.jetbrains.annotations.Nullable()
    java.lang.String banned_at_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String banned_by, boolean can_gild, boolean can_mod_post, @org.jetbrains.annotations.Nullable()
    java.lang.String category, boolean clicked, @org.jetbrains.annotations.Nullable()
    java.lang.String content_categories, boolean contest_mode, double created, double created_utc, @org.jetbrains.annotations.Nullable()
    java.lang.String discussion_type, @org.jetbrains.annotations.Nullable()
    java.lang.String distinguished, @org.jetbrains.annotations.Nullable()
    java.lang.String domain, @org.jetbrains.annotations.Nullable()
    java.lang.Integer downs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gilded, @org.jetbrains.annotations.Nullable()
    com.example.kotlinnews.network.Gildings gildings, boolean hidden, boolean hide_score, @org.jetbrains.annotations.Nullable()
    java.lang.String id, boolean is_crosspostable, boolean is_meta, boolean is_original_content, boolean is_reddit_media_domain, boolean is_robot_indexable, boolean is_self, boolean is_video, @org.jetbrains.annotations.Nullable()
    java.lang.String likes, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_background_color, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_css_class, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> link_flair_richtext, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_text, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_text_color, @org.jetbrains.annotations.Nullable()
    java.lang.String link_flair_type, boolean locked, @org.jetbrains.annotations.Nullable()
    java.lang.String media, @org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.MediaEmbed media_embed, boolean media_only, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_note, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_reason_by, @org.jetbrains.annotations.Nullable()
    java.lang.String mod_reason_title, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mod_reports, @org.jetbrains.annotations.Nullable()
    java.lang.String name, boolean no_follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_comments, @org.jetbrains.annotations.Nullable()
    java.lang.Integer num_crossposts, @org.jetbrains.annotations.Nullable()
    java.lang.String num_reports, boolean over_18, @org.jetbrains.annotations.Nullable()
    java.lang.String parent_whitelist_status, @org.jetbrains.annotations.Nullable()
    java.lang.String permalink, boolean pinned, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pwls, boolean quarantine, @org.jetbrains.annotations.Nullable()
    java.lang.String removal_reason, @org.jetbrains.annotations.Nullable()
    java.lang.String report_reasons, boolean saved, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score, @org.jetbrains.annotations.Nullable()
    java.lang.String secure_media, @org.jetbrains.annotations.NotNull()
    com.example.kotlinnews.network.SecureMediaEmbed secure_media_embed, @org.jetbrains.annotations.Nullable()
    java.lang.String selftext, @org.jetbrains.annotations.Nullable()
    java.lang.String selftext_html, boolean send_replies, boolean spoiler, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> steward_reports, boolean stickied, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_id, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_name_prefixed, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subreddit_subscribers, @org.jetbrains.annotations.Nullable()
    java.lang.String subreddit_type, @org.jetbrains.annotations.Nullable()
    java.lang.String suggested_sort, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total_awards_received, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ups, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> user_reports, @org.jetbrains.annotations.Nullable()
    java.lang.String view_count, boolean visited, @org.jetbrains.annotations.Nullable()
    java.lang.String whitelist_status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer wls) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}