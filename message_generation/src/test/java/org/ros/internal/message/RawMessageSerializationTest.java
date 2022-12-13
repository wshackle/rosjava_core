/*
 * Copyright (C) 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.internal.message;

import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import java.util.Arrays;

import org.jboss.netty.buffer.ChannelBuffer;
import org.junit.Before;
import org.junit.Test;
import org.ros.internal.message.topic.TopicDefinitionResourceProvider;
import org.ros.message.Duration;
import org.ros.message.MessageFactory;
import org.ros.message.Time;

/**
 * @author damonkohler@google.com (Damon Kohler)
 * @author mick.gaillard@gmail.com (Mickael Gaillard)
 */
public class RawMessageSerializationTest {

  private TopicDefinitionResourceProvider topicDefinitionResourceProvider;
  private MessageFactory messageFactory;

  @Before
  public void before() {
    topicDefinitionResourceProvider = new TopicDefinitionResourceProvider();
    messageFactory = new DefaultMessageFactory(topicDefinitionResourceProvider);
  }

  private void checkSerializeAndDeserialize(Message message) {
    ChannelBuffer buffer = MessageBuffers.dynamicBuffer();
    DefaultMessageSerializer serializer = new DefaultMessageSerializer();
    serializer.serialize(message, buffer);
    DefaultMessageDeserializer<RawMessage> deserializer =
        new DefaultMessageDeserializer<RawMessage>(message.toRawMessage().getIdentifier(),
            messageFactory);
    RawMessage deserializedMessage = deserializer.deserialize(buffer);
    assertTrue(message.equals(deserializedMessage));
  }

