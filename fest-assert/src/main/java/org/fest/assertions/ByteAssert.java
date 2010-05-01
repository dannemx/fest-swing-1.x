/*
 * Created on Jun 18, 2007
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
 * Copyright @2007-2009 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.assertions.ErrorMessages.*;

/**
 * Understands assertion methods for <code>byte</code>s. To create a new instance of this class use the method
 * <code>{@link Assertions#assertThat(byte)}</code>.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 * @since 1.2
 */
public class ByteAssert extends PrimitiveAssert<Byte> implements NumberAssert {

  private static final byte ZERO = (byte) 0;

  /**
   * Creates a new <code>{@link ByteAssert}</code>.
   *
   * @param actual the actual value to verify.
   */
  protected ByteAssert(byte actual) {
    super(actual);
  }

  /**
   * Creates a new <code>{@link ByteAssert}</code>.
   *
   * @param actual the actual value to verify.
   */
  protected ByteAssert(Byte actual) {
    super(actual);
  }

  /**
   * Sets the description of the actual value, to be used in as message of any <code>{@link AssertionError}</code>
   * thrown when an assertion fails. This method should be called before any assertion method, otherwise any assertion
   * failure will not show the provided description. <p> For example:
   * <pre>
   * assertThat(value).<strong>as</strong>(&quot;Some value&quot;).isEqualTo(otherValue);
   * </pre>
   * </p>
   *
   * @param description the description of the actual value.
   * @return this assertion object.
   */
  public ByteAssert as(String description) {
    description(description);
    return this;
  }

  /**
   * Alias for <code>{@link #as(String)}</code>, since "as" is a keyword in <a href="http://groovy.codehaus.org/"
   * target="_blank">Groovy</a>. This method should be called before any assertion method, otherwise any assertion
   * failure will not show the provided description. <p> For example:
   * <pre>
   * assertThat(value).<strong>describedAs</strong>(&quot;Some value&quot;).isEqualTo(otherValue);
   * </pre>
   * </p>
   *
   * @param description the description of the actual value.
   * @return this assertion object.
   */
  public ByteAssert describedAs(String description) {
    return as(description);
  }

  /**
   * Sets the description of the actual value, to be used in as message of any <code>{@link AssertionError}</code>
   * thrown when an assertion fails. This method should be called before any assertion method, otherwise any assertion
   * failure will not show the provided description. <p> For example:
   * <pre>
   * assertThat(value).<strong>as</strong>(new BasicDescription(&quot;Some value&quot;)).isEqualTo(otherValue);
   * </pre>
   * </p>
   *
   * @param description the description of the actual value.
   * @return this assertion object.
   */
  public ByteAssert as(Description description) {
    description(description);
    return this;
  }

  /**
   * Alias for <code>{@link #as(Description)}</code>, since "as" is a keyword in <a href="http://groovy.codehaus.org/"
   * target="_blank">Groovy</a>. This method should be called before any assertion method, otherwise any assertion
   * failure will not show the provided description. <p> For example:
   * <pre>
   * assertThat(value).<strong>describedAs</strong>(new BasicDescription(&quot;Some value&quot;))
   *   .isEqualTo(otherValue);
   * </pre>
   * </p>
   *
   * @param description the description of the actual value.
   * @return this assertion object.
   */
  public ByteAssert describedAs(Description description) {
    return as(description);
  }

  /**
   * Verifies that the actual <code>byte</code> value is equal to the given one.
   *
   * @param expected the value to compare the actual one to.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not equal to the given one.
   */
  public ByteAssert isEqualTo(byte expected) {
    if (actual == expected) return this;
    failIfCustomMessageIsSet();
    throw fail(unexpectedNotEqual(actual, expected));
  }

