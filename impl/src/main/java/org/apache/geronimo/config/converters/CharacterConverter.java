/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.geronimo.config.converters;

import org.eclipse.microprofile.config.spi.Converter;

import javax.annotation.Priority;
import javax.enterprise.inject.Vetoed;

/**
 * @author <a href="mailto:danielsoro@apache.org">Daniel 'soro' Cunha</a>
 */

@Priority(1)
@Vetoed
public class CharacterConverter implements Converter<Character> {

    public static final CharacterConverter INSTANCE = new CharacterConverter();

    @Override
    public Character convert(String value) {
        if (value == null || value.length() > 1) {
            throw new IllegalArgumentException("Error while converting the value " + value +
                    " to type " + char.class);
        }

        return value.charAt(0);
    }
}