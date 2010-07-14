/* Copyright (c) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.wave.api;

import junit.framework.TestCase;

/**
 * Gadget unit tests.
 *
 * @author scovitz@google.com (Seth Covitz)
 */
public class GadgetTest extends TestCase {

  private static final String EMPTY_STRING = "";
  private static final String URL = "url";

  public void testDefaultConstructor() {
    Gadget gadget = new Gadget();
    assertEquals(ElementType.GADGET, gadget.getType());
    assertEquals(EMPTY_STRING, gadget.getProperty(URL));
    assertEquals(EMPTY_STRING, gadget.getUrl());
  }

  public void testUrlConstructor() {
    Gadget gadget = new Gadget(URL);
    assertEquals(ElementType.GADGET, gadget.getType());
    assertEquals(URL, gadget.getProperty(URL));
    assertEquals(URL, gadget.getUrl());
  }
}