  /**
   * Verifies that the actual <code>byte</code> value is not equal to the given one.
   *
   * @param other the given value.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is equal to the given one.
   */
  public ByteAssert isNotEqualTo(byte other) {
    if (actual != other) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedEqual(actual, other));
  }

  /**
   * Verifies that the actual <code>byte</code> value is greater than the given one.
   *
   * @param other the given value.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not greater than the given one.
   */
  public ByteAssert isGreaterThan(byte other) {
    if (actual > other) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedLessThanOrEqualTo(actual, other));
  }

  /**
   * Verifies that the actual <code>byte</code> value is less than the given one.
   *
   * @param other the given value.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not less than the given one.
   */
  public ByteAssert isLessThan(byte other) {
    if (actual < other) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedGreaterThanOrEqualTo(actual, other));
  }

  /**
   * Verifies that the actual <code>byte</code> value is greater or equal to the given one.
   *
   * @param other the given value.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not greater than or equal to the given one.
   */
  public ByteAssert isGreaterThanOrEqualTo(byte other) {
    if (actual >= other) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedLessThan(actual, other));
  }

  /**
   * Verifies that the actual <code>byte</code> value is less or equal to the given one.
   *
   * @param other the given value.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not less than or equal to the given one.
   */
  public ByteAssert isLessThanOrEqualTo(byte other) {
    if (actual <= other) return this;
    failIfCustomMessageIsSet();
    throw failure(unexpectedGreaterThan(actual, other));
  }

  /**
   * Verifies that the actual <code>byte</code> value is equal to zero.
   *
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not equal to zero.
   */
  public ByteAssert isZero() {
    return isEqualTo(ZERO);
  }

  /**
   * Verifies that the actual <code>byte</code> value is positive.
   *
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not positive.
   */
  public ByteAssert isPositive() {
    return isGreaterThan(ZERO);
  }

  /**
   * Verifies that the actual <code>byte</code> value is negative.
   *
   * @return this assertion object.
   * @throws AssertionError if the actual <code>byte</code> value is not negative.
   */
  public ByteAssert isNegative() {
    return isLessThan(ZERO);
  }

  /** {@inheritDoc} */
  public ByteAssert overridingErrorMessage(String message) {
    replaceDefaultErrorMessagesWith(message);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> satisfies the given condition.
   *
   * @param condition the given condition.
   * @return this assertion object.
   * @throws NullPointerException if the given condition is <code>null</code>.
   * @throws AssertionError       if the actual <code>Byte</code> does not satisfy the given condition.
   * @see #is(Condition)
   * @since 1.3
   */
  @Override
  public ByteAssert satisfies(Condition<Byte> condition) {
    assertSatisfies(condition);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> does not satisfy the given condition.
   *
   * @param condition the given condition.
   * @return this assertion object.
   * @throws NullPointerException if the given condition is <code>null</code>.
   * @throws AssertionError       if the actual value does satisfies the given condition.
   * @see #isNot(Condition)
   * @since 1.3
   */
  @Override
  public ByteAssert doesNotSatisfy(Condition<Byte> condition) {
    assertDoesNotSatisfy(condition);
    return this;
  }

  /**
   * Alias for <code>{@link #satisfies(Condition)}</code>.
   *
   * @param condition the given condition.
   * @return this assertion object.
   * @throws NullPointerException if the given condition is <code>null</code>.
   * @throws AssertionError       if the actual <code>Byte</code> does not satisfy the given condition.
   * @since 1.3
   */
  @Override
  public ByteAssert is(Condition<Byte> condition) {
    assertIs(condition);
    return this;
  }

  /**
   * Alias for <code>{@link #doesNotSatisfy(Condition)}</code>.
   *
   * @param condition the given condition.
   * @return this assertion object.
   * @throws NullPointerException if the given condition is <code>null</code>.
   * @throws AssertionError       if the actual <code>Byte</code> does not satisfy the given condition.
   * @since 1.3
   */
  @Override
  public ByteAssert isNot(Condition<Byte> condition) {
    assertIsNot(condition);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> value is equal to the given one.
   *
   * @param expected the given <code>Byte</code> value to compare the actual <code>Byte</code> to.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>Byte</code> value is not equal to the given one.
   * @since 1.3
   */
  @Override
  public ByteAssert isEqualTo(Byte expected) {
    assertEqualTo(expected);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> is not equal to the given one.
   *
   * @param other the given <code>Byte</code> to compare the actual <code>Byte</code> to.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>Byte</code> value is equal to the given one.
   * @since 1.3
   */
  @Override
  public ByteAssert isNotEqualTo(Byte other) {
    assertNotEqualTo(other);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> is not <code>null</code>.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>Byte</code> value is <code>null</code>.
   * @since 1.3
   */
  @Override
  public ByteAssert isNotNull() {
    assertNotNull();
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> is the same object as the given one.
   * @param expected the given <code>Byte</code> to compare the actual <code>Byte</code> to.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>Byte</code> value is not the same as the given one.
   * @since 1.3
   */
  @Override
  public ByteAssert isSameAs(Byte expected) {
    assertSameAs(expected);
    return this;
  }

  /**
   * Verifies that the actual <code>{@link Byte}</code> is not the same object as the given one.
   * @param other the given <code>Byte</code> to compare the actual <code>BigDecimal</code> to.
   * @return this assertion object.
   * @throws AssertionError if the actual <code>Byte</code> value is the same as the given one.
   * @since 1.3
   */
  @Override
  public ByteAssert isNotSameAs(Byte other) {
    assertNotSameAs(other);
    return this;
  }
}