  @Test
  public void testBool() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Bool");
    rawMessage.setBool("data", true);
    checkSerializeAndDeserialize(rawMessage);
    rawMessage.setBool("data", false);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt8() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Int8");
    rawMessage.setInt8("data", (byte) 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testUint8() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/UInt8");
    rawMessage.setUInt8("data", (byte) 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt16() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Int16");
    rawMessage.setInt16("data", (short) 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testUInt16() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/UInt16");
    rawMessage.setUInt16("data", (short) 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt32() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Int32");
    rawMessage.setInt32("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testUInt32() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/UInt32");
    rawMessage.setUInt32("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt64() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Int64");
    rawMessage.setInt64("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testUInt64() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/UInt64");
    rawMessage.setUInt64("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testFloat32() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Float32");
    rawMessage.setFloat32("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testFloat64() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Float64");
    rawMessage.setFloat64("data", 42);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testString() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/String");
    rawMessage.setString("data", "Hello, ROS!");
    checkSerializeAndDeserialize(rawMessage);
  }
  
  @Test
  public void testStringUTF8() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/String");
    rawMessage.setString("data", "éêè €àáßëœ 文字化け");
    checkSerializeAndDeserialize(rawMessage);

    // i18n test case
    // base on http://www.inter-locale.com/whitepaper/learn/learn-to-test.html

    // Combining Marks and Accents test
    rawMessage.setString("data", "àéîōũ");
    checkSerializeAndDeserialize(rawMessage);

    // DOS 860 test
    rawMessage.setString("data", "você nós mãe avô irmã criança");
    checkSerializeAndDeserialize(rawMessage);

    // Windows-1252 test
    rawMessage.setString("data", "€ŒœŠš™©‰ƒ");
    checkSerializeAndDeserialize(rawMessage);

    // Turkish test
    rawMessage.setString("data", "ışık bir İyi Günler");
    checkSerializeAndDeserialize(rawMessage);

    // Dakuten and handakuten marks test
    rawMessage.setString("data", "がざばだぱか゛さ゛た゛は");
    checkSerializeAndDeserialize(rawMessage);

    // Combining Grapheme Joiner character
    rawMessage.setString("data", "אִ͏ַ");
    checkSerializeAndDeserialize(rawMessage);

    // Bidi with Latin test
    rawMessage.setString("data", "abcאבגדabc ");
    checkSerializeAndDeserialize(rawMessage);

    rawMessage.setString("data", "אבגדabcאבגד");
    checkSerializeAndDeserialize(rawMessage);

    rawMessage.setString("data", "אבגד012אבגד");
    checkSerializeAndDeserialize(rawMessage);

    rawMessage.setString("data", "אבגד 012 012");
    checkSerializeAndDeserialize(rawMessage);

    // Complex Scripts test
    rawMessage.setString("data", "สวัสดี");
    checkSerializeAndDeserialize(rawMessage);

    rawMessage.setString("data", "டாஹ்கோ");
    checkSerializeAndDeserialize(rawMessage);

    rawMessage.setString("data", "بِسْمِ اللّهِ الرَّحْمـَنِ الرَّحِيمِ");
    checkSerializeAndDeserialize(rawMessage);

    // Numeric Shaping test
    rawMessage.setString("data", "عدد مارس ١٩٩٨");
    checkSerializeAndDeserialize(rawMessage);

    // Common Scripts and Encodings test
    rawMessage.setString("data", "Слава Жанна Ювеналий Ярополк");
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testTime() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Time");
    rawMessage.setTime("data", new Time());
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testDuration() {
    RawMessage rawMessage = messageFactory.newFromType("std_msgs/Duration");
    rawMessage.setDuration("data", new Duration());
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testNestedMessage() {
    topicDefinitionResourceProvider.add("foo/foo", "std_msgs/String data");
    RawMessage fooMessage = messageFactory.newFromType("foo/foo");
    RawMessage stringMessage = messageFactory.newFromType("std_msgs/String");
    stringMessage.setString("data", "Hello, ROS!");
    fooMessage.setMessage("data", stringMessage);
    checkSerializeAndDeserialize(fooMessage);
  }

  @Test
  public void testNestedMessageArray() {
    topicDefinitionResourceProvider.add("foo/foo", "std_msgs/String[] data");
    RawMessage fooMessage = messageFactory.newFromType("foo/foo");
    RawMessage stringMessageA = messageFactory.newFromType("std_msgs/String");
    stringMessageA.setString("data", "Hello, ROS!");
    RawMessage stringMessageB = messageFactory.newFromType("std_msgs/String");
    stringMessageB.setString("data", "Goodbye, ROS!");
    fooMessage.setMessageList("data", Lists.<Message>newArrayList(stringMessageA, stringMessageB));
    checkSerializeAndDeserialize(fooMessage);
  }

  @Test
  public void testChannelBuffer() {
    topicDefinitionResourceProvider.add("foo/foo", "uint8[] data");
    ChannelBuffer buffer = MessageBuffers.dynamicBuffer();
    buffer.writeBytes(new byte[] { 1, 2, 3, 4, 5 });
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setChannelBuffer("data", buffer);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt32Array() {
    topicDefinitionResourceProvider.add("foo/foo", "int32[] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setInt32Array("data", new int[] { 1, 2, 3, 4, 5 });
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testFloat64Array() {
    topicDefinitionResourceProvider.add("foo/foo", "float64[] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setFloat64Array("data", new double[] { 1, 2, 3, 4, 5 });
    checkSerializeAndDeserialize(rawMessage);
  }
  
  @Test
  public void testChannelBufferFixedSizeWithInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "uint8[5] data");
    ChannelBuffer buffer = MessageBuffers.dynamicBuffer();
    buffer.writeBytes(new byte[] { 1, 2, 3, 4, 5 });
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setChannelBuffer("data", buffer);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testChannelBufferFixedSizeWithIncompleteInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "uint8[5] data");
    ChannelBuffer buffer = MessageBuffers.dynamicBuffer();
    buffer.writeBytes(new byte[] { 1, 2, 3 });
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setChannelBuffer("data", buffer);
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testChannelBufferFixedSizeNoInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "uint8[5] data");
    ChannelBuffer buffer = MessageBuffers.dynamicBuffer();
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setChannelBuffer("data", buffer);
    checkSerializeAndDeserialize(rawMessage);
  }
  
  @Test
  public void testInt32FixedSizeArrayWithInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "int32[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setInt32Array("data", new int[] { 1, 2, 3, 4, 5 });
    checkSerializeAndDeserialize(rawMessage);
  }
  
  @Test
  public void testInt32FixedSizeArrayWithIncompleteInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "int32[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setInt32Array("data", new int[] { 1, 2, 3 });
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testInt32FixedSizeArrayNoInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "int32[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testFloat64FixedSizeArrayWithInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "float64[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setFloat64Array("data", new double[] { 1, 2, 3, 4, 5 });
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testFloat64FixedSizeArrayWithIncompleteInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "float64[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setFloat64Array("data", new double[] { 1, 2, 3 });
    checkSerializeAndDeserialize(rawMessage);
  }
  
  @Test
  public void testFloat64FixedSizeArrayNoInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "float64[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testStringFixedSizeArrayWithInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "string[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    String[] stringArray = new String[] { "String 1", "String 2", "String 3", "String 4", "String 5" };
    rawMessage.setStringList("data", Arrays.asList(stringArray));
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testStringFixedSizeArrayWithIncompleteInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "string[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    String[] stringArray = new String[] { "String 1", "String 2", "String 3" };
    rawMessage.setStringList("data", Arrays.asList(stringArray));
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testStringFixedSizeArrayWithNoInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "string[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testByteFixedSizeArrayWithInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "byte[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setInt8Array("data", new byte[] { 1, 2, 3, 4, 5 });
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testByteFixedSizeArrayWithIncompleteInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "byte[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    rawMessage.setInt8Array("data", new byte[] { 1, 2, 3 });
    checkSerializeAndDeserialize(rawMessage);
  }

  @Test
  public void testByteFixedSizeArrayWithNoInitialization() {
    topicDefinitionResourceProvider.add("foo/foo", "byte[5] data");
    RawMessage rawMessage = messageFactory.newFromType("foo/foo");
    checkSerializeAndDeserialize(rawMessage);
  }
}
