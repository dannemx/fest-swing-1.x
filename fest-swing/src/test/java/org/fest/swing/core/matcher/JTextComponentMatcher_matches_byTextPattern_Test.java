/*
 * Created on Jul 16, 2008
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2008-2013 the original author or authors.
 */
package org.fest.swing.core.matcher;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.swing.test.builder.JTextFields.textField;

import java.util.regex.Pattern;

import javax.swing.JTextField;

import org.fest.swing.test.core.EDTSafeTestCase;
import org.junit.Test;

/**
 * Tests for {@link JTextComponentMatcher#matches(java.awt.Component)}.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class JTextComponentMatcher_matches_byTextPattern_Test extends EDTSafeTestCase {
  @Test
  public void should_return_true_if_text_matches_pattern() {
    JTextComponentMatcher matcher = JTextComponentMatcher.withText(Pattern.compile("He.*"));
    JTextField textField = textField().withText("Bye").createNew();
    assertThat(matcher.matches(textField)).isFalse();
  }

  @Test
  public void should_return_false_if_text_does_not_match_pattern() {
    JTextComponentMatcher matcher = JTextComponentMatcher.withText(Pattern.compile("Hello"));
    JTextField textField = textField().withText("Bye").createNew();
    assertThat(matcher.matches(textField)).isFalse();
  }
}
